package com.petclinic.petclinicproject.services

interface CrudService<T, ID> {
    fun findAll():MutableCollection<T>
    fun findById(id:ID):T?
    fun save(item:T):T
    fun delete(item:T)
    fun deleteById(id:ID)
}