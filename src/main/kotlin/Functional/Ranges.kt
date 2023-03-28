package Functional

fun main(args: Array<String>){
    // range to
    println("The following is a range created with the range to function")
    for (num in 1.rangeTo(5)){
        println(num)
    }
    // .. operator
    println("The following is a range created with the ... operator")
    for (num in 1..5){
        println(num)
    }
    // the down to function
    println("The following is a range created with the down to function")
    for (num in 5 downTo 1){
        println(num)
    }
    //the step function
    println("The follwing is a range created with the .. operator with a step of 2")
    for (item in 1..10 step 2){
        println(item)
    }

    val myrange = 1..10;
    // reversed function
    println("Print only even ones")
    for (item in myrange){
        if(item % 2 == 0){
            println(item)
        }
        continue
    }
    val even = myrange.distinct().filter { T -> T % 2 == 0 };
    val odd = myrange.distinct().filter { T -> T % 2 != 0 };
    // the other function of a range
    println(myrange.average());
    println(myrange.min());
    println(myrange.max());
    println(myrange.count());

}