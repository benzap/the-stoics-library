(ns marcparse.config)


(def db-spec
 {:classname   "org.sqlite.JDBC"
  :subprotocol "sqlite"
  :subname     "/resources/db/stoic_library.sqlite3"})
