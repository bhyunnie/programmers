class Solution {
    fun solution(n: Int, k: Int): Int {
        var realDrink = k - (n / 10).toInt();
        return (n * 12000) + (if(realDrink > 0) realDrink * 2000 else 0)
    }