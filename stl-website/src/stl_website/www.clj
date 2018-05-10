(ns stl-website.www
  (:require
   [org.httpkit.server :as http]
   [stasis.core :as stasis]
   [mount.core :as mount]
   [compojure.core :refer [routes]]
   [compojure.route :refer [resources]]

   [stl-website.routes.main]
   [stl-website.config :refer [config]]))


(defn file-entry [url file-path]
  {url (slurp file-path)})


(defn get-dev-directory-resources []
  (->> (stasis/slurp-directory "resources/public" #"^.*?\..*$")))


(defn get-pages []
  (merge
   (stl-website.routes.main/main-pages)
   (get-dev-directory-resources)))


(def app 
  (-> (stasis/serve-pages #'get-pages)
      (routes (resources "/"))))


(defn start-webserver []
  (println "Starting Web server on port " (:port config))
  (http/run-server app {:port (:port config)}))


(mount/defstate web-server
  :start (start-webserver)
  :stop (web-server))
