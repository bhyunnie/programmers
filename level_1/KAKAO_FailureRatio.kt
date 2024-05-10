class Solution {
    fun solution(
        N: Int,
        stages: IntArray,
    ): IntArray {
        val passOrRest = IntArray(N + 1) { it + 1 }.associateWith { 0 }.toMutableMap()
        val rest: Map<Int, Int>
        var success: MutableMap<Int, Double> = mutableMapOf()

        stages.forEach { stage ->
            if (passOrRest.containsKey(stage)) passOrRest[stage] = passOrRest[stage]!! + 1 else passOrRest[stage] = 1
        }

        rest = passOrRest.toMap()

        for (i in N downTo 1) {
            passOrRest[i] = passOrRest[i + 1]!! + passOrRest[i]!!
        }

        for (i in 1..N) {
            success[i] = if (passOrRest[i] == 0) 0.0 else rest[i]!! / passOrRest[i]?.toDouble()!!
        }

        return success.map { it }.sortedByDescending { it.value }.map { it.key }.toIntArray()
    }
}
