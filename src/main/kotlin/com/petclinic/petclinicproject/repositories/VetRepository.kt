package com.petclinic.petclinicproject.repositories

import com.petclinic.petclinicproject.model.Vet
import org.springframework.data.repository.CrudRepository

interface VetRepository:CrudRepository<Vet, Long> {
}