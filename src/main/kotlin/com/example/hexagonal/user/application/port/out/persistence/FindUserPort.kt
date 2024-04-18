package com.example.hexagonal.user.application.port.out.persistence

import com.example.hexagonal.user.domain.User

interface FindUserPort {
    fun invokeByUsername(username: String): User?
}