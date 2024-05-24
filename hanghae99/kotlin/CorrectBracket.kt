package hanghae99.kotlin

class CorrectBracket {
	fun solution(s: String): Boolean {
		var count = 0
		s.forEach {
			if (it == '(') {
				count++
			}
			if (it == ')') {
				count--
				if (count < 0) return false
			}
		}
		return count == 0
	}
}