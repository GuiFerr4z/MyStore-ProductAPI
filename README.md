# 🚀 Product API

API REST desenvolvida com Spring Boot para gerenciamento de produtos.

## 📌 Objetivo

Este projeto faz parte do meu portfólio como desenvolvedor, com o objetivo de praticar conceitos de:

- Arquitetura em camadas (Controller, Service, Repository)
- CRUD completo
- Uso de DTO
- Validação de dados
- Documentação com Swagger (OpenAPI)

---

## 🛠️ Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Swagger (Springdoc OpenAPI)

---

## 📁 Estrutura do projeto

src/main/java/com/guiferr/productapi
│
├── controller
├── service
├── repository
├── model
├── dto
└── exception

---

## 🔗 Endpoints principais

| Método | Endpoint      | Descrição             |
|--------|---------------|-----------------------|
| GET    | /products     | Listar produtos       |
| POST   | /products     | Criar produto         |
| PUT    | /products/{id}| Atualizar produto     |
| DELETE | /products/{id}| Remover produto       |

---

## ▶️ Como executar

1. Clonar o repositório:
   git clone https://github.com/GuiFerr4z/portfolio.git

2. Acessar o projeto:
   cd product-api

3. Rodar a aplicação:
- Via IntelliJ (Run)
- Ou via Maven: ./mvnw spring-boot:run

---

## 📄 Documentação da API

Após rodar o projeto, acessar:
http://localhost:8080/swagger-ui/index.html

---

## ⚠️ Status atual

🚧 Projeto em desenvolvimento.

Atualmente existe um erro conhecido relacionado à estrutura de pacotes:

- conflito entre `product_api` e `productapi`
- erro de importação da classe `Product`
- Swagger retornando erro 500 (`/v3/api-docs`)

Correção em andamento.

---

## 🎯 Próximos passos

- [ ] Corrigir estrutura de pacotes
- [ ] Ajustar Swagger
- [ ] Implementar paginação
- [ ] Criar autenticação (login)
- [ ] Deploy da API

---

## 👨‍💻 Autor

Guilherme Ferraz Rodrigues

- LinkedIn: https://www.linkedin.com/in/guifrodrigues/
- GitHub: https://github.com/GuiFerr4z