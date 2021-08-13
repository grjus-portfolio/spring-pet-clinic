package com.petclinic.petclinicproject.services.map

import com.petclinic.petclinicproject.model.Vet
import com.petclinic.petclinicproject.services.VetService
import org.springframework.stereotype.Service

@Service
class VetServiceMap:AbstractMapService<Vet, Long>(), VetService {
    override fun save(item: Vet): Vet {
        super.save(item.id, item)
        return item
    }

    override fun deleteById(id: Long) {
        super.deleteByID(id)
    }
}