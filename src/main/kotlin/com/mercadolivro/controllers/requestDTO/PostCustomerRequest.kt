package com.mercadolivro.controllers.requestDTO

data class PostCustomerRequest(

    var name: String,
    var email: String,
    var birthDate: String,
    var cpf: String,
    var gender: String,

)
