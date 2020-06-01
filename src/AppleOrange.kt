

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {

    var applesFel = 0
    var orangesFel = 0

    for(i in apples) {
        // range in if statement
        if(a + i in s..t)applesFel++
    }

    for(i in oranges) {
        // range in if statement
        if(b+i in s..t) orangesFel++
    }

    println(applesFel)
    println(orangesFel)
}



fun main() {
    val s =7
    val t= 11
    val a = 5
    val b = 15
    val apples = arrayOf(-2,2,1)
    val oranges = arrayOf(5, -6)

    countApplesAndOranges(s, t, a,b,apples,oranges)
}