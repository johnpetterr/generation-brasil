DROP DATABASE IF EXISTS db_rh;

CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_funcionaries(
	id BIGINT auto_increment, PRIMARY KEY(id),
    nome VARCHAR(50) NOT NULL,
    setor VARCHAR(25) NOT NULL,
	salario DECIMAL(10,2) NOT NULL,
    ativo BOOLEAN NOT NULL
);

INSERT INTO tb_funcionaries(nome, setor, salario, ativo) VALUES("Ana Paula Souza", "Gestão", 2100.00, true);
INSERT INTO tb_funcionaries(nome, setor, salario, ativo) VALUES("Cássia Arruda", "Recrutadora", 1900.00, true);
INSERT INTO tb_funcionaries(nome, setor, salario, ativo) VALUES("Anderson Coelho", "Consultoria", 2250.00, true);
INSERT INTO tb_funcionaries(nome, setor, salario, ativo) VALUES("Lucas Aguiar", "Gestão", 2100.00, true);
INSERT INTO tb_funcionaries(nome, setor, salario, ativo) VALUES("Beatriz Gomes", "Consultoria", 2250.00, true);

SELECT * FROM tb_funcionaries WHERE salario > 2000.00;

SELECT * FROM tb_funcionaries WHERE salario < 2000.00;

UPDATE tb_funcionaries SET salario = 2300.00 WHERE id = 2;
