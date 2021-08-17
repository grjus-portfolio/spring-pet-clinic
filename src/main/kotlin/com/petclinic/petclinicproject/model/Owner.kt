package com.petclinic.petclinicproject.model

import javax.persistence.*

@Entity
@Table(name="owners")
class Owner(
    firstName:String, lastName:String):Person(firstName, lastName){
    @Column(name="address")
    var address:String=""
    @Column(name="city")
    var city:String=""

    @OneToMany(cascade = [CascadeType.ALL], mappedBy = "owner")
    var pets:Set<Pet> = HashSet<Pet>()
}