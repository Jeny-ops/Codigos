create database empresaDeDesenvolvimento;
use empreseDeDesenvolvimento;

create table linguagemDeProgramacao (
nome varchar(30) primary key,
multiplataforma varchar(30),
aberta unique  
);

create table empregado (
cpf char(11) primary key,
nome varchar(30)  
);

create table setor(
nome char(30),
codigo_setor int primary key  
);

create table programador (
especialidade char(30),
nome_programador varchar(30),
cpf_programador char(11) primary key
);

create table engenheiro(
numero_de_registro int
nome_engenheiro varchar(30),
cpf_engenheiro char(11) primary key
);

create table projeto (
codigo_projeto int primary key,
nome_projeto char(30)  
);
 --Relacionamentos:
create table Programador_Domina_Linguagem_De_programacao(
nomeDaLinguagem char(30) not null,
especialidadeDoProgramador varchar(30),
cpfProgramador char(11) not null,
primary key (cpfProgramador,nomeDaLinguagem),
foreign key cpfProgramador references programador(cpf_programador),
foreign key nomeDaLinguagem references linguagemDeProgramacao(nome)
);

create table programador_participa_projeto(
codProjeto char(30) not null,
dataParticipacao data not null,
cpfProgramador char(11) not null,
primary key (codProjeto,cpfProgramador)
foreign key cpfProgramador references programador(cpf_programador),
foreign key codProjeto references projeto(codigo_projeto)
);

create table engenheiro_coordena_projeto (
codProjeto char(30) not null unique,
cpfEngenheiro char(11) not null,
primary key (codProjeto char,cpfEngenheiro char),
foreign key codProjeto references projeto(codigo_projeto),
foreign key cpfEngenheiro references engenheiro(cpf_engenheiro)
);

create table empregado_lotacao_setor (
codSetor varchar (30),
cpfEmpregado char (11) primary key,
foreign key codSetor references setor(codigo_setor),
foreign key cpfEmpregado references empregado(cpf_empregado)

);
