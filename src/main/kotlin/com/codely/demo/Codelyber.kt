package com.codely.demo
import java.time.LocalDate
import java.time.Period

fun main() {
    println("Voer alstublieft een datum in met het formaat: YYYY-MM-DD")

    //uitvoer let context tenzij readLine() null teruggeeft
    readLine().takeUnless {
        it.isNullOrEmpty()
    }?.let {
        line ->

        val input = LocalDate.parse(line).also {
            println("U heeft de datum $it ingevoerd")
        }

        with(Period.between(input, LocalDate.now())) {
            println("Het verschil tussen data $input is ${this.years} jaar")
        }

    }
}
