package com.example.hexagonal.user.domain

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder


class IdValue private constructor(
    private val value: String
) {

    companion object {
        fun create(value: String): IdValue {
            return IdValue(BCryptPasswordEncoder().encode(value))
        }
    }
}