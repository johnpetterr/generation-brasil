DROP DATABASE IF EXISTS db_escola;

CREATE DATABASE db_escola;

USER db_escola;

create table tb_alunes(
	id BIGINT auto_increment, PRIMARY KEY(id),
    nota INT(2) NOT NULL,
    nome VARCHAR(50) NOT NULL,
    turma INT(2) NOT NULL,
    periodo VARCHAR(10) NOT NULL
);

SELECT * FROM tb_alunes;

INSERT INTO tb_alunes(nota, nome, turma, periodo) VALUES(10, "João Pedro da Cruz", 30, "Noite");
INSERT INTO tb_alunes(nota, nome, turma, periodo) VALUES(7, "Cássia Arruda", 30, "Noite");
INSERT INTO tb_alunes(nota, nome, turma, periodo) VALUES(8, "Ana Paula", 30, "Noite");
INSERT INTO tb_alunes(nota, nome, turma, periodo) VALUES(7, "Anderson Coelho", 30, "Noite");
INSERT INTO tb_alunes(nota, nome, turma, periodo) VALUES(9, "Lucas Aguiar", 30, "Noite");
INSERT INTO tb_alunes(nota, nome, turma, periodo) VALUES(10, "Beatriz Gomes", 30, "Noite");
INSERT INTO tb_alunes(nota, nome, turma, periodo) VALUES(3, "Bruna Amora", 31, "Tarde");
INSERT INTO tb_alunes(nota, nome, turma, periodo) VALUES(5, "Debora Leticia", 29, "Manhã");

SELECT * FROM tb_alunes WHERE nota > 7;
SELECT * FROM tb_alunes WHERE nota < 7;

UPDATE tb_alunes SET nota = 10 WHERE id = 5;
