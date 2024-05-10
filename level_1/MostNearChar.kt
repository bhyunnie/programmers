class Solution {
    fun solution(s: String): IntArray {
        val newMap: MutableMap<String, Int> = mutableMapOf()
        val result =
            s.mapIndexed { index, it ->
                val lastIndex = newMap[it.toString()] ?: -1
                if (lastIndex == -1) {
                    newMap[it.toString()] = index
                    return@mapIndexed -1
                } else {
                    val res = index - (newMap[it.toString()]?.toInt() ?: 0)
                    newMap[it.toString()] = index
                    return@mapIndexed res
                }
            }.toIntArray()

        return result
    }
}
