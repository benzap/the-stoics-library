(ns stl-website.routes.main
  (:require
   [stl-website.views.home :refer [p-home]]))


(def pages {"/index.html" p-home})
