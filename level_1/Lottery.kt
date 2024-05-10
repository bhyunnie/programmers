class Solution {
    fun solution(
        lottos: IntArray,
        win_nums: IntArray,
    ): IntArray {
        var zeroCount = 0
        val correct = mutableListOf<Int>()
        lottos.forEach {
            if (it == 0) {
                zeroCount++
            } else if (win_nums.indexOf(it) != -1) {
                correct.add(it)
            }
        }

        val maxRank = if ((correct.size + zeroCount) < 2) 6 else 7 - (correct.size + zeroCount)
        val minRank = if (correct.size < 2) 6 else 7 - correct.size
        return intArrayOf(maxRank, minRank)
    }
}
