package demo.expresso.kotlintest.class_object

interface InterfaceKotlin {
    
    var age : Int

    fun Name(){
        println("Name ")
    }

    fun age();
}
class InterfaceImp(override var age: Int) :InterfaceKotlin{
    override fun age() {
        println(age)
    }

}

//Example 2
//Suppose, two interfaces(A and B) have a non-abstract method with
// the same name (let's say callMe() method). You implemented these two
// interfaces in a class (let's say C). Now, if you call the callMe()
// method using the object of class C, compiler will throw error. For example,
interface A {

    fun callMe() {
        println("From interface A")
    }
}

interface B  {
    fun callMe() {
        println("From interface B")
    }
}

class Child: A, B {
    override fun callMe() {
        super<A>.callMe()
        super<B>.callMe()
    }
}

fun main(args: Array<String>) {
    val obj =InterfaceImp(25)
    obj.age()


    val child =Child()
     child.callMe()

}