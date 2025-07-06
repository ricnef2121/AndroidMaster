package com.example.androidmaster

fun main() {
    var name: String? = null
    var secondName: String = "Name"

    println(name?.get(2) ?: "Lo siento no se puede acceder a la poscion en un valor nullo")
    println(secondName.get(2))
}

