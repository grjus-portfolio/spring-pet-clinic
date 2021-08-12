package com.petclinic.petclinicproject.services

import com.petclinic.petclinicproject.model.Owner

interface OwnerService {

    fun findByName(name:String):Owner
    fun findById(id:Long):Owner
    fun save(owner:Owner)
    fun findAll():Set<Owner>
}