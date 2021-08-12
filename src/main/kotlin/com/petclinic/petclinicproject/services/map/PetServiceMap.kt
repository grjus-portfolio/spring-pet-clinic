package com.petclinic.petclinicproject.services.map

import com.petclinic.petclinicproject.model.Pet
import com.petclinic.petclinicproject.services.CrudService

class PetServiceMap<T:Pet, ID:Long>:AbstractMapService<Pet, Long>(), CrudService<Pet, Long> {
    override fun save(item: Pet): Pet {
        super.save(item.id, item)
        return item
    }

    override fun deleteById(id: Long) {
        super.deleteByID(id)
    }
}