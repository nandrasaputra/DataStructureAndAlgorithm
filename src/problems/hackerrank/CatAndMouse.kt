package problems.hackerrank

/*
*   HackerRank: Cat and Mouse
*   https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
*/

fun catAndMouse(x: Int, y: Int, z: Int): String {
    val catADistance = Math.abs(x-z)
    val catBDistance = Math.abs((y-z))

    if (catADistance == catBDistance) {
        return "Mouse C"
    } else if (catADistance < catBDistance) {
        return "Cat A"
    } else {
        return "Cat B"
    }
}