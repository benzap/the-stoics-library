(ns marcparse.web-scraper
 (:require
  [clojure.pprint :as pp]
  [clj-http.client :as client]
  [net.cgrand.enlive-html :as html]))


(defn fetch-url [url]
  (html/html-resource (java.net.URL. url)))


(def main-url "http://stoics.com")




