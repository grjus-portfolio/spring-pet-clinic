package com.petclinic.petclinicproject.model

class Owner(firstName:String, lastName:String):Person(firstName, lastName){
    lateinit var pets:Set<Pet>
}