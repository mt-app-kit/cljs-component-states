
(ns component-states.states.listeners
    (:require [window.api :as window]
              [component-states.mark.side-effects :as mark.side-effects]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn add-component-pressed-state-listener!
  ; @description
  ; Adds a mouse-up listener (to the Window object) that removes the component pressed state.
  ;
  ; @param (keyword) component-id
  ; @param (map) component-props
  ; {:pressed (map)(opt)
  ;  ...}
  ;
  ; @usage
  ; (add-component-pressed-state-listener! :my-component {:pressed {:my-key "My value"} ...})
  [id {:keys [pressed]}]
  (if pressed (window/add-event-listener! "mouseup" (fn [] (mark.side-effects/unmark-component-as-pressed! id)))))

(defn remove-component-pressed-state-listener!
  ; @description
  ; Removes the mouse-up listener (from the Window object) that removes the component pressed state.
  ;
  ; @param (keyword) component-id
  ; @param (map) component-props
  ; {:pressed (map)(opt)
  ;  ...}
  ;
  ; @usage
  ; (remove-component-pressed-state-listener! :my-component {:pressed {:my-key "My value"} ...})
  [id {:keys [pressed]}]
  (if pressed (window/remove-event-listener! "mouseup" (fn [] (mark.side-effects/unmark-component-as-pressed! id)))))
