
(ns component-states.api
    (:require [component-states.mark.env :as mark.env]
              [component-states.mark.side-effects :as mark.side-effects]
              [component-states.states.env :as states.env]
              [component-states.states.attributes :as states.attributes]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Component states
;
; The states of UI components indicate various conditions of the component,
; such as being pressed, hovered over, highlighted, and more, reflecting their interactive behavior
; and appearance changes in response to user actions.
;
; Handled states:
;
; - active
; - disabled
; - failured
; - focused
; - highlighted
; - hovered
; - pressed
; - selected
; - succeeded

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Demo
;
; @usage
; (defn my-button
;   [id props]
;   (let [props (add-component-state-events id props)
;         props (import-component-states    id props)
;         props (apply-component-states     id props)]
;        [:button {:on-mouse-down  (:on-mouse-down-f  props)
;                  :on-mouse-over  (:on-mouse-over-f  props)
;                  :on-mouse-leave (:on-mouse-leave-f props)
;                  :on-mouse-up    (:on-mouse-up-f    props)
;                  :style          (:style            props)}
;                 "My button"]))
;
; (defn my-ui
;   []
;   [my-button :my-button {:disabled {:style {:opacity .5}}
;                          :hovered  {:style {:opacity .8}}
;                          :pressed  {:style {:opacity .5}}}])
;
; @usage
; (defn my-text-field
;   [id props]
;   (let [props (add-component-state-events id props)
;         props (import-component-states    id props)
;         props (apply-component-states     id props)]
;        [:input {:on-blur  (:on-blur-f  props)
;                 :on-focus (:on-focus-f props)
;                 :disabled (:disabled?  props)
;                 :style    (:style      props)
;                 :type     :text}]))
;
; (defn my-ui
;   []
;   [my-text-field :my-text-field {:disabled {:style {:opacity .5}}
;                                  :focused  {:style {:border-color :blue}}}])

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (component-states.mark.env/*)
(def component-marked-as-active?      mark.env/component-marked-as-active?)
(def component-marked-as-disabled?    mark.env/component-marked-as-disabled?)
(def component-marked-as-failured?    mark.env/component-marked-as-failured?)
(def component-marked-as-focused?     mark.env/component-marked-as-focused?)
(def component-marked-as-highlighted? mark.env/component-marked-as-highlighted?)
(def component-marked-as-hovered?     mark.env/component-marked-as-hovered?)
(def component-marked-as-pressed?     mark.env/component-marked-as-pressed?)
(def component-marked-as-selected?    mark.env/component-marked-as-selected?)
(def component-marked-as-succeeded?   mark.env/component-marked-as-succeeded?)

; @redirect (component-states.mark.side-effects/*)
(def mark-component-as-active!        mark.side-effects/mark-component-as-active!)
(def unmark-component-as-active!      mark.side-effects/unmark-component-as-active!)
(def mark-component-as-disabled!      mark.side-effects/mark-component-as-disabled!)
(def unmark-component-as-disabled!    mark.side-effects/unmark-component-as-disabled!)
(def mark-component-as-failured!      mark.side-effects/mark-component-as-failured!)
(def unmark-component-as-failured!    mark.side-effects/unmark-component-as-failured!)
(def mark-component-as-focused!       mark.side-effects/mark-component-as-focused!)
(def unmark-component-as-focused!     mark.side-effects/unmark-component-as-focused!)
(def mark-component-as-highlighted!   mark.side-effects/mark-component-as-highlighted!)
(def unmark-component-as-highlighted! mark.side-effects/unmark-component-as-highlighted!)
(def mark-component-as-hovered!       mark.side-effects/mark-component-as-hovered!)
(def unmark-component-as-hovered!     mark.side-effects/unmark-component-as-hovered!)
(def mark-component-as-pressed!       mark.side-effects/mark-component-as-pressed!)
(def unmark-component-as-pressed!     mark.side-effects/unmark-component-as-pressed!)
(def mark-component-as-selected!      mark.side-effects/mark-component-as-selected!)
(def unmark-component-as-selected!    mark.side-effects/unmark-component-as-selected!)
(def mark-component-as-succeeded!     mark.side-effects/mark-component-as-succeeded!)
(def unmark-component-as-succeeded!   mark.side-effects/unmark-component-as-succeeded!)

; @redirect (component-states.states.attributes/*)
(def component-state-attributes states.attributes/component-state-attributes)

; @redirect (component-states.states.env/*)
(def add-component-state-events states.env/add-component-state-events)
(def import-component-states    states.env/import-component-states)
(def apply-component-states     states.env/apply-component-states)
