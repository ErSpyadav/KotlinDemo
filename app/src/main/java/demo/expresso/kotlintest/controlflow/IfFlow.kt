package demo.expresso.kotlintest.controlflow

class ControlFlow{
    val a =10
    val b =20
    fun test() {
        //
        if(a>20)
            println("a is Greater")
        else
            println("a is smaller")




        //Kotlin expression
        val result = if (a > 20) {
            "Greater"
        } else {
            "Smaller"
        }
        println(result)

        val result2 =if(a>20)" $a greater" else "$a is smaller"
        println(result2)

        //Kotlin expression
        val max = if (a > b) {
           println("$a is greater")
            a
        } else {
           print("$a is smaller")
          b
        }
        println(max)

        val v1=10;
        val v2=20;
        val v3 =30

        val max1 =if(v1>v2){
           if(v1>v2)
               v1
            else
               v2
        }
        else{
            if(v2>v3)
                v2
            else
                v3

        }

        println("Max2:$max1")

    }
}


fun main(args : Array<String>){
    val control =ControlFlow()
    control.test()
}