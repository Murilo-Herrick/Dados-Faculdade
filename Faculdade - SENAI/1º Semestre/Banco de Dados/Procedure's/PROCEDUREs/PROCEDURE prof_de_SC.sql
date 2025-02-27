CREATE DEFINER=`root`@`localhost` PROCEDURE `prof_sc`()
BEGIN
	SELECT 	nome, telefone_celular, rua, cidade, estado, cep, pais, numero, cargo
    FROM colaboradores WHERE cargo ="Professor";
END