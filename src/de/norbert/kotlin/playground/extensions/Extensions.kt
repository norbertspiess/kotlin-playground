package de.norbert.kotlin.playground.extensions

fun String.removeFirstAndLastChar(): String = this.substring(1, this.length - 1)