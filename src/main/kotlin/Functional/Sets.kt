package Functional

fun main(){
    val theSet = setOf<String>("one", "two", "three", "four");
    var themutableSet = mutableSetOf<String>("one", "two", "three", "four")

    // iterating through
    // the iterator object
    var itr = theSet.asIterable().iterator()
    while (itr.hasNext()){
        println(itr.next());
    }

    // for loop
    println("Printing the values of the set using a for loop");
    for (i in theSet.indices){
        println(theSet.elementAt(i))
    }

    println("Printing the values of the set using a foreach");
    theSet.forEach{
        println("The element is $it");
    }

    // the size
    println("Printing the size of the set");
    println("I am printing the size which is:" + theSet.size)

    // in the case of the mutable sets we can also use the Functional.add and remove to Functional.add anf remove items

}