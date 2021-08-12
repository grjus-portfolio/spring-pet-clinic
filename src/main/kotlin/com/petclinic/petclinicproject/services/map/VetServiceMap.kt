package com.petclinic.petclinicproject.services.map

import com.petclinic.petclinicproject.model.Vet
import com.petclinic.petclinicproject.services.CrudService

class VetServiceMap<T:Vet, ID:Long>:AbstractMapService<Vet, Long>(), CrudService<Vet, Long> {
    override fun save(item: Vet): Vet {
        super.save(item.id, item)
        return item
    }

    override fun deleteById(id: Long) {
        super.deleteByID(id)
    }
}