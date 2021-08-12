package com.petclinic.petclinicproject.services

interface CrudService<T, ID> {
    fun findAll():Set<T>
    fun findById(id:ID):T
    fun save(item:T):T
    fun delete(item:T)
    fun deleteById(id:ID)
}