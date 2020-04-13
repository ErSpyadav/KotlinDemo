package demo.expresso.kotlintest.function

class RecursiveAndTrail {
    var max=1
    fun printVal(){
        print("$max ," )
        max=max+1
        if(max<=5)
            printVal()

    }
}

fun main(args :Array<String>){

    RecursiveAndTrail().printVal()

    val number = 4
    val result: Long
    result = factorial(number)
    println("Factorial of $number = $result")
}

fun factorial(n: Int): Long {
    return if (n == 1) n.toLong() else n*factorial(n-1)
}