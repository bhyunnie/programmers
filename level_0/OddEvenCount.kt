class OddEvenCount {
    fun solution(num_list: IntArray): IntArray {
        return intArrayOf(num_list.filter{it % 2 ===0}.size, num_list.filter{it % 2 === 1}.size)
    }
}