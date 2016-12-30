(ns clojure-test.exercises)

;; http://www.braveclojure.com/do-things/
;; Exercise 1
(def ex1-1 (str "First " "exercise"))
(def ex1-2 (vector 1 "2" :3 nil))
(def ex1-3 (list 1 "2" :3 nil))
(def ex1-4 (hash-map :1 "1" :second "2" :nil nil))
(def ex1-5 (hash-set :a :a 2 "2" 2))

;; Exercise 2
(defn add100 [n] (+ n 100))
;; (add100 1/4) => 401/4

;; Exercise 3
(defn dec-maker [dec-by] #(- % dec-by))

;; Exercise 4
(defn mapset [f coll] (apply hash-set (map f coll)))
