package com.example.hexagonal.user.application.port.out.persistence

interface ExistsUserPort {

    fun invokeByUsername(username: String): Boolean
}