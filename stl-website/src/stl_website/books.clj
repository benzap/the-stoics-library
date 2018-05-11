(ns stl-website.books
  (:require
   [markdown.core :as markdown]
   [stl-website.views.template :as template]
   [stl-website.config :refer [*root-path*]]
   [cuerdas.core :as str]))


(def book-dir "../resources/books/")


(defn md-book-resource [path]
  (markdown/md-to-html-string (slurp (str book-dir path)) :heading-anchors true))


(def book-listing
  [
   {:author "Marcus Aurelius"
    :translated-by "George Long"
    :series "Meditations"
    :title "Book One"
    :number 1
    :content (md-book-resource "marcus_aurelius_meditations/book01.md")}

   {:author "Marcus Aurelius"
    :translated-by "George Long"
    :series "Meditations"
    :title "Book Two"
    :number 2
    :content (md-book-resource "marcus_aurelius_meditations/book02.md")}

   {:author "Marcus Aurelius"
    :translated-by "George Long"
    :series "Meditations"
    :title "Book Three"
    :number 3
    :content (md-book-resource "marcus_aurelius_meditations/book03.md")}

   {:author "Marcus Aurelius"
    :translated-by "George Long"
    :series "Meditations"
    :title "Book Four"
    :number 4
    :content (md-book-resource "marcus_aurelius_meditations/book04.md")}

   {:author "Marcus Aurelius"
    :translated-by "George Long"
    :series "Meditations"
    :title "Book Five"
    :number 5
    :content (md-book-resource "marcus_aurelius_meditations/book05.md")}

   {:author "Marcus Aurelius"
    :translated-by "George Long"
    :series "Meditations"
    :title "Book Six"
    :number 6
    :content (md-book-resource "marcus_aurelius_meditations/book06.md")}

   {:author "Marcus Aurelius"
    :translated-by "George Long"
    :series "Meditations"
    :title "Book Seven"
    :number 7
    :content (md-book-resource "marcus_aurelius_meditations/book07.md")}

   {:author "Marcus Aurelius"
    :translated-by "George Long"
    :series "Meditations"
    :title "Book Eight"
    :number 8
    :content (md-book-resource "marcus_aurelius_meditations/book08.md")}

   {:author "Marcus Aurelius"
    :translated-by "George Long"
    :series "Meditations"
    :title "Book Nine"
    :number 9
    :content (md-book-resource "marcus_aurelius_meditations/book09.md")}

   {:author "Marcus Aurelius"
    :translated-by "George Long"
    :series "Meditations"
    :title "Book Ten"
    :number 10
    :content (md-book-resource "marcus_aurelius_meditations/book10.md")}

   {:author "Marcus Aurelius"
    :translated-by "George Long"
    :series "Meditations"
    :title "Book Eleven"
    :number 11
    :content (md-book-resource "marcus_aurelius_meditations/book11.md")}

   {:author "Marcus Aurelius"
    :translated-by "George Long"
    :series "Meditations"
    :title "Book Twelve"
    :number 12
    :content (md-book-resource "marcus_aurelius_meditations/book12.md")}

   {:author "Epictetus"
    :translated-by "Elizabeth Carter"
    :series "The Enchiridion"
    :title "Full Text"
    :number 1
    :content (md-book-resource "epictetus_enchiridion/root.md")}

   {:author "Epictetus"
    :translated-by "N/A"
    :series "Discourses"
    :title "Book One"
    :number 1
    :content (md-book-resource "epictetus_discourses/book01.md")}

   {:author "Epictetus"
    :translated-by "N/A"
    :series "Discourses"
    :title "Book Two"
    :number 2
    :content (md-book-resource "epictetus_discourses/book02.md")}

   {:author "Epictetus"
    :translated-by "N/A"
    :series "Discourses"
    :title "Book Three"
    :number 3
    :content (md-book-resource "epictetus_discourses/book03.md")}

   {:author "Epictetus"
    :translated-by "N/A"
    :series "Discourses"
    :title "Book Four"
    :number 4
    :content (md-book-resource "epictetus_discourses/book04.md")}

   {:author "Seneca"
    :translated-by "Richard M. Gummere"
    :series "Epistles"
    :title "Volume One"
    :number 1
    :content (md-book-resource "seneca_epistles_vol_1/root.md")}

   {:author "Seneca"
    :translated-by "Richard M. Gummere"
    :series "Epistles"
    :title "Volume Two"
    :number 2
    :content (md-book-resource "seneca_epistles_vol_2/root.md")}

   {:author "Seneca"
    :translated-by "Richard M. Gummere"
    :series "Epistles"
    :title "Volume Three"
    :number 3
    :content (md-book-resource "seneca_epistles_vol_3/root.md")}

   {:author "Seneca"
    :translated-by "John W. Basore"
    :series "Essays Volume 1"
    :title "On Providence"
    :number 1
    :content (md-book-resource "seneca_essays_vol_1/providence.md")}

   {:author "Seneca"
    :translated-by "John W. Basore"
    :series "Essays Volume 1"
    :title "On Firmness"
    :number 2
    :content (md-book-resource "seneca_essays_vol_1/firmness.md")}

   {:author "Seneca"
    :translated-by "John W. Basore"
    :series "Essays Volume 1"
    :title "On Anger"
    :number 3
    :content (md-book-resource "seneca_essays_vol_1/on_anger.md")}

   {:author "Seneca"
    :translated-by "John W. Basore"
    :series "Essays Volume 1"
    :title "On Mercy"
    :number 4
    :content (md-book-resource "seneca_essays_vol_1/mercy.md")}

   {:author "Seneca"
    :translated-by "John W. Basore"
    :series "Essays Volume 2"
    :title "On Consolation"
    :number 1
    :content (md-book-resource "seneca_essays_vol_2/on_consolation.md")}

   {:author "Seneca"
    :translated-by "John W. Basore"
    :series "Essays Volume 2"
    :title "On The Happy Life"
    :number 2
    :content (md-book-resource "seneca_essays_vol_2/on_the_happy_life.md")}

   {:author "Seneca"
    :translated-by "John W. Basore"
    :series "Essays Volume 2"
    :title "On Leisure"
    :number 3
    :content (md-book-resource "seneca_essays_vol_2/on_leisure.md")}

   {:author "Seneca"
    :translated-by "John W. Basore"
    :series "Essays Volume 2"
    :title "On Tranquility of Mind"
    :number 4
    :content (md-book-resource "seneca_essays_vol_2/on_tranquility_of_mind.md")}

   {:author "Seneca"
    :translated-by "John W. Basore"
    :series "Essays Volume 2"
    :title "On Shortness of Life"
    :number 5
    :content (md-book-resource "seneca_essays_vol_2/on_shortness_of_life.md")}

   {:author "Seneca"
    :translated-by "John W. Basore"
    :series "Essays Volume 3"
    :title "On Benefits Book I"
    :number 1
    :content (md-book-resource "seneca_essays_vol_3/on_benefits_book_1.md")}

   {:author "Seneca"
    :translated-by "John W. Basore"
    :series "Essays Volume 3"
    :title "On Benefits Book II"
    :number 2
    :content (md-book-resource "seneca_essays_vol_3/on_benefits_book_2.md")}

   {:author "Seneca"
    :translated-by "John W. Basore"
    :series "Essays Volume 3"
    :title "On Benefits Book III"
    :number 3
    :content (md-book-resource "seneca_essays_vol_3/on_benefits_book_3.md")}

   {:author "Seneca"
    :translated-by "John W. Basore"
    :series "Essays Volume 3"
    :title "On Benefits Book IV"
    :number 4
    :content (md-book-resource "seneca_essays_vol_3/on_benefits_book_4.md")}

   {:author "Seneca"
    :translated-by "John W. Basore"
    :series "Essays Volume 3"
    :title "On Benefits Book V"
    :number 5
    :content (md-book-resource "seneca_essays_vol_3/on_benefits_book_5.md")}])


