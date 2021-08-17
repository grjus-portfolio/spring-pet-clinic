package com.petclinic.petclinicproject.repositories

import com.petclinic.petclinicproject.model.Vet
import com.petclinic.petclinicproject.services.CrudService
import org.springframework.data.repository.CrudRepository

interface VetRepository:CrudService<Vet, Long> {
}