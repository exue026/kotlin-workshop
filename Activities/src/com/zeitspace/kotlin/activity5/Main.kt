package com.zeitspace.kotlin.activity5

fun main(args: Array<String>) {
    val people = listOf(
        Person("Bill", "Toronto", "Pizza", listOf("All Star")),
        Person("Sarah", "Kitchener", "Ice Cream", listOf("Bohemian Rhapsody", "Party Rock Anthem", "I Gotta Feeling")),
        Person("Sally", "Waterloo", "Chicken", listOf("Macarena", "Hey Jude", "Uptown Funk!")),
        Person("Bob", "Toronto", "Burgers", listOf("Bohemian Rhapsody")),
        Person("Jenny", "Kitchener", "Candy", listOf("Never Gonna Give You Up", "Bohemian Rhapsody", "Uptown Funk!"))
    )
    val numbers = listOf(
        "1",
        "8",
        "-6",
        "0"
    )

    val expected = "[3, [Pizza, Ice Cream, Chicken, Burgers, Candy], [Chicken], true, true, false, [All Star, Bohemian Rhapsody, Party Rock Anthem, I Gotta Feeling, Macarena, Hey Jude, Uptown Funk!, Never Gonna Give You Up], [All Star, Bohemian Rhapsody, Party Rock Anthem, I Gotta Feeling], [Person(name=Sarah, city=Kitchener, favouriteFood=Ice Cream, favouriteSongs=[Bohemian Rhapsody, Party Rock Anthem, I Gotta Feeling]), Person(name=Sally, city=Waterloo, favouriteFood=Chicken, favouriteSongs=[Macarena, Hey Jude, Uptown Funk!]), Person(name=Jenny, city=Kitchener, favouriteFood=Candy, favouriteSongs=[Never Gonna Give You Up, Bohemian Rhapsody, Uptown Funk!])]]"

    val result = mutableListOf<String>()
    result.add(numbers.sumIntStrings().toString())
    result.add(people.getFavouriteFoods().toString())
    result.add(people.getFavouriteFoods("Waterloo").toString())
    result.add(people.anybodyFromCity("Toronto").toString())
    result.add(people.anybodyFromCity("Waterloo").toString())
    result.add(people.anybodyFromCity("Milton").toString())
    result.add(people.getAllSongs().toString())
    result.add(people.subList(0, 2).getAllSongs().toString())
    result.add(people.getPeopleWithLotsOfSongs().toString())

    if (result.toString() == expected) {
        println("Your results were correct!")
    } else {
        println("Your results are: \n$result\nThe expected results are: \n$expected")
    }
}