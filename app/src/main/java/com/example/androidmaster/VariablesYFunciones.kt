package com.example.androidmaster


fun main() {
    showMyName()
    showMyAge(33)
    add(1, 2)
    var mySubtract = subtract(10, 2)
    println(mySubtract)
    var mySum = sumTwoNumbers(1)
    println(mySum)
}

fun add(number1: Int, number2: Int) {
    println(number1 + number2)
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

// add default value
fun sumTwoNumbers(firstN: Int = 0, secondN: Int = 0): Int {
    return firstN + secondN
}

// short Function
fun ShortSum(first:Int, second: Int): Int = first + second

fun showMyName() {
    println("Show my name")
}

fun showMyAge(currentAge: Int) {
    println("Show my age: $currentAge")
}

fun variablesAlfanumericas() {
    /**
     * Variables Alfanumericas
     */

    //Char
    val charExample1: Char = 'd'
    val charExample2: Char = '1'

    // string
    val stringExample: String = "Esto es una cadena de texto"

}

fun variablesBooleanas() {
    /*
    Variables Booleanas
     */

    val booleanExample1: Boolean = true
    val booleanExample2: Boolean = false
}

fun variablesNumericas() {
    /*
    * Variables Numericas
    */
    val name = "Ricardo" // string (sin tipado)
    // Int -2,147,483,647 a 2,147,483,647
    val age: Int = 30
    // long -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val longNumber: Long = 30
    // float
    val floatExample: Float = 30.45F
    // Double
    val doubleNumber: Double = 3241.2354587


    // para que se pueda cambiar el valor de una variable debe ser declarado usando var
    var age2: Int = 1
    age2 = 99

    println("Sumar :")
    println(age + age2)

    println("Restar :")
    println(age2 - age)

    println("Multiplicar :")
    println(age * age2)

    println("Division :")
    println(age2 / age)

    println("Modulo :")
    println(age2 % age)


    var exampleSuma = age + floatExample
    println(exampleSuma)

    var string1: String = "dsdsd"
    var string2: String = "sddsadsad"
    println(string1 + string2)

    var title: String = "libro de"
    var names: String = "ricnef"
    var stringConcat: String = "$title $names"
    println(stringConcat)

    // convertir de entero a string
    var exampleToString: String = age.toString()
    println(exampleToString)
}