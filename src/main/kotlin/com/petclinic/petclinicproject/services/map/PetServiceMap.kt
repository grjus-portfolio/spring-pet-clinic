package com.petclinic.petclinicproject.services.map

import com.petclinic.petclinicproject.model.Pet
import com.petclinic.petclinicproject.services.PetService
import org.springframework.stereotype.Service

@Service
class PetServiceMap:AbstractMapService<Pet, Long>(), PetService {
    override fun save(item: Pet): Pet {
        super.save( item)
        return item
    }

    override fun deleteById(id: Long) {
        super.deleteByID(id)
    }
}