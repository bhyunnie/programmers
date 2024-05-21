class CeaserCrypto {
    fun solution(
        s: String,
        n: Int,
    ): String {
        return s.map {
            if (it.toString() == " ") return@map it
            if (it.toString() == it.uppercase()) {
                return@map ((it.code - 'A'.code + n) % 26 + 'A'.code).toChar()
            } else {
                return@map ((it.code - 'a'.code + n) % 26 + 'a'.code).toChar()
            }
        }.joinToString("")
    }
}
