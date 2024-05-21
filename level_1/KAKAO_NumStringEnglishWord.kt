class KAKAO_NumStringEnglishWord {
    fun solution(s: String): Int {
        var temp = ""
        var result = arrayOf<String>()
        var numbers = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
        for (it in s) {
            if (it.uppercase() in "A".."Z") {
                temp += it
                if (numbers.indexOf(temp) >= 0) {
                    result += numbers.indexOf(temp).toString()
                    temp = ""
                }
            } else {
                result += it.toString()
            }
        }
        return result.joinToString("").toInt()
    }
}
