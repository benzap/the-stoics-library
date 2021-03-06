(ns stl-website.views.template
  (:require
   [hiccup.page :refer [html5 include-css include-js]]
   [clj-time.core :as t]
   [clj-time.format :as f]
   [cuerdas.core :as str]
   [garden.core :refer [style]]
   [stl-website.config :refer [*root-path*]]))


(defn skeleton [title & content]
  (html5 {:ng-app "mainApp" :lang "en"}
         [:head
          [:meta {:charset "utf-8"}]
          [:title (str title " | The Stoics Library")]

          ;; Viewport
          ;;"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">"
          [:meta {:name "viewport" :content "width=device-width, initial-scale=1.0"}]

          ;; Favicons
          ;;"<link rel=\"apple-touch-icon\" sizes=\"57x57\" href=\"/apple-icon-57x57.png\">"
          ;;"<link rel=\"apple-touch-icon\" sizes=\"60x60\" href=\"/apple-icon-60x60.png\">"
          ;;"<link rel=\"apple-touch-icon\" sizes=\"72x72\" href=\"/apple-icon-72x72.png\">"
          ;;"<link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"/apple-icon-76x76.png\">"
          ;;"<link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"/apple-icon-114x114.png\">"
          ;;"<link rel=\"apple-touch-icon\" sizes=\"120x120\" href=\"/apple-icon-120x120.png\">"
          ;;"<link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"/apple-icon-144x144.png\">"
          ;;"<link rel=\"apple-touch-icon\" sizes=\"152x152\" href=\"/apple-icon-152x152.png\">"
          ;;"<link rel=\"apple-touch-icon\" sizes=\"180x180\" href=\"/apple-icon-180x180.png\">"

          [:link {:rel "apple-touch-icon" :sizes "57x57" :href (str *root-path* "/apple-icon-57x57.png")}]
          [:link {:rel "apple-touch-icon" :sizes "60x60" :href (str *root-path* "/apple-icon-60x60.png")}]
          [:link {:rel "apple-touch-icon" :sizes "72x72" :href (str *root-path* "/apple-icon-72x72.png")}]
          [:link {:rel "apple-touch-icon" :sizes "76x76" :href (str *root-path* "/apple-icon-76x76.png")}]
          [:link {:rel "apple-touch-icon" :sizes "114x114" :href (str *root-path* "/apple-icon-114x114.png")}]
          [:link {:rel "apple-touch-icon" :sizes "120x120" :href (str *root-path* "/apple-icon-120x120.png")}]
          [:link {:rel "apple-touch-icon" :sizes "144x144" :href (str *root-path* "/apple-icon-144x144.png")}]
          [:link {:rel "apple-touch-icon" :sizes "152x152" :href (str *root-path* "/apple-icon-152x152.png")}]
          [:link {:rel "apple-touch-icon" :sizes "180x180" :href (str *root-path* "/apple-icon-180x180.png")}]          

          ;;"<link rel=\"icon\" type=\"image/png\" sizes=\"192x192\"  href=\"/android-icon-192x192.png\">"
          [:link {:rel "icon" :type "image/png" :sizes "192x192" :href (str *root-path* "/android-icon-192x192.png")}]
          

          ;;"<link rel=\"icon\" type=\"image/png\" sizes=\"32x32\" href=\"/favicon-32x32.png\">"
          ;;"<link rel=\"icon\" type=\"image/png\" sizes=\"96x96\" href=\"/favicon-96x96.png\">"
          ;;"<link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"/favicon-16x16.png\">"
          
          [:link {:rel "icon" :type "image/png" :sizes "32x32" :href (str *root-path* "/favicon-32x32.png")}]
          [:link {:rel "icon" :type "image/png" :sizes "96x96" :href (str *root-path* "/favicon-96x96.png")}]
          [:link {:rel "icon" :type "image/png" :sizes "16x16" :href (str *root-path* "/favicon-16x16.png")}]

          ;;"<link rel=\"manifest\" href=\"/manifest.json\">"

          [:link {:rel "manifest" :href (str *root-path* "/manifest.json")}]

          "<meta name=\"msapplication-TileColor\" content=\"#ffffff\">"
          "<meta name=\"msapplication-TileImage\" content=\"/ms-icon-144x144.png\">"
          "<meta name=\"theme-color\" content=\"#ffffff\">"


          ;; CSS Stylesheets
          (include-css "https://fonts.googleapis.com/css?family=Merriweather:400,700")
          (include-css "https://fonts.googleapis.com/css?family=Roboto")
          (include-css (str *root-path* "/css/compiled/stl-website.css"))]

         [:body
          (apply list content)
          (include-js (str *root-path* "/js/compiled/stl-website.js"))]))


(defn menu-item [name url]
  [:div.menu-item [:a {:href url} name]])


(defn main [title & content]
  (skeleton
   title
   [:div.body-container
    [:div.header-container
     [:div.header-title "The Stoics Library"]
     [:div.header-nav
      (menu-item "Home" (str *root-path* "/index.html"))
      ;;(menu-item "About" "/about.html")
      ;;(menu-item "Principles of Stoicism" "/principles_of_stoicism.html")
      (menu-item "Online Texts" (str *root-path* "/texts.html"))]]
      ;;(menu-item "Other Resources" "/other_resources.html")]]
    [:div.content-container
     content]
    [:div.footer-container
     [:div.acknowledgement "Several text resources can be credited to "
      [:a {:href "http://stoics.com"} "stoics.com"] " and "
      [:a {:href "http://classics.mit.edu"} "classics.mit.edu"]]]]))
    
   
   
