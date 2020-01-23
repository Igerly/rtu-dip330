(ns darbs5.core
	(:require [clojure.string :as str])
	)

(defn encrypt [string key]
	(def modifiedString (str/replace string " " "_"))
	(def stringLength (count modifiedString))
 (def encryptedString "")
 (def step (- (* key 2) 2))

 (dotimes [x key]
	 (dotimes [y stringLength]
	 	(when (or (= 0 (mod (+ x y) step)) (= 0 (mod (- y x) step)))
				(def encryptedString (str encryptedString (nth modifiedString y))))
	 )
 )

 (println (str "Encrypted text of " string " with " key " rows is " encryptedString))
)