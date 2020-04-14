package demo.expresso.kotlintest.class_object

import android.content.res.Resources
import java.nio.file.OpenOption

class sealedClass2 {
}

sealed class Operation {
    class Add(val value: Int) : Operation()
    class Substract(val value: Int) : Operation()
    class Multiply(val value: Int) : Operation()
    class Divide(val value: Int) : Operation()
    class incremement(val value :Int ):Operation()
}

fun excute(a: Int, op: Operation) = when (op) {

    is Operation.Add -> a + op.value
    is Operation.Substract -> a + op.value
    is Operation.Multiply -> a * op.value
    is Operation.Divide -> a / op.value
    is Operation.incremement -> op.value+1
}





fun main(args: Array<String>) {
    println(excute(10, Operation.Add(20)))
    println(excute(10, Operation.Add(40)))
    println(excute(10, Operation.Add(60)))
    println(excute(10,Operation.incremement(10)))


}