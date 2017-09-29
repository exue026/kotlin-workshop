package com.zeitspace.kotlin.activity4

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main(args: Array<String>) {
    val myData1 = MyData("No Name", 2, "Nowhere")
    val obj1 = JvmType.Object("obj1")

    val expected = "[one, two, more, more, more, Else, Billy Joe, 25, The Moon, String, Big int, Little int, Big float, Little float, I don't know, Lobj1;]"

    val result = mutableListOf<String>()
    result.add(switch(1, { "one" }, { "two" }, { "more" }))
    result.add(switch(2, { "one" }, { "two" }, { "more" }))
    result.add(switch(3, { "one" }, { "two" }, { "more" }))
    result.add(switch(4, { "one" }, { "two" }, { "more" }))
    result.add(switch(5, { "one" }, { "two" }, { "more" }))
    result.add(switch(6, { "one" }, { "two" }, { "more" }))

    withStatement(myData1)
    result.add(myData1.name)
    result.add(myData1.age.toString())
    result.add(myData1.hometown)

    result.add(switchType("String"))
    result.add(switchType(200))
    result.add(switchType(5))
    result.add(switchType(200f))
    result.add(switchType(5f))
    result.add(switchType(myData1))
    result.add(switchType(obj1))

    if (result.toString() == expected) {
        println("Your results were correct!")
    } else {
        println("Your results are: \n$result\nThe expected results are: \n$expected")
    }
}