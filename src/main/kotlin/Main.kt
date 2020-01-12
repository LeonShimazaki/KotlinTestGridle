package demo 

import java.util.Random


fun main(args : Array<String>){
    println("Hello, world!")
    
    fun add(num1: Int, num2: Int) = num1 + num2
    println("5 + 4 = ${add(5,4)}")

    val items = listOf("apple", "banana", "kiwifruit", "orange", "kiwifruit")
    for (item in items) {
        println(item)
    }
    val rand = Random()
    val magicnumber = rand.nextInt(50) + 1

    var guess = 0

    while(magicnumber != guess){
        guess += 1
    }
    println("Magic number was $guess")
}