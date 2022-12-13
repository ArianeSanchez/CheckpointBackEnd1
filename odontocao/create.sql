             create table IF NOT EXISTS DENTISTA(
             Id Integer,
             NOME varchar(255),
             SOBRENOME varchar(255),
             MATRICULA integer);

             create table IF NOT EXISTS ENDERECO(
              RUA varchar(255),
              NUMERO varchar(255),
              BAIRRO varchar(255),
              CIDADE varchar(255) );

             create table IF NOT EXISTS PACIENTE(
              Id Integer,
              NOME varchar(255),
              SOBRENOME varchar(255),
              CPF varchar(255),
              DATA Date );
              
              // Spring boot dando erro no mapping
