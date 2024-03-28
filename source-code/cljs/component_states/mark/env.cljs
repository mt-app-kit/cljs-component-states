
(ns component-states.mark.env
    (:require [common-state.api :as common-state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn component-marked-as-active?
  ; @description
  ; Returns TRUE if a specific component is marked as active.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (component-marked-as-active? :my-component)
  ; =>
  ; true
  ;
  ; @return (boolean)
  [component-id]
  (common-state/get-state :component-states component-id :active?))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn component-marked-as-disabled?
  ; @description
  ; Returns TRUE if a specific component is marked as disabled.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (component-marked-as-disabled? :my-component)
  ; =>
  ; true
  ;
  ; @return (boolean)
  [component-id]
  (common-state/get-state :component-states component-id :disabled?))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn component-marked-as-failured?
  ; @description
  ; Returns TRUE if a specific component is marked as failured.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (component-marked-as-failured? :my-component)
  ; =>
  ; true
  ;
  ; @return (boolean)
  [component-id]
  (common-state/get-state :component-states component-id :failured?))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn component-marked-as-focused?
  ; @description
  ; Returns TRUE if a specific component is marked as focused.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (component-marked-as-focused? :my-component)
  ; =>
  ; true
  ;
  ; @return (boolean)
  [component-id]
  (common-state/get-state :component-states component-id :focused?))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn component-marked-as-highlighted?
  ; @description
  ; Returns TRUE if a specific component is marked as highlighted.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (component-marked-as-highlighted? :my-component)
  ; =>
  ; true
  ;
  ; @return (boolean)
  [component-id]
  (common-state/get-state :component-states component-id :highlighted?))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn component-marked-as-hovered?
  ; @description
  ; Returns TRUE if a specific component is marked as hovered.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (component-marked-as-hovered? :my-component)
  ; =>
  ; true
  ;
  ; @return (boolean)
  [component-id]
  (common-state/get-state :component-states component-id :hovered?))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn component-marked-as-pressed?
  ; @description
  ; Returns TRUE if a specific component is marked as pressed.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (component-marked-as-pressed? :my-component)
  ; =>
  ; true
  ;
  ; @return (boolean)
  [component-id]
  (common-state/get-state :component-states component-id :pressed?))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn component-marked-as-selected?
  ; @description
  ; Returns TRUE if a specific component is marked as selected.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (component-marked-as-selected? :my-component)
  ; =>
  ; true
  ;
  ; @return (boolean)
  [component-id]
  (common-state/get-state :component-states component-id :selected?))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn component-marked-as-succeeded?
  ; @description
  ; Returns TRUE if a specific component is marked as succeeded.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (component-marked-as-succeeded? :my-component)
  ; =>
  ; true
  ;
  ; @return (boolean)
  [component-id]
  (common-state/get-state :component-states component-id :succeeded?))
