# Projeto de Gerenciamento de Vendedores e Departamentos

Este projeto é uma aplicação Java que utiliza o padrão DAO (Data Access Object) para gerenciar vendedores e departamentos
em um banco de dados. A aplicação permite realizar operações básicas de CRUD (Criar, Ler, Atualizar e Excluir) nas entidades,
facilitando a manipulação de dados.

## Estrutura do Projeto

```
src/ ├── application/ │ ├── Program.java # Classe principal da aplicação │ └── Program2.java # Classe alternativa para gerenciamento de departamentos └── model/ ├── dao/ │ ├── DaoFactory.java # Fábrica para criação de instâncias de DAO │ ├── DepartmentDao.java # Interface para operações de departamento │ └── SellerDao.java # Interface para operações de vendedor ├── dao/impl/ │ ├── DepartmentDaoJDBC.java # Implementação da interface DepartmentDao │ └── SellerDaoJDBC.java # Implementação da interface SellerDao └── entities/ ├── Department.java # Classe que representa o departamento └── Seller.java # Classe que representa o vendedor database.sql # Script para criar o banco de dados e as tabelas                     # Script para criar o banco de dados e a tabela de departamentos
```

### Entidades

As classes `Department` e `Seller` representam as entidades que estão sendo manipuladas no banco de dados.
Elas incluem atributos que correspondem às colunas das tabelas no banco de dados, além de métodos para manipulação e comparação de objetos.

### Interfaces

As interfaces `DepartmentDao` e `SellerDao` definem um contrato para as operações que podem ser realizadas nas entidades.
Isso permite que diferentes implementações sejam utilizadas sem alterar o código cliente, promovendo a flexibilidade e a manutenção do código.

### Fábrica de DAO

A classe `DaoFactory` centraliza a criação das instâncias de DAO, promovendo uma arquitetura mais limpa e desacoplada.
Ela implementa o padrão de projeto Factory, permitindo a criação de instâncias de DAO sem expor a lógica de instância.

### Métodos CRUD

O código realiza operações de inserção, atualização, exclusão e busca, permitindo manipular dados no banco de dados. 
As operações CRUD são implementadas nas interfaces e suas respectivas classes de implementação para as entidades `Department` e `Seller`.

## Pré-requisitos

- Java Development Kit (JDK) 8 ou superior.
- MySQL Server instalado e em execução.

## Configuração

1. **Banco de Dados**: Certifique-se de que o servidor MySQL esteja em execução e que o banco de dados `coursejdbc` exista. Você pode criar o banco de dados usando o seguinte comando SQL:

    ```sql
    CREATE DATABASE coursejdbc;
    ```

2. **Tabela de Departamentos e Vendedores**: Execute o script `database.sql`, que se encontra na raiz do seu diretório do projeto. Este script cria as tabelas `seller` e `department` necessárias para o funcionamento do exemplo.

3. **Arquivo de Propriedades**: Crie um arquivo chamado `db.properties` na raiz do seu diretório do projeto com o seguinte conteúdo:

    ```properties
    user=root
    password=123456
    dburl=jdbc:mysql://localhost:3306/coursejdbc
    useSSL=false
    ```

   **Obs.**: Substitua os valores de `user` e `password` pelas credenciais do seu banco de dados, se necessário.

## Como Executar

1. Compile o projeto. Se estiver usando um IDE como IntelliJ IDEA ou Eclipse, você pode usar o recurso de compilação integrado.

2. Execute a classe `Program.java`:

    ```bash
    java application.Program
    ```

3. O programa tentará estabelecer uma conexão com o banco de dados, permitindo realizar operações de CRUD nas entidades.

## Funcionalidades

- **Inserir**: Adicionar novos vendedores e departamentos ao banco de dados.
- **Atualizar**: Modificar informações de vendedores e departamentos existentes.
- **Excluir**: Remover vendedores e departamentos do banco de dados.
- **Buscar**: Encontrar vendedores e departamentos pelo ID ou por critérios específicos.

## Conclusão

Este projeto demonstra a aplicação do padrão DAO em Java, proporcionando uma maneira eficiente e organizada de gerenciar
dados em um banco de dados. O uso de entidades e interfaces facilita a manutenção e a escalabilidade da aplicação.
Ele demonstra como realizar operações de CRUD em um banco de dados MySQL, permitindo que você adapte e expanda o código.