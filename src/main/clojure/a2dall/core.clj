(ns a2dall.core
  (:import (com.a2dict.a2dall.domain People)))

(defn hello ^String []
  "hello world")

(defn new-people ^People
  ([] (new-people "idx" "foo"))
  ([id name]
   (doto (People.)
     (.setId id)
     (.setName name))))