package problems.leetcode

object SignOfProduct {
    fun arraySign(nums: IntArray): Int {
        var result = 1
        for (number in nums) {
            if (number == 0) {
                return 0
            } else if (number < 0) {
                result = -result
            }
        }
        return result
    }
}