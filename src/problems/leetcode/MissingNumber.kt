package problems.leetcode

object MissingNumber {
    class Solution {
        fun missingNumber(nums: IntArray): Int {
            val numSize = nums.size
            var actualSumNumber = 0
            var expectedSumNumber = 0
            for (number in 0..numSize) {
                expectedSumNumber += number
            }
            nums.forEach {
                actualSumNumber += it
            }
            val missingNumber = expectedSumNumber - actualSumNumber
            return missingNumber
        }
    }
}