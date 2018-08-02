(ns iamgroot.core
  (:gen-class)
  (:require [ring.adapter.jetty :as jetty])
  (:require [environ.core :refer [env]]))

(defn -main
  "A very simple web server"
  [& [port-number]]
  (jetty/run-jetty
    (fn [request] {:status 200
                   :body "<h1>I am Groot</h1>"
                   :headers {"Content-Type" "text/html"}})
    {:port (Integer. (or port-number (env :port) 8080))}))
