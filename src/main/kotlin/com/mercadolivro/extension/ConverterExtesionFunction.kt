package com.mercadolivro.extension

import com.mercadolivro.controllers.requestDTO.bookRequest.PostBookRequest
import com.mercadolivro.controllers.requestDTO.customerRequest.PostCustomerRequest
import com.mercadolivro.controllers.requestDTO.customerRequest.PutCustomerRequest
import com.mercadolivro.enums.BookStatus
import com.mercadolivro.model.BookModel
import com.mercadolivro.model.CustomerModel

fun PostCustomerRequest.toCustomerModel(/*book: PostBookRequest*/): CustomerModel {
    return CustomerModel(name = this.name, email = this.email /*, book = this.book*/)
}

fun PutCustomerRequest.toCustomerModel(id: Int): CustomerModel {
    return CustomerModel(id = id, name = this.name, email = this.email)
}

fun PostBookRequest.toBookModel(customer: CustomerModel): BookModel{
    return BookModel(
        name = this.name,
        price = this.price,
        status = BookStatus.ATIVO,
    )
}
