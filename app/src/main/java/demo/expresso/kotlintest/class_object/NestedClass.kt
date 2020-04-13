package demo.expresso.kotlintest.class_object

class NestedClass {

    fun outerTest(){
        println("Outer method is called")
    }
     class Inner {
        fun innerTest(){
            println("Inner method is called")
        }
    }
}


//2nd Example
class Outer {

    val a = "Outside Nested class."

    class Nested {
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }

    //without using inner .cannot access outer variable in inner class.use inner keyowrd
   inner class Nested2 {
        fun callMe() = a
    }
}


fun main(args: Array<String>) {
    val outer =NestedClass()
    val inner =NestedClass.Inner()
    outer.outerTest()
    inner.innerTest()

    //2nd example
    println(Outer.Nested().b)

    // creating object of Nested class
    val nested = Outer.Nested()
    println(nested.callMe())

    val nested2 =Outer().Nested2()//Way of creating obj
    nested2.callMe()

}