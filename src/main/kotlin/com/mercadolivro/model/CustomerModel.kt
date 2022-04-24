package com.mercadolivro.model

data class CustomerModel(
    var id: Int,
    var name: String,
    var email: String,
    var birthDate: String,
    var cpf: String,
    var gender: String
)