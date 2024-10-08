```md
# API Exemplo - Biblioteca de Livros

Esta é uma API simples desenvolvida em Java usando o framework Spring Boot. A API consome dados de uma API externa de livros utilizando Feign Client e os disponibiliza através de endpoints REST.

## Funcionalidades

- Listar todos os livros disponíveis na biblioteca.
- Acessar os detalhes dos livros, como título, autor, ano de publicação, editora, ISBN, e imagem.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.3.4
- Spring Cloud OpenFeign
- Lombok
- Maven

## Dependências

As principais dependências usadas no projeto são:

- **spring-boot-starter-web**: Para criar e expor APIs REST.
- **spring-cloud-starter-openfeign**: Para consumir APIs externas usando Feign Client.
- **lombok**: Para reduzir o código boilerplate com geração automática de construtores, getters, setters, etc.
- **spring-boot-devtools**: Para facilitar o desenvolvimento com recursos de reinicialização automática.
- **spring-boot-starter-test**: Para testes automatizados.

## Endpoints

### Listar Livros

- **Rota**: `/api/books`
- **Método**: `GET`
- **Descrição**: Retorna a lista de livros consumida de uma API externa.

#### Exemplo de Resposta

```json
[
    {
        "titulo": "Livro Exemplo 1",
        "autor": "Autor Exemplo",
        "imagem": "link_para_imagem",
        "editora": "Editora Exemplo",
        "ano_de_publicacao": "2020",
        "isbn": "123-4567891234"
    },
    {
        "titulo": "Livro Exemplo 2",
        "autor": "Outro Autor",
        "imagem": "link_para_imagem",
        "editora": "Outra Editora",
        "ano_de_publicacao": "2019",
        "isbn": "123-4567895678"
    }
]
```

## Configuração e Execução

### Pré-requisitos

- Java 17+
- Maven

### Passos para executar a aplicação:

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/api-exemplo.git
   cd api-exemplo
   ```

2. Compile o projeto:
   ```bash
   mvn clean install
   ```

3. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```

A aplicação estará disponível em: `http://localhost:8080`.

## Estrutura do Projeto

- **BookController**: Controlador que expõe os endpoints da API.
- **BookService**: Serviço responsável por obter os dados da API externa.
- **BookClient**: Feign Client que consome a API externa de livros.
- **Book**: Classe de domínio que representa um livro.
- **ApiExemploApplication**: Classe principal para executar a aplicação.
