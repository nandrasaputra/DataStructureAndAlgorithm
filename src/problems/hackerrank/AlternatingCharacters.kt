package problems.hackerrank

fun alternatingCharacters(s: String): Int {
    var counter = 0
    for(index in 0 until s.length - 1) {
        if (s[index] == s[index+1]) {
           counter++
        }
    }
    return counter
}
