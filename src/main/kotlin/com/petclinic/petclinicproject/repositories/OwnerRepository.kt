package com.petclinic.petclinicproject.repositories

import com.petclinic.petclinicproject.model.Owner
import com.petclinic.petclinicproject.services.CrudService

interface OwnerRepository:CrudService<Owner, Long> {
    fun findByLastName(lastName:String):Owner
}