package com.petclinic.petclinicproject.services

import com.petclinic.petclinicproject.model.Owner

interface OwnerService<Owner,Long>:CrudService<Owner, Long>{

    fun findByLastName(name:String):Owner

}