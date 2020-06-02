
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {


    return when {
        x2 > x1 && v2 > v1 -> "NO"
        x1 > x2 && v1 > v2 -> "NO"
        v1 == v2 -> "NO"
        else ->  {
            if((x1-x2) % (v2-v1) == 0) "YES" else "NO"
        }
    }

}

fun main() {

    var x1 = 0
    var v1 = 3
    var x2 = 4
    var v2 = 2

    println(kangaroo(x1, v1, x2, v2))

    x1 = 14
    v1 = 4
    x2 = 98
    v2 = 2

    println(kangaroo(x1,v1,x2,v2))

    x1 = 43
    v1 = 2
    x2 = 70
    v2 = 2

    println(kangaroo(x1,v1,x2,v2))
}


