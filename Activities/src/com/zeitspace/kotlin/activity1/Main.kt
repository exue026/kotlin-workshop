package com.zeitspace.kotlin.activity1

fun main(args: Array<String>) {
    val expected = "[john_doe@mail.com belongs to John Doe who is 26 years old., sarah_connor@yahoo.com belongs to Sarah Connor who is 18 years old., baby@mail.com belongs to Baby Doe who is 1 year old.]"

    val result = mutableListOf<String>()
    /* Uncomment after you've defined and implemented your methods */
//    result.add(activity1("john_doe@mail.com", age = 26))
//    result.add(activity1("sarah_connor@yahoo.com", "Sarah", "Connor"))
//    result.add(activity1("baby@mail.com", firstName = "Baby", age = 1))

    if (result.toString() == expected) {
        println("Your results were correct!")
    } else {
        println("Your results are: \n$result\nThe expected results are: \n$expected")
    }
}