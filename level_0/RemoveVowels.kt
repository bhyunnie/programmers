class RemoveVowels {
    fun solution(my_string: String): String {
        return my_string.filter { !"aeiou".contains(it.lowercase()) }
    }
}
