package problems.hackerrank

import java.util.*
import kotlin.collections.*

// Complete the sherlockAndAnagrams function below.
fun sherlockAndAnagrams(s: String): Int {

    return 0

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = sherlockAndAnagrams(s)

        println(result)
    }
}