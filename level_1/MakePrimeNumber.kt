class Solution {
    fun solution(nums: IntArray): Int {
        var result = 0
        for (i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size - 1) {
                for (k in j + 1 until nums.size) {
                    val num = nums[i] + nums[j] + nums[k]
                    var flag = true
                    for (l in 2 until num) {
                        if (num % l == 0) {
                            flag = false
                            break
                        }
                    }
                    if (flag) result += 1
                }
            }
        }
        return result
    }
}
