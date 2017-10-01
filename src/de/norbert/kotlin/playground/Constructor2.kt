package de.norbert.kotlin.playground

class Constructor2(_firstName: String, _age: Int = 0) {
    val firstName = _firstName.capitalize()
    var age = _age

    // initializer block
    init {
        println("$firstName is $age years old")
    }

}