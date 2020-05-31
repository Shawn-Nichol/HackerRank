
fun timeConversion(s: String): String {

    var hour: String = s.substring(0,2)
    var minSec: String = s.substring(2, 8)
    var format = s.contains("PM")


    println(hour)
    println(minSec)
    println(format)

    if(format && hour != "12") {
        hour = (hour.toInt() + 12).toString()

    }
    else if(!format && hour == "12") hour = "00"



    return hour + minSec
}



fun main() {
    var time = "07:05:45PM"



    println(timeConversion(time))

    time = "12:05:22AM"
    println(timeConversion(time))

    time = "12:55:22PM"
    println(timeConversion(time))
}