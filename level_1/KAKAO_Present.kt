class Solution {
    fun solution(
        friends: Array<String>,
        gifts: Array<String>,
    ): Int {
        val scoreMap = friends.associateWith { 0 }.toMutableMap()
        val giftMap = friends.associateWith { friends.associateWith { 0 }.toMutableMap() }.toMutableMap()
        val nextMonthMap = friends.associateWith { 0 }.toMutableMap()

        gifts.forEach { gift ->
            val from = gift.split(" ")[0]
            val to = gift.split(" ")[1]
            scoreMap[from] = scoreMap[from]!! + 1
            scoreMap[to] = scoreMap[to]!! - 1
            giftMap[from]!![to] = giftMap[from]!![to]!! + 1
        }

        for (i in friends.indices) {
            for (j in friends.indices)
                if (i != j) {
                    val from = friends[i]
                    val to = friends[j]

                    if (giftMap[from]!![to] == giftMap[to]!![from]) {
                        nextMonthMap[from] = nextMonthMap[from]!! + if (scoreMap[from]!! > scoreMap[to]!!) 1 else 0
                    }

                    if (giftMap[from]!![to]!! > giftMap[to]!![from]!!) {
                        nextMonthMap[from] = nextMonthMap[from]!! + 1
                    }
                }
        }

        return nextMonthMap.values.reduce { a, b -> if (a >= b) a else b }
    }
}
