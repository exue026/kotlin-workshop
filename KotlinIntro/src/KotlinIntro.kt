import com.sun.org.apache.xpath.internal.operations.Bool

data class Student(val age: Int, var average: Double)
data class Department(val name: String, val numberOfMembers: Int)

fun main(args : Array<String>) {
    val student = Student(age = 16, average = 85.0)
    student.average = 5.0
}

/*

// var vs. val, type inference, inline functions

fun typeInference() {

    val word1: String = "Hello World!"

    val word2 = "Hello World" // isNegative is inferred to be of type Boolean
    //word2 = "hello world"   // error: Val cannot be reassigned

    val age: Int
    age = 8

    var isNegative = checkIfNegative(age)
}

fun checkIfNegative(age: Int): Boolean {
    return age < 0
}

// inline function
fun checkIfNegative2(age: Int) = age < 0

fun smartCasting() {
    // word has type "Any" (class Any is the root of the Kotlin class hierarchy)
    val word: Any = "Hello World"
    System.out.println(word.length) // error: unresolved reference: length

    if (word is String) {
        // word has type "String"
        println(word.length)
    } else {
        println("Word is not of type String!")
    }
}

*/

data class Teacher(val age: Int, val firstname: String, val lastname: String, val middlename: String?)

fun nullables() {

    var grade: Int? = 5
    grade = null // OK

    var anotherGrade: Int = grade // error: Type mismatch
    anotherGrade = grade!! // OK

    var firstname: String = "John"
    firstname = null // error: Null cannot be a value of a non-null type String

    var Bob: Teacher? = Teacher(40, "Bob", "Cruise", "Rocky")
    var BobsLastName = Bob?.firstname // BobsLastName is of type String?
    // BobsMiddleName is of type String? (NOTE: will throw NPE if Bob or middlename is null)
    var BobsMiddleName = Bob!!.middlename!!

    println("Bob's last name is: ${ BobsLastName ?: "N/A" }")

    //Equivalent to

    if (BobsLastName != null) {
        // BobsLastName is smart-casted to type String
        println("Bob's last name is: ${ BobsLastName } ")
    } else {
        println("Bob's last name is: N/A")
    }

    //safe casts
    val someString = "Hello"
    //anotherString has type Int? and value null
    val anotherString = someString as? Int
}

fun dataStructures() {

    val readOnlyList: List<Int> = listOf(1, 2, 3)
    readOnlyList.clear() // error: unresolved reference: clear
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3)
    mutableList.clear() // OK

    val firstItem = mutableList.get(0)
    mutableList[2] = -1
}

fun firstRepeatedChar(string: String): Char? {

    val charMap = mutableMapOf<Char, Boolean>()

    for(char in string) {
        if (charMap.containsKey(char)) return char
        else charMap.put(char, true)
    }
    return null
}

//extension function
fun Int.squared(): Int {
    return this * this
}


//inline functions; return type is inferred
fun Int.cubed() = this * this * this

//extension properties
val Int.squared: Int
    get() = this * this

val Int.squared = this * this //error since extensions don't insert members into classes so it can't hold stored properties

fun extensions() {
    val myNum = 3
    println(myNum.squared())
}

//named, optional, and variable length arguments


fun refreshPageIfNeeded(force: Boolean = false, onComplete: () -> Unit) {
    //check if data is outdated; if not outdated, don't update page
    //if force = true, update page
}

fun updateAll() {

    //code

    refreshPageIfNeeded(true, { println("page refreshed!") })

    refreshPageIfNeeded(onComplete = { println("page refreshed!") }, force = true)

    refreshPageIfNeeded {
        println("page refreshed!")
    }

    //code
}
*/

fun sumOf(vararg nums: Int) = nums.reduce { base, currNum ->  base + currNum }



