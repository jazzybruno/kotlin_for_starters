package Classes.interfaces

fun main(args: Array<String>){
    var example : Example;
    example = ExampleImpl();

    println(example.myVariable);
    println(example.greetings());
    example.myFunction();
}