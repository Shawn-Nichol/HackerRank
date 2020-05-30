fun main() {
    var size = 6


    for(i in 0 until size) {

        for(j in 1..size) {
            if(j < size-i) {
                print(" ")
            } else {
                print("#")
            }
        }
        println()
    }
}

