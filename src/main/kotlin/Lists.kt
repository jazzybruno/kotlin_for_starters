fun main(){

    val theList = listOf<String>("one", "two", "three", "four");
    println(theList);

    var theMutableList = mutableListOf<String>("one", "two", "three", "four")
    println(theMutableList)

    // iterator
    var iterator = theList.listIterator();
    while (iterator.hasNext()){
        println(iterator.next());
    }

    println("Using the for loop top print elememts is a list");
    for (i in theList.indices){
        println(theList[i]);
    }

    println("Using a foreach loop to loop throught the given:");
    theList.forEach{
        println("The value is $it");
}

    // size
    println("To get the sioze of a list in kotlin use the sixe property");
    println("The size of the above list is " + theList.size);

    // the in operator
    if("two" in theList){
        println(true)
    }else{
        println(false)
    }

    // the contain method

    if(theList.contains("Three")){
        println(true)
    }else{
        println(false)
    }

    // the isEmpty method
    if(theList.isEmpty()){
        println(true)
    }else{
        println(false)
    }

    // list addition
    var myOtherList : List<String>;
    myOtherList = listOf<String>("five" , "six" , "seven" , "eight");

    var addedList = theList + myOtherList;
    var itr : Iterator<String>;
    itr = addedList.listIterator();
    while (itr.hasNext()){
        println(itr.next())
    }

    // chunked
    // mutable list
    theMutableList.add("five")
    theMutableList.add("six")
    theMutableList.add("seven")
    theMutableList.add("eight")
}