package Classes.abstraction

class Manager constructor(_name : String) : Worker(_name) {
    override var age : Int = 50;
    override var role : String = "CEO";

    override fun getWorkerAge(): Int {
        return age;
    }

    override fun getWorkerRole(): String {
        return role;
    }

    override fun setWorkerRole(_role: String) {
        this.role = _role;
    }

    override fun setWorkerAge(_age: Int): Any {
        this.age = _age;
        return Any();
    }

    override fun printDetails() {
        println("Hello World my name is : $name and i am the $role and i am $age years old");
    }
}