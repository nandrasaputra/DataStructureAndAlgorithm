package problems.leetcode

object TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for ((elementIndex, element) in nums.withIndex()) {
            val pair = target - element
            val pairIndex = nums.indexOf(pair)
            if (pairIndex != -1 && pairIndex != elementIndex) {
                if (elementIndex > pairIndex) {
                    return intArrayOf(pairIndex, elementIndex)
                } else {
                    return intArrayOf(elementIndex, pairIndex)
                }
            }
        }
        return intArrayOf(0,0)
    }
}