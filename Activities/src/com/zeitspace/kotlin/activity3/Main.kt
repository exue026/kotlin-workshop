package com.zeitspace.kotlin.activity3

fun main(args: Array<String>) {
    val expected = "[2, 4, 356, 100, 200]"

    val result = mutableListOf<Int>()
    result.add(nullableAdd(2, null))
    result.add(nullableAdd(null, 4))
    result.add(anyAdd(100, 256))
    result.add(anyAdd(100, "256"))
    result.add(anyAdd(200, null))

    if (result.toString() == expected) {
        println("Your results were correct!")
    } else {
        println("Your results are: \n$result\nThe expected results are: \n$expected")
    }
}