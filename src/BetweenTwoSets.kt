// int being considered is divisible by all ints array a
// int being considered is is a factor of the ints in array b
fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here

    println("a size: ${a.size} b size: ${b.size}")

    var count = 0

    for (i in a.max()!!..b.min()!!) {

        var check1 = 0
        var check2 = 0

        for (j in a.indices) {
            if (i % a[j] == 0) {
                check1 = 1
            } else {
                check1 = 0
                break
            }

            if (j == a.size - 1 && check1 == 1) {
                println("array is a factory $i")
            }


        }

        for (k in b.indices) {

            if (b[k] % i == 0) {

                check2 = 1
            } else {
                check2 = 0
                break
            }

            if (k == b.size - 1 && check2 == 1) println("element is a factor $i")
        }


        if (check1 == 1 && check2 == 1) count++
    }


    return count
}

fun main() {

    var a = arrayOf(2, 6)
    var b = arrayOf(24, 36)

    println(getTotalX(a, b))

    a = arrayOf(2, 4)
    b = arrayOf(16, 32, 96)

    println(getTotalX(a, b))
}