package com.mercadolivro.controllers.requestDTO.customerRequest

data class PutCustomerRequest(

    var name: String,
    var email: String,
    var gender: Boolean,
)
