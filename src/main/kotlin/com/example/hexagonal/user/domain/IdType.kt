package com.example.hexagonal.user.domain


/*
   개인/법인 1일 송금 한도(기축 통화 기준)를 가지고 있다
 */
enum class IdType() {
    BUSINESS,
    INDIVIDUAL
}
