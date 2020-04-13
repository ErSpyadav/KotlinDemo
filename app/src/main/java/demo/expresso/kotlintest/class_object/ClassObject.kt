package demo.expresso.kotlintest.class_object

import demo.expresso.kotlintest.function.inlineAdd

class ClassObject {

    fun addNum(a : Int, b: Int):Int{
        return a+b
    }

    fun message():String ="This is test message"

    fun triagnle(max:Int){
        for (i in 1..max){
            var k=0
            for (j in 1..max-i)
                print(" ")
            for (l in 1..i) {
                print("*")
              ++k
            }
            println()
        }
    }
}

fun main(args: Array<String>) {
    val obj =ClassObject()
    println(obj.addNum(10,20))
    println(obj.message())
    obj.triagnle(5)
}