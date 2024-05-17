class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        val altc = a > n/2
        val bltc = b > n/2
        val isDifferentDivision = (altc && bltc) || !(altc || bltc)
        if (isDifferentDivision) {
            var e = 0
            var cur = n
            while(cur>1) {
                cur /= 2
                e++
            }
            return e
        } else {
            return solution(n/2, if(altc) a - n/2 else a, if(bltc) b - n/2 else b)
        }
    }
}

// 개선 할 필요가 있다.