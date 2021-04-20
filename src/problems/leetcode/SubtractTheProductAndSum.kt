package problems.leetcode

object SubtractTheProductAndSum {
    fun subtractProductAndSum(n: Int): Int {
        var productOfDigits = 1
        var sumOfDigits = 0
        n.toString().forEach {
            val digit = it.toString().toInt()
            productOfDigits *= digit
            sumOfDigits += digit
        }
        return productOfDigits - sumOfDigits
    }
}