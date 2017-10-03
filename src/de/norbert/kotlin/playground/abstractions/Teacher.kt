package de.norbert.kotlin.playground.abstractions

abstract class Person(name: String) : IPerson {

    init {
        println("My name is $name.")
    }

    override fun displaySSN(ssn: Int) {
        println("My SSN is $ssn.")
    }

    abstract fun displayJob(description: String)
}

class Teacher(name: String) : Person(name) {
    override var age: Int = 50
        set(value) {
            println("setting age to $value")
            field = value
        }

    override val birthYear: Int
        get() = 1950

    override fun displayJob(description: String) {
        println(description)
    }
}

interface IPerson {
    var age: Int
    // property with implementation
    val birthYear: Int
        get() = 1987

    fun displaySSN(ssn: Int)
    fun asString(): String = "teacher (age: $age), born in $birthYear"
}