package com.example.daggerproject.designpattern.builderdesign

class FoodOrder private constructor(
    val bread: String?,
    val pizza: String?,
    val fish: String?,
    val chicken: String?
) {
    data class Builder(
        var bread: String? = null,
        var pizza: String? = null,
        var fish: String? = null,
        var chicken: String? = null
    ) {

        fun bread(bread: String) = apply { this.bread = bread }
        fun pizza(pizza: String) = apply { this.pizza }
        fun fish(fish: String) = apply { this.fish }
        fun chicken(chicken: String) = apply { this.chicken }
        fun build() = FoodOrder(bread, pizza, fish, chicken)


    }
}