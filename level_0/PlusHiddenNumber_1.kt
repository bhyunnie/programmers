class Solution {
    fun solution(my_string: String): Int {
        return my_string.replace(Regex("\\D"), "").map { it.digitToInt() }.fold(0) { acc, cur -> acc + cur.toInt() }
    }
}
