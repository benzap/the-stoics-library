(ns stl-website.config
  (:require
   [mount.core :as mount]))


(mount/defstate config :start {:port 8080})


;;(def ^:dynamic *root-path* "")

(def ^:dynamic *root-path* "/the-stoics-library")
