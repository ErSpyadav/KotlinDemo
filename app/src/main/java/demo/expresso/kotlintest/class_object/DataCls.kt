package demo.expresso.kotlintest.class_object

data class DataCls(var name :String ,var age :Int)
data class User(var name :String,val age :Int)

fun main(args: Array<String>) {

    //Note :When we declare data class compiler atomatic generate copy, equals hackCode and toString form
    val data =DataCls("SpYadav",28)
    println("Name : ${data.name} ,\nAge : ${data.age}")

    //actually destrucure variable create componentN().example component1() ->name
    println("***************Destrucure declaration**********************")
    val (name ,age) =DataCls("SpYadav",28) // destruction variable
    println("Name : $name ,\nAge : $age")
    println("Name : ${data.component1()} ,\nAge : ${data.component2()}")//component1() and component2()



    println("HashCode :${data.hashCode()}")
    println("String formate : ${data.toString()}")

    //Copy
    val data2 =data.copy(name ="Sunita" ,age =25)
    val (sname ,sage) =data2
    println("Sname : $sname , Age : $sage")

//hashCode
    val u1 = User("John", 29)
    val u2 = u1.copy()
    val u3 = u1.copy(name = "Amanda")
    println("u1 hashcode = ${u1.hashCode()}")
    println("u2 hashcode = ${u2.hashCode()}")
    println("u3 hashcode = ${u3.hashCode()}")

    //Equal compare content of object
    println("***************compare using eqauls() method*******************")
    if (u1.equals(u2) == true)
        println("u1 is equal to u2.")
    else
        println("u1 is not equal to u2.")

    if (u1.equals(u3) == true)
        println("u1 is equal to u3.")
    else
        println("u1 is not equal to u3.")

    //== use
    println("**********compare using === method*************")
    if(u1 === u2)
        println("u1 is equla to u2")
    else {
        println("u1 not equal to u2")
    }
    if(u1 === u3)
        println("u1 is equla to u3")
    else {
        println("u1 not equal to u3")
    }
}