package com.codely.demo
import java.time.LocalDate
import java.time.Period

fun main() {
    println("Voer alstublieft een datum in met het formaat: YYYY-MM-DD")

    //uitvoer let context tenzij readLine() null teruggeeft
    readLine().takeUnless {
        it.isNullOrEmpty()
    }?.let {
        val input = LocalDate.parse(it)
        println("U heeft de datum $input ingevoerd")

        val currentDate = LocalDate.now()
        val difference = Period.between(input, currentDate)
        println("Het verschil tussen data $input en $currentDate is ${difference.years} jaar")
    }
}
