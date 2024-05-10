class Solution {
    fun solution(
        n: Int,
        lost: IntArray,
        reserve: IntArray,
    ): Int {
        val lostMap = lost.associateWith { true }
        val reserveMap = reserve.associateWith { true }.toMutableMap()
        var result = 0

        lost.sorted().forEach {
            for (i in it - 1..it + 1) {
                if (reserveMap[it] == true && lostMap[i] == true) {
                    result++
                    break
                }
                if (reserveMap[i] == true && lostMap[i] != true) {
                    reserveMap[i] = false
                    result++
                    break
                }
            }
        }

        return n - lost.size + result
    }
}
