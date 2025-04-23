-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: innerjoin
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `associacao_realiza`
--

DROP TABLE IF EXISTS `associacao_realiza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `associacao_realiza` (
  `id_realiza` int NOT NULL AUTO_INCREMENT,
  `CURSO_id_curso` int NOT NULL,
  `ALUNO_id_aluno` int NOT NULL,
  `data_inicio` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_realiza`,`CURSO_id_curso`,`ALUNO_id_aluno`),
  KEY `fk_associacao REALIZA_ALUNO_idx` (`ALUNO_id_aluno`),
  KEY `fk_associacao REALIZA_CURSO1_idx` (`CURSO_id_curso`),
  CONSTRAINT `fk_associacao REALIZA_ALUNO` FOREIGN KEY (`ALUNO_id_aluno`) REFERENCES `aluno` (`id_aluno`),
  CONSTRAINT `fk_associacao REALIZA_CURSO1` FOREIGN KEY (`CURSO_id_curso`) REFERENCES `curso` (`id_curso`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `associacao_realiza`
--

LOCK TABLES `associacao_realiza` WRITE;
/*!40000 ALTER TABLE `associacao_realiza` DISABLE KEYS */;
INSERT INTO `associacao_realiza` VALUES (1,1,1,'2024-04-16'),(2,2,2,'2024-04-16'),(3,3,1,'2024-04-16'),(4,4,1,'2024-04-16'),(5,2,1,'2024-04-16'),(6,4,3,'2024-04-16'),(7,1,3,'2024-04-16');
/*!40000 ALTER TABLE `associacao_realiza` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-19 22:50:27
