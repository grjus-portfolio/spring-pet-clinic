package com.petclinic.petclinicproject.services.map

import com.petclinic.petclinicproject.model.Owner
import com.petclinic.petclinicproject.services.CrudService
import com.petclinic.petclinicproject.services.OwnerService
import com.petclinic.petclinicproject.services.PetService
import com.petclinic.petclinicproject.services.PetTypeService
import org.springframework.stereotype.Service

@Service
class OwnerServiceMap(
    val petTypeService: PetTypeService,
    val petService: PetService
    )
    :AbstractMapService<Owner,Long>(), OwnerService{
    override fun findByLastName(name: String): Owner {
        TODO("Not yet implemented")
    }

    override fun save(item: Owner): Owner {
        if (item!=null){
            item.pets.forEach { petTypeService.save(it.petType) }
        }
        super.save(item)
        return item
    }

    override fun deleteById(id: Long) {
        super.deleteByID(id)
    }


}