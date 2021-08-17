package com.petclinic.petclinicproject.repositories

import com.petclinic.petclinicproject.model.PetType
import org.springframework.data.repository.CrudRepository

interface PetTypeRepository:CrudRepository<PetType, Long> {
}