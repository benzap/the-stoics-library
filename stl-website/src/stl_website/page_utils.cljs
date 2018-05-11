(ns stl-website.page-utils
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require
   [cljs.core.async :refer [put! chan <! close! >!]]))


;; TODO: 'go back to top of page' button which shows after scrolling
;;       Needs to be unobtrusive.


;; TODO: Provide a way to copy permalinks from header anchors. Mobile friendly.

;; TODO: Add permalink anchors to book paragraphs.
