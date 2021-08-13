package com.petclinic.petclinicproject.model

import java.io.Serializable
import kotlin.properties.Delegates

open class BaseEntity :Serializable{
    var id:Long = 1L
}