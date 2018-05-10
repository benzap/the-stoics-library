(ns stl-website.views.home
  (:require
   [stl-website.views.template :as template]
   [stl-website.config :refer [*root-path*]]))


(defn p-home [ctx]
  (template/main
   "Home"
   [:div.home-container
    [:div.banner
     [:span "Welcome to The Stoics Library"]]
    [:div.content-sections
     [:div.section-parent
      [:div.section-title "Recommended Online Texts"]
      [:div.section-container
       [:ul
        [:li [:a {:href (str *root-path* "/marcus-aurelius/meditations/book-two/")}
              "Meditations by Marcus Aurelius"]]
        [:li [:a {:href (str *root-path* "/epictetus/the-enchiridion/full-text/")}
              "The Enchiridion by Epictetus"]]
        [:li [:a {:href (str *root-path* "/seneca/epistles/volume-one/")}
              "Senecas's Epistles"]]]
       [:span.bottom-link [:a {:href (str *root-path* "/texts.html")} "See all Online Texts"]]]]

     [:div.section-parent
      [:div.section-title "Recommended Books"]
      [:div.section-container
       [:ul
        [:li [:a {:href "http://a.co/7Bl7qI3"} "A Guide to the Good Life"]]]]]

     [:div.section-parent
      [:div.section-title "Recommended Online Resources"]
      [:div.section-container
       [:ul
        [:li [:a {:href "http://www.iep.utm.edu/stoicism/"} "Philosophy of Stoicism"]]
        [:li [:a {:href "http://stoics.com"} "Additional Stoic Texts"]]]]]]]))


;;(p-home)
