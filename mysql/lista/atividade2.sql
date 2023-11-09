DROP DATABASE IF EXISTS db_ecommerce;

CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos(
	id BIGINT auto_increment, PRIMARY KEY(id),
    valor DECIMAL(10,2) NOT NULL,
    nome VARCHAR(50) NOT NULL,
	estoque BOOLEAN NOT NULL,
    quantidade INT(10) NOT NULL
);

INSERT INTO tb_produtos(valor, nome, estoque, quantidade) VALUES (690.99, "PULSEIRA ICY", true, 140);
INSERT INTO tb_produtos(valor, nome, estoque, quantidade) VALUES (390.99, "ANEL TOPÁZIO", true, 76);
INSERT INTO tb_produtos(valor, nome, estoque, quantidade) VALUES (400.99, "COlAR SAFIRA", true, 30);
INSERT INTO tb_produtos(valor, nome, estoque, quantidade) VALUES (590.99, "PULSEIRA LIZ", true, 2);
INSERT INTO tb_produtos(valor, nome, estoque, quantidade) VALUES (650.50, "ANEL CRISTAL", true, 200);
INSERT INTO tb_produtos(valor, nome, estoque, quantidade) VALUES (800.00, "BRINCO JASPE", true, 46);
INSERT INTO tb_produtos(valor, nome, estoque, quantidade) VALUES (740.99, "PINGENTE LUA", false, 0);
INSERT INTO tb_produtos(valor, nome, estoque, quantidade) VALUES (500.00, "COLAR AMÉLIA", true, 100);

SELECT * FROM tb_produtos;
SELECT * FROM tb_produtos WHERE valor > 500;
SELECT * FROM tb_produtos WHERE valor < 500;

UPDATE tb_produtos SET quantidade = quantidade - 1 WHERE id = 8;

SELECT * FROM tb_produtos;
