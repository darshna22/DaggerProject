package com.example.daggerproject.higherorderfun

import com.google.gson.GsonBuilder

class Company(
    var name: String,
    var employees: Int,
    var offices: List<String>
)

object GsonProgram {
    @JvmStatic
    fun main(args: Array<String>) {
        val jsonString = "{\"name\":\"Microsoft\",\"employees\":180000," +
                "\"offices\":[\"Washington\",\"Virginia\",\"India\"]}"
        val gson = GsonBuilder().setPrettyPrinting().create()
        val resp = gson.fromJson(jsonString, Company::class.java)
        val jsonResp = gson.toJson(resp)
        println(jsonString)
        val n = 10
        for (i in 1..n) {
            var j = 1
            while (j <= n) {
                print("hello $j")
                j = j + i
            }
            println("")
        }
    }
}