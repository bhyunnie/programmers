class AverageOfArray {
    fun solution(numbers: IntArray): Double {
        var sum = 0
        for(i in 0 until numbers.size) {
            sum += numbers[i]
        }
        return sum.toDouble() / numbers.size
    }

    fun solution2(numbers: IntArray):Double {
        return numbers.average()
    }
}