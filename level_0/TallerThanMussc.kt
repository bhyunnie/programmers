class TallerThanMussc {
    fun solution(array: IntArray, height: Int): Int {
        return array.filter{height < it}.size
    }
}