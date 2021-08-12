package com.petclinic.petclinicproject.model

import java.time.LocalDate

class Pet (var petType:PetType, var owner:Owner, var birthDate:LocalDate,id:Long):BaseEntity(id) {
}