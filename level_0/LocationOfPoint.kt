class LocationOfPoint {
    fun solution(dot: IntArray): Int {
        val x = dot[0]
        val y = dot[1]
        when {
            x > 0 && y > 0 -> return 1
            x < 0 && y > 0 -> return 2
            x < 0 && y < 0 -> return 3
            else -> return 4
        }
    }
}
