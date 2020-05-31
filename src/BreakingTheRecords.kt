fun records(scores: Array<Int>): Array<Int> {


    var records = arrayOf(0, 0)
    var high = -1
    var low = -1

    for(i in scores) {
        if(high == -1) {
            high = i
        } else if(i > high) {
            high = i
            records.set(0, records[0]+ 1)
        }

        if(low == -1) {
            low = i
        } else if( i < low) {
            low = i
            records.set(1, records[1] + 1)
        }
    }

    return records
}


fun main() {
    val scores = arrayOf(0, 9, 3, 10, 2, 20)

    println(records(scores).joinToString(" "))
}