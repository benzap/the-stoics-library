(ns stl-website.dev.user
  (:require
   [environ.core :refer [env]]
   [mount.core :as mount]
   [clojure.spec.alpha :as spec]
   [figwheel-sidecar.system :as fw-sys]

   [stl-website.dev.mount-components :refer [garden-watcher figwheel]]
   [stl-website.www :refer [web-server]]))
   

(defn start []
  (mount/start))


(defn stop []
  (mount/stop))


(defn restart [] (stop)(start))


(defn browser-repl []
  (fw-sys/cljs-repl (:figwheel-server figwheel)))
