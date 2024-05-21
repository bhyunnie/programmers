class MaximumAndMinimum {
    fun solution(s: String): String {
        return "${s.split(" ").map{it.toInt()}.sorted().first()} ${s.split(" ").map{it.toInt()}.sorted().last()}"
    }
}
