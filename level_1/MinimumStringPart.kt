class Solution {
    fun solution(
        t: String,
        p: String,
    ): Int {
        var count = 0
        for (i in 0..t.length - p.length) {
            if (t.slice(i..i + p.length - 1).toBigInteger() <= p.toBigInteger()) {
                count += 1
            }
        }
        return count
    }
}
