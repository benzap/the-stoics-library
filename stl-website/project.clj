(defproject stl-website "0.1.0-SNAPSHOT"
  :description "Statically Generated Website for the stoics library"
  :url "http://github.com/benzap/the-stoics-library/stl-website"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/clojurescript "1.10.217" :scope "provided"]
                 [org.clojure/core.async "0.4.474"]
                 [com.cognitect/transit-clj "0.8.300"]
                 [ring "1.6.3"]
                 [ring/ring-defaults "0.3.1"]
                 [bk/ring-gzip "0.3.0"]
                 [http-kit "2.2.0"]
                 [lambdaisland/ring.middleware.logger "0.5.1"]
                 [com.stuartsierra/component "0.3.2"]
                 [compojure "1.6.0"]
                 [environ "1.1.0"]
                 [hiccup "1.0.5"]
                 [stasis "2.3.0"]
                 [com.rpl/specter "1.1.1"]
                 [funcool/cuerdas "2.0.5"]
                 [markdown-clj "1.0.2"]
                 [mount "0.1.12"]
                 [clj-time "0.14.2"]
                 [garden "1.3.5"]]

  :plugins [[lein-garden "0.3.0"] ;; CSS Compilation
            [lein-cljsbuild "1.1.7"] ;; Clojurescript Compilation
            [lein-environ "1.1.0"] ;; ENVVAR Tooling
            [lein-ancient "0.6.15"]] ;; Check for outdated libraries

  :main ^:skip-aot stl-website.core
  :target-path "target/%s"

  :figwheel {:http-server-root "public"
             :server-port 8081
             :server-ip "127.0.0.1"
             :css-dirs ["resources/public/css"]
             :server-logfile "log/figwheel.log"}

  :cljsbuild {:builds
              [{:id "dev"
                :source-paths ["src" "dev"]
                :figwheel {:autoload true}
                           ;;:on-jsload "stl-website.dev.core/figwheel-reload-hook"}
                :compiler {:main stl-website.core
                           :asset-path "/js/compiled/out"
                           :output-to "resources/public/js/compiled/the-stoics-library.js"
                           :output-dir "resources/public/js/compiled/out"
                           :optimizations :none
                           :pretty-print true
                           :source-map true
                           :source-map-timestamp true}}

               ;; Untested
               {:id "prod"
                :source-paths ["src"]
                :jar true
                :compiler {:main hsynapse.core
                           :output-to "resources/public/js/compiled/the-stoics-library.js"
                           :output-dir "target"
                           :source-map "resources/public/js/compiled/the-stoics-library.js.map"
                           :source-map-timestamp true
                           :optimizations :simple
                           :pretty-print false}}]}

  :profiles 
  {:dev
   {:dependencies [
                   [org.clojure/tools.nrepl "0.2.13"]
                   [lambdaisland/garden-watcher "0.3.2"] ;; Component System for Garden CSS
                   [figwheel "0.5.15"] ;; CLJS & CSS Reloading
                   [figwheel-sidecar "0.5.15"] ;; figwheel system component
                   [com.cemerick/piggieback "0.2.2"]] ;; CLJS nrepl middleware
                   

    :plugins [
              [lein-figwheel "0.5.14"]
              [lein-doo "0.1.8"]]              

    :source-paths ["dev"]
    :repl-options {:init-ns stl-website.dev.user
                   :nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]
                   :port 9000}}

   :uberjar {:aot :all}})
