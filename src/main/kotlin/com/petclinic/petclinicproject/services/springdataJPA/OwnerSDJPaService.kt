package com.petclinic.petclinicproject.services.springdataJPA

import com.petclinic.petclinicproject.model.Owner
import com.petclinic.petclinicproject.repositories.OwnerRepository
import com.petclinic.petclinicproject.repositories.PetRepository
import com.petclinic.petclinicproject.repositories.PetTypeRepository
import com.petclinic.petclinicproject.services.OwnerService
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("springdataJPA")
class OwnerSDJPaService(
    val ownerRepository: OwnerRepository,
    val petRepository: PetRepository,
    val petTypeRepository: PetTypeRepository
):OwnerService {
    override fun findByLastName(name: String): Owner {
        return ownerRepository.findByLastName(name)
    }

    override fun findAll(): MutableCollection<Owner> {
        val owners:MutableSet<Owner> = HashSet<Owner>()
        ownerRepository.findAll().forEach(owners::add)
        return owners
    }

    override fun findById(id: Long): Owner? {
        return ownerRepository.findById(id)
    }

    override fun save(item: Owner): Owner {
        return ownerRepository.save(item)
    }

    override fun delete(item: Owner) {
        ownerRepository.delete(item)
    }

    override fun deleteById(id: Long) {
        ownerRepository.deleteById(id)
    }
}