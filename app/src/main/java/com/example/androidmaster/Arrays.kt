package com.example.androidmaster

fun main(){
    val weekDays = arrayOf("Lunes","Martes","Miercoles")
    println(weekDays[0])
    println(weekDays.size)

    //Modificar valores
    weekDays[0] = "Domingo"
    println(weekDays[0])

    // Bucles
    for (position in weekDays.indices){
        println(weekDays[position])
    }

    for((position, value) in weekDays.withIndex()){
        println("La posicion $position, contiene $value")
    }

    for(weekDay in weekDays){
        println("Now is $weekDay")
    }
}