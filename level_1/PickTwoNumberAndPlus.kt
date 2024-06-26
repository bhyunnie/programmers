class PickTwoNumberAndPlus {
    fun solution(numbers: IntArray): IntArray {
        val temp = mutableListOf<Int>()
        for (i in 0 until numbers.size - 1) {
            for (j in i + 1 until numbers.size) {
                temp.add(numbers[i] + numbers[j])
            }
        }
        return temp.toSet().toIntArray().sortedArray()
    }
}
