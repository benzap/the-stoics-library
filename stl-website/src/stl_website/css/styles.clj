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

(def font-serif "'Merriweather', serif")
(def font-sans-serif "'Roboto', sans-serif")


;; Color Palette
;; http://www.colourlovers.com/palette/711624/Julius_Ceasar?widths=0
;;
;; Julius Ceasar


(def black (rgb 23 19 9))
(def copper (rgb 171 128 60))
(def white (rgb 247 242 242))
(def red1 (rgb 161 6 6))
(def red2 (rgb 140 14 14))

;; http://www.colourlovers.com/palette/3021956/Roman_Holiday
;;
;; Roman Holiday

(def dark-grey (rgb 95 102 110))
(def lite-grey (rgb 157 163 166))
(def peach (rgb 240 199 133))
(def lite-pink (rgb 243 214 216))
(def lite-red (rgb 248 101 91))


;; Main CSS Stylesheet. Generates the file hsynapse.css.
(defstyles ^{:garden {:output-to main-stylesheet-output}} main-stylesheet

  [:*
   {:box-sizing "border-box"
    :margin 0
    :padding 0}]


  [:html
   {:width "100%"
    :height "100%"}]


  [:body
   {:background-color white
    :color black
    :width "100%"
    :height "100%"
    :font-family font-serif}]

  [:h1
   {:padding-left (em 0.3)}]

  [:h2
   {:padding-left (em 0.4)}]

  [:h3
   {:padding-left (em 0.5)}]

  [:h4
   {:padding-left (em 0.5)}]

  [:h5
   {:padding-left (em 0.5)}]

  [:h6
   {:padding-left (em 0.5)}]

  [:p
   {:padding (em 0.5)}]

  [:a
   {:color copper
    :text-decoration "none"
    :padding "initial"}
   [:&:hover
    {:color red2}]]

  [:li
   {:margin-left (em 2.0)
    :padding (em 0.5)
    :padding-left 0}]


  [:.body-container
   {:display "flex"
    :flex-direction "column"
    :width "100%"
    :min-height "100%"}]


  [:.header-container
   {:display "flex"
    :background-color white
    :flex-basis (em 2)
    :flex-grow 0
    :flex-direction "row"
    :align-items "center"}]

  
  (at-media
   {:max-width (px 800)}
   [:.header-container
    {:flex-basis "auto"
     :flex-direction "column"}])


  (at-media
   {:max-width (px 600)}
   [:.header-container
    {:flex-basis "auto"
     :flex-direction "column"}])


  [:.header-title
   {:background-color red2
    :height (em 2)
    :line-height (em 2)
    :color white
    :font-weight "bold"
    :padding-left (em 1)
    :padding-right (em 1)}]


  (at-media
   {:max-width (px 800)}
   [:.header-title
    {:width "50%"
     :font-size (em 1.5)
     :text-align "center"}])


  (at-media
   {:max-width (px 600)}
   [:.header-title
    {:width "100%"}])


  [:.header-nav
   {:display "flex"
    :flex-direction "row"
    :padding (em 0.5)
    :padding-left (em 0.5)
    :padding-right (em 0.5)}]


  (at-media
   {:max-width (px 600)}
   [:.header-nav
    {:flex-direction "column"
     :padding (em 1.0)
     :padding-bottom 0
     :text-align "center"}])


  [:.header-nav>.menu-item
   {:padding-left (em 0.5)
    :padding-right (em 0.5)
    :font-size (em 1.2)
    :font-family font-sans-serif}]


  (at-media
   {:max-width (px 600)}
   [:.header-nav>.menu-item
    {:padding (em 0.3)
     :font-size (em 1.7)}])


  [:.content-container
   {:flex-grow 1}]


  [:.footer-container
   {:display "flex"
    :flex-direction "row"
    :flex-grow 0
    :flex-basis (em 2)
    :padding (em 0.5)
    :align-items "center"
    :font-size (em 0.7)
    :width "100%"
    :justify-content "center"
    :text-align "center"}]


  ;; Home Page
  [:.home-container
   {:display "flex"
    :flex-direction "column"
    :width "100%"}]


  [:.home-container>.banner
   {:text-align "center"
    :font-weight "bold"
    :padding (em 1)
    :padding-left (em 0.3)
    :padding-right (em 0.3)
    :font-size (em 2)}]


  [:.content-sections
   {:display "flex"
    :flex-wrap "wrap"
    :flex-direction "row"
    :justify-content "center"}]


  [:.section-parent
   {:width (px 350)
    :margin (em 0.7)
    :padding (em 0.5)
    :padding-bottom (em 1.0)
    :border "1px solid black"
    :border-color (rgba 140 14 14 0.3)
    :border-radius (px 3)}]


  (at-media
   {:max-width (px 420)}
   [:.section-parent
    {:margin 0
     :border-left "none"
     :border-right "none"
     :border-bottom "none"}])


  [:.section-parent>.section-container
   {:display "flex"
    :flex-direction "column"}]

  [:.section-parent>.section-title
   {:padding (em 0.7)
    :font-size (em 1.2)
    :font-weight "bold"
    :font-family font-sans-serif
    :text-align "center"}]
    
  [:.section-container>.bottom-link
   {:text-align "center"
    :width "100%"
    :padding-top (em 0.7)
    :font-size (em 0.7)}]

  ;;
  ;; Online Texts Page
  ;;

  [:.texts-container
   {}]


  [:.text-listings
   {:display "flex"
    :flex-direction "row"
    :justify-content "center"
    :flex-wrap "wrap"}]


  [:.author-listing
   {:width (px 300)
    :border-radius (px 3)
    :margin (em 1.0)
    :padding (em 0.5)
    :padding-left (em 0.7)
    :padding-right (em 0.7)
    :padding-top (em 1)
    :border-style "solid"
    :border-width (px 1)
    :border-color (rgba 140 14 14 0.3)}]


  [:.author-listing>.author
   {:text-align "center"
    :font-family font-sans-serif
    :font-size (em 1.2)
    :padding-bottom (em 0.5)
    :font-weight "bold"}]


  [:.series-listing
   {:display "flex"
    :flex-direction "row"
    :justify-content "center"}]


  [:.series-listing>.series
   {:padding (em 0.5)
    :text-align "right"
    :flex-basis (px 100)
    :font-weight "bold"
    :flex-grow 1}]


  [:.series-listing>.series-content
   {:padding (em 0.5)
    :flex-basis (px 100)
    :flex-grow 1}]

  
  [:.book-listing
   {:padding-left (em 0.5)
    :padding-bottom (em 0.5)}]


  ;;
  ;; Book Reader Styling
  ;;

  [:.book-container
   {:margin (em 0.5)
    :display "flex"
    :flex-direction "column"
    :align-items "center"}]


  [:.book-container>.intro
   {:padding (em 0.5)
    :padding-bottom 0
    :text-align "center"
    :font-weight "bold"
    :font-size (em 1.5)}]

  [:.book-container>.intro>.series
   {:font-size (em 1.5)}]

  [:.book-container>.author
   {:text-align "center"
    :font-size (em 1)
    :padding (em 0.5)}]


  [:.book-container>.author>.author
   {:font-style "italic"}]


  [:.book-container>.content
   {:width (px 600)}]


  (at-media
   {:max-width (px 600)}
   [:.book-container>.content
    {:width "auto"}])


  [:.book-container>.content>p
   {:line-height (em 1.5)
    :text-indent (em 1)}]


  [:.book-container>.content>h1
   {:padding-top (em 1.2)
    :display "block"}]

  [:.book-container>.content>h2
   {:padding-top (em 1.2)
    :display "block"}])
