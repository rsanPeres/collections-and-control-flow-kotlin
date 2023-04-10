package com.control.flow

class When {
    fun cases(obj: Any) {
        when (obj) {
            1 -> println("One")                          // 2
            "Hello" -> println("Greeting")               // 3
            is Long -> println("Long")                   // 4
            !is String -> println("Not a string")        // 5
            else -> println("Unknown")
        }
    }

    fun caseExpression(obj: Any) : Any{
        val result = when (obj){
            1->"One"
            "Hello" -> 1
            is Long -> false
            else -> 42
        }
        return result
    }

}
