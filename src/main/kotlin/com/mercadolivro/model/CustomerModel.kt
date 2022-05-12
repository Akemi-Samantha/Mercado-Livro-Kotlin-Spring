package com.mercadolivro.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "tb_customer")
data class CustomerModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column(name = "name_customer")
    var name: String,
    @Column(name = "email_customer")
    var email: String,
   // var book : BookModel? = null



)