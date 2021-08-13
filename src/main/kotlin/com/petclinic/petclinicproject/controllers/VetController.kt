package com.petclinic.petclinicproject.controllers

import com.petclinic.petclinicproject.services.VetService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
@RequestMapping("/vets")
@Controller
class VetController(val vetService: VetService) {
    @RequestMapping("/index.html","/index","")
    fun listOfVets(model:Model):String{
        model.addAttribute("vets",vetService.findAll())
        return "vets/index"
    }
}