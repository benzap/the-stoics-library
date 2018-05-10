(ns stl-website.views.home
  (:require
   [stl-website.views.template :as template]))


(defn p-home [ctx]
  (template/main
   "Home"
   [:div "Home Page2"]))


;;(p-home)
