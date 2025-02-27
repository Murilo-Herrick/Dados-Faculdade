CREATE DEFINER=`root`@`localhost` PROCEDURE `lista_professor`()
BEGIN
	SELECT nome,pais,estado,cidade,rua,numero,cep,telefone,celular,
    cargo, departamento, salario, nacionalidade
    FROM colaboradores WHERE Cargo="Professor";
END