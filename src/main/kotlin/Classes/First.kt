package Classes

import java.util.*

class Tutorial {
    private var name : String = "Tutorials point";
    fun printMessage(){
        println("We are currently taking courses on $name");
    }

    //inner classes
    class myInnerClass{
        protected var name : String = "Jazzy Bruno";
        fun sayMyName(){
            println("My name is : $name");
        }

    }
}

// type alias
typealias User = Triple<String ,String ,  Int>;
class userInfo{
    public var username = "Jazzy Bruno" ;
    public var age = 12;
    public var schoolName = "Rwanda Coding Academy";

    fun returnUserDetails():User{
        return Triple(username , schoolName , age);
    }

 }

fun main(args: Array<String>){
    var myTutorial = Tutorial();
    myTutorial.printMessage();
    var myInnerClass : Tutorial.myInnerClass = Tutorial.myInnerClass();
    myInnerClass.sayMyName();
}