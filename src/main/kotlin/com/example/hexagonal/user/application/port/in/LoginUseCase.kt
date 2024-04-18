package com.example.hexagonal.user.application.port.`in`

interface LoginUseCase {
    fun invoke(command: Command): Result

    class Command(
        username: String,
        password: String
    )

    class Result(
        token: String
    )
}