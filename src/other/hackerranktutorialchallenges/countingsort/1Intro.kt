package other.hackerranktutorialchallenges.countingsort

fun countingSort(arr: Array<Int>): Array<Int> {
    val countArray = Array(100) {0}
    arr.forEach {
        countArray[it]++
    }
    return countArray
}