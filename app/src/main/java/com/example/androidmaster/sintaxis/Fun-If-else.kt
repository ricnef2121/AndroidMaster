package com.example.androidmaster.sintaxis

fun main() {
    // ifBasic()
    // ifAnidado()
    // ifBoolean()
    // ifInt()
    // ifMultiple()
    ifMultipleOR()
}

fun ifMultipleOR() {
    var pet = "cat"
    if (pet == "dog" || pet == "cat") {
        print("Es un gato o un perro")
    }
}

fun ifMultiple() {
    var age = 18
    var parentPermission = true
    var imHappy = true
    if (age >= 18 && parentPermission && imHappy) {
        println("puedo beber cerveza")
    }
}

fun ifInt() {
    var age = 18
    if (age >= 18) {
        println("Beber Cerveza")
    } else {
        println("Beber Jugo")
    }
}

fun ifBoolean() {
    var soyFeliz: Boolean = true
    if (!soyFeliz) {
        println("Estoy triste")
    }
}

fun ifBasic() {
    var name = "ricnef"

    if (name == "ricnef") {
        println("La variable es ricnef")
    } else {
        println("la variable no es ricnef")
    }
}

fun ifAnidado() {
    val animal = "dog"
    if (animal == "dog") {
        println("Es un perro")
    } else if (animal == "cat") {
        println("Es un gatito")
    } else if (animal == "bird") {
        println("Es un pajaro")
    } else {
        println("No es un animal")
    }
}