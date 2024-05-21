class LongJump {
	fun solution(n: Int): Long {
		val arr = LongArray(n+1)
		arr[0] = 1
		arr[1] = 1
		if (n <= 1) return arr[n]
		for (i in 2..n) {
			arr[i] = (arr[i - 1] + arr[i - 2]) % 123_456_7
		}
		return arr[n]
	}
}