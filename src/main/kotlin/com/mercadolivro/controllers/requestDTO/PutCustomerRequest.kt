package com.mercadolivro.controllers.requestDTO

data class PutCustomerRequest(

    var name: String,
    var email: String,
    var gender: Boolean,
)
