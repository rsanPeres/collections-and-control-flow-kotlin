package com.dominio

data class Cats(val name : String, val owners : List<Owners>) {
    operator fun iterator(): Iterator<Owners>{
        return owners.iterator()
    }
}