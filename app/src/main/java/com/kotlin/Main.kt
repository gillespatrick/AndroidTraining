package com.kotlin

fun main() {
//
    val myFirstDice = Dice(6)
    println("Your ${myFirstDice.numSide} sided dice rolled ${myFirstDice.roll()}!")

    val mySecondDice = Dice(20)
    println("Your ${mySecondDice.numSide} sided dice rolled ${mySecondDice.roll()}!")



}

class Dice(val numSide:Int){
    var sides = 6


    fun roll():Int{
        return (1..numSide).random()
    }

}