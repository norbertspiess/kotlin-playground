package de.norbert.kotlin.playground

class Person {
    var firstName: String = "uwe"
        get() {
            println(field)
            return field
        }
        set(value) {
            println("setting firstName to $value")
            field = value
        }
    var lastName: String = "ochsenknecht"
        get() {
            println("retrieving lastName with value $field")
            return field
        }
    var age: Int = 0
        @Deprecated(message = "setter is deprecated") private set
}