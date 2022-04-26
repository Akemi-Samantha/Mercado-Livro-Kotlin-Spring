package com.mercadolivro.model

data class CustomerModel(
    var id: Int? = null,
    var name: String,
    var email: String,
    var birthDate: String? = null,
    var cpf: String? = null,
    var gender: String? = null
)