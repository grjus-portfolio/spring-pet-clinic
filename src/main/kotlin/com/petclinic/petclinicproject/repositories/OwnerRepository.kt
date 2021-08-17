package com.petclinic.petclinicproject.repositories

import com.petclinic.petclinicproject.model.Owner
import org.springframework.data.repository.CrudRepository

interface OwnerRepository:CrudRepository<Owner, Long> {
}