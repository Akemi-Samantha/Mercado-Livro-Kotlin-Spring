CREATE TABLE public.tb_book (
	id_book serial4 NOT NULL,
	name_book varchar(255) NOT NULL,
	price decimal (10,2) NOT NULL,
	status varchar (255) NOT NULL,
	customer_id int NOT NULL,
	CONSTRAINT tb_book_pkey PRIMARY KEY (id_book),
	CONSTRAINT tb_book_fkey FOREIGN KEY (customer_id) REFERENCES tb_customer(id)
);