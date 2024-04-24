package com.example.hexagonal.user.adapter.out.persistence

import com.example.hexagonal.user.application.port.out.persistence.ExistsUserPort
import com.example.hexagonal.user.data.jpa.repository.UserEntityRepository
import org.springframework.stereotype.Component

@Component
class ExistsUserPortAdapter(
    private val userEntityRepository: UserEntityRepository
): ExistsUserPort {

    override fun invokeByUsername(username: String): Boolean {
        return this.userEntityRepository.existsByUsername(username)
    }


}