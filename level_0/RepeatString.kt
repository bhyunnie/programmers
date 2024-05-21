class RepeatString {
    fun solution(my_string: String, n: Int): String {
        var result = ""
        for (char in my_string) {
            for (i in 1..n) {
                result += char
            }
        }
        return result
    }
}