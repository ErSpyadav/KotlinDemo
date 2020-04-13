package demo.expresso.kotlintest.function

class InlineFunction{
    inline fun inlinemsg(test: () -> Unit){
        test()
        println("Message is Printed")

    }
}

inline fun inlineAdd(test: () -> Unit){
  test()
       println("test is printed")

}

inline fun inlineAddWith2Agrs(test: () -> Unit,testInner :() -> Unit){
    test()
        testInner()
        println("Inner 2 Args is Printed")


}

inline fun higherfunc( str : String, mycall :(String)-> Unit){
    //inovkes the print() by passing the string str
    mycall(str)
}

fun main(args :Array<String>){
    inlineAdd { println("1st Way :Calling inline function") }
    inlineAdd ({ println("2nd Way :Calling inline function") })

    val obj =InlineFunction()
    obj.inlinemsg { println("1st way ->Msg is calling") }
    obj.inlinemsg ({ println("2st way ->Msg is calling" )})

    inlineAddWith2Agrs({ print("method1")},{"method2"})

    higherfunc("A Computer Science portal for Geeks",::println)

}