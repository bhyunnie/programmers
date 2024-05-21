class Redraw {
    fun solution(
        n: Int,
        m: Int,
        section: IntArray,
    ): Int {
        var result = 0
        if (section.size == 1) return 1
        val new = section.filter { it -> it > (section[0] + m - 1) }
        result += 1
        if (new.size >= 1) {
            result += solution(n, m, new.toIntArray())
        }
        return result
    }
}
