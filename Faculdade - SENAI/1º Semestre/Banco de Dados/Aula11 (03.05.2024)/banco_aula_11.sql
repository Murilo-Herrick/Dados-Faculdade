CREATE DATABASE  IF NOT EXISTS `loja` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `loja`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: loja
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id_cliente` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `cpf` varchar(45) DEFAULT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Joe Cadgan','11.111.111-11','(16)91111.1111'),(2,'Ana Silva','12.111.111-11','(16)92111.1111'),(3,'Legolas Verdefolha','22.111.111-11','(16)9222.1111'),(4,'Samwise Gamgee','34.211.111-11','(16)9232.1115'),(5,'Waldir Peres','74.211.111-11','(16)9131.2111'),(6,'José Leandro de Souza Ferreira','37.111.111-11','(16)9731.1111'),(7,'Antônio Carlos Cerezo','19.211.211-11','(16)9731.2345'),(8,'Arthur Antunes Coimbra','53.211.311-11','(16)9331.3333'),(9,'Ana Moser','62.711.311-11','(16)9771.3113'),(10,'Sheilla Castro','22.317.311-11','(16)95551.5555');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda`
--

DROP TABLE IF EXISTS `venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venda` (
  `id_compra` int NOT NULL AUTO_INCREMENT,
  `produto` varchar(45) DEFAULT NULL,
  `valor` varchar(45) DEFAULT NULL,
  `data_compra` date DEFAULT NULL,
  `CLIENTE_id_cliente` int NOT NULL,
  PRIMARY KEY (`id_compra`),
  KEY `fk_PRODUTO_CLIENTE_idx` (`CLIENTE_id_cliente`),
  CONSTRAINT `fk_PRODUTO_CLIENTE` FOREIGN KEY (`CLIENTE_id_cliente`) REFERENCES `cliente` (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda`
--

LOCK TABLES `venda` WRITE;
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
INSERT INTO `venda` VALUES (1,'Coca-cola','4.50','2024-02-01',1),(2,'Coca-cola','4.50','2024-02-05',1),(3,'Fanta Laranja','4,50','2024-02-07',2),(4,'Guaraná','4,00','2024-02-07',3),(5,'Suco de Laranja','5,00','2024-02-12',4),(6,'Coca-cola','4,50','2024-02-12',5),(7,'Coca-cola','4,50','2024-02-12',9),(8,'Suco de Laranja','5,00','2024-02-12',7),(9,'Coca-cola','4,50','2024-02-12',1),(10,'Fanta Laranja','4,50','2024-02-15',3),(11,'Coca-cola','4,50','2024-02-15',2),(12,'Coca-cola','4,50','2024-02-15',1),(13,'Guaraná','4,00','2024-02-25',4),(14,'Coca-cola','4,50','2024-02-25',1),(15,'Coca-cola','4,50','2024-02-25',3),(16,'Suco de Laranja','4,00','2024-02-25',2),(17,'Guaraná','4,50','2024-02-25',9),(18,'Coca-cola','4,50','2024-02-25',8),(19,'Coca-cola','4,50','2024-03-01',1),(20,'Coca-cola','4,50','2024-03-01',4),(21,'Guaraná','4,50','2024-03-01',2),(22,'Suco de Laranja','5,00','2024-03-01',9),(23,'Fanta Laranja','4,50','2024-03-05',3),(24,'Fanta Laranja','4,50','2024-03-05',9),(25,'Suco de Laranja','5,00','2024-03-05',2),(26,'Coca-cola','4,50','2024-03-05',1),(27,'Coca-cola','4,50','2024-03-08',1),(28,'Suco de Laranja','5,00','2024-03-08',2),(29,'Fanta Laranja','4,50','2024-03-08',5),(30,'Coca-cola','4,50','2024-03-08',3),(31,'Suco de Laranja','5,00','2024-03-08',4),(32,'Coca-cola','4,50','2024-03-08',9),(33,'Coca-cola','4,50','2024-03-08',1),(34,'Guaraná','4,50','2024-03-15',3),(35,'Fanta Laranja','4,50','2024-03-15',9),(36,'Fanta Laranja','4,50','2024-03-15',8),(37,'Sudo de Laranja','5,00','2024-03-15',4),(38,'Coca-cola','4,50','2024-03-15',1),(39,'Fanta Laranja','4,50','2024-03-15',3),(40,'Suco de Laranja','4,50','2024-03-15',2),(41,'Coca-cola','4,50','2024-03-21',1),(42,'Coca-cola','4,50','2024-03-21',4),(43,'Fanta Laranja','4,50','2024-03-21',5),(44,'Coca-cola','4,50','2024-03-21',9),(45,'Coca-cola','4,50','2024-03-21',3),(46,'Coca-cola','4,50','2024-03-21',8),(47,'Coca-cola','4,50','2024-03-21',1),(48,'Coca-cola','4,50','2024-03-21',7),(49,'Fanta Laranja','4,50','2024-03-25',3),(50,'Coca-cola','4,50','2024-03-25',1),(51,'Coca-cola','4,50','2024-03-25',9),(52,'Coca-cola','4,50','2024-03-27',1),(53,'Coca-cola','4,50','2024-03-27',9),(54,'Suco de Laranja','5,00','2024-04-01',4),(55,'Suco de Laranja','5,00','2024-04-01',9),(56,'Coca-cola','4,50','2024-04-01',1),(57,'Coca-cola','4,50','2024-04-05',1),(58,'Coca-cola','4,50','2024-04-05',2),(59,'Coca-cola','4,50','2024-04-05',9),(60,'Coca-cola','4,50','2024-04-10',1),(61,'Fanta Laranja','4,50','2024-04-10',9),(62,'Suco de Laranja','5,00','2024-04-10',10),(63,'Suco de Laranja','5,00','2024-04-10',7),(64,'Suco de Laranja','5,00','2024-04-10',3),(65,'Suco de Laranja','5,00','2024-04-10',2),(66,'Suco de Laranja','5,00','2024-04-10',8),(67,'Sudo de Laranja','5,00','2024-04-10',4),(68,'Coca-cola','4,50','2024-04-15',1),(69,'Coca-cola','4,50','2024-04-15',2),(70,'Coca-cola','4,50','2024-04-15',9),(71,'Coca-cola','4,50','2024-04-21',1),(72,'Coca-cola','4,50','2024-04-21',9),(73,'Coca-cola','4,50','2024-04-21',3),(74,'Fanta Laranja','4,50','2024-04-21',8),(75,'Guaraná','4,50','2024-04-21',10),(76,'Suco de Laranja','4,50','2024-04-21',10),(77,'Suco de Laranja','4,50','2024-04-21',4),(78,'Coca-cola','4,50','2024-04-21',2),(79,'Coca-cola','4,50','2024-04-25',1),(80,'Coca-cola','4,50','2024-04-25',3),(81,'Fanta Laranja','4,50','2024-04-25',9),(82,'Guaraná','4,00','2024-04-25',10),(83,'Coca-cola','4,50','2024-04-29',2),(84,'Coca-cola','4,50','2024-04-29',4),(85,'Coca-cola','4,50','2024-04-29',5),(86,'Coca-cola','4,50','2024-04-29',9),(87,'Suco de Laranja','5,00','2024-04-29',10),(88,'Coca-cola','4,50','2024-04-29',3);
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-02 13:58:34
