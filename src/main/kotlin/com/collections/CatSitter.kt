package com.collections

import com.dominio.Cats
import kotlin.collections.List

class CatSitter(private val catSiter : MutableList<Cats>) {
    fun addCats(cat : Cats) {
        catSiter.add(cat)
    }

    fun copyToRead(cats : List<Cats>) : List<Cats>{
        val cop : List<Cats> = cats
        return cop
    }

    fun getCats() : List<Cats>{
        return catSiter
    }
}