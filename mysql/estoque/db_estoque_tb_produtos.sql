-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_estoque
-- ------------------------------------------------------
-- Server version	8.0.25
--
-- Table structure for table `tb_produtos`
--

DROP TABLE IF EXISTS `tb_produtos`;
CREATE TABLE `tb_produtos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  `preco` decimal(10,2) DEFAULT NULL,
  `marca_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `marca_id` (`marca_id`),
  CONSTRAINT `tb_produtos_ibfk_1` FOREIGN KEY (`marca_id`) REFERENCES `tb_marcas` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `tb_produtos`
--

LOCK TABLES `tb_produtos` WRITE;

INSERT INTO `tb_produtos` VALUES (1,'Camiseta',79.00,1),(4,'Air Max 90',800.00,1),(5,'Corta-vento',320.00,1),(6,'Tenis Superstar',374.00,2),(7,'Jaqueta Track Navy',8870.00,4),(8,'Óculos',1218.00,4),(9,'Bota',450.00,5),(10,'Moletom',4230.00,6),(11,'Mala',12323.00,7),(12,'Camiseta',3200.00,8),(13,'Chinelo Slide',3530.00,9),(14,'Air Jordan 4',2340.00,10),(15,'Calça',290.00,11),(16,'Moletom',400.00,12),(17,'Tenis',5239.00,13),(18,'Cinto',3214.00,14),(19,'Camiseta Astroworld',754.00,15);

UNLOCK TABLES;

-- Dump completed on 2021-08-18 12:36:38
