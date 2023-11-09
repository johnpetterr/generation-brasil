-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_estoque
-- ------------------------------------------------------
-- Server version	8.0.25
--
-- Table structure for table `tb_marcas`
--

DROP TABLE IF EXISTS `tb_marcas`;

CREATE TABLE `tb_marcas` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(20) NOT NULL,
  `ativo` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `tb_marcas`
--

LOCK TABLES `tb_marcas` WRITE;

INSERT INTO `tb_marcas` VALUES (1,'Nike',1),(2,'Adidas',1),(4,'Versacci',1),(5,'Oakley',1),(6,'Dior',1),(7,'Louis Vuitton',1),(8,'Yves Saint Laurent',1),(9,'Yeezy',1),(10,'Jordan',1),(11,'Sufgang',1),(12,'Champion',1),(13,'Balenciaga',1),(14,'Off-White',1),(15,'Gucci',1),(16,'Cactus Jack',1);

UNLOCK TABLES;

-- Dump completed on 2021-08-18 12:36:38
