![Imgur](https://i.imgur.com/s7BLsQO.png)

<h1 align = "center">
  Literalura
</h1>
<p align="center">
  <a href="#descrição-do-projeto">Descrição</a> •
  <a href="#funcionalidades">Funcionalidades</a> •
  <a href="#tecnologias-utilizadas">Tecnologias</a> •
  <a href="#como-executar-o-projeto">Como Executar o Projeto</a> •
  <a href="#screenshots">Screenshots</a> •
  <a href="#contribuição">Contribuição</a> •
  <a href="#contato">Contato</a>
</p>

<br>

## Descrição do Projeto

Literalura consiste em uma aplicação para a construção de um catálogo de livros utilizando Java, Spring, PostgreSQL e a API Gutendex, que possui dados de mais de 70 mil livros.

A interação é feita inteiramente via linha de comando. Esta aplicação permite buscar seus livros favoritos na API Gutendex e registrar os dados obtidos, incluindo dados referentes aos autores, no banco de dados da Literalura. Além disso, é possível listar todos os livros e autores registrados, bem como filtrar os livros por idioma e listar apenas os autores vivos em um determinado ano. 

![Imgur](https://i.imgur.com/9QMgZcH.png)

<a href="#--literalura">Voltar ao topo</a>


## Funcionalidades

1. **Buscar livro pelo título**: Consulta a API Gutendex para buscar livros pelo título em inglês.
2. **Listar livros registrados**: Exibe todos os livros registrados no banco de dados.
3. **Listar autores registrados**: Exibe todos os autores registrados no banco de dados.
4. **Listar autores vivos em um determinado ano**: Lista os autores vivos em um ano especificado pelo usuário.
5. **Listar livros em um determinado idioma**: Lista livros registrados no banco de dados em um idioma especificado via código do idioma (Se for informado o código "en", serão listados os livros em inglês registrados no banco de dados).

<a href="#--literalura">Voltar ao topo</a>

## Tecnologias Utilizadas 

- Java 21
- Spring Boot
- Hibernate
- PostgreSQL
- Gutendex API
- Maven

<a href="#--literalura">Voltar ao topo</a>

## Como executar o projeto 

1. Clone o repositório para a sua máquina local.
    ```bash
    git clone https://github.com/KarlaSilvaDev/literalura.git
    ```
    
2. Entre no diretório do projeto
    ```bash
    cd literalura
    ```
    
3. Configure o banco de dados no arquivo `application.properties` ou cria variáveis de ambiente na sua máquina:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
    spring.datasource.username=seu-usuario
    spring.datasource.password=sua-senha
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    ```
    
4. Execute a aplicação.
    ```bash
    mvn spring-boot:run
    ```

<a href="#--literalura">Voltar ao topo</a>

## Screenshots

Menu da aplicação:

![Imgur](https://i.imgur.com/UlNhCUL.png)

**Opção 1:** Buscar livro pelo título:

![Imgur](https://i.imgur.com/3XVgDFY.png)

**Opção 2:** Listar livros registrados

![Imgur](https://i.imgur.com/QmZjzzj.png)

**Opção 3:** Listar autores registrados

![Imgur](https://i.imgur.com/RF5WVF8.png)

**Opção 4:** Listar autores vivos em um determinado ano

![Imgur](https://i.imgur.com/w5vTUbe.png)

**Opção 5:** Listar livros em um determinado idioma

![Imgur](https://i.imgur.com/D9653Fr.png)

<a href="#--literalura">Voltar ao topo</a>

## Contribuição

Se deseja contribuir para o projeto, siga os passos abaixo:

1. Faça um fork deste repositório
   
2. Crie uma branch para sua feature:
    ```bash
     git checkout -b feature/nova-feature
    ```
    
3. Faça commit das suas alterações:
    ```bash
    git commit -m "Adiciona nova feature"
    ```
    
4. Envie as alterações para o seu fork:
    ```bash
    git push origin feature/nova-feature
    ```
    
5. Abra um pull request neste repositório

<a href="#--literalura">Voltar ao topo</a>

## Contato

Caso tenha alguma dúvida ou sugestão, entre em contato pelo email karlasilvaeng@gmail.com.
