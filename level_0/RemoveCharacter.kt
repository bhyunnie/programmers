class RemoveCharacter {
    fun solution(my_string: String, letter: String): String {
        return my_string.filter{ it != letter.firstOrNull() }
    }
}