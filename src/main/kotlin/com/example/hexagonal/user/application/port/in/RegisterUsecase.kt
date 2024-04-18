package com.example.hexagonal.user.application.port.`in`

import com.example.hexagonal.user.domain.IdType

interface RegisterUsecase {
    fun registerUser(command: Command)

    class Command(
        val userId: String,
        val password: String,
        val name: String,
        val idType: IdType,
        val idValue: String,
    )
}