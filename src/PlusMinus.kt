

fun main() {
    val arr = arrayOf(-4,3,-9,0,4,1)

    val size: Double = arr.size.toDouble()

    var pos = 0
    var neg = 0
    var zero = 0

    for(i in arr) {
        when {
            i > 0 -> pos++
            i < 0 -> neg++
            else ->  zero++

        }
    }

    println(pos/size)
    println(neg/size)
    println(zero/size)


}

