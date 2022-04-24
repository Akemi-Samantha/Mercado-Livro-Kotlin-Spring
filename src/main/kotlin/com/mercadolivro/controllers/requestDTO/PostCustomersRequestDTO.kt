package com.mercadolivro.controllers.requestDTO

data class PostCustomersRequestDTO(

    var name: String,
    var email: String,
    var birthDate: String,
    var cpf: String,
    var gender: String,

)
