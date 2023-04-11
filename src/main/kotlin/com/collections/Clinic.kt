package com.collections

import com.dominio.Cats
import com.dominio.Veterinarian
import com.dominio.enums.CareType
import java.time.LocalDateTime

class Clinic(val scheduling : MutableMap<LocalDateTime, MutableMap<Veterinarian?, Cats>>, val vets : MutableSet<Veterinarian>, val prices : MutableMap<CareType, Double>) {
    fun scheduling(date : LocalDateTime, vet : Veterinarian, cat : Cats){
        val pacientOf : MutableMap<Veterinarian?, Cats> = mutableMapOf<Veterinarian?, Cats>()
        pacientOf.put(vet, cat)
        scheduling.put(date, pacientOf)
    }

    fun addVet(vet : Veterinarian) : Boolean{
        return vets.add(vet)
    }

    fun statusLog(isAdd : Boolean) : String{
        return if(isAdd) "registered correctly" else "duplicate value and rejected"
    }

    fun schedulingReport(){
        scheduling.forEach{
            k, v -> println("Date $k")
            v.forEach{
                k2, v2 -> println("Vet ${k2?.name} e gato ${v2.name}")
            }
        }
    }

    fun Clinic.maxPriceCare() : Double = this.prices.maxByOrNull { it.value }?.value ?: 0.0

}