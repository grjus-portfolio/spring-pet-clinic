package com.petclinic.petclinicproject.model

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name="pets")
data class Pet (
    @Column(name="name")
    val name:String,
    @ManyToOne
    @JoinColumn(name="type_id")
    val petType:PetType,
    @ManyToOne
    @JoinColumn(name="owner_id")
    val owner:Owner,
    @Column(name="birth_date")
    val birthDate:LocalDate,
    @OneToMany(cascade = [CascadeType.ALL], mappedBy = "pet")
    val visits:Set<Visit> = HashSet<Visit>()
    ):BaseEntity() {
}