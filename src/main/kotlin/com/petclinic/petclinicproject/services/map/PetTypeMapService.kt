package com.petclinic.petclinicproject.services.map

import com.petclinic.petclinicproject.model.PetType
import com.petclinic.petclinicproject.services.PetTypeService
import org.springframework.stereotype.Component

@Component
class PetTypeMapService:AbstractMapService<PetType, Long>(), PetTypeService {
    override fun deleteById(id: Long) {
        super.deleteByID(id)
    }
}