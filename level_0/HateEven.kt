class Solution {
    fun solution(n: Int): IntArray {
        return IntArray(n){ it +1 }.filter{ it % 2 === 1}.toIntArray()
    }
}