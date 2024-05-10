class Solution {
    fun solution(slice: Int, n: Int):Double {
        return Math.ceil(n / slice.toDouble())
    }
}