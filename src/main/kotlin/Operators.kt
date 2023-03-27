fun main(args: Array<String>){
    // The operators are :
//    Arithmetic
    var x: Int = 40
    var y: Int = 20

    println("x + y = " +  (x + y))
    println("x - y = " +  (x - y))
    println("x / y = " +  (x / y))
    println("x * y = " +  (x * y))
    println("x % y = " +  (x % y))
//    logical
    var a: Boolean = true
    var b:Boolean = false

    println("x && y = " +  (a && b))
    println("x || y = " +  (a || b))
    println("!y = " +  (!b))
//    Assignment

    println("x = " +  x)
    println("y = " +  y)

    x += 5
    println("x += 5 = " + x )

    x = 40;
    x -= 5
    println("x -= 5 = " +  x)

    x = 40
    x *= 5
    println("x *= 5 = " +  x)

    x = 40
    x /= 5
    println("x /= 5 = " +  x)

    x = 43
    x %= 5
    println("x %= 5 = " + x)
//    Relatinal

    println("x > y = " +  (x > y))
    println("x < y = " +  (x < y))
    println("x >= y = " +  (x >= y))
    println("x <= y = " +  (x <= y))
    println("x == y = " +  (x == y))
    println("x != y = " +  (x != y))
//    Bitwise
//    Unary
}