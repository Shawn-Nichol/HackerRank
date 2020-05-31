
fun divisible (n: Int, k: Int, ar: Array<Int>): Int {

    println("n $n")
    println("n $k")
    println("ar, $ar")
    var counter = 0

    for(i in ar.indices) {
        for(j in i+1 until ar.size) {
            var sum = ar[i] + ar[j]
            if(sum % k == 0) counter++
            println("${ar[i]} , ${ar[j]} = $sum")

        }
    }

    return counter
}
fun main() {

    val n = 6
    val k = 3

    val arr = arrayOf(1,3,2,6,1,2)

    println(divisible(n, k, arr))
}