package demo.expresso.kotlintest.class_object

class SealedClass {
}
sealed class Expr
class Const(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()
object NotANumber : Expr()


fun eval(e: Expr): Int =
    when (e) {
        is Const -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        NotANumber -> 10
    }

sealed class RupeesConvert
class Diramh(var amt :Int) : RupeesConvert()
class Doller(var amt :Int) : RupeesConvert()

fun  convert(e : RupeesConvert) =
    when(e){
        is Diramh -> e.amt*20
        is Doller ->e.amt*60
    }



fun main(args: Array<String>) {
    println("Sealed class")
    println(eval(Const(20)))
    println(eval(Const(20)))

    //******RupeesConvert***********
    println(convert(Diramh(30)))
    println(convert(Doller(30)))

}