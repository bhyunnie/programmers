class Solution {
    fun solution(array: IntArray, n: Int): Int {
        return array.filter{it === n}.size
    }
}