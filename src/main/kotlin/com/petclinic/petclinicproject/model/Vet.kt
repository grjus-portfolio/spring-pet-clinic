package com.petclinic.petclinicproject.model

import javax.persistence.*

@Entity
@Table(name="vets")
class Vet(firstName:String, lastName:String):Person(firstName, lastName) {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="vet_specialities", joinColumns = [JoinColumn(name="vet_id")], inverseJoinColumns = [JoinColumn(name="speciality_id")])
    var specialities:MutableSet<Speciality> = HashSet<Speciality>()
    var city:String = ""
    var adress:String = ""
    var phone:String = ""

}