package com.example.hexagonal.user.adapter.out.persistence

import com.example.hexagonal.user.application.port.out.persistence.FindUserPort
import com.example.hexagonal.user.data.jpa.repository.UserEntityRepository
import com.example.hexagonal.user.domain.User
import org.springframework.stereotype.Component


@Component
class FindUserPortAdapter(
    private val userEntityRepository: UserEntityRepository
): FindUserPort {

    override fun invokeByUsername(username: String): User? {
        this.userEntityRepository.findByUsername(username)
    }
}