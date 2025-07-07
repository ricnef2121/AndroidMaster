package com.example.androidmaster.sintaxis

fun main() {
    // inmutableList()
    mutableList()
}

fun mutableList() {
    var weekDays: MutableList<String> =
        mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    weekDays.add("DomingoLunes")
    weekDays.add(3,"Third Position")
    println(weekDays)
    if(weekDays.isEmpty()){
        println("La lista esta vacia")
    }else{
        weekDays.forEach { println(it) }
    }

    if(weekDays.isNotEmpty()){
        weekDays.forEach { println(it) }
    }
}

fun inmutableList() {
    val readonly: List<String> =
        listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    println(readonly.size)
    println(readonly)
    println(readonly[0])
    println(readonly.last())
    println(readonly.first())

    // filters
    var example = readonly.filter { it.contains("a") }
    println(example)

    var example2 = readonly.filter { it.contains("A") }
    println(example2)

    readonly.forEach { weekDay -> println(weekDay) }
}