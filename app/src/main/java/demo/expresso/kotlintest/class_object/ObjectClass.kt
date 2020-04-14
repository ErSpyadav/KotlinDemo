package demo.expresso.kotlintest.class_object

class ObjectClass {
}

object MyTest {
    private var a: Int = 0
    var b: Int = 1

    fun makeMe12(): Int {
        a = 12
        return a
    }
}

fun main(args: Array<String>) {
    val result: Int
    //val obj = Test()//you cannot create the instance of Test class.Just you have to access variable and
    //method usinhg dot or (.). like below

    result = MyTest.makeMe12()

    println("b = ${MyTest.b}")
    println("result = $result")
}