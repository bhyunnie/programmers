package hanghae99.kotlin

import java.util.*

class MoreSpicy {
	fun solution(scoville:IntArray, K: Int):Int {
		var answer = 0
		val pq = PriorityQueue<Int>()
		for (i in scoville) {
			pq.add(i)
		}
		var min = pq.peek()
		while(min < K) {
			if(pq.size >= 2) {
				pq.add(pq.poll() + (pq.poll()*2))
				min = pq.peek();
				answer++
			}
			if (pq.size < 2){
				return -1
			}
		}
		return answer
	}
}