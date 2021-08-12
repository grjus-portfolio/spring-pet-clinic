package com.petclinic.petclinicproject.services

import com.petclinic.petclinicproject.model.Pet

interface PetService<Pet, Long>:CrudService<Pet, Long> {

}