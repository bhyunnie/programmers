class Solution {
    fun solution(babbling: Array<String>): Int {
        var result = 0
        babbling.forEach {
            val babbleMap = mutableMapOf("aya" to true, "ye" to true, "woo" to true, "ma" to true)
            var offset = 0
            var prev = ""
            while (offset < it.length) {
                if (offset + 1 <= it.length - 1 && babbleMap[it.slice(offset..offset + 1)] == true) {
                    if (prev == it.slice(offset..offset + 1)) break
                    prev = it.slice(offset..offset + 1)
                    offset += 2
                } else if (offset + 2 <= it.length - 1 && babbleMap[it.slice(offset..offset + 2)] == true) {
                    if (prev == it.slice(offset..offset + 2)) break
                    prev = it.slice(offset..offset + 2)
                    offset += 3
                } else {
                    break
                }
            }
            if (offset == it.length) result++
        }

        return result
    }
}
