CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_classe (
    id INT AUTO_INCREMENT,
    PRIMARY KEY (id),
    nome VARCHAR(20) NOT NULL,
    evolucoes INT NOT NULL,
    tipo VARCHAR(15) NOT NULL
)  ENGINE=INNODB;

CREATE TABLE tb_personagem (
    id INT AUTO_INCREMENT,
    PRIMARY KEY (id),
    nome VARCHAR(50) NOT NULL,
    ataque INT NOT NULL,
    defesa INT NOT NULL,
    sabedoria INT NOT NULL,
    velocidade INT NOT NULL,
    nivel INT NOT NULL,
    id_classe INT NOT NULL,
    FOREIGN KEY (id_classe)
        REFERENCES tb_classe (id)
)  ENGINE=INNODB;

INSERT INTO tb_classe(nome, evolucoes, tipo) VALUES("Cavaleiro", 4, "Humano");
INSERT INTO tb_classe(nome, evolucoes, tipo) VALUES("Magos", 7, "Ancião");
INSERT INTO tb_classe(nome, evolucoes, tipo) VALUES("Arqueiro", 3, "Elfo");
INSERT INTO tb_classe(nome, evolucoes, tipo) VALUES("Assassino", 6, "Humano");
INSERT INTO tb_classe(nome, evolucoes, tipo) VALUES("Ladino", 5, "Anão");

INSERT INTO tb_personagem(nome, ataque, defesa, sabedoria, velocidade, nivel, id_classe) VALUES("Aisha", 1000, 1000, 3000, 800, 50, 2);
INSERT INTO tb_personagem(nome, ataque, defesa, sabedoria, velocidade, nivel, id_classe) VALUES("Chung", 4000, 500, 500, 3500, 50, 4);
INSERT INTO tb_personagem(nome, ataque, defesa, sabedoria, velocidade, nivel, id_classe) VALUES("Elsword", 3500, 3500, 500, 1500, 50, 1);
INSERT INTO tb_personagem(nome, ataque, defesa, sabedoria, velocidade, nivel, id_classe) VALUES("Raven", 3500, 3500, 500, 1500, 50, 1);
INSERT INTO tb_personagem(nome, ataque, defesa, sabedoria, velocidade, nivel, id_classe) VALUES("Ayaya", 3000, 500, 2000, 2000, 50, 3);
INSERT INTO tb_personagem(nome, ataque, defesa, sabedoria, velocidade, nivel, id_classe) VALUES("Elesis", 3000, 3000, 2000, 1000, 50, 1);
INSERT INTO tb_personagem(nome, ataque, defesa, sabedoria, velocidade, nivel, id_classe) VALUES("Luciel", 3000, 500, 2000, 2000, 50, 3);
INSERT INTO tb_personagem(nome, ataque, defesa, sabedoria, velocidade, nivel, id_classe) VALUES("Eve", 1000, 1000, 3000, 800, 50, 2);

SELECT * FROM tb_personagem
    WHERE ataque > 2000;

SELECT * FROM tb_personagem
    WHERE defesa BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagem
    WHERE nome LIKE '%c%';
 
SELECT * FROM tb_classe
    INNER JOIN tb_personagem 
        ON tb_classe.id = tb_personagem.id_classe;

SELECT * FROM tb_classe
        INNER JOIN tb_personagem
            ON tb_personagem.id_classe = tb_classe.id
                WHERE tb_classe.nome = 'Arqueiro';