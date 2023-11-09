CREATE DATABASE db_aeroporto;

USE db_aeroporto;
DROP TABLE tb_tripulantes;
DROP TABLE tb_aviao;

CREATE TABLE tb_aviao (
    id INT AUTO_INCREMENT,
    modelo VARCHAR(20) NOT NULL,
    PRIMARY KEY (id)
)  ENGINE=INNODB;

DESC tb_aviao;

CREATE TABLE tb_tripulantes (
    id INT AUTO_INCREMENT,
    PRIMARY KEY (id),
    nome VARCHAR(50) NOT NULL,
    genero CHAR(1) NOT NULL CHECK (genero IN ('F' , 'M', 'N')),
    id_aviao INT NOT NULL,
    FOREIGN KEY (id_aviao)
        REFERENCES tb_aviao (id)
)  ENGINE=INNODB;

DESC tb_tripulantes;

INSERT INTO tb_tripulantes VALUES (16,'James Kirk','M',1);
INSERT INTO tb_tripulantes VALUES (86, 'Catherine Janeway', 'F', 2);
INSERT INTO tb_tripulantes VALUES (87, 'Uhura', 'F', 1);
INSERT INTO tb_tripulantes VALUES (48, 'Ikaru Sulu', 'M', 3);
INSERT INTO tb_tripulantes VALUES (52, 'Tuvok', 'M', 2);
INSERT INTO tb_tripulantes VALUES (1,'Jhony','M',1);
INSERT INTO tb_tripulantes VALUES (20, 'Sasha', 'N', 2);
INSERT INTO tb_tripulantes VALUES (30, 'Uhura', 'F', 1);
INSERT INTO tb_tripulantes VALUES (66, 'Price', 'N', 3);
INSERT INTO tb_tripulantes VALUES (55, 'Taira', 'N', 2);

INSERT INTO tb_aviao VALUES (1, "GOL");
INSERT INTO tb_aviao VALUES (2, "AVIANCA");
INSERT INTO tb_aviao VALUES (3, "TAM");

SELECT * FROM tb_tripulantes WHERE genero = 'F';

UPDATE tb_tripulantes SET genero = 'N' WHERE genero = 'F';

SET SQL_SAFE_UPDATES = 0;
