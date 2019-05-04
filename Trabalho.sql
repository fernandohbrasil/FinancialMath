drop table lancamento;
drop table conta;
drop table usuario;

drop sequence sq_conta;
drop sequence sq_lancamento;
drop sequence sq_usuario;

create sequence sq_conta;
create sequence sq_lancamento;
create sequence sq_usuario;
	

create table usuario (
	usuarioid int not null constraint pk_usuario primary key,
	nome varchar(50) not null,
	email varchar (50) not null,
	login int not null constraint uq_usuario_login unique,
	senha int not null
);

create table conta
  (
    contaid   int not null constraint pk_contas primary key,
    descricao varchar(30) not null,
    tipo      char (1) not null constraint ck_tipo check (tipo in ('d', 'c')),
		usuarioid int not null constraint fk_usuario_conta references usuario (usuarioid)
  );
	
	
create table lancamento
  (
    lancamentoid   int not null constraint pk_lanmento primary key,
    valor          numeric(6,2) not null constraint ck_valor check (valor > 0),
    contaid        int not null constraint fk_conta references conta (contaid),
    datalancamento date not null,
		usuarioid int not null constraint fk_usuario_lancamento references usuario (usuarioid)
  );
	
INSERT
INTO USUARIO
  (USUARIOID, NOME, EMAIL, LOGIN, SENHA)
  VALUES
  (sq_usuario.nextval, 'Fernando', 'fernandohbrasil@hotmail.com', 1, 1);
	
commit;
