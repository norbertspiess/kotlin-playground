package de.norbert.kotlin.playground.dataclass

data class User(val name: String, var age: Int)
// kotlin generates copy(), equals() and hashCode() pair(), and toString()
// also generates setters and getters

// The primary constructor must have at least one parameter.
// The parameters of the primary constructor must be marked as either val or var.
// The class cannot be open, abstract, inner or sealed.