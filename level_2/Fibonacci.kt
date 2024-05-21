class Fibonacci {
    fun solution(n: Int): Int {
        val pibo = mutableMapOf(0 to 0, 1 to 1)

        for (i in 2..n) {
            pibo[i] = (pibo[i - 1]!! + pibo[i - 2]!!) % 1234567
        }

        return pibo[n]!!
    }
}
