package demo.expresso.kotlintest.class_object

class SafecallAndNullSafety {
    var country :String  ="India"
    var age:Int =29


    fun printDetail(){
        println("print method is called")
    }

}

fun main() {
    var safecall: SafecallAndNullSafety? =null //nullable type. it can hold null
    lateinit var safecal2 :SafecallAndNullSafety// cannot hold null

    safecall = SafecallAndNullSafety()
    safecal2 =SafecallAndNullSafety();

  //  safecall =null // no error
   // safecal2 =null //error. it cannot hold null

    /*Now we have to be careful for nullable object*/
    // no exception. beacuse in case of null it will not call printDetail
    safecall?.printDetail()

    /*Exception nullPointer Exception. not null Assertion indicate that safecall is not null*/
   // safecall!!.printDetail()


    //elvis operator.if object is not then return.safecall is null,So print is excuted
    safecall?.printDetail()?: println("Object is null")

    //Class Cast Safety

    /*"main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
    * because string cannot be cast into int*/
   // var age1 =safecall.country as Int

    /*handle class cast safety*/
    var age2 :Int? =safecall.country as? Int// classcast exception handled
    var age3 :Int?= safecall.age as? Int
    println(age2) //null
    println(age3) //29




}