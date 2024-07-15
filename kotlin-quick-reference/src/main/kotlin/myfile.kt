package dev.blueberry.dream

import java.util.Scanner
import java.io.File

fun main() {
    println("Running I/O")

//    System.err.println("Oops, error!")

    println("What is your name?")
    val name = readlnOrNull()
    println("Your name is $name")

    val scanner = Scanner(System.`in`)

    print("Enter an int: ")
    val i: Int = scanner.nextInt()
    println("i = $i")

    fun readFile(filename: String): List<String> = File(filename).readLines()

    val lines = readFile("/etc/passwd")

    lines.forEach{ println(it) }
    lines.forEach{ line -> println(line) }

    val fileName = "passwdCopy"

    File(fileName).writeText(lines.joinToString("\n"))

}
