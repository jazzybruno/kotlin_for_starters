package Classes.constuctors

class UserClass{
    var firstName : String;
     var secondName : String;
     var age : Int;
     var marks : Double? = null;

    // the initialise function
    init {
        // the initializer
        println("This is the block of initialization");
    }

    // secondary constructor
    constructor(_firstName: String ,  _secondName: String , _age: Int){
        this.firstName = _firstName;
        this.secondName = _secondName;
        this.age = _age;
    }

    // another secondary constructor
    constructor(_firstName: String ,  _secondName: String , _age: Int , _marks : Double){
        this.firstName = _firstName;
        this.secondName = _secondName;
        this.age = _age;
         this.marks = _marks;
    }
    fun printDetails(){
        println("My names are $firstName and $secondName");
        println("I am $age years old");
    }
}