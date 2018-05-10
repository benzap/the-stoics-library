(ns stl-website.routes.main
  (:require
   [stl-website.views.home :refer [p-home]]
   [stl-website.books :refer [pages-online-text]]))


(defn main-pages []
  (merge {"/index.html" p-home}
         (pages-online-text)))
