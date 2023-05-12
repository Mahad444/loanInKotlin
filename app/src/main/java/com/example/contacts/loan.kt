package com.example.contacts

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Input loan amount from the user
    print("Enter the loan amount: ")
    val loanAmount = scanner.nextDouble()

    // Calculate and output remaining loan amount after three months
    val remainingAmount = calculateRemainingAmount(loanAmount)
    println("Remaining loan amount after three months: $remainingAmount")
}

fun calculateRemainingAmount(loanAmount: Double): Double {
    var remainingAmount = loanAmount

    // Calculate the remaining amount after each month's payment
    for (i in 1..3) {
        val payment = 0.1 * remainingAmount
        remainingAmount -= payment
    }

    return remainingAmount
}
