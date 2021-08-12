package com.petclinic.petclinicproject.services

import com.petclinic.petclinicproject.model.Pet

interface PetService {
    fun findById(id:Long): Pet
    fun save(owner: Pet)
    fun findAll():Set<Pet>
}