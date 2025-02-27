-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: escola
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
-- Table structure for table `colaboradores`
--

DROP TABLE IF EXISTS `colaboradores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `colaboradores` (
  `id_colaborador` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(40) NOT NULL,
  `data_nascimento` date DEFAULT NULL,
  `data_admissao` date DEFAULT NULL,
  `pais` varchar(40) DEFAULT NULL,
  `estado` char(2) DEFAULT NULL,
  `cidade` varchar(40) DEFAULT NULL,
  `rua` varchar(40) DEFAULT NULL,
  `numero` int DEFAULT NULL,
  `cep` varchar(20) DEFAULT NULL,
  `telefone_fixo` varchar(45) DEFAULT NULL,
  `telefone_celular` varchar(45) DEFAULT NULL,
  `cargo` varchar(30) DEFAULT NULL,
  `departamento` varchar(45) DEFAULT NULL,
  `salario` float DEFAULT NULL,
  `nacionalidade` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_colaborador`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `colaboradores`
--

LOCK TABLES `colaboradores` WRITE;
/*!40000 ALTER TABLE `colaboradores` DISABLE KEYS */;
INSERT INTO `colaboradores` VALUES (1,'Antonio Adolpho Lobbe','1970-10-08','1998-10-18','Brasil','SP','São Carlos','Candido Padin',25,'13560','(16)33700000','(16)981000000','Professor','Tecnologia da Informação',1000,NULL),(2,'José Augusto Pronto','1975-11-06','2001-10-01','Brasil','SP','São Carlos','Rocha Lisa',785,'13560','(16)33711111','(16)9981008888','Professor','Tecnologia da Informação',3000,NULL),(4,'Ana Solange Caixinhas','2000-11-07','2001-08-21','Brasil','SP','Araras','Rua Atanásio',2014,'13130','(16)3333070707','(16)999781010','Assistente Adiministrativo','Secretaria',1200,NULL),(5,'Asdrubal Soltinho','1965-01-01','2197-02-08','Brasil','SP','Catanduva','Rua Gervásio',17,'112007','(19)22220000','(19)981810101','Almoxarife','Administração',1800,NULL),(6,'Anita Tavare','1980-08-15','2015-12-01','Brasil','SP','Catanduva','Rua Julio Mesquita',300,'11568','(19)22210202','(19)98920101','Assistente Administrativo','Secertaria',1200,NULL),(7,'Ronaldo Nazario','1975-01-25','2017-02-14','Brasil','SP','São Carlos','Rua Episcopal',3100,'13560','(16)233733333','(16)981919999','Professor','Mecatrônica',3000,NULL),(8,'Romario Rubro','1969-06-10','2018-10-18','Brasil','SP','Ibaté','Rua Zamer',32,'13565','(16)33635555','(16)96510101','Professor','Tecnologia da Informação',3000,NULL),(9,'Raymond Reddington','1960-11-02','2005-04-25','Estados Unidos','NY','Nova York',NULL,NULL,NULL,'(646)66299988','(646)92125555','Professor','Tecnologia da Informação',3000,NULL),(10,'Juvenal Rosalino','1971-10-11','2000-01-12','Brasil','SP','São Carlos','Rua Julio Mesquita',3600,'113563','(19)33636363','(19)9878785','Administrativo','Secertaria',5000,NULL),(11,'Amintas José Mattos','1978-12-05','2024-03-28','Brasil','SP','Campinas','Aramribóia',1327,'14567','(19)21213434','(21)988887777','Professor','Mecatrônica',2700,'Brasileira'),(12,'Edson Arantes do Nascimento','1940-10-23','1999-01-02','Brasil','SP','Três Corações','Fifa',1283,'12354','(19)10101010','(19)1010101010','Professor','Tecnologia da Informação',3700,'Brasileira'),(13,'Aragorn Segundo Elessar','1975-03-01','2005-09-15','Eriador','GD','Gondor','Rua do Castelo',1,'11.111-111','(03)7611010','(03)97611010','Professor','Tecnoloia da Inforação',750,'Gondoniano'),(14,'Aragorn Segundo Elessar','1975-03-01','2005-09-15','Eriador','GD','Gondor','Rua do Castelo',1,'11.111-111','(03)7611010','(03)97611010','Professor','Tecnoloia da Inforação',750,'Gondoniano'),(15,'Gabriel Newern','1965-01-01','2000-01-01','Valinor','VL','Tirion','Rua do Bosque',100,'12.121-121','(02)12313232','912121212','Professor','Tecnologia da Informação',2750,'Valindoriana');
/*!40000 ALTER TABLE `colaboradores` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-05 22:39:32
