CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;

CREATE TABLE tb_categoria (
    id int AUTO_INCREMENT,
    tipo VARCHAR(25) NOT NULL,
    prescricao BOOLEAN NOT NULL,
    PRIMARY KEY (id) 
)ENGINE = INNODB;

CREATE TABLE tb_produto (
    id int AUTO_INCREMENT,
    valor decimal(10,2) NOT NULL,
    nome VARCHAR(20) NOT NULL,
    id_categoria int NOT NULL,
    estoque int NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (id_categoria) REFERENCES tb_categoria(id)
)ENGINE = INNODB;

INSERT INTO tb_categoria(tipo, prescricao) 
    VALUES("TARJA PRETA", true), ("TARJA VERMELHA", true), ("TARJA AMARELA", false), ("TARJA VERMELHA", true), 
    ("COMESTICOS", false);

INSERT INTO tb_produto(valor, nome, id_categoria, estoque) 
    VALUES( 120.00, "Fluoxetina", 1, 50), ( 75.00, "Mupirocina", 2, 50), ( 70, "Antialergico", 3, 50), ( 75.00, "Respiridona", 4, 50),
    ( 5.00, "Desodorante", 5, 50), ( 100.00, "Colecaciferol", 4, 50), ( 90.00, "Kit para Cabelo", 5, 50), ( 234.00, "Escitalopram", 1, 50);

SELECT * FROM tb_produto 
    WHERE valor > 50;

SELECT * FROM tb_produto 
    WHERE valor between 3 AND 60;

SELECT * FROM tb_produto 
    WHERE nome LIKE "%b%";
    
SELECT * FROM tb_produto 
    INNER JOIN tb_categoria 
        ON tb_produto.id_categoria = tb_categoria.id;

SELECT * FROM tb_produto 
    INNER JOIN tb_categoria 
        ON tb_produto.id_categoria = tb_categoria.id
            WHERE tb_produto.id_categoria = 5;