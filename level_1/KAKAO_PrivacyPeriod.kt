class Solution {
    fun solution(
        today: String,
        terms: Array<String>,
        privacies: Array<String>,
    ): IntArray {
        val termsLimitMap: MutableMap<String, Int> = mutableMapOf()
        val result = mutableListOf<Int>()

        terms.forEach {
            val keyAndValue = it.split(" ")
            termsLimitMap[keyAndValue[0]] = keyAndValue[1].toInt()
        }

        privacies.forEachIndexed { index, p ->
            val splitedP = p.split(" ")
            val date = splitedP[0]
            val type = splitedP[1]
            var year = splitedP[0].split(".")[0].toInt()
            var month = splitedP[0].split(".")[1].toInt()
            val day = splitedP[0].split(".")[2]

            year += ((month + termsLimitMap[type]!! - 1) / 12).toInt()
            month = if ((month + termsLimitMap[type]!!) % 12 == 0) 12 else (month + termsLimitMap[type]!!) % 12

            if ("$year${if (month < 10) "0$month" else month}$day".toInt() <= today.replace(".", "").toInt()) result.add(index + 1)
        }

        return result.toIntArray()
    }
}
