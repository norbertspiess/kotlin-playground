package de.norbert.kotlin.playground

fun main(args: Array<String>) {
    flowStuff()
    parameterStuff()
}

fun parameterStuff() {
    Constructor1()
    Constructor1("my own")
    Constructor1(prop2 = 5)
    Constructor2("Uwe")
}

private fun flowStuff() {
    val flow = Flow()
    flow.ifStatement(5, 6)
    flow.whenStatement("b")
    flow.forLoop()
    flow.whenStatement("lorem")
}