package com.petclinic.petclinicproject.repositories

import com.petclinic.petclinicproject.model.Speciality
import com.petclinic.petclinicproject.services.CrudService
import org.springframework.data.repository.CrudRepository

interface SpecialitiesRepository:CrudService<Speciality, Long> {
}