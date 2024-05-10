class Solution {
    fun solution(food: IntArray): String {
        var result: String = ""

        food.slice(1 until food.size).forEachIndexed { index, item ->
            repeat(item / 2) { result += index + 1 }
        }
        val reversed = result.reversed()
        result += "0".repeat(food[0])
        result += reversed

        return result
    }
}
