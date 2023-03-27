fun main(args: Array<String>){
    val a: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1

    val name : String = "Jazzy Bruno";
    var character : Char = name[0];

    var escapeString = "Hello World!! \n My name is Jazzy Bruno";
    var rawString : String = """Hola Mundo!! 
        Mi Nombre es Jazzy Bruno
    """.trimMargin()

    var boolean : Boolean ? = null;
    boolean = true;

    var toInt : Int = l.toInt();
    toInt = s.toInt();
    println("Int Value is " + a)
    println("Double  Value is " + d)
    println("Float Value is " + f)
    println("Long Value is " + l )
    println("Short Value is " + s)
    println("Byte Value is " + b)
    println("The character is:  $character")
    println(escapeString)
    println(rawString)
}