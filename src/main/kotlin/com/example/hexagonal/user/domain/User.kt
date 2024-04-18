package com.example.hexagonal.user.domain

class User(
    val username: String,
    val id: Long,
    val idValue: IdValue,
    val idType: IdType,
    val password: Password,
    val name: String,
    val email: String,
) {
    fun isMatchedPassword(password: String): Boolean {
        return this.password.isMatched(password)
    }
}