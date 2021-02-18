package problems.hackerrank

fun howManyGames(p: Int, d: Int, m: Int, s: Int): Int {
    var count = 0
    var mS = s
    var mP = p
    while(mS >= mP){
        count++
        mS -= mP
        mP = Math.max(mP-d,m)
    }
    return count
}