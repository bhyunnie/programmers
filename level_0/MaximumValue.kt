class Solution {
    fun solution(numbers: IntArray): Int {
        return numbers.sortedArrayDescending()[0] * numbers.sortedArrayDescending()[1]
    }
}
