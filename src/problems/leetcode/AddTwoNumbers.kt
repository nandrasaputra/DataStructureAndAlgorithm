package problems.leetcode

/*
*       LeetCode Problem : Add Two Numbers
*       Medium
*       https://leetcode.com/problems/add-two-numbers/
* */

object AddTwoNumbers {
    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val nodeResult = ListNode(0)
        var currentNodeResult: AddTwoNumbers.ListNode? = nodeResult
        var currentNode1 = l1
        var currentNode2 = l2
        var remainder = 0
        while (currentNode1?.`val` != null || currentNode2?.`val` != null) {
            var result = (currentNode1?.`val` ?: 0) + (currentNode2?.`val` ?: 0)
            result += remainder
            remainder = 0
            if (result > 9) {
                currentNodeResult?.`val` = result - 10
                remainder = 1
            } else {
                currentNodeResult?.`val` = result
            }
            if (currentNode1?.next?.`val` != null || currentNode2?.next?.`val` != null) {
                currentNode1 = currentNode1?.next
                currentNode2 = currentNode2?.next
                currentNodeResult?.next = ListNode(0)
                currentNodeResult = currentNodeResult?.next
            } else {
                currentNode1 = currentNode1?.next
                currentNode2 = currentNode2?.next
                if (remainder > 0) {
                    currentNodeResult?.next = ListNode(remainder)
                }
            }
        }
        return nodeResult
    }
}