package com.codely.demo
import java.time.LocalDate
import java.time.Period
import kotlin.system.exitProcess

fun main() {
    println("Voer alstublieft een datum in met het formaat: YYYY-MM-DD")

    // in geval van een fout retorneer de functie een string: Geen waarde opgegeven
    val inputString = readLine() ?: "Geen waarde opgegeven"
    if (inputString.isEmpty()) {
        println("De ingevoerde datums is ongeldig")
        exitProcess(1)
    }

    val input = LocalDate.parse(inputString)
    println("U heeft de datum $input ingevoerd")

    val currentDate = LocalDate.now()
    val difference = Period.between(input, currentDate)
    println("Het verschil tussen data $input en $currentDate is ${difference.years} jaar")
}
