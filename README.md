# Web API

Esta é uma Web API desenvolvida com Spring Boot, destinada a gerenciar usuários. A API fornece endpoints para criar, atualizar, listar e excluir usuários, além de incluir um tratamento global de exceções e documentação Swagger.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.3.4**
- **Springfox para Swagger**
- **Maven** como gerenciador de dependências

## Funcionalidades

- **CRUD para Usuários**:
  - `GET /users`: Retorna a lista de todos os usuários.
  - `POST /users`: Cria um novo usuário.
  - `DELETE /users/{id}`: Remove um usuário pelo ID.

- **Tratamento de Exceções**:
  - A API implementa um tratamento global de exceções, que captura erros e fornece respostas apropriadas em formato JSON.

- **Documentação Swagger**:
  - A API é documentada usando Swagger, facilitando a visualização e testes dos endpoints.
 
- **Sinta-se à vontade para ajustar qualquer seção conforme necessário!**

## Uso
Após a execução, a API estará disponível em http://localhost:8080

Você pode acessar a documentação Swagger em http://localhost:8080/swagger-ui/
 

## Instalação

1. Clone o repositório:

   ```bash
   git clone https://github.com/srmatheusmaciel/web-api.git

2. Navegue até o diretório do projeto:

   ```bash
    cd web-api
   
3 - Compile o Projeto usando Maven:

   ```bash
   mvn clean install
