class Solution {
    fun solution(s: String): Int {
        var offset = 0
        var left = 0
        var right = 0
        var result = 0

        s.forEachIndexed { i, it ->
            if (s[offset] == it) left++ else right++
            if (left == right) {
                left = 0
                right = 0
                result++
                offset = i + 1
            }
        }

        if (left + right > 0) result++

        return result
    }
}
