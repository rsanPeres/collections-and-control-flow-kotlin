package com.Api

import com.dominio.Cats
import com.dominio.Veterinarian
import com.infra.Validator


class VeterinarianRequest(val name: String, val register: String, val pacient: MutableList<Cats>) {
    fun validate(){
        val valid : Validator<VeterinarianRequest> = Validator()
        valid.valIsNull(this)
    }

    fun mapToObject() : Veterinarian{
        return Veterinarian(name, register, pacient)
    }
}