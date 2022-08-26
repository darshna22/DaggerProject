package com.example.daggerproject.higherorderfun

object HigherFunBasic {
    @JvmStatic
    fun main(array: Array<String>) {
        var multi:(Int,Int)->Int={a,b->a*b}
        calculation(multi)
        val d:Int by lazy { 10 }
        val mLmd: (Int, Int) -> Int = { a, b -> a + b }
        //higherfunc(::add)

        higherfunc(mLmd)
        val sum = object : Calculation {
            override fun add(a: Int, b: Int): Int {
                return a * b
            }
        }
        calculation(::addMin)

    }

    fun calculation(minus:(Int,Int)->Int){
        minus(2,5)

    }

    fun addMin(a: Int,b: Int):Int{
        return a+b
    }


    fun add(a: Int, b: Int): Int {
        return a + b
    }

    inline fun higherfunc(lmbd: (Int, Int) -> Int) {      // accepting lambda as parameter

        var result = lmbd(2, 4)    // invokes the lambda expression by passing parameters
        println("The sum of two numbers is: $result")
    }
}

interface Calculation {
    fun add(a: Int, b: Int): Int
}