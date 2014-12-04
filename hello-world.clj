(ns ccw-plugin.hello-world
  (:require [ccw.eclipse :as e]
            [ccw.e4.dsl :refer :all]))

(defcommand greeter "Hello World from Counterclockwise" "Alt+U H"
  [context]
  (e/info-dialog 
    "Hello world from Counterclockwise" "This popup provided to you from a user script!"))
