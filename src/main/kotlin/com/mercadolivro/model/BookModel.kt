package com.mercadolivro.model

import com.mercadolivro.enums.BookStatus
import java.math.BigDecimal
import javax.persistence.*


@Entity(name = "tb_book")
data class BookModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column(name = "name_book")
    var name: String? = null,
    @Column
    var price: BigDecimal? = null,
    @Column
    @Enumerated(EnumType.STRING)
    var status: BookStatus? = null,
    @ManyToOne
    @JoinColumn(name = "customer_id")
    var customer: CustomerModel? = null




)
