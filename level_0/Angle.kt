class Angle {
    fun solution(angle: Int): Int {
        if(angle <= 90) {
            return angle/90 + 1
        } else {
            return angle/90 + 2
        }
    }
}