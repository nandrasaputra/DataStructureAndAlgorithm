package problems.hackerrank

fun flippingBits(n: Long): Long {

    val maxValue: Long = (Math.pow((2).toDouble(), (32).toDouble()) -1).toLong()
    return maxValue xor n
}