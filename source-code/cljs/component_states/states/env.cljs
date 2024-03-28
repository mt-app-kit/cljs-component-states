
(ns component-states.states.env
    (:require [component-states.mark.side-effects :as mark-side-effects]
              [component-states.mark.env :as mark.env]
              [component-states.states.utils :as states.utils]
              [fruits.map.api :as map]
              [fruits.hiccup.api :as hiccup]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn add-component-state-events
  ; @description
  ; Associates the state related events of the component to the given property map
  ; in case of any event controlled state (':focused', ':hovered' or ':pressed') is provided.
  ;
  ; @param (keyword) component-id
  ; @param (map) component-props
  ; {:focused (map)(opt)
  ;  :hovered (map)(opt)
  ;  :pressed (map)(opt)
  ;  ...}
  ;
  ; @usage
  ; (add-component-state-events :my-component {:focused {:my-key "My value"} ...})
  ; =>
  ; {:focused    {:my-key "My value"}
  ;  :on-focus-f (fn [_] (mark-component-as-focused!   :my-component))
  ;  :on-blur-f  (fn [_] (unmark-component-as-focused! :my-component))
  ;  ...}
  ;
  ; @usage
  ; (add-component-state-events :my-component {:hovered {:my-key "My value"} ...})
  ; =>
  ; {:hovered          {:my-key "My value"}
  ;  :on-mouse-over-f  (fn [_] (mark-component-as-hovered!   :my-component))
  ;  :on-mouse-leave-f (fn [_] (unmark-component-as-hovered! :my-component))
  ;  ...}
  ;
  ; @usage
  ; (add-component-state-events :my-component {:pressed {:my-key "My value"} ...})
  ; =>
  ; {:pressed         {:my-key "My value"}
  ;  :on-mouse-down-f (fn [_] (mark-component-as-pressed!   :my-component))
  ;  :on-mouse-up-f   (fn [_] (unmark-component-as-pressed! :my-component))
  ;  ...}
  ;
  ; @return (map)
  ; {:on-blur-f (function)
  ;  :on-focus-f (function)
  ;  :on-mouse-down-f (function)
  ;  :on-mouse-leave-f (function)
  ;  :on-mouse-over-f (function)
  ;  :on-mouse-up-f (function)
  ;  ...}
  [component-id {:keys [focused hovered pressed] :as component-props}]
  (letfn [(f0 [_] (side-effects/mark-component-as-focused!   component-id))
          (f1 [_] (side-effects/unmark-component-as-focused! component-id))
          (f2 [_] (side-effects/mark-component-as-hovered!   component-id))
          (f3 [_] (side-effects/unmark-component-as-hovered! component-id))
          (f4 [_] (side-effects/mark-component-as-pressed!   component-id))
          (f5 [_] (side-effects/unmark-component-as-pressed! component-id))]
         (cond-> component-props focused (hiccup/merge-event-fn :on-focus-f       f0)
                                 focused (hiccup/merge-event-fn :on-blur-f        f1)
                                 hovered (hiccup/merge-event-fn :on-mouse-over-f  f2)
                                 hovered (hiccup/merge-event-fn :on-mouse-leave-f f3)
                                 pressed (hiccup/merge-event-fn :on-mouse-down-f  f4)
                                 pressed (hiccup/merge-event-fn :on-mouse-up-f    f5))))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn import-component-states
  ; @description
  ; Imports all dynamically set component state toggles (e.g., ':active?' ':disabled?', etc.) into the given property map.
  ;
  ; @param (keyword) component-id
  ; @param (map) component-props
  ;
  ; @usage
  ; (mark-component-as-disabled! :my-component)
  ; (import-component-states     :my-component {...})
  ; =>
  ; {:disabled? true
  ;  ...}
  ;
  ; @return (map)
  ; {:active? (boolean)
  ;  :disabled? (boolean)
  ;  :failured? (boolean)
  ;  :focused? (boolean)
  ;  :highlighted? (boolean)
  ;  :hovered? (boolean)
  ;  :pressed? (boolean)
  ;  :selected? (boolean)
  ;  :succeeded? (boolean)
  ;  ...}
  [component-id component-props]
  (cond-> component-props (mark.env/component-marked-as-active?      component-id) (assoc :active?      true)
                          (mark.env/component-marked-as-disabled?    component-id) (assoc :disabled?    true)
                          (mark.env/component-marked-as-failured?    component-id) (assoc :failured?    true)
                          (mark.env/component-marked-as-focused?     component-id) (assoc :focused?     true)
                          (mark.env/component-marked-as-highlighted? component-id) (assoc :highlighted? true)
                          (mark.env/component-marked-as-hovered?     component-id) (assoc :hovered?     true)
                          (mark.env/component-marked-as-pressed?     component-id) (assoc :pressed?     true)
                          (mark.env/component-marked-as-selected?    component-id) (assoc :selected?    true)
                          (mark.env/component-marked-as-succeeded?   component-id) (assoc :succeeded?   true)))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn apply-component-states
  ; @description
  ; Applies the current states of the component on the given property map.
  ;
  ; @param (keyword) id
  ; @param (map) props
  ; {:active (map)(opt)
  ;  :active? (boolean)(opt)
  ;  :disabled (map)(opt)
  ;  :disabled? (boolean)(opt)
  ;  :failured (map)(opt)
  ;  :failured? (boolean)(opt)
  ;  :focused (map)(opt)
  ;  :focused? (boolean)(opt)
  ;  :highlighted (map)(opt)
  ;  :highlighted? (boolean)(opt)
  ;  :hovered (map)(opt)
  ;  :hovered? (boolean)(opt)
  ;  :pressed (map)(opt)
  ;  :pressed? (boolean)(opt)
  ;  :selected (map)(opt)
  ;  :selected? (boolean)(opt)
  ;  :succeeded (map)(opt)
  ;  :succeeded? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (apply-component-states :my-component {:disabled {:my-key "My value"} :disabled? true ...})
  ; =>
  ; {:disabled  {:my-key "My value"}
  ;  :disabled? true
  ;  :my-key    "My value"
  ;  ...}
  ;
  ; @usage
  ; (apply-component-states :my-component {:hovered {:my-key "My value"} :hovered? true ...})
  ; =>
  ; {:hovered  {:my-key "My value"}
  ;  :hovered? true
  ;  :my-key   "My value"
  ;  ...}
  ;
  ; @return (map)
  [_ {:keys [active? disabled? failured? focused? highlighted? hovered? pressed? selected? succeeded?] :as component-props}]
  (cond-> component-props selected?    (states.utils/apply-component-state :selected)
                          active?      (states.utils/apply-component-state :active)      ; Must override selected state
                          focused?     (states.utils/apply-component-state :focused)     ; Must override active state
                          highlighted? (states.utils/apply-component-state :highlighted) ; Must override focused state
                          hovered?     (states.utils/apply-component-state :hovered)     ; Must override highlighted state
                          pressed?     (states.utils/apply-component-state :pressed)     ; Must override hovered state
                          succeeded?   (states.utils/apply-component-state :succeeded)   ; Must override less important states
                          failured?    (states.utils/apply-component-state :failured)    ; Must override succeeded state
                          disabled?    (states.utils/apply-component-state :disabled)))  ; Must override other states
