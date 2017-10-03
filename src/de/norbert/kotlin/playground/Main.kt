package de.norbert.kotlin.playground

import de.norbert.kotlin.playground.abstractions.Teacher
import de.norbert.kotlin.playground.constructor.Constructor1
import de.norbert.kotlin.playground.constructor.Constructor2
import de.norbert.kotlin.playground.dataclass.User
import de.norbert.kotlin.playground.flow.Flow
import de.norbert.kotlin.playground.getter.setter.Person
import de.norbert.kotlin.playground.visibility.Base
import de.norbert.kotlin.playground.visibility.Derived

fun main(args: Array<String>) {
    flow()
    parameterAndConstructors()
    getterAndSetter()
    visibility()
    abstractions()
    dataClasses()
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
    // User().age=5
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

fun abstractions() {
    val t = Teacher("Hans")
    t.displayJob("description")
    t.displaySSN(124)
    t.age=31
    println("getting age: ${t.age}")
}

fun dataClasses() {
    var user = User("Horst", 50)
    println("User: $user")
    user = user.copy(age=18)
    println("copied user: $user")

    val (name, age) = user // destructuring declaration
    println("$name - $age")
}
