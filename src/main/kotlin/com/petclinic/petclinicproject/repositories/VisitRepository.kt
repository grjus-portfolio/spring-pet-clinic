package com.petclinic.petclinicproject.repositories

import com.petclinic.petclinicproject.model.Visit
import com.petclinic.petclinicproject.services.CrudService

interface VisitRepository:CrudService<Visit, Long> {
}