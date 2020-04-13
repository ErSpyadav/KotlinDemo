package demo.expresso.kotlintest.function

class function1{
    fun add( a :Int,b : Int):Int{
        return a+b;
    }

    //Method with default value
    fun addWithDefault( a :Int=10,b : Int=10):Int{
        return a+b;
    }

    var max=1
    fun printVal(){
        print("$max ," )
        max=max+1
        if(max<=5)
        printVal()

    }

}
fun sub():Int{
    return 20-10
}

var v1=20;
fun multi() = println("Multiply :"+v1*10);

var v2=30;
fun divide():Int = v2/3;

fun main(args :Array<String>){
    val fn =function1()
    println("Sum :"+fn.add(10,20))
    println("Sum :"+fn.addWithDefault(10))
    println(sub())
    var a =20
    val sum =if(a>10){
     a+a
    }
    else a*a
    println(sum)


    println("Functionm in single line")
    println("Subs:"+sub())
    multi()
    println("Divide:"+divide())


}