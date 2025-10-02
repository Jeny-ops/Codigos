create database 20231164010001_ativ_3bim;

use 20231164010001_ativ_3bim;
-- Escrevendo o código SQL para construir o banco de dados relacional mostrado no diagrama.
create table usuario (
id int primary key not null auto_increment,
cpf char(11) not null unique,
nome varchar(80) unique not null
);

create table sala (
numero int not null,
id int primary key not null auto_incrment,
nome_completo varchar(150) unique not null,
nome_curto (30) unique not null
);

create table permissao(
expirar_acesso date,
cpf_usuario char(11) not null,
numero_sala int not null,
primary key(cpf_usuario, numero_sala),

foreing key (cpf_usuario) references usuario (cpf) on delete restrict on update cascade,
foreing key (numero_sala) references sala (numero)  on delete restrict on update cascade 

);

-- Escrevendo o código SQL para inserir os dados abaixo para usuários e salas.
insert into usuarios (nome, cpf) values ('Felipe', '111.111.111-11');
insert into usuarios (nome, cpf) values ('Marcelo', '222.222.222-22');
insert into usuarios (nome, cpf) values ('Mizael', '999.999.999-99');
insert into usuarios (nome, cpf) values ('Leonardo', '333.333.333-33');

insert into sala (numero, nome_completo, nome_curto) values (21, 'Laboraorio de manutencao e arquitetura de computadores', 'lamac');
insert into usuarios (nome, cpf) values (46, 'Laboratorio de informatica 1', 'LabInfo1');
insert into usuarios (nome, cpf) values (48, 'Laboratorio de informatica 2', 'LabInfo2');

-- Os usuários com CPF 111.111.111-11 e 222.222.222-22 têm permissão para acessar as salas de números 21, 46 e 48. O acesso expira no dia 31/12/2020;
insert into permissao(cpf_usuario, numero_sala, expirar_acesso) values ('111.111.111-11', 21, 2020/12/31);
insert into permissao(cpf_usuario, numero_sala, expirar_acesso) values ('111.111.111-11', 46, 2020/12/31);
insert into permissao(cpf_usuario, numero_sala, expirar_acesso) values ('111.111.111-11', 48, 2020/12/31);

insert into permissao(cpf_usuario, numero_sala, expirar_acesso) values ('222.222.222-22', 21, 2020/12/31);
insert into permissao(cpf_usuario, numero_sala, expirar_acesso) values ('222.222.222-22', 46, 2020/12/31);
insert into permissao(cpf_usuario, numero_sala, expirar_acesso) values ('222.222.222-22', 28, 2020/12/31);

-- O usuário com CPF 333.333.333-33 tem permissão para acessar a sala 21 com acesso por tempo indeterminado.
insert into permissao(cpf_usuario, numero_sala, expirar_acesso) values ('333.333.333-33', 21, null);

-- Escreva uma consulta para mostrar o nome e o CPF de todos os usuários que têm permissão de acesso para a sala número 21.
select nome, cpf_usuario from permissao where  numero_sala == 21;

--Escreva uma consulta para mostrar o número e o nome curto das salas que o usuário de CPF 111.111.111-11 tem permissão de acesso.
