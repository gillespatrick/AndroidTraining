package com.kotlin

fun main() {
    val diceRange = 1..6
    val randomNum = diceRange.random()
    val myFirstDice = Dice()
    println(myFirstDice.sides)
    myFirstDice.roll()

}

class Dice{
    var sides = 6


    fun roll(){
        val randomNumber = (1..6).random()
        println(randomNumber)
    }

}