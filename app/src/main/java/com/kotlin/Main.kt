package com.kotlin

fun main(){

    val age = 25 * 365
    val y = 4
    val name = "Gilles"
    val x = "-._,-"
    println()
    printBorder(x,y)
    println("Happy Birthday ${name} ")
    printBorder(x,y)
    println()

    // Let's print a cake!
    println("   ,,,,,   ")
    println("   |||||   ")
    println(" =========")
    println("@@@@@@@@@@@")
    println("{~@~@~@~@~}")
    println("@@@@@@@@@@@")
    println()
    println("You are already ${age} days old, ${name}!")
    println("${age} days old is the very best age to celebrate!")
}

fun printBorder(border:String, timeToRepeat:Int){
    repeat(timeToRepeat){
        print(border)
    }
    println()

}