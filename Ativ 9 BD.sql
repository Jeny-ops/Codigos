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
codigoDoCampus int not null unique,
foreign key (codigoDoCampus) references campus(codigo)
);

create table Notebook(
codigo_notebook int,
data_compra date,
profMatricula int not null,
primary key(codigo_notebook,profMatricula)
foreign key profMatricula references professor(matricula_professor)
);

create table turma(
codigo_turma char(30) primary key,
semestre int
);

create table aluno(
matricula_aluno char(30) primary key,
nome varchar (30),
rendimento int
);

-- relacionamentos:
create table professor_aquisicao_notebook(
dataAquisicao date,
professorMatricula int not null,
notebookCodigo int not null,
primary key(notebookCodigo,professorMatricula),
foreign key (professorMatricula) references professor(matricula_professor),
foreign key (notebookCodigo) references NoteBook(codigo_notebook)
);

create table professor_ensina_turma (
matriculaProf int not null,
codigoTurma int not null,
primary key (codigoTurma),
foreign key (matriculaProf) references professor(matricula_professot),
foreign key (codigoTurma ) references turma(codigo_turma)
);

create table professor_e_campus(
matriculaProf int not null,
codCampus varchar(30) not null,
primary key (codCampus),
foreign key (matriculaProf) references professor(matricula_professor)
foreign key (codCampus) references campus(codigo_campus)
);

create table alunos_pertencem_turma(
matriculasAlunos varchar(30) not null,
codTurmas varchar(30) not null,
primary key (codTurmas),
foreign key (matriculasAlunos) references alunos(matriculas_alunos),
foreign key (codTurmas) references turma(codigo_turma)
);

create table campus_e_alunos (
codCampus varchar(30) not null,
matriculasAlunos varchar(30) not null,
primary key (codCampus),
foreign key (matriculasAlunos) references alunos(matriculas_alunos),
foreign key (codCampus) references campus(codigo_campus)


);
