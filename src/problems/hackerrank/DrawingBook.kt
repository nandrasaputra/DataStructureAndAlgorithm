package problems.hackerrank

fun pageCount(n: Int, p: Int): Int {
    val totalPageTurnCountFromFront = n / 2
    val targetPageTurnCountFromFront = p / 2
    val targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront

    return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack)
}