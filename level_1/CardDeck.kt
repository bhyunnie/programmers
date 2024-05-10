class Solution {
    fun solution(
        cards1: Array<String>,
        cards2: Array<String>,
        goal: Array<String>,
    ): String {
        var offset1 = 0
        var offset2 = 0

        goal.forEach { it ->
            if (offset1 < cards1.size && cards1[offset1] == it) {
                offset1 += 1
            } else if (offset2 < cards2.size && cards2[offset2] == it) {
                offset2 += 1
            } else {
                return "No"
            }
        }

        return "Yes"
    }
}
