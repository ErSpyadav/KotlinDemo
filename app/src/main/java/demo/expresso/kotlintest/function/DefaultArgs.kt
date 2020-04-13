package demo.expresso.kotlintest.function

class DefaultArgs {
   var age:Int=0
    fun DriverAge(age :Int =18):Int{
        this.age=age
        return age;
    }

    fun totalChile(girl :Int =1,boy :Int=0):Int{
        return girl + boy
    }

    fun displayBorder(character: String = "=", length: Int = 15,name:String ="Sarayu") {
        for (i in 1..length) {
            print(character)
        }
        println(name)
    }
}

fun main(args :Array<String>){

    var obj =DefaultArgs()
    println("Age :"+obj.DriverAge())// default as age
    println("Age :"+obj.DriverAge(23))// taken 23 as age

    println("Age :"+obj.totalChile())// default value added
    println("Age :"+obj.totalChile(3,2))// taken 23 as age

    obj.displayBorder(">")
    obj.displayBorder(length = 10)//length value is used. if we use abc in place of length. error will ome that variable not found of abc name
    obj.displayBorder("*",length = 10)
    //obj.displayBorder(age="Sunita")//error.variable not found with age name
    obj.displayBorder(name="Sunita")//error.variable not found with age name


}