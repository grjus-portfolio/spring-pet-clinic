package com.petclinic.petclinicproject.model

import javax.persistence.Column
import javax.persistence.MappedSuperclass

@MappedSuperclass
open class Person(
    @Column(name="first_name")
    var firstName:String,
    @Column(name=" last_name")
    var lastName:String):BaseEntity() {
}