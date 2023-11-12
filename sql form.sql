create database formulario;
use formulario;
create table dados_form(
idUser int auto_increment primary key,
nome varchar(150),
email varchar(150),
celular varchar(15),
genero varchar(10),
nascimento date,
pais varchar(30),
altura double(3,2),
peso double(3,2),
IMC double(3,2),
situacao varchar(100)

);
select * from dados_form;