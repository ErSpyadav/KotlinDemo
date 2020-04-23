package demo.expresso.kotlintest.class_object

class Student(var name :String){

    init {
        println("Init Block is invoked: $name")
    }

    fun printDetail(){
        println("printDetail method is call")
    }

}

fun main() {
    lateinit var student:Student
    student= Student("Sarayu")//Student get memory. init blocked will be invoked

    val student1:Student by lazy { //init blocked will not called because object did get memory
        Student("Sunita")
    }

    //when we will access property of student, then only student1 will initialize and get memory
    student1.printDetail()




}