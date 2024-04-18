package com.example.hexagonal.user.data.jpa.repository

import com.example.hexagonal.user.data.jpa.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserEntityRepository: JpaRepository<UserEntity, Long> {
    fun existsByUsername(username: String): Boolean
    fun findByUsername(username: String): UserEntity?
}