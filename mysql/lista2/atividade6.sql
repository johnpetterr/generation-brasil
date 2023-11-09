CREATE DATABASE db_cursoDaMinhaVida;
USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria (
    id INT NOT NULL AUTO_INCREMENT,
    tipo VARCHAR(25) NOT NULL,
    linguagem VARCHAR(25) NOT NULL,
    PRIMARY KEY (id)
)  ENGINE=INNODB;

INSERT INTO tb_categoria(tipo, linguagem) 
	VALUES ("EAD", "JAVA"),("PRESENCIAL", "PHP"),("PRESENCIAL/EAD", "JAVA"),("EAD", "SQL"),
    ("EAD", "FRONT-END");

CREATE TABLE tb_curso (
    id INT NOT NULL AUTO_INCREMENT,
    valor DECIMAL(5,2) NOT NULL,
    nome VARCHAR(35) NOT NULL,
    periodo VARCHAR(11) NOT NULL,
    id_categoria INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (id_categoria)
        REFERENCES tb_categoria (id)
)  ENGINE=INNODB;

INSERT INTO tb_curso(valor, nome, periodo, id_categoria)
	VALUES (34.90, "Java Básico", "Noite", 1), (34.90, "PHP Básico", "Noite", 2),(54.90, "Java Intermédiario", "Dia", 3),
        (54.90, "SQL Avançado", "Tarde", 4),(124.00, "Java Avançado", "Manhã", 3),(124.00, "Angular Avançado", "Manhã", 5)
        ,(124.00, "PHP Avançado", "Manhã", 2),(154.00, "HTML/CSS Avançado", "Manhã", 5);
    
SELECT * FROM tb_curso 
    WHERE valor > 50;

SELECT * FROM tb_curso 
    WHERE valor between 3 AND 60;

SELECT * FROM tb_curso 
    WHERE nome LIKE "%j%";
    
SELECT * FROM tb_curso 
    INNER JOIN tb_categoria 
        ON tb_curso.id_categoria = tb_categoria.id;

SELECT * FROM tb_curso 
    INNER JOIN tb_categoria 
        ON tb_curso.id_categoria = tb_categoria.id
            WHERE tb_categoria.linguagem = "JAVA";
    