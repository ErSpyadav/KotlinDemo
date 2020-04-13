package demo.expresso.kotlintest.class_object

class GetterSetter {
    var name :String=""
    //Internaly JVM create method getter and setter.
    get() =field
    set(value){
        field =value;
    }


    var age : Int =0
        get() =field
        set(value){
            field =value;
        }
}
class Person {
    var name :String=""
    var age : Int =0

}

class Employee (name :String ,age :Int){
    var name :String=""
    var age : Int =0


}

fun main(args: Array<String>) {
    val obj =GetterSetter()
    obj.name ="Sunita"
    obj.age =25
    println("Name : ${obj.name} , age : ${obj.age}")

    //Witout any getter and setter
    val obj1 =Person()
    obj1.name ="Sarayu"
    obj1.age =29
    println("Name : ${obj1.name} , age : ${obj1.age}")
}