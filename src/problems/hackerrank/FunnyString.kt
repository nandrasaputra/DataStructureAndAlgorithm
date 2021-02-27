package problems.hackerrank

// TODO: TEMPORARY SOLUTION
fun funnyString(s: String): String {
    val reverseString = s.reversed()
    var firstPointer = 0
    var difference: Int? = null
    for (secondPointer in 1 until s.length) {
        val currentDifference = Math.abs(s[firstPointer].toInt() - s[secondPointer].toInt())
        difference?.let {
            if (currentDifference != difference) {
                return "Not Funny"
            }
        }
        difference = currentDifference
        firstPointer++
    }
    return "Funny"
}

fun main() {
    print(funnyString("acxz"))
}