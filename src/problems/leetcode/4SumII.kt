package problems.leetcode

/*
*       LeetCode Problem : 4SumII
*       https://leetcode.com/problems/4sum-ii/
* */

object SumII {
    class Solution {
        fun fourSumCount(A: IntArray, B: IntArray, C: IntArray, D: IntArray): Int {
            val x = mutableMapOf<Int, Int>()
            for (aElement in A) {
                for (bElement in B) {
                    val count = x[aElement + bElement]
                    if (count != null) {
                        x[aElement + bElement] = count + 1
                    } else {
                        x[aElement + bElement] = 1
                    }
                }
            }

            val y = mutableMapOf<Int, Int>()
            for (cElement in C) {
                for (dElement in D) {
                    val count = y[cElement + dElement]
                    if (count != null) {
                        y[cElement + dElement] = count + 1
                    } else {
                        y[cElement + dElement] = 1
                    }
                }
            }

            var result = 0

            for (key in x.keys) {
                val element = y[-key]
                if (element != null) {
                    result += x[key]!! * y[-key]!!
                }
            }

            return result
        }
    }
}

fun main() {
    print(SumII.Solution().fourSumCount(
        intArrayOf(1,2),
        intArrayOf(-2,-1),
        intArrayOf(-1,2),
        intArrayOf(0,2)
    ))
}