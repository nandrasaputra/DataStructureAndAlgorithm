package problems.hackerrank

fun jimOrders(orders: Array<Array<Int>>): Array<Int> {
    val result = Array<Int>(orders.size) {0}
    val ordersSorted = orders.sortedBy {
        it[0] + it[1]
    }

    for (index in ordersSorted.indices) {
        result[index] = orders.indexOf(ordersSorted[index]) + 1
    }

    return result
}