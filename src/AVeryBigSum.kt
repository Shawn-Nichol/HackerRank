
fun aVeryBigSum(ar: Array<Long>): Long {

    val mySum: Long = ar.sum().toLong()
    return mySum
}

fun main() {
    var myArray = arrayOf(1_000_0000_000L, 2_000_000_000L,3_000_000_000L, 4_000_000_000L)

    val result = aVeryBigSum(myArray)

    println(result)
}