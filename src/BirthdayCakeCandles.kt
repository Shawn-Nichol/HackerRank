fun main() {

    val ar = arrayOf(4,3,2,1,3)

    val results = birthdayCandles(ar)

    println(results)
}

fun birthdayCandles(ar: Array<Int>): Int {

    val candles = ar.drop(1)
    val max = candles.max()
    var count = 0

    for(candle in candles) {

        if(candle == max) {
            count++
        }
    }

    return count
}