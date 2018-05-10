(ns stl-website.core
  (:require 
   [mount.core :as mount]
   [stl-website.config]
   [stl-website.www]))


(defn -main []
  (mount/start))
