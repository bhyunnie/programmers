class Solution {
    fun solution(n: Int): Int {
        if (n == 0) return 0
        var num = n
        var result = ""
        while (num >= 1) {
            result = (num % 3).toString() + result
            num /= 3
        }
        return result.foldIndexed(0) { index, acc, cur -> (acc + cur.digitToInt() * Math.pow(3.0, index.toDouble()).toInt()) }
    }
}
