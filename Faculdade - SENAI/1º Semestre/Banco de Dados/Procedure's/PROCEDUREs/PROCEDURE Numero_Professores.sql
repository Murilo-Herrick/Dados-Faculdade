CREATE DEFINER=`root`@`localhost` PROCEDURE `conta_professor`()
BEGIN
	DECLARE cont INT;
    SELECT COUNT(*) INTO cont FROM colaboradores WHERE cargo = "Professor";
    IF cont > 0 THEN
		SELECT cont;
	ELSE
		SELECT "Nenhum funcionário cargo Professor";
	END IF;
END