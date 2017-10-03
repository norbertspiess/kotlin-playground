package de.norbert.kotlin.playground.constructor

class Constructor1(private var prop1: String = "default", private var prop2: Int = 0, _param1: String = "default param value") {

    init {
        println("params: " + _param1)
        println("fields: prop1=$prop1, prop2=$prop2")
    }

    private constructor(foo: Int): this() {
        println("private")
    }

}

