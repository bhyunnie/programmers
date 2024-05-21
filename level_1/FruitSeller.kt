class FruitSeller {
    fun solution(
        k: Int,
        m: Int,
        score: IntArray,
    ): Int {
        var totalPrice = 0
        val sortedScore = score.filter { it <= k }.sortedDescending()

        for (i in 0..sortedScore.size - m step m) {
            totalPrice += sortedScore[i + m - 1] * m
        }
        return totalPrice
    }
}
