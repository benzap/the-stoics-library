(defproject marcparse "0.1.0-SNAPSHOT"
  :description "Webscraper for stoics.com"
  :url "http://github.com/benzap/the-stoics-library/marcparse"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/core.async "0.4.474"]
                 [enlive "1.1.6"]
                 [stasis "2.3.0"]
                 [org.xerial/sqlite-jdbc "3.21.0.1"]]
  :plugins [[lein-ancient "0.6.15"]]
  :main ^:skip-aot marcparse.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
