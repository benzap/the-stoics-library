(ns stl-website.web-utils)


(defn query-select
  ([elem query]
   (.querySelector elem query))
  ([query] (query-select js/document query)))


(defn query-select-all
  ([elem query]
   (.querySelector elem query))
  ([query] (query-select-all js/document query)))
