class Solution {
    fun solution(s: String): IntArray {
        var count = 0
        var zeroCount = 0
        var current = s

        while (current != "1") {
            zeroCount += current.replace("1", "").length
            current = Integer.toBinaryString(current.replace("0", "").length)
            count++
        }

        return intArrayOf(count, zeroCount)
    }
}
