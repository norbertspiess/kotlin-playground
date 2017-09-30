package de.norbert.kotlin.playground

fun main(args: Array<String>) {
    val flow = Flow()
    flow.ifStatement(5, 6)
    flow.whenStatement("b")
    flow.forLoop()
    flow.whenStatement("lorem")
}