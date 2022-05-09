CREATE TABLE public.tb_customer (
	id serial4 NOT NULL,
	email_customer varchar(255) NOT NULL,
	name_customer varchar(255) NOT NULL,
	CONSTRAINT tb_customer_pkey PRIMARY KEY (id),
	CONSTRAINT tb_customer_un UNIQUE (email_customer)
);