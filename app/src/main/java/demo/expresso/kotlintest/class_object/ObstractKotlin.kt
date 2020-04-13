package demo.expresso.kotlintest.class_object

 abstract class ObstractKotlin {
     //need to use open for overide im subclass.remove open if dont want to overide Age
    open  var age :Int =0

     //if you want to overide Name method then use open keyword
      open fun Name(){
         println("Abstract")
     }

     abstract fun age();

}
class Test(age1 :Int,age2 : Int) : ObstractKotlin(){
    override var age: Int =0

    init {
       super.age =age1
        this.age=age2
    }

    override fun age() {
        println("Parent Age:${super.age}age && Child Age : $age")
    }

    override fun Name(){
        println("Test")
    }

}

fun main(args: Array<String>) {
    val test =Test(50,25)
    test.Name()
    test.age();


}