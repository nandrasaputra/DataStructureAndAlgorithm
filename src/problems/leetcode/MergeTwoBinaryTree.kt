package problems.leetcode

import java.util.*

object MergeTwoBinaryTree {
    /**
     * Example:
     * var ti = TreeNode(5)
     * var v = ti.`val`
     * Definition for a binary tree node.
     * class TreeNode(var `val`: Int) {
     *     var left: TreeNode? = null
     *     var right: TreeNode? = null
     * }
     */

    class TreeNode(var `val`: Int) {
            var left: TreeNode? = null
            var right: TreeNode? = null
        }
    class Solution {
        fun mergeTrees(t1: TreeNode?, t2: TreeNode?): TreeNode? {
            val t1Queue: Queue<TreeNode> = LinkedList()
            val t2Queue: Queue<TreeNode> = LinkedList()
            val newTreeResult = TreeNode(0)

            t1Queue.add(t1)
            t2Queue.add(t2)

            while (t1Queue.isNotEmpty()) {
                val currentT1TreeNode = t1Queue.remove()
                currentT1TreeNode.left?.let {
                    t1Queue.add(it)
                }
                currentT1TreeNode.right?.let {
                    t1Queue.add(it)
                }
            }

            return newTreeResult
        }
    }
}