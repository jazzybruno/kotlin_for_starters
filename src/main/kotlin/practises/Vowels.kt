package practises

fun main(args : Array<String>){
    println("Hello World this id s program to remove vowel letters in a program");
    var sentence : String = "This is a sentence to remove all vowel letters";
    var sentenceArray : MutableList<Char> = copy_chars(sentence);
    remove_vowels(sentenceArray);
}

// function to copy all characters from the string to the array of strings
fun copy_chars( sentence : String ) : MutableList<Char>{
    var sentenceArray : MutableList<Char> = mutableListOf<Char>();
    var wordlength : Int = sentence.length;
    for (i in 0..(wordlength-1)){
        sentenceArray.add(sentence[i])
    }
    return sentenceArray;
}

// the function to remove the vowels and space in the array;
fun remove_vowels(sentenceArray : MutableList<Char>){
    var newSentenceArray : MutableList<Char> = mutableListOf<Char>('a' , 'e' , 'o' , 'u' , 'i');
    var i = 0;
    while (i <= sentenceArray.size -1){
        for (j in 1..newSentenceArray.size-1){
            if(sentenceArray[i] == newSentenceArray.get(j)){
                println("Vowel letter found: $i");
            }
        }
    }
}