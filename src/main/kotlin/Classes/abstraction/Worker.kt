package Classes.abstraction

abstract class Worker constructor(var _name : String) {
    var name : String ? = null;
    abstract var age : Int;
    abstract var role: String;
    init {
        this.name = _name;
    }

    abstract fun getWorkerAge():Int;
    abstract fun setWorkerAge(_age: Int) : Any;

    abstract fun setWorkerRole(_role : String);
    abstract fun getWorkerRole() :String;

    abstract fun printDetails();
}