;; Contains functions for parsing the files contained in
;; github.com/benzap/the-stoic-library/resources/books


(defun re-begin-paragraph-whitespace ()
  (interactive)
  (re-search-forward "^\\( \\{3,\\}\\)"))


(defun replace-next-fill-paragraph ()
  (interactive)
  (when (re-begin-paragraph-whitespace)
    (replace-match "\n")))


(defun re-begin-page-definer ()
  (interactive)
  (re-search-forward "^<.*> *$"))


(defun re-title-w-roman (title)
  (interactive "sTitle: ")
  (re-search-forward (format "^%s.*$" title)))


(defun remove-page-definer ()
  (interactive)
  (when (re-begin-page-definer)
    (replace-match "")
    (delete-blank-lines)
    (delete-blank-lines)))


(defun remove-title-w-roman (title)
  (interactive "sTitle: ")
  (when (re-title-w-roman title)
    (replace-match "")
    (delete-blank-lines)))


(defun remove-pagestamp-epistle ()
  (interactive)
  (remove-page-definer)
  (remove-title-w-roman "EPISTLE"))


(defun re-start-letter-spacer ()
  (interactive)
  (re-search-forward "^\\([A-Z]\\) [a-zA-Z]+"))


(defun format-start-of-paragraph-spacer ()
  (interactive)
  (when (re-start-letter-spacer)
    (beginning-of-line)
    (right-char 1)
    (delete-char 1)))
    

(defun remove-from-beginning (text)
  (when (re-search-forward (format "^\\(%s\\)" text))
    (replace-match "")))


(defun remove-beginning-plutarch-1 ()
  (interactive)
  (remove-from-beginning "TO THE READERS"))


(defun remove-beginning-plutarch-2 ()
  (interactive)
  (remove-from-beginning " ?THESEVS"))


(defun remove-beginning-plutarch-3 ()
  (interactive)
  (remove-from-beginning " & ROMVLVS"))


(defun remove-beginning-plutarch-4 ()
  (interactive)
  (remove-from-beginning " ?LYCVRGVS"))


(defun remove-beginning-plutarch-5 ()
  (interactive)
  (remove-from-beginning " ?NVMA"))


(defun remove-beginning-plutarch-6 ()
  (interactive)
  (remove-from-beginning " & NVMA"))


(defun remove-beginning-plutarch-7 ()
  (interactive)
  (remove-from-beginning " ?SOLON"))


(defun remove-beginning-plutarch-8 ()
  (interactive)
  (remove-from-beginning " ?PVBLICOLA"))


(defun remove-beginning-plutarch-9 ()
  (interactive)
  (remove-from-beginning " & PVBLICOLA"))


(defun remove-beginning-plutarch-10 ()
  (interactive)
  (remove-from-beginning "THEMISTOCLES"))


(defun remove-beginning-plutarch-11 ()
  (interactive)
  (remove-from-beginning "CAMILLVS"))


(defun remove-from-within (text)
  (when (re-search-forward text)
     (replace-match "")))


(defun remove-book-marker ()
  (interactive)
  (remove-from-within "<.*>"))


(defun remove-line-plutarch-vols ()
  (interactive)
  (when (re-search-forward "<.*>")
    (beginning-of-line)
    (kill-line)
    (delete-char 1)
    (delete-blank-lines)))


(defun format-paragraphs-plutarch-vol-4 ()
  (interactive)
  (setq case-fold-search nil)
  (when (re-search-forward "^[A-Z]")
    (beginning-of-line)
    (insert "\n")
    (next-line))
  (setq case-fold-search t))


(defun remove-line-beginning-with (text)
  (interactive "sText: ")
  (setq case-fold-search nil)
  (when (re-search-forward (format "^%s" text))
    (beginning-of-line)
    (kill-line)
    (delete-char 1))
  (setq case-fold-search t))


(defun remove-line-castig-1 ()
  (interactive)
  (remove-line-beginning-with "CASTIGLIONE"))


(defun remove-line-castig-2 ()
  (interactive)
  (remove-line-beginning-with "THE COURTIER"))
