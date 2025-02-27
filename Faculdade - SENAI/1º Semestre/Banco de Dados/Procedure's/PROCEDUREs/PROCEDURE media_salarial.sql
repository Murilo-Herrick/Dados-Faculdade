CREATE DEFINER=`root`@`localhost` PROCEDURE `media_salario_profs`()
BEGIN
	select avg(salario) as media_salarial_Professores
    from colaboradores WHERE cargo="Professor";
END