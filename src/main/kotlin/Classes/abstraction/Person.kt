package Classes.abstraction

abstract class Person{
    var age : Int = 10;
    abstract fun setPersonAge(a:Int);
    fun getPersonAge() : Int{
        return age;
    }
}