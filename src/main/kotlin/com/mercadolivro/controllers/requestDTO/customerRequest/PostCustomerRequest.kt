package com.mercadolivro.controllers.requestDTO.customerRequest

import com.mercadolivro.model.BookModel

data class PostCustomerRequest(

    var name: String,
    var email: String,
    //var book : BookModel

) {

}
