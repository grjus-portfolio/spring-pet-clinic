package com.petclinic.petclinicproject.repositories

import com.petclinic.petclinicproject.model.Pet
import com.petclinic.petclinicproject.services.CrudService
import org.springframework.data.repository.CrudRepository

interface PetRepository:CrudService<Pet, Long> {
}