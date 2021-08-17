package com.petclinic.petclinicproject.model

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name="visits")
data class Visit(
    @Column(name="date")
    val date:LocalDate,
    @Column(name="description")
    val description:String,
    @ManyToOne
    @JoinColumn(name="pet_id")
    val pet:Pet
):BaseEntity() {

}