package com.example.androidmaster.sintaxis

fun main() {
    // getTrimestre(9)
    // getSemestre(1000)
    // resultado("ochooo")
    println(getSemestre(1000))
}

fun resultado(value: Any) {
    when (value) {
        is Int -> value + value
        is String -> println(value)
        is Boolean -> println("es un booleano")
    }
}

fun getSemestre(month: Int) = when (month) {
        // rangos
        // range
        in 1..876 -> "Primer Semestre"
        in 877..1233 -> "Segundo Semestre"
        // negacion en rangos
        !in 1..1233 -> "Semestre no valido"
        else ->  "nothing to display"
    }

fun getTrimestre(month: Int) {
    when (month) {
        1, 2, 3 -> print("Primer Trimestre") // if month == 1 || month == 2 || month == 3 -> Primer Trimestre
        4, 5, 6 -> print("Segundo Trimestre") // if month == 4 || month == 5 || month == 6 -> Segundo Trimestre
        7, 8, 9 -> print("Tercer Trimestre") // if month == 7 || month == 8 || month == 9 -> Tercer Trimestre
        10, 11, 12 -> print("Cuarto Trimestre") // if month == 10 || month == 11 || month == 12 -> Cuarto Trimestre
        else -> print("Trimestre no valido")
    }
}

fun getMonth(month: Int) {
    when (month) {
        1 -> print("Enero") // if month == 1 -> Enero
        2 -> print("Febrero")
        3 -> print("Marzo")
        4 -> print("Abril")
        5 -> print("Mayo")
        6 -> print("Junio")
        7 -> print("Julio")
        8 -> print("Agosto")
        9 -> print("Septiembre")
        10 -> print("Octubre")
        11 -> {
            println("Noviembre")
            println("Noviembre")
        }

        12 -> print("Diciembre")
        else -> print("No es un mes valido")

    }
}