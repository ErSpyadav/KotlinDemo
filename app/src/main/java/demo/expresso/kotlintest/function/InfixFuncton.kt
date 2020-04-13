package demo.expresso.kotlintest.function

class InfixFuncton{
    infix fun createPiramid(rows :Int){
        var k=0;
        for (i in 1..rows){
            k=0;
            for(space in i..rows )
                print(" ")
            while (k!=2*i -1){
                print("*" )
                k++
            }
            println()
        }
    }

    infix fun creatTriangle(max : Int){
       var k=0
        for(i in 1..max) {
            k=0

           while (k!=i){
               print("*")
               k++
           }
           println()
       }
    }

    infix fun creatTriangle1(max : Int){
        var k=0
        for(i in 1..max) {
            k=0

            for (space in 1..max-i)
                print(" ")

            while (k!=i){
                print("*")
                k++
            }
            println()
        }
    }
}

fun main(args: Array<String>) {
    val a = true
    val b = false
    var result: Boolean

    result = a or b // a or b instead of a.or(b), and a and b instead of a.and(b) is used
    var result1 =a and b
    println("result = $result")
    print("Result and : $result1")

    result = a and b // a.and(b)
    println("result = $result")

    val obj =InfixFuncton()
    println("Piramid shaper")
    obj createPiramid 5
    println("Triangle shaper")
     obj creatTriangle 5

    println("Triangle2 shaper")

    obj creatTriangle1 5


}