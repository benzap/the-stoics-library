(ns stl-website.css.styles
  "Includes main Garden CSS Style sheet generation."
  (:require
   [garden.def :refer [defstyles defkeyframes]]
   [garden.stylesheet :refer [at-import at-media]]
   [garden.units :refer [px em]]
   [garden.color :as color :refer [rgb rgba]]))


(def stylesheet-root "resources/public")
(def stylesheet-output "/css/compiled/stl-website.css")

(def main-stylesheet-output (str stylesheet-root stylesheet-output))



;; Main CSS Stylesheet. Generates the file hsynapse.css.
(defstyles ^{:garden {:output-to main-stylesheet-output}} main-stylesheet
  

  [:*
   {:box-sizing "border-box"}])
