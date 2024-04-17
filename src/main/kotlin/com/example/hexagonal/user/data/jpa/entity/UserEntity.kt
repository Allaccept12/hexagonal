package com.example.hexagonal.user.data.jpa.entity

import com.example.hexagonal.user.domain.IdType
import com.example.hexagonal.user.domain.IdValue
import com.example.hexagonal.user.domain.Password
import jakarta.persistence.*

@Entity
@Table(name = "users")
class UserEntity(
    @Column(unique = true)
    val userId: String,
    val name: String,

    @Embedded
    val password: Password,

    @Enumerated(EnumType.STRING)
    val idType: IdType,

    @Embedded
    val idValue: IdValue,
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

}