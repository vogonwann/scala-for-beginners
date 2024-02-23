package lectures.part1basics

object Expressions extends App {
  
    val x = 1 + 2 // expression
    println(x)

    println(2 + 3 * 4)

    println(1 == x)

    var aVariable = 2
    aVariable += 3
    println(aVariable)

    // IF Expression
    val aCondition = true
    val aConditionedValue = if(aCondition) 5 else 3 // IF Expression
    println(aConditionedValue)
    println(if(aCondition) 5 else 3)

    var i = 0
    while (i < 10) {
        println(i)
        i += 1
    }

    // PLEASE NEVER WRITE THIS AGAIN

    // EVERYTHING in Scala is an Expression

    val aWeirdValue = (aVariable = 3) // Unit == void
    println(aWeirdValue)

    // side effects: println(), whiles, reassinging

    // Code blocks
    val aCodeBlock = {
        val y = 2
        val z = y + 1

        if (z > 2) "hello" else "godbye"
    }

    // 1. difference between "hello world" vs println("hello world")
    // 2.

    val someValue = {
        2 < 3
    }

    println(someValue)

    val someOtherValue = {
        if (someValue) 239 else 985
        42
    }

    println(someOtherValue)
}