(defn generate-book-url
  [{:keys [author series title]}]
  (str "/" (str/slug author) "/" (str/slug series) "/" (str/slug title) "/"))


(defn generate-page-title
  [{:keys [author series title]}]
  (str author " - " series " - " title))


;; (generate-book-url (first book-listing))


(defn group-by-author [listing]
  (group-by :author listing))


(defn group-by-series [listing]
  (group-by :series listing))


(defn generate-text-index []
  (template/main
   "Texts"
   [:div.texts-container
    [:div.text-listings
     (for [[author author-content] (group-by-author book-listing)]
       [:div.author-listing
        [:div.author author]
        (for [[series series-content] (group-by-series author-content)]
          [:div.series-listing
           [:div.series series]
           [:div.series-content
            (for [book-content (sort-by :number series-content)]
              [:div.book-listing
               [:a {:href (str *root-path* (generate-book-url book-content))}
                (:title book-content)]])]])])]]))


(defn generate-books []
  (->> book-listing
       (map (fn [book] 
              [(generate-book-url book)
               (template/main (generate-page-title book)
                              [:div.book-container
                               [:div.intro [:div.series (:series book)]
                                           [:div.title (:title book)]]
                               [:div.author "by " [:span.author (:author book)]]
                               [:div.translated-by
                                "Translated by " [:span.translated-by (:translated-by book)]]
                               [:div.content (:content book)]])]))
       (into {})))


;; (generate-books)


(defn pages-online-text []
  (merge
   {"/texts.html" (generate-text-index)}
   (generate-books)))
