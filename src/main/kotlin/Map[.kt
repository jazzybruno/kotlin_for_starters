import jdk.internal.net.http.common.Pair.pair

fun main(){
    var theMap = mapOf<String , Int>("One" to 1 , "two" to 2, "three" to 3, "four" to 4);
    var theMutableMap = mutableMapOf<String , Int>("One" to 1 , "two" to 2, "three" to 3, "four" to 4)

    println(theMap);
    println(theMutableMap);

    // the pair
    var thePairAray = mapOf<String , Int>(Pair("Five" , 5) , Pair("Six" , 6) , Pair("Seven" , 7));
    println("Keys:" + theMap.keys)
    println("Values:" + theMap.values)

    // the iteration
    val itr = theMap.keys.iterator()

    while (itr.hasNext()) {
        val key = itr.next()
        val value = theMap[key]
        println("${key}=$value")
    }

    theMap.forEach{ k, v -> println("Key = $k, Value = $v")
}
}