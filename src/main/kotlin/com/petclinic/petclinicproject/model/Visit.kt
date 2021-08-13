package com.petclinic.petclinicproject.model

import java.time.LocalDate

class Visit:BaseEntity() {
    
    lateinit var date:LocalDate
    lateinit var description:String
    lateinit var pet:Pet

}