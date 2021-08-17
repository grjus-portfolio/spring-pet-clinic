package com.petclinic.petclinicproject.repositories

import com.petclinic.petclinicproject.model.Visit
import org.springframework.data.repository.CrudRepository

interface VisitRepository:CrudRepository<Visit, Long> {
}