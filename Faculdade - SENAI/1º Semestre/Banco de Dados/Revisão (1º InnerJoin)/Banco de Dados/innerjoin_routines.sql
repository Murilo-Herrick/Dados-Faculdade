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
-- Dumping events for database 'innerjoin'
--

--
-- Dumping routines for database 'innerjoin'
--
/*!50003 DROP PROCEDURE IF EXISTS `cadastro_aluno` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `cadastro_aluno`(
nome_aluno VARCHAR(45),cpf_aluno VARCHAR(45), sexo_aluno VARCHAR(15),estado_aluno CHAR(2),
cidade_aluno VARCHAR(45), rua_aluno VARCHAR(45),numero_aluno INT,telefone_fixo_aluno VARCHAR(45),
telefone_celular_aluno VARCHAR(45), OUT saida VARCHAR(80),saida_rotulo VARCHAR(80)
)
BEGIN
	IF EXISTS(SELECT * FROM aluno WHERE nome = nome_aluno)THEN
    BEGIN
    SET saida_rotulo = "ERRO!!!";
    SET saida = "Este aluno já foi cadastrado!";
    END;
    ELSE
		INSERT INTO aluno(nome,cpf,sexo,estado,cidade,rua,numero,telefone_fixo,telefone_celular)
        VALUES(nome_aluno, cpf_aluno, sexo_aluno, estado_aluno, cidade_aluno, rua_aluno, numero_aluno,
        telefone_fixo_aluno, telefone_celular_aluno);
	IF ROW_COUNT() =  0 THEN
		SET saida_rotulo =  "ERRO!!";
        SET saida = "O aluno não foi cadastrado";
	ELSE
		SET saida_rotulo = "SUCESSO!!!";
        SET saida = "Aluno cadastrado com sucesso!";
	END IF;
END IF;
SELECT saida_rotulo,saida;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `cadastro_curso` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `cadastro_curso`(
nome_do_curso VARCHAR(45),aulas_curso VARCHAR(45), valor_curso VARCHAR(15),turno_curso VARCHAR(45),
OUT saida VARCHAR(80), OUT saida_rotulo VARCHAR(80)
)
BEGIN
	IF EXISTS(SELECT * FROM curso WHERE nome_curso = nome_do_curso)THEN 
    BEGIN
		SET saida_rotulo = "ERRO!!!";
        SET saida = "Este curso já foi cadastrado!";
	END;
    ELSE
		INSERT INTO curso(nome_curso,aulas,valor,turno)
        VALUES(nome_do_curso,aulas_curso,valor_curso,turno_curso);
	IF ROW_COUNT() = 0 THEN
		SET saida_rotulo = "ERRO!!";
        SET saida = "Curso não foi cadastrado!";
	ELSE
		SET saida_rotulo = "SUCESSO!!!";
        SET saida = "Curso cadastrado com sucesso!";
	END IF;
    END IF;
SELECT saida_rotulo,saida;
		
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `cadastro_matricula` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `cadastro_matricula`(
id_aluno INT, id_curso INT, data_inicio_curso VARCHAR(45),
OUT saida_rotulo VARCHAR(80), OUT saida VARCHAR(80)
)
BEGIN
	IF EXISTS(SELECT * FROM associacao_realiza WHERE CURSO_id_curso = id_curso AND ALUNO_id_aluno = id_aluno)THEN
		BEGIN
        SET saida_rotulo = "ERRO!!!";
        SET saida = "Este aluno já foi matriculado neste curso!";
	END;
    ELSE
		INSERT INTO associacao_realiza(ALUNO_id_aluno,CURSO_id_curso,data_inicio)
        VALUES(id_aluno,id_curso,data_inicio_curso);
	IF ROW_COUNT() = 0 THEN 
		SET saida_rotulo = "ERRO!!";
        SET saida = "Matricula não realizada!";
	ELSE
		SET saida_rotulo = "SUCESO!!!";
        SET saida = "Matricula realizada com sucesso!";
	END IF;
END IF;
SELECT saida_rotulo,saida;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-19 22:50:27
