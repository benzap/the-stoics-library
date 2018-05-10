(ns stl-website.dev.mount-components
  (:require
   [mount.core :as mount :refer [defstate]]
   [garden-watcher.core :refer [new-garden-watcher]]
   [figwheel-sidecar.system :as sys]
   [com.stuartsierra.component :as component]))


;; Namespaces to watch for compilation with garden
(def ^:dynamic *garden-css-watch-files* '[stl-website.css.styles])


;; mount component that watches for and compiles CSS files in the development environment
(defstate garden-watcher
  :start
  (component/start (new-garden-watcher *garden-css-watch-files*))
  :stop
  (component/stop garden-watcher))


;; Enable figwheel-server with the css watcher
(def dev-figwheel-system
  (component/system-map
   :figwheel-server   (sys/figwheel-system (sys/fetch-config))
   :css-watcher       (component/using
                       (sys/css-watcher {:watch-paths ["resources/public/css"]})
                       [:figwheel-server])))


;; figwheel system, which uses the project.clj configuration
(defstate figwheel
  :start
  (component/start dev-figwheel-system)
  :stop
  (component/stop figwheel))
