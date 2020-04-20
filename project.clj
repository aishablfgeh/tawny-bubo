(defproject uk.org.russet/tawny-bubo "0.3.2-SNAPSHOT"
  :description "Automated Scripting Framework for Tawny-OWL"
  :dependencies [[cli-matic "0.3.11"]
                 [org.clojure/clojure "1.10.1"]
                 [org.clojure/data.csv "0.1.4"]
                 [uk.org.russet/tawny-owl "2.0.3"]
                 [org.slf4j/slf4j-nop "1.7.30"]
                 [say-cheez "0.2.0"]]

  :license {:name "LGPL"
            :url "http://www.gnu.org/licenses/lgpl-3.0.txt"
            :distribution :repo}

  :plugins [[lein-binplus "0.6.6"]]
  :bin {:name "bubo"
        :bin-path "./bin"}
  :main tawny.bubo.cli
  :aot :all
  :aliases
  ;; alias test to also do install; bubo works through the command
  ;; line, so we must install before we run tests.
  {"bin-test" ["do" ["bin"] "test"]}
  :profiles
  {
   :fast
   [:base
    {:bin {:skip-realign true}}
    ]}
  )
