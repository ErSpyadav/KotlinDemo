package demo.expresso.kotlintest.function


fun print(){
    println("Print is done")
}
fun printMsg(p:()->Unit){
    p()
}

//***************************
// lambda expression
var lambdaAdd = {a: Int , b: Int -> a + b }
// higher order function
fun higherfunc1( lmbd: (Int, Int) -> Int) {      // accepting lambda as parameter

    var result = lmbd(2,4)    // invokes the lambda expression by passing parameters
    println("The sum of two numbers is: $result")
}




//******************fun passed ad argument
fun add(a:Int,b:Int):Int{
    return  a+b
}

fun addInt():((Int,Int)->Int){
   return ::add
}

//*********************
var lambdaPrint = {println("GeeksforGeeks: A Computer Science portal for Geeks") }
// higher-order function
fun higherfuncPrint( lmbd: () -> Unit ) {     // accepting lambda as parameter
    lmbd()                               //invokes lambda expression
}


val mult={a:Int ,b:Int ->a*b}
fun multi(mul:(Int,Int)->Int){
    val result = mul(5,6)
    print("Multiply is :"+result)
}

fun div(a:Int,b:Int):Int{
    return a/b
}
fun divide11() : ((Int,Int)->Int){
    return ::div
}

val lambdaSub ={a:Int,b:Int ->a-b}
fun subFun(sub:(Int,Int)->Int){
    val result =sub(20,13)
    println("Subtraction is :"+ subFun(lambdaSub))
}

fun main(args: Array<String>) {
    println(printMsg (::print))
    println(lambdaAdd(10,20))
    println(addInt()(40,20))

    //invoke higher-order function
    higherfuncPrint(lambdaPrint)

    higherfunc1(lambdaAdd)

    multi()

    println("Divide:"+ divide11()(20,5))


}