fun main() {

    matrix1()
    matrix2()
    nestedMatrix()
    nestedMatrix2()
    contentDeep()
    cookBook()

}

fun matrix1() {

    val arr = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6, 7),
        arrayOf(8, 9)
    )

    for (i in arr.indices) {
        println(arr[i].contentToString())
    }
}

fun matrix2() {
    println("Matrix 2")
    val arr = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    for (row in arr) {
        println(row?.contentToString())
    }
}

fun nestedMatrix() {
    println("Nested Matrix")
    val arr = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    for (row in arr) {
        for (col in row) {
            print("$col ")
        }
        println()
    }
}

fun nestedMatrix2() {
    println("Foreach nestMatrix")
    val arr = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    for (row in arr) {
        for (col in row) {
            print("$col ")
        }
        println()
    }
}

fun contentDeep() {
    println("Content Deep to String")
    val arr = arrayOf(
        arrayOf(1,2,3),
        arrayOf(4,5,6),
        arrayOf(7,8,9)

    )

    println(arr.contentDeepToString())

}

fun cookBook() {
    val n = 3
    val array = Array(n, {IntArray(n){-1}})
}