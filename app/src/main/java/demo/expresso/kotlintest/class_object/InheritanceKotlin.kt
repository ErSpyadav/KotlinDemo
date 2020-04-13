package demo.expresso.kotlintest.class_object

class InheritanceKotlin {
}
open class University{
    //by default all class in kotlin is final.use open keyoword to inherite
    fun universityName(){
        println("CUTM")
    }

   open fun name(){
        println("University name is CUTM")
    }
}
class College : University(){

    fun totalStudent(){
        println("203")
    }

    override fun name(){
        println("College name is jitm")
    }

}

// Empty primary constructor
open class Car() {
    open var age: Int = 0
        get() = field

        set(value) {
            field = value
        }
}

class Girl: Car() {

    override var age: Int = 0
        get() = field

        set(value) {
            field = value - 5
        }
}

fun main(args: Array<String>) {
    val college = College()
    college.totalStudent();
    college.universityName()
    college.name();
    val university = University()
    university.name()


    val girl = Girl()
    girl.age = 31
    println("My fake age is ${girl.age}.")
}