package com.example.androidmaster


fun main(){
    /*
    * Variables Numericas
    */
    val name = "Ricardo" // string (sin tipado)
    // Int -2,147,483,647 a 2,147,483,647
    val age:Int = 30
    // long -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val longNumber: Long = 30
    // float
    val floatExample: Float = 30.45F
    // Double
    val doubleNumber : Double = 3241.2354587

    /**
     * Variables Alfanumericas
     */

    //Char
    val charExample1 : Char = 'd'
    val charExample2 : Char = '1'

    // string
    val stringExample: String = "Esto es una cadena de texto"

    /*
    Variables Booleanas
     */

    val booleanExample1 : Boolean = true
    val booleanExample2 : Boolean = false

    // para que se pueda cambiar el valor de una variable debe ser declarado usando var
    var age2 : Int = 1
    age2 = 99

    println("Sumar :")
    println(age+age2)

    println("Restar :")
    println(age2-age)

    println("Multiplicar :")
    println(age*age2)

    println("Division :")
    println(age2/age)

    println("Modulo :")
    println(age2 % age)


    var exampleSuma = age + floatExample
    println(exampleSuma)

    var string1: String = "dsdsd"
    var string2:String = "sddsadsad"
    println(string1+string2)

    var title:String = "libro de"
    var names:String="ricnef"
    var stringConcat : String = "$title $names"
    println(stringConcat)

    // convertir de entero a string
    var exampleToString: String = age.toString()
    println(exampleToString)

}