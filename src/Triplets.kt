fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    val score = arrayOf(0, 0)

    for(item in a.indices) {
        when {
            a[item] > b[item] -> score[0] = score[0] + 1
            a[item] < b[item] -> score[1] = score[1] + 1
            else -> {
                println("position $item is a tie ")
            }
        }
    }

    return score
}




fun main() {
    val a = arrayOf(1,2,3)
    val b = arrayOf(3,2,1)

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}