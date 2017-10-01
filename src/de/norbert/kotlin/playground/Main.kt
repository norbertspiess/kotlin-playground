package de.norbert.kotlin.playground

fun main(args: Array<String>) {
    flow()
    parameterAndConstructors()
    getterAndSetter()
}

private fun flow() {
    val flow = Flow()
    flow.ifStatement(5, 6)
    flow.whenStatement("b")
    flow.forLoop()
    flow.whenStatement("lorem")
}

fun parameterAndConstructors() {
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
