package com.petclinic.petclinicproject.services.map

import com.petclinic.petclinicproject.model.PetType
import com.petclinic.petclinicproject.services.PetTypeInterface


class PetTypeMapService:AbstractMapService<PetType, Long>(), PetTypeInterface {
    override fun deleteById(id: Long) {
        super.deleteByID(id)
    }
}