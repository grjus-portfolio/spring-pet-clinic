package com.petclinic.petclinicproject.bootstrap

import com.petclinic.petclinicproject.model.Owner
import com.petclinic.petclinicproject.model.Pet
import com.petclinic.petclinicproject.model.PetType
import com.petclinic.petclinicproject.model.Vet
import com.petclinic.petclinicproject.services.OwnerService
import com.petclinic.petclinicproject.services.PetTypeService
import com.petclinic.petclinicproject.services.VetService
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class DataLoader(var ownerService:OwnerService,
                 var vetService:VetService,
                 var petTypeService:PetTypeService
):CommandLineRunner {
    override fun run(vararg args: String?) {
        val owner1 = Owner("Grzegorz","Juszkiewicz")
        ownerService.save(owner1)

        val owner2 = Owner("Adam","Juszkiewicz")
        ownerService.save(owner2)

        val vet1 = Vet("Mariusz", "Wlaszczyk")
        vetService.save(vet1)

        val vet2 = Vet("Mariusz", "Kielbasa")
        vetService.save(vet2)

        var petType = PetType("cat")
        petTypeService.save(petType)

        val mikesPet = Pet(petType, owner1,  LocalDate.now() )
        println(mikesPet.owner.firstName)

    }
}