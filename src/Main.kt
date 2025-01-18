import problems.leetcode.AddTwoNumbers

fun main() {
    val node1 = AddTwoNumbers.ListNode(2)
    node1.next = AddTwoNumbers.ListNode(4)
    node1.next?.next = AddTwoNumbers.ListNode(3)
    val node2 = AddTwoNumbers.ListNode(5)
    node2.next = AddTwoNumbers.ListNode(6)
    node2.next?.next = AddTwoNumbers.ListNode(4)
    print(AddTwoNumbers.addTwoNumbers(node1, node2))
}