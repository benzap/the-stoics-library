(ns stl-website.www
  (:require
   [org.httpkit.server :as http]
   [stasis.core :as stasis]
   [mount.core :as mount]

   [stl-website.config :refer [config]]))


(def pages {"/index.html" "<h1>Hello World!</h1>"})

(def app (stasis/serve-pages pages))


(defn start-webserver []
  (println "Starting Web server on port " (:port config))
  (http/run-server app {:port (:port config)}))


(mount/defstate web-server
  :start (start-webserver)
  :stop (web-server))
