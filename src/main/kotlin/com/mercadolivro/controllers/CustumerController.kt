package com.mercadolivro.controllers

import com.mercadolivro.controllers.requestDTO.PostCustomers
import com.mercadolivro.controllers.requestDTO.PutCustomers
import com.mercadolivro.model.CustomerModel
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("customers")
class CustumerController {

    val customers = mutableListOf<CustomerModel>()


    // Add uma Query Params - Na hora de requisitar ...
    @GetMapping
    fun getAll(@RequestParam name: String?): List<CustomerModel> {
        name?.let{
            return customers.filter { it.name.contains(name, true) }
        }
        return customers
    }

    @PostMapping
    fun createCustomer(@RequestBody customer: PostCustomers){

        var id = if(customers.isEmpty()){
            1
        }else{
            customers.last().id + 1
        }

        customers.add(CustomerModel( id ,customer.name,customer.email,customer.birthDate,customer.cpf,customer.gender))
    }

    // Receber uma váriavel pela url
    @GetMapping("{id}")
    fun getCustomer(@PathVariable id: Int ): CustomerModel{
        return customers.filter { it.id == id }.first()
    }

    // Implementando o PUT - Criado uma request Put, pois tem variaveis que não devem ser atualizadas como o cpf
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun updateCuatomer(@PathVariable id: Int, @RequestBody customer: PutCustomers) {
        return customers.filter { it.id == id }.first().let {
            it.email = customer.email
            it.name = customer.name
        }
    }

    // Implementando um DELETE
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteCustomer(@PathVariable id: Int){
            customers.removeIf { it.id == id}
    }






}