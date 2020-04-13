package demo.expresso.kotlintest.controlflow

class ForLoop{}

fun main(args : Array<String>){

    //case 1-Iterate through range
    for (i in 1..5) print("$i ,") // 1,2,3,4,5

    println()
    for( i in 'a'..'z') print("$i ") // print a b c

    println()
    for( i in 5..1) print("$i ") // print nothing


    println()

    for (i in 5 downTo 1) print("$i ,") //5, 4, 3, 2, 1

    println()

    for (i in 5 downTo 1 step 2) print("$i ,") // 5,3,1

    println()

    for (i in 1..10 step 2) print("$i ,") // 1,3,5,7,9


    /*Iterate through Array*/
    println()
    val language = arrayOf("Java","Kotlin","React","AEM")
    for(i in language) print("$i ,")

    //It's possible to iterate through an array with an index. For example
    println("**It's possible to iterate through an array with an index. For example**")
    for(i in language.indices) print(language[i])

    /*Iterate through String*/
    println("** Iterate through String **")
    val name ="Sarayu"
    for(ch in name) print("$ch ,") // S,a,r,a,y,u
    println()
    for(ch in name.indices) print(name[ch]+",")




}