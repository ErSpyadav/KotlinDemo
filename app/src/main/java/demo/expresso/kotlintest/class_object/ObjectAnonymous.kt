package demo.expresso.kotlintest.class_object

open class ObjectAnonymous {

   open fun  add(a :Int ,b :Int ){
    println("Sum :${a+b}")
    }

    fun  sub(a :Int ,b :Int ){
        println("Sub :${a-b}")
    }
    fun  multy(a :Int ,b :Int ){
        println("Sum :${a*b}")
    }
}

fun main(args: Array<String>) {
    val obj =object : ObjectAnonymous(){

        override fun add(a: Int, b: Int) {
            super.add(a, b)
        }
    }
    obj.add(10,20)
    obj.sub(20,10)
    obj.multy(10,10)


}

