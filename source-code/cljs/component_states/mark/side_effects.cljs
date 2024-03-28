
(ns component-states.mark.side-effects
    (:require [common-state.api :as common-state]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn mark-component-as-active!
  ; @description
  ; Marks a specific component as active.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (mark-component-as-active! :my-component)
  [component-id]
  (common-state/assoc-state! :component-states component-id :active? true))

(defn unmark-component-as-active!
  ; @description
  ; Unmarks a specific component as active.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (unmark-component-as-active! :my-component)
  [component-id]
  (common-state/dissoc-state! :component-states component-id :active?))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn mark-component-as-disabled!
  ; @description
  ; Marks a specific component as disabled.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (mark-component-as-disabled! :my-component)
  [component-id]
  (common-state/assoc-state! :component-states component-id :disabled? true))

(defn unmark-component-as-disabled!
  ; @description
  ; Unmarks a specific component as disabled.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (unmark-component-as-disabled! :my-component)
  [component-id]
  (common-state/dissoc-state! :component-states component-id :disabled?))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn mark-component-as-failured!
  ; @description
  ; Marks a specific component as failured.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (mark-component-as-failured! :my-component)
  [component-id]
  (common-state/assoc-state! :component-states component-id :failured? true))

(defn unmark-component-as-failured!
  ; @description
  ; Unmarks a specific component as failured.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (unmark-component-as-failured! :my-component)
  [component-id]
  (common-state/dissoc-state! :component-states component-id :failured?))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn mark-component-as-focused!
  ; @description
  ; Marks a specific component as focused.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (mark-component-as-focused! :my-component)
  [component-id]
  (common-state/assoc-state! :component-states component-id :focused? true))

(defn unmark-component-as-focused!
  ; @description
  ; Unmarks a specific component as focused.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (unmark-component-as-focused! :my-component)
  [component-id]
  (common-state/dissoc-state! :component-states component-id :focused?))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn mark-component-as-highlighted!
  ; @description
  ; Marks a specific component as highlighted.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (mark-component-as-highlighted! :my-component)
  [component-id]
  (common-state/assoc-state! :component-states component-id :highlighted? true))

(defn unmark-component-as-highlighted!
  ; @description
  ; Unmarks a specific component as highlighted.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (unmark-component-as-highlighted! :my-component)
  [component-id]
  (common-state/dissoc-state! :component-states component-id :highlighted?))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn mark-component-as-hovered!
  ; @description
  ; Marks a specific component as hovered.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (mark-component-as-hovered! :my-component)
  [component-id]
  (common-state/assoc-state! :component-states component-id :hovered? true))

(defn unmark-component-as-hovered!
  ; @description
  ; Unmarks a specific component as hovered.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (unmark-component-as-hovered! :my-component)
  [component-id]
  (common-state/dissoc-state! :component-states component-id :hovered?))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn mark-component-as-pressed!
  ; @description
  ; Marks a specific component as pressed.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (mark-component-as-pressed! :my-component)
  [component-id]
  (common-state/assoc-state! :component-states component-id :pressed? true))

(defn unmark-component-as-pressed!
  ; @description
  ; Unmarks a specific component as pressed.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (unmark-component-as-pressed! :my-component)
  [component-id]
  (common-state/dissoc-state! :component-states component-id :pressed?))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn mark-component-as-selected!
  ; @description
  ; Marks a specific component as selected.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (mark-component-as-selected! :my-component)
  [component-id]
  (common-state/assoc-state! :component-states component-id :selected? true))

(defn unmark-component-as-selected!
  ; @description
  ; Unmarks a specific component as selected.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (unmark-component-as-selected! :my-component)
  [component-id]
  (common-state/dissoc-state! :component-states component-id :selected?))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn mark-component-as-succeeded!
  ; @description
  ; Marks a specific component as succeeded.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (mark-component-as-succeeded! :my-component)
  [component-id]
  (common-state/assoc-state! :component-states component-id :succeeded? true))

(defn unmark-component-as-succeeded!
  ; @description
  ; Unmarks a specific component as succeeded.
  ;
  ; @param (keyword) component-id
  ;
  ; @usage
  ; (unmark-component-as-succeeded! :my-component)
  [component-id]
  (common-state/dissoc-state! :component-states component-id :succeeded?))
