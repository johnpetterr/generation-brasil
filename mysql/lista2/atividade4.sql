CREATE DATABASE db_cidade_das_frutas;
USE db_cidade_das_frutas;

CREATE TABLE tb_categoria (
    id INT NOT NULL AUTO_INCREMENT,
    tipo VARCHAR(25) NOT NULL,
    madura BOOLEAN NOT NULL,
    PRIMARY KEY (id)
)  ENGINE=INNODB;

INSERT INTO tb_categoria(tipo, madura) 
	VALUES ("Legumes", false),("Frutas", true),("Frutas", true),
			("Outros", false),("Doces", false);

CREATE TABLE tb_produto (
    id INT NOT NULL AUTO_INCREMENT,
    valor DECIMAL(4 , 2 ) NOT NULL,
    nome VARCHAR(20) NOT NULL,
    estoque INT NOT NULL,
    id_categoria INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_categoria)
        REFERENCES tb_categoria (id)
)  ENGINE=INNODB;

INSERT INTO tb_produto(valor, nome, estoque, id_categoria)
	VALUES (3.50, "Alface", 40, 1),(2.00, "Maça", 40, 2),(5.60, "Melancia", 40, 2),(8.50, "Sal", 40, 3),
	(3.50, "Pé de moça", 40, 5),(5.00, "Salgadinhos", 40, 4),(1.70, "Coentro", 40, 1),(20.50, "Lichia", 40, 2);
    
SELECT * FROM tb_produto 
    WHERE valor > 50;

SELECT * FROM tb_produto 
    WHERE valor between 3 AND 60;

SELECT * FROM tb_produto 
    WHERE nome LIKE "%c%";
    
SELECT * FROM tb_produto 
    INNER JOIN tb_categoria 
        ON tb_produto.id_categoria = tb_categoria.id;

SELECT * FROM tb_produto 
    INNER JOIN tb_categoria 
        ON tb_produto.id_categoria = tb_categoria.id
            WHERE tb_produto.id_categoria = 1;
    