package com.petclinic.petclinicproject.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name="specialities")
class Speciality:BaseEntity() {
    @Column(name="description")
    var description:String=""
}