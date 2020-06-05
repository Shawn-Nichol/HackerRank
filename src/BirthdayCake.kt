


// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {

    var counter = 0
    val loop = s.size-m
    println("size ${s.size}")
    if(s.size == 1) {

        return if(s.sum() == d) 1 else 0
    }


    for(i in 0..loop) {
        println(i)
        var chocolateNum = 0

        for(j in 0 until m) {
            chocolateNum += s[i+j]
            println("i: $i, j: $j added ${s[i+j]} to chocolateNum $chocolateNum")

        }
        if(chocolateNum == d) counter++
    }

    return counter
}

fun main() {
    var arr = arrayOf(2,5,1,3,4,4,3,5,1,1,2,1,4,1,3,3,4,2,1)
    var day = 18
    var month = 7

    println(birthday(arr, day, month ))

}