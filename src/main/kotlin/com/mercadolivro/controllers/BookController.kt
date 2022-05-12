package com.mercadolivro.controllers

import com.mercadolivro.controllers.requestDTO.bookRequest.PostBookRequest
import com.mercadolivro.extension.toBookModel
import com.mercadolivro.model.BookModel
import com.mercadolivro.service.BookService
import com.mercadolivro.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("book")
class BookController(
    val bookService: BookService,
    val customerService: CustomerService
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createBook(@RequestBody resquest: PostBookRequest){
        val customer = customerService.getByID(resquest.customerId)
        bookService.createBook(resquest.toBookModel(customer))

    }

    @GetMapping
    fun getAll(): List<BookModel>{
        return bookService.findAll()
    }

    @GetMapping("/active")
    fun findActives(): List<BookModel>{
        return bookService.findActives()
    }


}