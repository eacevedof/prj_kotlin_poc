package com.codely.demo
import java.time.LocalDate

fun main() {
    println("Please enter a date with the format YYYY-MM-DD:")
    val input = LocalDate.parse(readLine())
    println("You wrote $input ${input.dayOfWeek}")
}
