package demo.expresso.kotlintest.collection

fun main(args: Array<String>) {
    val numbers = setOf(1, 2, 3)
    println(numbers.map { it * 3 })
    println(numbers.mapIndexed { idx, value -> value * 4 })

    val mapList = mapOf("key1" to 1,"key2" to 2,"key3" to 3)
    println(mapList.keys +" -"+mapList.values)
    print(mapList.mapKeys { it.key.toUpperCase() })

    println(mapList.mapKeys { mapList[it.key] })

    println("*****Zip Operator*********")
    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")
    println(colors zip animals)

    val twoAnimals = listOf("fox", "bear")
    println(colors.zip(twoAnimals))



    println(colors.zip(animals) { color, animal -> "The ${animal.capitalize()} is $color"})

    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs.unzip())


    //Assocition
    val numberNew = listOf("one", "two", "three", "four")
    println(numberNew.associateWith { it.length })//one=3,three=5, four=4
    println(numberNew.map { it.length })//print only length

    //Falttern

    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(1, 2))
    println(numberSets)
    println(numberSets.flatten())
        /*
        * [[1, 2, 3], [4, 5, 6], [1, 2]]
[1, 2, 3, 4, 5, 6, 1, 2]*/

}