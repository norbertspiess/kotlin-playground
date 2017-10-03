package de.norbert.kotlin.playground

import de.norbert.kotlin.playground.visibility.Base
import de.norbert.kotlin.playground.visibility.Derived

fun main(args: Array<String>) {
    flow()
    parameterAndConstructors()
    getterAndSetter()
    visibility()
}

private fun flow() {
    val flow = Flow()
    flow.ifStatement(5, 6)
    flow.whenStatement("b")
    flow.forLoop()
    flow.whenStatement("lorem")
}

private fun parameterAndConstructors() {
    Constructor1()
    Constructor1("my own")
    Constructor1(prop2 = 5)
    Constructor2("Uwe")
}

private fun getterAndSetter() {
    Person().firstName
    Person().lastName
    Person().firstName = "horstmann"
    // compile error as setter is private:
    // Person().age=5
}

private fun visibility() {
    val base = Base()
    base.a
    base.d
    // base.b, base.c and base.e() are not visible

    val derived = Derived()
    derived.a
    derived.d
    // derived.c is not visible
}
