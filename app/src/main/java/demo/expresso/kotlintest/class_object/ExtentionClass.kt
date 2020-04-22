package demo.expresso.kotlintest.class_object

class ExtentionClass {

    fun add(a :Int,b :Int)=a+b
    fun sub(a :Int ,b:Int) =a-b

}

fun ExtentionClass.Mult(a :Int,b:Int) =a*b

fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)

fun main(args: Array<String>) {
    val obj =ExtentionClass()
    println(obj.add(10,20))
    println(obj.sub(20,10))
    println(obj.Mult(10,10))

    val myString= "Hello Everyone"
    val result = myString.removeFirstLastChar()
    println("First character is: $result")

}