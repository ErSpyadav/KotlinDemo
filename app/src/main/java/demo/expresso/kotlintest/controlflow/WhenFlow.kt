package demo.expresso.kotlintest.controlflow

class WhneDlow{
    val a=2
    //Check if a value is of a particular type.
    fun whenMethod( type :Any){
        when(type){
            is String ->{
                println("Input is String")
            }
            is Int ->{
                println("Input is String")
            }
            else ->{
                println("Greater than 100")
            }
        }
    }
}

fun main(args :Array<String>){

    val a =10
    val b =20

    println("Enter the operator")
    val operator = readLine();

    when(operator){
        "+" ->{
            println("add = $a+$b")
        }
        "-" ->{
            println("Sub =  $a-$b")
        }
        "*" ->{
            println("Multi = $a*$b")
        }
        else ->{
            println("Divide = $a/$b")
        }
    }







    val result =when(operator){
        "+" -> {
            print("a+b = ")
            a+b
        }
        "-" -> {
            print("a-b = ")
            a-b
        }
        "*" -> {
            print("a*b =")
            a*b
        }
        else -> {
            print("a/b =")
            a/b
        }
    }

    println(result)

    //Combine two or more branch conditions with a comma.
    println("Multiple case in single line.Enter day")
    val day = readLine()
    when(day){
        "Saturday","Sunday" ->{
            println("Holiday")
        }
        else -> {
            println("Working day")
        }
    }

    //Check value in the range
    println("Enter number :")
    val number = readLine()?.toInt()
    when(number){
        in 1..10 ->{
        println("number is smalleer than 11")
    }
        in 11..100 ->{
            println("number is between 11 to 100")
        }
        else ->{
            println("Greater than 100")
        }
    }
    println("Enter enter type :")
   val obj = WhneDlow()
    obj.whenMethod("Sarayu")

    //Use expressions as branch condition
    val x = 11
    val y = "11"

    when (y) {
        "cat" -> println("Cat? Really?")
        11.toString() -> println("Close but not close enough.")
        a.toString() -> println("Bingo! It's eleven.")
    }

}