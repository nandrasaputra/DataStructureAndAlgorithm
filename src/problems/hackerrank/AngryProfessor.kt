package problems.hackerrank

fun angryProfessor(k: Int, a: Array<Int>): String {
    var studentPresent = 0
    for (element in a) {
        if (element <= 0) {
            studentPresent++
        }
        if (studentPresent >= k) {
            break
        }
    }

    if (studentPresent >= k) {
        return "NO"
    } else {
        return "YES"
    }
}