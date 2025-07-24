create database empresaDeDesenvolvimento;
use empreseDeDesenvolvimento;

create table linguagemDeProgramacao (
nome varchar(30) primary key,
multiplataforma varchar(30),
aberta unique  
);

create table empregado (
cpf int primary key,
nome varchar(30)  
);

create table setor(
nome char(30),
codigo_setor int primary key  
);

create table programador (
especialidade char(30)  
);

create table engenheiro(
numero_de_registro int 
);

create table projeto (
codigo_projeto int primary key,
nome_projeto char(30)  
);
