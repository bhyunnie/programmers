class CenterValue {
    fun solution(array: IntArray): Int {
        return array.sortedArray()[array.size / 2]
    }
}