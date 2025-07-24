create dabase controleDeAcesso;
use controleDeAcesso;

create table sala(
id int primary key,
numero int,
nome varchar(30),
);

create table usuario (
id int primary key auto_increment,
nome varchar(30),
endereço varchar(76)
);

create table tag(
id int primary key,
codigo varchar(30),
tipo varchar(30)
);

create table servidor(
id int primary key,
matricula varchar(30),
foreign key (id) references usuario(id)
);

create table externo (
id int,
cpf char(11),
foreign key (id) references usuario(id)
);

--Relacionamentos:
create table usuario_Permissao_sala(
horario time,
idUsuario int,
idSala int,
primary key (idUsuario,idSala,horario);
foreign key (idUsuario) references usuario(id),
foreign key (idSala) references sala(id)
);

create table sala_acesso_usuario_tag(
idSala int,
idUsuario int,
idTag int,
horario time,
permitido boolean,
primary key(idSala,idUsuario,idTag,horario,permitido),
foreign key (idSala) references sala(id),
foreign key (idUsuario) references usuario(id),
foreign key (idTag) references tag(id)
);
