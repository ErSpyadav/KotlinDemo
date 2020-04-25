package demo.expresso.kotlintest.class_object

open class Animal{
    open var age :Int=5

    open fun eat(){
        println("Animal eating")
    }

}
class Cat:Animal(){
     var color :String="clack"
    override var age=10
    fun mew(){
        println("mew mew")
    }

    override fun eat(){
        println("Cat eat rat")
    }
}

class Dog :Animal(){
    override var age=20
    var breed:String ="BullDog"
    fun bark(){
        println("bhow bhow")
    }

    override fun eat(){
        println("Dog eat animal")
    }
}

fun main() {
    println("***********Cal**************")
    val cat=Cat()
    println(cat.age)
    println(cat.color)
    cat.mew()
    cat.eat()
    println("***********Dog**************")
    val dog=Dog()
    println(dog.age)
    println(dog.breed)
    dog.bark()
    dog.eat()

        //if you want to override Parent method or variable the mark parent vairible and method with open
       // and used overidde in child class method

}
