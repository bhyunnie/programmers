class JadenCase {
    fun solution(s: String) = s.lowercase().split(" ").joinToString(" ") { if (it != "") it.replaceRange(0..0, it[0].uppercase()) else "" }
}
