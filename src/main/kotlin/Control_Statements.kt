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
    var fruits = arrayOf("Orange", "Apple", "Mango", "Banana")

    for (index in fruits.indices) {
        println(fruits[index])
    }

    for (item in 5 downTo 1 step 2) {
        println(item)
    }
//    while loop
    var i = 5;
    while (i > 0) {
        println(i)
        i--
    }

    do{
        println(i)
        i--
    }while(i > 0)
//    Break and continue
    while (i++ < 100) {
        println(i)
        if( i == 3 ){
            break
        }

    }

    outerLoop@ for (i in 1..3) {
        innerLoop@ for (j in 1..3) {
            println("i = $i and j = $j")
            if (i == 2){
                break@outerLoop
            }
            break@innerLoop
        }
    }

    outerLoop@ for (i in 1..3) {
        innerLoop@ for (j in 1..3) {
            if (i == 2){
                continue@outerLoop
            }
            println("i = $i and j = $j")
        }
    }
}