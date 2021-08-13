package com.petclinic.petclinicproject.services.map

import com.petclinic.petclinicproject.model.Owner
import com.petclinic.petclinicproject.services.CrudService
import com.petclinic.petclinicproject.services.OwnerService
import org.springframework.stereotype.Service

@Service
class OwnerServiceMap
    :AbstractMapService<Owner,Long>(), OwnerService{
    override fun findByLastName(name: String): Owner {
        TODO("Not yet implemented")
    }

    override fun save(item: Owner): Owner {
        super.save(item.id, item)
        return item
    }

    override fun deleteById(id: Long) {
        super.deleteByID(id)
    }


}