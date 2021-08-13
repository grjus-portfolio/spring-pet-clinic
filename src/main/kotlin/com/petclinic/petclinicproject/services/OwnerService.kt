package com.petclinic.petclinicproject.services

import com.petclinic.petclinicproject.model.Owner
import org.springframework.stereotype.Service

interface OwnerService:CrudService<Owner, Long>{

    fun findByLastName(name:String):Owner

}