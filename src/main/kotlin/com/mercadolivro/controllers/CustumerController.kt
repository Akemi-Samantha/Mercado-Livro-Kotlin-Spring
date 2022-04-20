package com.mercadolivro.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("customer")
class CustumerController {

    @GetMapping
    fun getCustomer(): String{
        return "Custuomer number one"
    }

}