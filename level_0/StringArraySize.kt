class StringArraySize {
    fun solution(strlist: Array<String>): IntArray {
        return strlist.map { it.length }.toIntArray()
    }
}
