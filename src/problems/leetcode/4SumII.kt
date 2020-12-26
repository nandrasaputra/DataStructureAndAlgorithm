package problems.leetcode

object SumII {
    class Solution {
        fun fourSumCount(A: IntArray, B: IntArray, C: IntArray, D: IntArray): Int {
            return 1
        }
    }

    class SumCount2Solver(A: IntArray, B: IntArray, C: IntArray, D: IntArray) {
        val n = A.size-1
        var result = 0

        fun getEligibleTupleCount() : Int {
            searchTuple(0, 0)
            return result
        }

        fun searchTuple(currentPosition: Int, currentSum: Int) {
            if (currentPosition > 3) {
                if (currentSum == 0) {
                    result++
                } else {
                    return
                }
            } else {

            }
        }
    }
}