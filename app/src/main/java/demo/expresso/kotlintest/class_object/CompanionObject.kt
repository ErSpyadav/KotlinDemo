package demo.expresso.kotlintest.class_object


//Normal class need object to access it variable and method
class CompanionObject {
    fun test() = println("Test is running")
}

class CompanionTest{

    //companion object block create static method
    companion object Run{
        fun test1()= println("Companion object is running")
    }
}

fun main(args: Array<String>) {
    val obj = CompanionObject()
    obj.test()

    //How to access
    CompanionTest.test1()
}

