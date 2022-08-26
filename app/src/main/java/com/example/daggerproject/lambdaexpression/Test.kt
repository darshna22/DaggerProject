package com.example.daggerproject.lambdaexpression

object Test{

    @JvmStatic
    public fun main(args: Array<String>) {
        val foo = Foo { println("Hello!") }
        foo.bar()
    }

}