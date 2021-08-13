package com.petclinic.petclinicproject.bootstrap

import com.petclinic.petclinicproject.model.Owner
import com.petclinic.petclinicproject.services.OwnerService
import com.petclinic.petclinicproject.services.VetService
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DataLoader(var ownerService:OwnerService,
                 var vetService:VetService
):CommandLineRunner {
    override fun run(vararg args: String?) {
        val owner1 = Owner("Grzegorz","Juszkiewicz",1L)
        ownerService.save(owner1)

        val owner2 = Owner("Adam","Juszkiewicz",2L)
        ownerService.save(owner2)
    }
}