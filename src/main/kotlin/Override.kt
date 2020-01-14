fun main(args: Array<String>) {
    var student_1 = Student("Arjun")
 
    println("\n\nAbout ${student_1.role} \n---------------")
    student_1.doAll()
}
 
/**
* Person is a Super Class
*/
open class Person(var role: String = "Person", var name: String = "X") {
    fun eat(){
        println(name + " is eating.")
    }
    open fun sleep(){
        println(name + " is sleeping.")
    }    
}
 
/**
* Student class inherits Person class
*/
class Student(name: String): Person("Student", name) {
    // activity function belongs to Student only
    fun activity(){
        println("$name is a $role. $name is studying in school.")
    }
 
    // overrides sleep function of Person class
    override fun sleep(){
        println("$name is a $role. $name goes to bed early.")
    }
 
    fun doAll(){
        eat()
        sleep()
        activity()
    }
    
}