package com.petclinic.petclinicproject.model

class Vet(firstName:String, lastName:String):Person(firstName, lastName) {

    lateinit var specialities:Set<Speciality>
    lateinit var city:String
    lateinit var adress:String
    lateinit var phone:String

}