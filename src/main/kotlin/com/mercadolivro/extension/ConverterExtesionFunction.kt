package com.mercadolivro.extension

import com.mercadolivro.controllers.requestDTO.PostCustomerRequest
import com.mercadolivro.controllers.requestDTO.PutCustomerRequest
import com.mercadolivro.model.CustomerModel

fun PostCustomerRequest.toCustomerModel(): CustomerModel {
    return CustomerModel(name = this.name, email = this.email , birthDate = this.birthDate, cpf = this.cpf, gender = this.gender)
}

fun PutCustomerRequest.toCustomerModel(id: Int): CustomerModel {
    return CustomerModel(id = id, name = this.name, email = this.email)
}
