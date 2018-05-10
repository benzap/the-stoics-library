(ns stl-website.routes.main
  (:require
   [stl-website.views.home :refer [p-home]]))


(defn main-pages [] {"/index.html" p-home})
