create database Escola;
use Escola;

create table campus(
codigo_campus char (30) primary key,
endereco varchar (30) not null,
cidade varchar (30)
);

create table professor(
matricula_professor int primary key,
nome char (30),
titulacao char(30),
codigoDoCampus int not null,
foreign key (codigoDoCampus) references campus(codigo)
);

create table Notebook(
codigo_notebook int,
data_compra date,
primary key(codigo_notebook)
);

create table turma(
codigo_turma char(30) primary key,
semestre int
);

create table aluno(
matricula_aluno char(30) primary key,
nome varchar (30),
rendimento int,
codCampus char(30),
codTurmas varchar(30) not null,
foreign key (codCampus) references campus(codigo_campus),
foreign key (codTurmas) references turma(codigo_turma)
);

-- relacionamentos:
create table professor_aquisicao_notebook(
dataAquisicao date,
professorMatricula int not null unique,
notebookCodigo int not null,
primary key(notebookCodigo),
foreign key (professorMatricula) references professor(matricula_professor),
foreign key (notebookCodigo) references NoteBook(codigo_notebook)
);

create table professor_ensina_turma (
matriculaProf int not null,
codigoTurma int not null,
primary key (codigoTurma,matriculaProf),
foreign key (matriculaProf) references professor(matricula_professot),
foreign key (codigoTurma ) references turma(codigo_turma)
);




