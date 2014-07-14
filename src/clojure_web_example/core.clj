(ns clojure-web-example.core
  (:use ring.adapter.jetty)  ;; for testing?
)

(defn handler 
  "I don't do a whole lot."
  [request]
{:status 200
 :header {"Content-Type" "text/plain"}
 :body "Yo From Clojure..whats up?"})

;;(run-jetty handler {:port 8889 })  ;; for testing!
