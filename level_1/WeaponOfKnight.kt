class WeaponOfKnight {
    fun solution(
        number: Int,
        limit: Int,
        power: Int,
    ): Int {
        var result = 0
        for (j in 1..number) {
            var count = 0
            var i = 1
            while (i * i < j) {
                if (j % i == 0) {
                    count += 2
                }
                i++
            }
            if (i * i == j) count++
            if (count <= limit) result += count else result += power
        }
        return result
    }
}
