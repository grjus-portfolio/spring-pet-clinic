package com.petclinic.petclinicproject.services.map

import com.petclinic.petclinicproject.services.CrudService

abstract class AbstractMapService<T, ID>:CrudService<T,ID> {

    private val map:HashMap<ID, T> = HashMap()

    override fun findAll():MutableCollection<T>{
        return map.values
    }

    override fun findById(id:ID): T? {
        return map[id]
    }

    fun save(id:ID, item:T):T{
        map[id] = item
        return item
    }

    fun deleteByID(id:ID){
        map.remove(id)
    }

    override fun delete(item:T){
        map.entries.removeIf { it-> it == item }

    }

}