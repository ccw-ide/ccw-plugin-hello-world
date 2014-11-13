(ns ccw-plugin.hello-world
  (:require [ccw.eclipse :as e]
            [ccw.e4.dsl :refer :all]))

(defn greet [context] 
  (e/info-dialog 
    "Hello world from Counterclockwise" "This popup provided to you from a user script!"))

(defcommand greeter "Hello World from Counterclockwise")
(defhandler greeter greet)
(defkeybinding greeter "Alt+U H")
