(ns darbs4.core)

(defn getAverageGrade 
  [grades]

  (def filteredStudents (into (sorted-map)
   (filter #(= "a" (subs (first %) (- (count (first %)) 1))) grades))
  )

  (def averageGrade
    (float (/ (reduce + (vals filteredStudents)) (count (vals filteredStudents))))
  )

	(println (str "Average grade of valid students is " averageGrade))
)