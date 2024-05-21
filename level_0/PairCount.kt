class PairCount {
    fun solution(n: Int): Int {
        var arrayList = ArrayList<Int>()
        for (i in 1..n) {
            if (n % i == 0) arrayList.add(i)
        }
        return arrayList.size
    }
}
