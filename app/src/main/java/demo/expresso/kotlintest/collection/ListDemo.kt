package demo.expresso.kotlintest.collection

import java.util.function.Consumer

fun main(args: Array<String>) {
    val list = listOf<Int>(1,2,3,4,5,6)
    //list.add(7) we cannot modify
    println(list)

    val list1 = mutableListOf<Int>(1,2,3,4,5,6)
    println(list1)
    list1.add(7)
    println(list1)
    list1+= listOf<Int>(8,8,10)
    println(list1)

    println("Iteration")
    val iterator =list.iterator()
    while (iterator.hasNext())
        println(iterator.next())
    println("for Loop")
    for(item in list)
        print("$item ")

    println("forEach")
    list.forEach { print("Data:$it") }

    println("**************Filter*****************")
    val listNew =list.filter { it>3 }
    println(listNew)

    val numbers = listOf("one", "two", "three", "four")
    val filterResults = mutableListOf<String>()  //destination object
    numbers.filterTo(filterResults) { it.length > 3 }
  //  numbers.filterIndexedTo(filterResults) { index, _ -> index == 0 }
    println(filterResults) // contain


    val result = numbers.mapTo(HashSet()) { it.length }
    println("distinct item lengths are $result")


    val numbers1 = mutableListOf("one", "two", "three", "four")
    val sortedNumbers = numbers1.sorted()
    println(numbers == sortedNumbers)  // false
    numbers1.sort()
    numbers1.add("Five")
    println(numbers == sortedNumbers)  // true
}