class MakeWeirdWord {
    fun solution(s: String): String {
        return s.split(" ").toTypedArray().map {
                word ->
            word.mapIndexed {
                    index,
                    it,
                ->
                if (index % 2 == 0) it.uppercase() else it.lowercase()
            }.joinToString("")
        }.joinToString(" ")
    }
}
