package Classes.abstraction

fun main(args: Array<String>){
   var manager : Manager;
    var chief : CEO;

    manager = Manager("Bruce Wayne");
    chief = CEO("Jazzy Bruno");

    manager.setWorkerAge(40);
    chief.setWorkerAge(50);

    manager.setWorkerRole("Manager");
    chief.setWorkerRole("CEO");

    manager.printDetails();
    chief.printDetails();
}