package com.petclinic.petclinicproject.repositories

import com.petclinic.petclinicproject.model.Speciality
import org.springframework.data.repository.CrudRepository

interface SpecialitiesRepository:CrudRepository<Speciality, Long> {
}