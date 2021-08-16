package com.petclinic.petclinicproject.model

class Owner(firstName:String, lastName:String):Person(firstName, lastName){
    var pets:Set<Pet> = HashSet<Pet>()
}