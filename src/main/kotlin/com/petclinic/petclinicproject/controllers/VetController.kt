package com.petclinic.petclinicproject.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class VetController {
    @RequestMapping("/vets/index.html","/vets/index")
    fun listOfVets():String{
        return "vets/index"
    }
}