package practises

fun main(args: Array<String>){
    val response = "the word is a palindrome";
    val response2 = "the word is not a palindrome";
    var sampleWord : String;
    sampleWord = "mum";
    var wordLength : Int = sampleWord.length;
    var reversed : String = "";
    for (i in wordLength-1 downTo 0){
        reversed += sampleWord[i]
    }

    if (sampleWord.equals(reversed)){
        println("The normal word is $sampleWord and the reversed word is $reversed");
        println(response.toUpperCase());
    }else{
        println("The normal word is $sampleWord and the reversed word is $reversed");
        println(response2.toUpperCase());
    }
}