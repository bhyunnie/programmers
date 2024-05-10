class Solution {
    fun solution(
        a: Int,
        b: Int,
        n: Int,
    ): Int {
        if (n < a) return 0
        var reward = (n / a) * b
        val rest = n % a

        if (reward + rest >= a) {
            val recursiveReward = solution(a, b, reward + rest)
            reward += recursiveReward
        }

        return reward
    }
}
