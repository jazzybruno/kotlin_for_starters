fun main(args: Array<String>){
    println("This is an array file in kotlin for starters");
    //simple array
    var myCars = arrayOf("Volvo" , "Hyundai" , "Benz")
    println(myCars[0])
    println(myCars[1])
    println(myCars[2])
    // primitive arrays
    var myInts = intArrayOf(1,3,5,6,7,7);
    var myDoubles = doubleArrayOf();
    println("The array of intergers")
    println(myInts[0])
    println(myInts[1])
    println(myInts[2])

    // specific arrays with generics
    var stringArray = arrayOf<String>("Jazzy" ,"Jazzy2" , "Jazzy3" , "Jazzy4" , "Jazzy5");

    for (name in stringArray){
        println(name)
    }

    // methods
    //length
    val fruits = arrayOf<String>("Apple", "Mango", "Banana", "Orange")
    println(fruits.size)
    //get
    println(fruits.get(0))
    println(fruits.get(2))
    println(fruits.get(3))
    //set
    fruits.set(0 , "Bruno Apple")
    println(fruits.get(0))
    //check if element exist
    var item:String = "Apple"
    if(item in fruits){
        println("The item $item does exist in the array")
    }else{
        println("The item $item does exist in the array")
    }
    //dropping items
        fruits.drop(4);
    // checking if it is empty
    var boolean : Boolean = fruits.isEmpty();
       println("Array is empty: $boolean")
}