/*
    Criação das tabelas e inserção de dados no banco de dados

    A tabela 'department' (departamento) contém as seguintes colunas:
    - Id: um identificador único para cada departamento, que é gerado automaticamente (AUTO_INCREMENT).
    - Name: o nome do departamento, com um limite de 60 caracteres.

    A tabela 'seller' (vendedor) contém as seguintes colunas:
    - Id: um identificador único para cada vendedor, que também é gerado automaticamente (AUTO_INCREMENT).
    - Name: o nome do vendedor, que não pode ser nulo.
    - Email: o endereço de email do vendedor, que também não pode ser nulo.
    - BirthDate: a data de nascimento do vendedor, que não pode ser nula.
    - BaseSalary: o salário base do vendedor, que é um valor numérico e não pode ser nulo.
    - DepartmentId: um identificador que relaciona o vendedor ao seu departamento, que não pode ser nulo. É uma chave estrangeira que referencia a coluna 'id' da tabela 'department'.

    Abaixo estão as instruções SQL para criar as tabelas:

    CREATE TABLE department (
      Id int(11) NOT NULL AUTO_INCREMENT,
      Name varchar(60) DEFAULT NULL,
      PRIMARY KEY (Id)
    );

    CREATE TABLE seller (
      Id int(11) NOT NULL AUTO_INCREMENT,
      Name varchar(60) NOT NULL,
      Email varchar(100) NOT NULL,
      BirthDate datetime NOT NULL,
      BaseSalary double NOT NULL,
      DepartmentId int(11) NOT NULL,
      PRIMARY KEY (Id),
      FOREIGN KEY (DepartmentId) REFERENCES department (id)
    );

    Após a criação das tabelas, foram inseridos dados iniciais nas tabelas 'department' e 'seller':

    Os departamentos inseridos são:
    - Computers
    - Electronics
    - Fashion
    - Books

    Os vendedores inseridos são:
    - Bob Brown: ID 1, email: bob@gmail.com, nascimento: 21/04/1998, salário: 1000, departamento: Computers (ID 1)
    - Maria Green: ID 2, email: maria@gmail.com, nascimento: 31/12/1979, salário: 3500, departamento: Electronics (ID 2)
    - Alex Grey: ID 3, email: alex@gmail.com, nascimento: 15/01/1988, salário: 2200, departamento: Computers (ID 1)
    - Martha Red: ID 4, email: martha@gmail.com, nascimento: 30/11/1993, salário: 3000, departamento: Books (ID 4)
    - Donald Blue: ID 5, email: donald@gmail.com, nascimento: 09/01/2000, salário: 4000, departamento: Fashion (ID 3)
    - Alex Pink: ID 6, email: bob@gmail.com, nascimento: 04/03/1997, salário: 3000, departamento: Electronics (ID 2)
*/

CREATE TABLE department (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Name varchar(60) DEFAULT NULL,
  PRIMARY KEY (Id)
);

CREATE TABLE seller (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Name varchar(60) NOT NULL,
  Email varchar(100) NOT NULL,
  BirthDate datetime NOT NULL,
  BaseSalary double NOT NULL,
  DepartmentId int(11) NOT NULL,
  PRIMARY KEY (Id),
  FOREIGN KEY (DepartmentId) REFERENCES department (id)
);

INSERT INTO department (Name) VALUES 
  ('Computers'),
  ('Electronics'),
  ('Fashion'),
  ('Books');

INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES 
  ('Bob Brown','bob@gmail.com','1998-04-21 00:00:00',1000,1),
  ('Maria Green','maria@gmail.com','1979-12-31 00:00:00',3500,2),
  ('Alex Grey','alex@gmail.com','1988-01-15 00:00:00',2200,1),
  ('Martha Red','martha@gmail.com','1993-11-30 00:00:00',3000,4),
  ('Donald Blue','donald@gmail.com','2000-01-09 00:00:00',4000,3),
  ('Alex Pink','bob@gmail.com','1997-03-04 00:00:00',3000,2);