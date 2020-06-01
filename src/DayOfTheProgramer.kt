fun dayOfProgrammer(year: Int) : String {

    var day: Int
    var dop: Int

    when {
        year > 1918 -> {
            day = if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
                244
            } else {
                243
            }
            dop = 256 - day
        }
        1918 == year -> {
            dop = 256 - 243 + 13
        }
        else -> {
            day = if(year % 4 == 0)244 else 243

            dop = 256 - day
        }
    }


    return ("$dop.09.$year")
}

fun main() {
    val year = 1918


    println(dayOfProgrammer(year))
}
// Test 59 failed