package com.example.hexagonal.user.domain

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder


class Password private constructor(
    private val value: String
) {

    companion object {
        fun create(rawPassword: String): Password {
            return Password(BCryptPasswordEncoder().encode(rawPassword))
        }
    }

    fun isMatched(rawPassword: String): Boolean {
        return BCryptPasswordEncoder().matches(rawPassword, this.value)
    }
}