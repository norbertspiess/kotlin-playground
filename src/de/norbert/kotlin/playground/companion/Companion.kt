package de.norbert.kotlin.playground.companion

class Companion {

    // name of the companion object is omitted
    // something like a static method in Java
    /*
    * The companion objects can access private members of the class.
    * Hence, they can be used to implement the factory method patterns.
    */
    companion object {
        fun callMe() = println("I'm called.")
    }
}