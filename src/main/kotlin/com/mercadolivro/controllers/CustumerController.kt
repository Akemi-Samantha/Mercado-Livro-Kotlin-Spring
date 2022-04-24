package com.mercadolivro.controllers

import com.mercadolivro.controllers.requestDTO.PostCustomersRequestDTO
import com.mercadolivro.model.CustomerModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("customers")
class CustumerController {

    val customers = mutableListOf<CustomerModel>()

    @GetMapping
    fun getCustomer(): MutableList<CustomerModel>{
        return customers
    }

    @PostMapping
    fun createCustomer(@RequestBody customer: PostCustomersRequestDTO){

        var id = if(customers.isEmpty()){
            1
        }else{
            customers.last().id + 1
        }

        customers.add(CustomerModel( id ,customer.name,customer.email,customer.birthDate,customer.cpf,customer.gender))
    }

}