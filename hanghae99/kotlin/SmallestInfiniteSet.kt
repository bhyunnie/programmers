package hanghae99.kotlin

import java.util.*

class SmallestInfiniteSet {
	var pq: PriorityQueue<Int>? = null
	var i: Int = 1

	fun SmallestInfiniteSet() {
		pq = PriorityQueue()
	}

	fun popSmallest(): Int {
		return if (pq != null && pq!!.isEmpty()) {
			i++
		} else {
			pq!!.poll()
		}
	}

	fun addBack(num: Int) {
		if (num < i && !pq!!.contains(num)) {
			pq!!.add(num)
		}
	}

}