package com.petclinic.petclinicproject.services.map

import com.petclinic.petclinicproject.model.Owner
import com.petclinic.petclinicproject.services.CrudService

class OwnerServiceMap<T: Owner,ID:Long>
    :AbstractMapService<Owner,Long>(),
    CrudService<Owner, Long>{

    override fun save(item: Owner): Owner {
        super.save(item.id, item)
        return item
    }

    override fun deleteById(id: Long) {
        super.deleteByID(id)
    }


}