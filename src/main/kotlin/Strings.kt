fun main(args: Array<String>){
    var myName : String;
    var quotes = "Hello World my names is 'Jazzy Bruno'  ";
    myName = "jazzy bruno";
    println("These is a strings file and we are going to be looking at some strings")
    println("Mi nombre es : $myName")
    println("The length of my name is : " + myName.length);
    println("My name in uppercase are: " + myName.toUpperCase())
    println("My name in lowercase are: " + myName.toLowerCase())
    println("My name when some characters are removed: " + myName.dropLast(5))
    println(quotes)

    var str1 : String = "Apple"
    var str2 : String = "Apple"

    println(str2.compareTo(str1));
    println(str2.compareTo(myName))

    println(myName.getOrNull(8))
    println(myName.getOrNull(4))
    println(myName.getOrNull(200))
}