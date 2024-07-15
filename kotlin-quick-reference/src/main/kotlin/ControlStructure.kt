package dev.blueberry.dream

fun main() {
    val a = 1
    val b = 1

    if(a == b) println("hi!")
    if(a == b) {
        println("hi number 2!")
    }

    if(a != b) {

    } else {
        println("hi number 3!")
    }

    // when statement
    when {
        a != b -> {

        }
        else -> {
            println("hi number 3!")
        }
    }

    if (a == 0) {}
    else if (a == 1) {
        println("hi number 4!")
    } else {
        println("hi number 5!")
    }

    // kotlin ternary
    val minVal = if (a < b) a else b
    val maxVal = if (a > b) a else b


    val numsList = listOf(1,2,3,4,5)

    for(n in numsList){
        println(n)
    }

    for(n in numsList) println(n)

    for(i in 1..10) {
        println(i)
    }
    for(i in 10 downTo 1) println(i)
    for(i in 1..10 step 2) println(i)
    for(i in 10 downTo 1 step 2) println(i)

    var ratings = mapOf(
        "S" to 1,
        "J" to 2
    )

    for((char, num) in ratings) println("$char position $num")

    var i = 0

    while(i < 10) {
        println("while loop countup:\t${i++}")
    }

    do {
        println("dowhile loop countdown:\t${i--}")
    } while (i > 1)

    val i2 = 5

    when(i2) {
        1 -> println("one")
        2 -> println("two")
        else -> println("non binary")
    }

}