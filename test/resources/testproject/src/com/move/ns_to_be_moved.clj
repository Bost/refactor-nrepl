(ns com.move.ns-to-be-moved)

(def var-to-be-moved)
(def ^:private private-var-to-be-moved)

(defmacro macro-to-be-moved [& body])

(defn fn-to-be-moved [arg]
  (println arg))

(defn- private-fn-to-be-moved [arg]
  (println arg))

(deftype TypeToBeMoved [field])
(deftype TypeToBeMovedAndFullyQualified [field])

(defrecord RecordToBeMovedAndFullyQualified [field])
(defrecord RecordToBeMoved [field])
