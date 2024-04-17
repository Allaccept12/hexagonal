package com.example.hexagonal.user.domain

class User(
    val userId: String,
    val id: IdValue,
    val idType: IdType,
    val password: Password,
    val name: String,
    val email: String,
) {
    fun isMatchedPassword(password: String): Boolean {
        return this.password.isMatched(password)
    }
}