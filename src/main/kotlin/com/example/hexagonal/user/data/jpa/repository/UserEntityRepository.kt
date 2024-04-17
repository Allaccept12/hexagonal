package com.example.hexagonal.user.data.jpa.repository

import com.example.hexagonal.user.data.jpa.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserEntityRepository: JpaRepository<UserEntity, Long> {
    fun existsByUserId(userId: String): Boolean
    fun findByUserId(userId: String): UserEntity?
}