class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        val sortedArray =
            sizes.map {
                it.sortedArray()
            }
        return sortedArray.reduce {
                acc,
                cur,
            ->
            if (acc[0] >= cur[0]) acc else cur
        }[0] * sortedArray.reduce { acc, cur -> if (acc[1] >= cur[1]) acc else cur }[1]
    }
}
