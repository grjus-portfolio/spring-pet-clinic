package com.petclinic.petclinicproject.controllers

import com.petclinic.petclinicproject.services.OwnerService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/owners")
@Controller
class OwnerController(var ownerService:OwnerService) {

    @RequestMapping("","/index","/index.html")
    fun index(model:Model):String{
        model.addAttribute("owners",ownerService.findAll())
        return "owners/index"
    }

    @RequestMapping("/find")
    fun findData():String{
        return "notImplemented"
    }
}