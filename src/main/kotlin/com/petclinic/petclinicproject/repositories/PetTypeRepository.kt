package com.petclinic.petclinicproject.repositories

import com.petclinic.petclinicproject.model.PetType
import com.petclinic.petclinicproject.services.CrudService
import org.springframework.data.repository.CrudRepository

interface PetTypeRepository:CrudService<PetType, Long> {
}