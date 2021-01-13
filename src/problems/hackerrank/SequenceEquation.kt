package problems.hackerrank

fun permutationEquation(p: Array<Int>): Array<Int> {
    val n = p.size
    val result = Array(n){0}
    for (index in 1..n) {
        val lookUpIndex = p.indexOf(index) + 1
        val lookUpIndexTwo = p.indexOf(lookUpIndex) + 1
        result[index - 1] = lookUpIndexTwo
    }
    return result
}