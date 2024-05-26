package hanghae99.kotlin

import java.sql.Time
import java.util.Date

class MaximumNumber {
	fun solution(numbers:IntArray):String {
		val str = numbers.map{it.toString()}.sortedWith({ o1, o2 -> (o2+o1).compareTo(o1+o2)})
		if (str[0] == "0") return "0"
		return str.joinToString("")
	}
}