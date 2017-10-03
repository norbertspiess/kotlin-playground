package de.norbert.kotlin.playground.flow

class Flow {

    fun ifStatement(a: Int, b: Int) {
        val max = if (a > b) a else b
        println("max: $max")
    }

    fun whenStatement(input: Any) {
        val type = when (input) {
            is String -> "string"
            is Int -> "int"
            else -> "i don't know what"
        }
        val strInput = input.toString()
        val result = when (strInput) {
            "a" -> "you gave me an a"
            in "b", "c", "d" -> "either b, c or d"
            else -> "you gave me something unexpected"
        }
        println("input is of type $type and was $result")
    }

    fun whileLoop() {
        var ctr = 6
        while (ctr > 0) {
            println("counting down: $ctr")
            ctr--
        }
    }

    fun forLoop() {
        for (i in 1..10) {
            println("counting up: $i")
        }
        println()
        for (i in 10 downTo 1) {
            println("counting down: $i")
        }
        println()
        for (i in 10 downTo 1 step 2) {
            println("counting down with steps: $i")
        }
        println()
        val language = arrayOf("Ruby", "Kotlin", "Python", "Java")
        for (item in language)
            println(item)

        println()
        for (item in language.indices) {
            // printing array elements having even index only
            if (item % 2 == 0)
                println(language[item])
        }
        println()
        for (letter in "lorem ipsum") {
            print(letter)
        }
    }
}