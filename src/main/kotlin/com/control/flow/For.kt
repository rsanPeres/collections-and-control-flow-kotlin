package com.control.flow

import com.dominio.Cats

class For {
    fun search(collec : List<Cats>){
        for(cat in collec){
            println("Hello ${cat.name}")
        }
    }
}