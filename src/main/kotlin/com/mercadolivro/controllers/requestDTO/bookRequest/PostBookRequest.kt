package com.mercadolivro.controllers.requestDTO.bookRequest

import com.fasterxml.jackson.annotation.JsonProperty
import java.math.BigDecimal

data class PostBookRequest(

    var name: String,
    var price: BigDecimal,
    @JsonProperty("customer_id")
    var customerId: Int
)
