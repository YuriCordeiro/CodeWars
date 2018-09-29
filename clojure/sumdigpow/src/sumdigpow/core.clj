(ns sumdigpow.core)

(defn sum-dig-pow [a b]
    (loop [pos a]
      (when (<= pos b)
      ;; verifiy the number length
    (if (> (.length (str pos)) 1)
      ; (println pos "'s length it's bigger than one.")
     ;; pow the number to the int position
      
      (doseq [i (map #(Character/digit % 10) (str pos)) ]
        
        (reduce (java.lang.Math/pow i (+ (.indexOf (map #(Character/digit % 10) (str pos)) i) 1) ))
        
        ; (println 
        ;  i " elevado à " 
        ;  (+ (.indexOf (map #(Character/digit % 10) (str pos)) i) 1) 
        ;  " é igual a = " (java.lang.Math/pow i (+ (.indexOf (map #(Character/digit % 10) (str pos)) i) 1) )
        ;  )
        )
      
    )
      ;; sum erevything
    (recur (inc pos))
    ))
  )

; (get (into [] (map #(Character/digit % 10) (str 942))) 0)

(sum-dig-pow 27 27)


(.indexOf (map #(Character/digit % 10) (str 945)) 5)

(str 945)



;; https://www.codewars.com/kata/5626b561280a42ecc50000d1/train/clojure


; (doseq [i (map #(Character/digit % 10) (str 942))] (println i))

; (map #(Character/digit % 10) (str 942))



(reduce +
(map #(Character/digit % 10) (str 942))
        )

(doseq [x [1 2 3]]
  x)