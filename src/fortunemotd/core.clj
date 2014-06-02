(ns fortunemotd.core
  (:gen-class))

(use '[clojure.java.shell :only [sh]])

(defn -main
  "Run the fortune command and print the output"
  [& args]
  (println (get (sh "fortune") :out)))
