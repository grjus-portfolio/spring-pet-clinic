package com.petclinic.petclinicproject.services

import com.petclinic.petclinicproject.model.Vet

interface VetService {

    fun findById(id:Long): Vet
    fun save(owner: Vet)
    fun findAll():Set<Vet>
}