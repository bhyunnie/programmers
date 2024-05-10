class Solution {
    fun solution(price: Int): Int {
        val dc:Double
        when {
            price >= 500000 -> dc=0.2
            price >= 300000 -> dc=0.1
            price >= 100000 -> dc=0.05
            else -> return price
        }

        return Math.floor(price * (1-dc)).toInt()
    }
}