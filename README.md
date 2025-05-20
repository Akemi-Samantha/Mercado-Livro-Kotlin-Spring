# 📚 Mercado Livro – API em Kotlin com Spring Boot

Este projeto é uma API RESTful desenvolvida com **Kotlin** e **Spring Boot**, simulando o funcionamento de um sistema de livraria digital. Ele contempla operações de cadastro, atualização e consulta de usuários, livros, e pedidos — com foco em arquitetura limpa, boas práticas e estrutura escalável.

---

## 📌 Objetivos do projeto

- Praticar o desenvolvimento de APIs RESTful usando Kotlin
- Aplicar arquitetura em camadas (MVC + Clean Architecture)
- Implementar regras de negócio típicas de um sistema de ecommerce
- Utilizar recursos modernos do ecossistema Spring com Kotlin
- Explorar modelagem de domínio com foco em legibilidade e organização

---

## 🛠️ Tecnologias utilizadas

- **Kotlin**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Web**
- **H2 Database** (em memória)
- **Flyway** (migração de banco)
- **Maven**
- **Postman** (testes de rota)

---

## ✅ Funcionalidades

- Cadastro, listagem, atualização e inativação de usuários
- Cadastro e listagem de livros
- Criação de pedidos a partir de usuários e livros disponíveis
- Validação de entidades com mensagens customizadas
- Manipulação de status do cliente (ativo/inativo)
- Regras de negócio encapsuladas em services

---

## 🧠 Arquitetura

- Projeto estruturado com padrão MVC
- Separação clara entre entidades, DTOs, controllers, services e repositories
- Validações com annotations personalizadas
- Utilização de ResponseEntity para retorno adequado nas respostas HTTP

---

## 📁 Estrutura do projeto

src/
└── main/
└── kotlin/
└── com/example/mercadolivro/
├── controller/
├── domain/
├── dto/
├── exception/
├── repository/
└── service/


- `controller/`: gerenciamento das requisições HTTP
- `domain/`: entidades de negócio
- `dto/`: objetos de transporte para entrada/saída
- `exception/`: tratamento de exceções customizadas
- `repository/`: interfaces JPA
- `service/`: regras de negócio e lógica da aplicação

---

## ▶️ Como executar o projeto

1. Clone este repositório  
   `git clone https://github.com/Akemi-Samantha/Mercado-Livro-Kotlin-Spring`

2. Importe o projeto na IDE (IntelliJ recomendado)

3. Rode a aplicação com:  
   `./mvnw spring-boot:run` ou direto pela IDE

4. Acesse o H2 Console (se habilitado) ou teste as rotas via Postman

---

## 🧪 Exemplos de rotas

- `POST /customers` → cadastrar cliente  
- `GET /books` → listar livros  
- `POST /purchases` → criar pedido  
- `PUT /customers/{id}` → atualizar cliente  
- `DELETE /customers/{id}` → inativar cliente  

---

## ✨ Sobre

Este projeto foi desenvolvido como parte do meu processo de evolução como desenvolvedora backend, buscando consolidar práticas modernas com **Kotlin**, **Spring Boot** e uma arquitetura organizada e de fácil manutenção.  
É um dos meus primeiros projetos utilizando Kotlin de forma completa, reforçando o domínio de múltiplas stacks no backend.

---

## 👩‍💻 Por Akemi Samantha Nakayama

🔗 [LinkedIn](https://www.linkedin.com/in/akemi-samantha-nakayama-121622206/)  
🐙 [GitHub](https://github.com/Akemi-Samantha)
