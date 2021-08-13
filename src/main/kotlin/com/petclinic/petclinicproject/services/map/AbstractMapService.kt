package com.petclinic.petclinicproject.services.map

import com.petclinic.petclinicproject.model.BaseEntity
import com.petclinic.petclinicproject.services.CrudService
import java.lang.RuntimeException
import kotlin.NoSuchElementException
import kotlin.collections.HashMap
import kotlin.math.max


abstract class AbstractMapService<T:BaseEntity, ID:Long>:CrudService<T,ID> {

    private val map: HashMap<Long, T> = HashMap()

    override fun findAll(): MutableCollection<T> {
        return map.values
    }

    override fun findById(id: ID): T? {
        return map[id]
    }

    override fun save(item: T): T {
        if (item != null) {
                item.id = getNextId()
            print("SETTING ID ${item.id}")

            map[item.id] = item
        } else {
            throw RuntimeException("Object is null")
        }

        return item
    }

    fun deleteByID(id: ID) {
        map.remove(id)
    }

    override fun delete(item: T) {
        map.entries.removeIf { it -> it == item }

    }

    private fun getNextId(): Long {
        var nextId:Long = 1L
        try {
            print("================NEXT ID==================\n")
            nextId = map.size + 1L


        } catch(e:NoSuchElementException){
            nextId = 2L
        }
        println(nextId)
        return nextId

    }

}