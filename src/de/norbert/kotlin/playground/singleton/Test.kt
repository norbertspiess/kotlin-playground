package de.norbert.kotlin.playground.singleton

object Test {
    private var a: Int = 0
    var b: Int = 1

    fun makeMe12(): Int {
        a = 12
        return a
    }
}