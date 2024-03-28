
(ns component-states.states.attributes
    (:require [fruits.map.api :as map]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn component-state-attributes
  ; @description
  ; Associates the state toggles (e.g., ':active?' ':disabled?', etc.) of the component on the given attribute map as data attributes.
  ;
  ; @param (map) component-attributes
  ; @param (map) component-props
  ; {:active? (boolean)(opt)
  ;  :disabled? (boolean)(opt)
  ;  :failured? (boolean)(opt)
  ;  :focused? (boolean)(opt)
  ;  :highlighted? (boolean)(opt)
  ;  :hovered? (boolean)(opt)
  ;  :pressed? (boolean)(opt)
  ;  :selected? (boolean)(opt)
  ;  :succeeded? (boolean)(opt)
  ;  ...}
  ;
  ; @usage
  ; (component-state-attributes {...} {:disabled? true})
  ; =>
  ; {:data-disabled true
  ;  ...}
  ;
  ; @usage
  ; (component-state-attributes {...} {:hovered? true})
  ; =>
  ; {:data-hovered true
  ;  ...}
  ;
  ; @return (map)
  ; {:data-active (boolean)
  ;  :data-disabled (boolean)
  ;  :data-failured (boolean)
  ;  :data-focused (boolean)
  ;  :data-highlighted (boolean)
  ;  :data-hovered (boolean)
  ;  :data-pressed (boolean)
  ;  :data-selected (boolean)
  ;  :data-succeeded (boolean)
  ;  ...}
  [component-attributes {:keys [active? disabled? failured? focused? highlighted? hovered? pressed? selected? succeeded?]}]
  (map/merge-some component-attributes {:data-active      active?
                                        :data-disabled    disabled?
                                        :data-failured    failured?
                                        :data-focused     focused?
                                        :data-highlighted active?
                                        :data-hovered     hovered?
                                        :data-pressed     pressed?
                                        :data-selected    selected?
                                        :data-succeeded   pressed?}))
