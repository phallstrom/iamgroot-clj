(defproject iamgroot "0.1.0-SNAPSHOT"
  :description "I am Groot"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.6.3"]
                 [environ "1.1.0"]]
  :main iamgroot.core
  :aot [iamgroot.core]
  :uberjar-name "i-am-groot-standalone.jar")
