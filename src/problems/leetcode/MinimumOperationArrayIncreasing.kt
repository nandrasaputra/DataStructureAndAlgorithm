package problems.leetcode

object MinimumOperationArrayIncreasing {
    fun minOperations(nums: IntArray): Int {
        var result = 0
        for (index in 1 until nums.size) {
            if(nums[index] <= nums[index-1]) {
                val numberToAdd = nums[index-1] - nums[index] + 1
                nums[index] += numberToAdd
                result += numberToAdd
            }
        }
        return result
    }
}