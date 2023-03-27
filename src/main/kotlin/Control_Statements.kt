fun main(args: Array<String>){
    // control statements in kotlin
//    if ... else expressions
    var age : Int = 21;
    if(age < 18){
        println("Minor")
    }else{
        println("Adult")
    }

    if(age < 10) println("She or he is a child") else if(age < 18) println("She or he is a teenager") else println("She or he is and adult")
//    when expressions
    val day = 2

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)


    when (day) {
        1, 2, 3, 4, 5 -> println("Weekday")
        else -> println("Weekend")
    }
//    for loop
//    while loop
//    Break and continue
}