package Functional

fun main(args: Array<String>){
    var num1 = 10;
    var num2 = 20;
    var result : Int = calculate(num1 , num2 , ::add);
    println(result);
}

fun printSum(num1:Int , num2:Int){
    println(num1 + num2)
}

fun add(num1:Int , num2:Int):Int{
    return num1 + num2;
}

// High order Functions ( HOF)
fun calculate(a:Int , b:Int , operation:(Int , Int) -> Int) : Int{
   return operation(a , b);
}
