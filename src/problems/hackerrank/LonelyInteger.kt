package problems.hackerrank

import java.util.*

fun lonelyinteger(a: Array<Int>): Int {
    var result = 0
    for (element in a) {
        result = result xor element
    }

    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = lonelyinteger(a)

    println(result)
}