package com.petclinic.petclinicproject.repositories

import com.petclinic.petclinicproject.model.Pet
import org.springframework.data.repository.CrudRepository

interface PetRepository:CrudRepository<Pet, Long> {
}