(ns clojure-test.core
  (:gen-class)
  (:require [clojure-test.hobbit :as hobbit])
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (hobbit/symmetrize-body-parts hobbit/asym-hobbit-body-parts)))
