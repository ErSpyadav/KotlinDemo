package demo.expresso.kotlintest.class_object


class ConstructorKotlin(max : Int) {

    //Primary does not contain any statement.Just it is used to initilise class property. it come with class header
    //Secondary consurctor can contain some logic or statement

  //First Way to initialize consrtuctor
   var max1:Int =0
    init {
        this.max1 =max
        println("Number1 is :"+max1)
    }

    //Second Way to initialize consrtuctor
    var max2:Int = max1
    init {
        println("Number2 is :"+max2)
    }

}

class DefaultPrimary(name :String ="SpYadav"){
    init {
        println("Name:"+name)
    }
}

fun main(args: Array<String>) {
    val obj = ConstructorKotlin(5)
    val obj2 =DefaultPrimary()//Default name "SpYadav
    val obj3 =DefaultPrimary("Sunita")//Default name "SpYadav
}