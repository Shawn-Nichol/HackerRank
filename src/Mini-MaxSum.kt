fun main() {
    val arr = arrayOf(1,3,5,7,9)
    val arr2 = arrayOf(256_741_038, 623_958_417, 467_905_213, 714_532_089, 938_071_625)
    // Insert 2063136757 2744467344
    minMax(arr)
    minMax(arr2)


}

fun minMax(arr: Array<Int>):Unit {
    // arr.sum does not handle the longs correctly
//    val sum:Long = arr.sum()?.toLong()

    var total: Long = 0
    for(i in arr.indices) {
        total += arr[i]
    }


    val min = arr.min()?.toLong()
    val max = arr.max()?.toLong()

    println("Sum $total")
    println("Min $min")
    println("Max $max")

    // !! converts any value into a none null value
    println("${total- max!!} ${total-min!!}")
}