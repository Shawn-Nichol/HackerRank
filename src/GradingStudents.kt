

fun round(grades: Array<Int>): Array<Int> {



    for(i in grades.indices) {

        if(grades[i] < 38) continue // Continue skips to the next iteration.

        var numOne = 0
        when(grades[i] % 10) {
            in 1..5 -> numOne = 5
            in 6..10 -> numOne = 10
        }
        var numTwo = (grades[i] /10)


        println("${numTwo*10 + numOne} - ${grades[i]}")
        if(((numTwo*10 + numOne) - grades[i]) < 3) {
            grades.set(i, numTwo*10 + numOne)
        }



    }

    return grades.drop(1).toTypedArray()
}


fun main() {
    val grades = arrayOf(4, 73,67,38, 33, 100)

    println(round(grades).joinToString("\n"))
}