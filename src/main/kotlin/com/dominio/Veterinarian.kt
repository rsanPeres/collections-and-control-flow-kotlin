package com.dominio

class Veterinarian(name: String, val register : String, val pacient : MutableList<Cats>) : Person(name) {
    infix fun Veterinarian.care(cat : Cats){pacient.add(cat)}

}