package com.dominio

open class Person(val name: String) {
    open fun sayHello(p : Person){
        println("Hey $p.name")
    }
}