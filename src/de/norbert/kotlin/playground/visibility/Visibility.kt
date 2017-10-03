package de.norbert.kotlin.playground.visibility

open class Base {
    var a = 1                 // public by default
    private var b = 2         // private to Base class
    protected open val c = 3  // visible to the Base and the Derived class
    internal val d = 4        // visible inside the same module

    protected fun e() {}     // visible to the Base and the Derived class
}

class Derived() : Base() {

    override val c = 9        // c is protected

    private constructor(foo: String): this() {
        println("private")
    }

    override fun toString(): String {
        // a, c, d, and e() of the Base class are visible
        // b is not visible
        return "$a $c $d " + e()
    }
}