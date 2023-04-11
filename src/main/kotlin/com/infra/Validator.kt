package com.infra

class Validator <T>{
    fun valIsNull(t: T?){
        t?.let {
            println("Valor não nulo")
        }
        t.nullSafeToString()
        println("O valor é null")
    }

    fun <T> T?.nullSafeToString() =this?.toString() ?: "Não possui valor"

}