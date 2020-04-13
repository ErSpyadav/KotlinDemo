package demo.expresso.kotlintest.controlflow

class BreakTest {}
fun main(args: Array<String>) {

    //Break is similar like java
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        print("$i ,")
    }

    println("Continue.....")
    for (i in 1..10) {
        if (i == 5) {
            continue
        }
        print("$i ,")
    }

    println("*********************")
    var a :Int
    var sum =0;
    while(true){
        println("Enter the number")
        a = readLine()!!.toInt()
        sum =sum + a

        if(a==0)
            break
    }
   println(sum)

    println("*******labeled Break**************")

    first@ for( i in 5..10) {
        println("\n $i")
        second@ for (j in 1..2) {
            if (i == 7) {
                 break@first
            }
            print("$j ,")

        }
    }

   // Destructuring declarations, or destructuring for short, is a technique for unpacking a class instance into separate variables.
    val (l1,l2) = arrayOf("Math","AEM");
    println("lang1:"+l1);


}