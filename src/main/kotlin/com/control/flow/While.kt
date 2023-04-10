package com.control.flow

import com.dominio.Cats

class While {
    fun whi(cats : List<Cats>){
        var i = 0
        while (i <= cats.size){
            println(cats.get(i).name)
            i++
        }
    }

    fun doWhi(cats: List<Cats>){
        var i = 0
        do{
            println(cats.get(i).name)
            i++
        }while (i < cats.size)
    }
}