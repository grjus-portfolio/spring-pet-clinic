package com.petclinic.petclinicproject.services.map

import com.petclinic.petclinicproject.model.Speciality
import com.petclinic.petclinicproject.services.SpecialityService

class SpecialitiesMapService:AbstractMapService<Speciality, Long>(),SpecialityService {
    override fun deleteById(id: Long) {
        super.deleteByID(id)
    }

}