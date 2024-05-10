class Solution {
    fun solution(
        name: Array<String>,
        yearning: IntArray,
        photo: Array<Array<String>>,
    ): IntArray {
        var nameMap = name.mapIndexed { index, it -> it to yearning[index] }.toMap()

        return photo.map { shot ->
            shot.fold(0 as Int) { acc, cur ->
                acc.plus((nameMap[cur] ?: 0).toInt() ?: 0)
            }
        }.toIntArray()
    }
}
