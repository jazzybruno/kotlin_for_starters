package Classes.interfaces

interface A{
    fun printMe(){
        println("I am an interface A")
    }
}

interface B{
    fun printMoiToo(){
        println("I am an interface B also!!!")
    }
}

class interfaceImpl : A, B{

}

fun main(args: Array<String>){
    var mysimpleClass : interfaceImpl;
    mysimpleClass = interfaceImpl();
    mysimpleClass.printMe();
    mysimpleClass.printMoiToo();
}