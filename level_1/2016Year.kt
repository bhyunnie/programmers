class Solution {
    fun solution(
        a: Int,
        b: Int,
    ): String {
        val dayCount = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        var daySum = 0

        for (i in 0 until a - 1) {
            daySum += dayCount[i]
        }

        // 0 일땐 목요일
        return when ((daySum + b) % 7) {
            0 -> "THU"
            1 -> "FRI"
            2 -> "SAT"
            3 -> "SUN"
            4 -> "MON"
            5 -> "TUE"
            6 -> "WED"
            else -> ""
        }
    }
}
