class Solution {
    fun solution(array: IntArray, height: Int): Int {
        return array.filter{height < it}.size
    }
}