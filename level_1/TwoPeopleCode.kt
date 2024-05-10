class Solution {
    fun solution(
        s: String,
        skip: String,
        index: Int,
    ): String {
        val alphabet = "abcdefghijklmnopqrstuvwxyz".split("").filter { it != "" }
        val skipMap = skip.split("").filter { it != "" }.associateWith { true }
        var result = ""
        var rest = index.toInt()

        for (i in s.indices) {
            var offset = alphabet.indexOf(s[i].toString())
            while (rest != 0) {
                if (skipMap[alphabet[(offset + 1) % alphabet.size]] != true) {
                    offset = (offset + 1) % alphabet.size
                    rest--
                } else {
                    offset = (offset + 1) % alphabet.size
                }
            }
            result += alphabet[offset]
            rest = index.toInt()
        }

        return result
        // 무제 조건을 꼼꼼히 읽자 처음 방식대로 했어도 됐다.
    }
}
