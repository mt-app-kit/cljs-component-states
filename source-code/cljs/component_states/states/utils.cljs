
(ns component-states.states.utils
    (:require [fruits.map.api :as map]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn apply-component-state
  ; @ignore
  ;
  ; @description
  ; Applies a specific state of the component on the given property map.
  ;
  ; @param (map) component-props
  ; @param (keyword) state-key
  ;
  ; @usage
  ; (apply-component-state :my-component {:pressed {:my-key "My value"} ...} :pressed)
  ; =>
  ; {:my-key "My value"
  ;  :pressed {:my-key "My value"}
  ;  ...}
  ;
  ; @return (map)
  [component-props state-key]
  (if-let [state (get component-props state-key)]
          (-> component-props (map/deep-merge state))
          (-> component-props)))
