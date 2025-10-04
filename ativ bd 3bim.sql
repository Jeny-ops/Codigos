create database 20231164010006_ativ_3bim_BD;

use 20231164010006_ativ_3bim_BD;
-- Escrevendo o código SQL para construir o banco de dados relacional mostrado no diagrama.

create table usuario (
id int primary key not null auto_increment,
cpf char(14) not null unique,
nome varchar(80) unique not null
);

create table sala (
numero int not null,
id int primary key not null auto_increment,
nome_completo varchar(150) unique not null,
nome_curto varchar(30) unique not null
);

create table permissao(
expirar_acesso date,
nome_usuario varchar(80),
cpf_usuario char(14) not null,
numero_sala int not null,
primary key(cpf_usuario, numero_sala),

foreing key (nome_usuario) references usuario (nome) on delete restrict on update cascade,
foreing key (cpf_usuario) references usuario (cpf) on delete restrict on update cascade,
foreing key (numero_sala) references sala (numero)  on delete restrict on update cascade 

);

-- Escrevendo o código SQL para inserir os dados abaixo para usuários e salas.
insert into usuario (nome, cpf) values ('Felipe', '111.111.111-11');
insert into usuario (nome, cpf) values ('Marcelo', '222.222.222-22');
insert into usuario (nome, cpf) values ('Mizael', '999.999.999-99');
insert into usuario (nome, cpf) values ('Leonardo', '333.333.333-33');

insert into sala (numero, nome_completo, nome_curto) values (21, 'Laboraorio de manutencao e arquitetura de computadores', 'lamac');
insert into sala (numero, nome_completo, nome_curto) values (46, 'Laboratorio de informatica 1', 'LabInfo1');
insert into sala (numero, nome_completo, nome_curto) values (48, 'Laboratorio de informatica 2', 'LabInfo2');

-- Os usuários com CPF 111.111.111-11 e 222.222.222-22 têm permissão para acessar as salas de números 21, 46 e 48. O acesso expira no dia 31/12/2020;
insert into permissao(cpf_usuario, numero_sala, expirar_acesso) values ('111.111.111-11', 21, 2020-12-31);
insert into permissao(cpf_usuario, numero_sala, expirar_acesso) values ('111.111.111-11', 46, 2020-12-31);
insert into permissao(cpf_usuario, numero_sala, expirar_acesso) values ('111.111.111-11', 48, 2020-12-31);

insert into permissao(cpf_usuario, numero_sala, expirar_acesso) values ('222.222.222-22', 21, 2020-12-31);
insert into permissao(cpf_usuario, numero_sala, expirar_acesso) values ('222.222.222-22', 46, 2020-12-31);
insert into permissao(cpf_usuario, numero_sala, expirar_acesso) values ('222.222.222-22', 48, 2020-12-31);

-- O usuário com CPF 333.333.333-33 tem permissão para acessar a sala 21 com acesso por tempo indeterminado.
insert into permissao(cpf_usuario, numero_sala, expirar_acesso) values ('333.333.333-33', 21, null);

-- Escreva uma consulta para mostrar o nome e o CPF de todos os usuários que têm permissão de acesso para a sala número 21.
select nome_usuario, cpf_usuario from permissao where  numero_sala = 21;

-- Escreva uma consulta para mostrar o número e o nome curto das salas que o usuário de CPF 111.111.111-11 tem permissão de acesso.
select sala.numero, sala.nome_curto from sala inner join permissao on sala.numero = permissao.numero_sala where permissao.usuario_cpf ='111.111.111-11' ;

/* Escreva uma consulta que gera uma tabela de relatório indicando para cada usuário as salas que
ele tem acesso. Apresente o resultado ordenado pelo nome do usuário em primeiro lugar e pelo
número da sala em segundo lugar. As colunas da tabela serão nome, CPF, número, nome
completo, nome curto e a data de expirar acesso. */
select usuario.nome, usuario.cpf from usuario, sala.numero, sala.nome_completo, sala.nome_curto inner join permissao on numero=numero_sala;

-- Escreva o código SQL para remover o usuário de CPF 999.999.999-99.
delete from usuario where cpf= '999.999.999-99';

-- Escreva o código SQL para remover todas as permissões do usuário de CPF 111.111.111-11.
delete from permissao where cpf_usuario= '111.111.111-11';

-- Escreva o código SQL para remover as permissões do usuário de CPF 222.222.222-22 para a sala de número 21.
delete permissao.cpf_usuario from permissao where permissao.cpf_usuario= '222.222.222-22' and permissao.numero=21;

-- Escreva o código SQL para atualizar o nome do usuário de CPF 222.222.222-22 para Lucas Mariano.
update usuario set nome = 'Lucas Mariano' where cpf='222.222.222-22';

-- Escreva o código SQL para atualizar o nome completo e o nome curto da sala de número 21 para Laboratório de Redes de Computadores e LADIR, respectivamente.
update sala set nome_completo = 'Laboratório de Redes de Computadores', nome_curto='LADIR' where numero=21;
