(ns stl-website.views.home
  (:require
   [stl-website.views.template :as template]))


(defn p-home [ctx]
  (template/main
   "Home"
   [:h1 "Home Page"]))


;;(p-home)
