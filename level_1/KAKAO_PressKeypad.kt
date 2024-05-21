import kotlin.math.abs

class KAKAO_PressKeypad {
    fun solution(
        numbers: IntArray,
        hand: String,
    ): String {
        var left: Pair<Int, Int> = Pair(3, 0)
        var right: Pair<Int, Int> = Pair(3, 2)
        var result = ""

        fun moveLeft(n: Int) {
            left = Pair((n - 1) / 3, (n - 1) % 3)
            result += "L"
        }

        fun moveRight(n: Int) {
            right = Pair((n - 1) / 3, (n - 1) % 3)
            result += "R"
        }
        numbers.forEach { n ->
            when (n) {
                in arrayOf(1, 4, 7) -> moveLeft(n)
                in arrayOf(3, 6, 9) -> moveRight(n)
                in arrayOf(2, 5, 8, 0) -> {
                    val k = if (n == 0) 11 else n
                    val i = (k - 1) / 3
                    val j = (k - 1) % 3
                    val leftDistance = abs(left.first - i) + abs(left.second - j)
                    val rightDistance = abs(right.first - i) + abs(right.second - j)
                    if (leftDistance > rightDistance) {
                        moveRight(k)
                    } else if (leftDistance == rightDistance) {
                        println(hand == "left")
                        if (hand == "left") moveLeft(k) else moveRight(k)
                    } else {
                        moveLeft(k)
                    }
                }
            }
        }
        return result
    }
}
