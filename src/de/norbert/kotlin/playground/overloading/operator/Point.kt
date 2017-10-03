package de.norbert.kotlin.playground.overloading.operator

class Point(private val x: Int = 0, private val y: Int = 10) {

    // overloading plus function
    operator fun plus(p: Point): Point {
        return Point(x + p.x, y + p.y)
    }

    override fun toString(): String {
        return "Point(x: $x, y: $y)"
    }
}