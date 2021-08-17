package com.petclinic.petclinicproject.model

import java.io.Serializable
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass


@MappedSuperclass
open class BaseEntity :Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long = 1L
}