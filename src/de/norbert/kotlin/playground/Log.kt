package de.norbert.kotlin.playground;

open class Log {
    constructor(data: String) {
        // code
    }
    constructor(data: String, numberOfData: Int) {
        // code
    }
}

class AuthLog: Log {
    constructor(data: String): this(data, 10) {
        // code
    }
    constructor(data: String, numberOfData: Int): super(data, numberOfData) {
        // code
    }
}