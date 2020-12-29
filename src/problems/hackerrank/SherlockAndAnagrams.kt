package problems.hackerrank

import java.util.*
import kotlin.collections.*

// Complete the sherlockAndAnagrams function below.
fun sherlockAndAnagrams(s: String): Int {

    val wordMap = mutableMapOf<String, Int>()

    for (i in s.indices) {
        for (j in (i+1)..s.length) {
            val substring = s.substring(i, j).toCharArray().sorted().joinToString(separator = "")
            wordMap[substring] = wordMap.getOrDefault(substring, 0) + 1
        }
    }

    var anagramPair = 0

    for (value in wordMap.values) {
        anagramPair += (value * (value - 1)) / 2
    }

    return anagramPair

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