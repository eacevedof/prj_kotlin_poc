package com.codely.demo
import java.time.LocalDate

fun main() {
    println("Voer alstublieft een datum in met het formaat: YYYY-MM-DD")
    val readLine: String? = null //readLine kan String of null zijn
    // als readline niet null is, dant print de dag van de week
    readLine?.let {
        val input = LocalDate.parse(readLine!!) //deze !! tonen dat readLine nooit null is. Als het null is dan gooit een NullPointerException
        println("U heeft getypt $input en de dag van het week is ${input.dayOfWeek}")
    }
}
