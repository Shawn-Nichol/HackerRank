
// int being considered is divisible by all ints array a
// int being considered is is a factor of the ints in array b
fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here

    println("a size: ${a.size} b size: ${b.size}")

    var count = 0
    var considered = mutableListOf<Int>()


        for(i in a.max()!!..b.min()!!) {

            if(i % a[0]== 0 && i % a[1] == 0 && b[0] % i == 0 && b[1] % i == 0) {
                considered.add(i)

                println("${considered[count]}, size: ${considered.size}")
                count++
            }



        }



    return considered.size
}

fun main() {

    var a = arrayOf(2, 6)
    var b = arrayOf(24, 36)

    println(getTotalX(a, b))

    a = arrayOf(2, 4)
    b = arrayOf(16, 32, 96)

    println(getTotalX(a, b))
}