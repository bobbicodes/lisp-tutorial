(defn myrange [a b]
  (take (- b a) (iterate inc a)))