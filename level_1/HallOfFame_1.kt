class HallOfFame_1 {
    fun solution(
        k: Int,
        score: IntArray,
    ): IntArray {
        val glory: MutableList<Int> = MutableList(1) { score[0] }
        val result: MutableList<Int> = MutableList(1) { score[0] }
        for (i in 1 until score.size) {
            val index = glory.indexOfFirst { it > score[i] }
            if (index > -1) {
                glory.add(index, score[i])
            } else if (index < 0 && i < k) {
                glory.add(score[i])
            } else if (index < 0) {
                glory.add(glory.size, score[i])
            }
            if (glory.size > k) {
                glory.removeAt(0)
            }
            result.add(glory.first())
        }

        return result.toIntArray()
    }
}
