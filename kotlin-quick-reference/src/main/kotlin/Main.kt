package dev.blueberry.dream

import java.math.BigInteger
import java.math.BigDecimal

fun main() {
    // single line comment
    // single line comment
    /*
     * multi line comment
     */

    /**
     * multi line comment
     */
    println("Hello World!")

    println("This is the javaClass of an instance of int ${1.javaClass}")
    println("This is the javaClass of an instance of int ${"String".javaClass}")
    println("This is the javaClass of an instance of int ${'c'.javaClass}")

    // init immutable variable
    val s = "hello world"
    // s = "suh dude" // will error


    // init mutable variable
    var s2 = "saad khan"
    s2 = "suh dude"

    //deferred intialization
    val name: String
    val num: Int

    val r = (1..10 ).shuffled().first()
    println("r: $r")

    name = if (r % 2 == 0) "Saad" else "Khan"
    num = r

    println("name $name")
    println("num $num")

    // explicit type definition
    val myInt: Int = 1
    // implicit type definition
    val myInt2 = 2

    // built in data types
    val b: Byte = 1
    val i: Int = 1
    val l: Long = 12
    val l2 = 1L
    val s3: Short = 1
    val d:Double = 1.0
    val f:Float = 1f

    val x = BigInteger("1")
    val y = 42L.toBigInteger()
    val y2 = 23.toBigInteger()

    val n2 = "SK"
    val c: Char = 'c'
    val b2: Boolean = true

    // multi line strings
    val mString = """
        Hello my string is
        on multiple lines
    """.trimIndent()

    println(mString)

    val numsList = listOf(1,2,3,4,5)
    println(numsList.joinToString())

    val words = arrayOf("SJ", "was", "here")
    println(words.joinToString())

}
