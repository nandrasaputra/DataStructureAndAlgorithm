package problems.hackerrank

fun findDigits(n: Int): Int {
    var count = 0
    var remainingNumber = n
    while (remainingNumber > 0) {
        val currentDigit = remainingNumber % 10
        if (currentDigit != 0 && n % currentDigit == 0){
            count++
        }
        remainingNumber /= 10
    }

    return count
}