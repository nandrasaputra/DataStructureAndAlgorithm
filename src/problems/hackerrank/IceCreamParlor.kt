package problems.hackerrank

import java.util.*

/*
*   HackerRank Problem : Hash Tables: Ice Cream Parlor
*   https://www.hackerrank.com/challenges/ctci-ice-cream-parlor/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=search
* */
fun whatFlavors(cost: Array<Int>, money: Int): Unit {

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val money = scan.nextLine().trim().toInt()

        val n = scan.nextLine().trim().toInt()

        val cost = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

        whatFlavors(cost, money)
    }
}