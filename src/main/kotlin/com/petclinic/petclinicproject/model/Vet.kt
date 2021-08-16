package com.petclinic.petclinicproject.model

class Vet(firstName:String, lastName:String):Person(firstName, lastName) {

    var specialities:MutableSet<Speciality> = HashSet<Speciality>()
    var city:String = ""
    var adress:String = ""
    var phone:String = ""

}