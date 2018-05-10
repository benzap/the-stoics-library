(ns stl-website.export
  (:require 
   [clojure.string :as string]
   [stasis.core :as stasis]
   [me.raynes.fs :as fs]
   [stl-website.routes.main :refer [main-pages]]))


(def export-directory "../dist_website")


(defn is-compiled-js? [path]
  (string/includes? path "js/compiled"))


(defn filter-compiled-js [pages]
  (->> pages
       (filter (fn [[path _]] (not (is-compiled-js? path))))
       (into {})))


(defn production-pages [] 
  (-> (main-pages) filter-compiled-js))


(defn empty-export-directory! [path]
  (println (str "Emptying directory " export-directory " ..."))
  (let [path-list (->> (fs/list-dir path) (map #(.getAbsolutePath %)))]
    (doseq [path path-list]
      (cond
        (string/ends-with? path ".git") nil
        (string/ends-with? path "CNAME") nil
        (fs/directory? path) (fs/delete-dir path)
        (fs/file? path) (fs/delete path)
        :else nil))))


#_(empty-export-directory! export-directory)


(defn export-to-dist
  "Task to export to ../dist_website folder"
  []
  (println (str "Exporting to directory " export-directory " ..."))
  (let [pages (production-pages)]
    (empty-export-directory! export-directory)
    (stasis/export-pages pages export-directory)
    (println (str "Finished Exporting to " export-directory "!"))))


#_(export-to-dist)
