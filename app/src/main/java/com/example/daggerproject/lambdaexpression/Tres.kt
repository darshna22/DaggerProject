package com.example.daggerproject.lambdaexpression

object Tres {
    @JvmStatic
    fun main(args: Array<String>) {
        val calculation = object : Calculation {
            override fun calculateData() {
                println("hello ji")
            }
        }
        calculation.calculateData()
    }
}