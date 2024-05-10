class Solution {
    fun solution(answers: IntArray): IntArray {
        val patterns =
            arrayOf(
                intArrayOf(1, 2, 3, 4, 5),
                intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
                intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5),
            )
        val scores = IntArray(3)

        for ((index, answer) in answers.withIndex()) {
            for ((i, pattern) in patterns.withIndex()) {
                if (pattern[index % pattern.size] == answer) {
                    scores[i]++
                }
            }
        }

        val maxScore = scores.maxOrNull() ?: 0

        return scores.mapIndexed { index, score ->
            if (score == maxScore) index + 1 else null
        }.filterNotNull().toIntArray()
    }
}
