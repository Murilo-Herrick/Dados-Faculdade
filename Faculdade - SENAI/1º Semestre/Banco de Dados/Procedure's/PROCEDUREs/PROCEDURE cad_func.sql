CREATE DEFINER=`root`@`localhost` PROCEDURE `cadastro_func`()
BEGIN
	DECLARE nome_colab VARCHAR(40) DEFAULT "Aragorn Segundo Elessar";
    DECLARE data_nascimento_colab DATE DEFAULT 19750301;
	DECLARE data_admissao_colab DATE DEFAULT 20050915;
    DECLARE pais_colab VARCHAR(40) DEFAULT "Eriador";
    DECLARE estado_colab VARCHAR(2) DEFAULT "GD";
    DECLARE cidade_colab VARCHAR(40) DEFAULT "Gondor";
    DECLARE rua_colab VARCHAR(40) DEFAULT "Rua do Castelo";
    DECLARE numero_colab INT DEFAULT 1;
    DECLARE cep_colab VARCHAR(20) DEFAULT "11.111-111";
    DECLARE telefone_fixo_colab VARCHAR(45) DEFAULT "(03)7611010";
    DECLARE telefone_celular_colab VARCHAR(45) DEFAULT "(03)97611010";
	DECLARE cargo_colab VARCHAR(30) DEFAULT "Professor";
    DECLARE departamento_colab VARCHAR(45) DEFAULT "Tecnoloia da Inforação";
    DECLARE salario_colab FLOAT DEFAULT 750.00;
    DECLARE nacionalidade_colab VARCHAR(20) DEFAULT "Gondoniano";
	DECLARE saida VARCHAR(80);
    DECLARE saida_rotulo VARCHAR(80);
    
    
    INSERT INTO colaboradores(nome, data_nascimento, data_admissao, pais, estado, cidade, rua, numero, cep 
    ,telefone_fixo, telefone_celular, cargo, departamento, salario, nacionalidade)
    VALUES (nome_colab, data_nascimento_colab, data_admissao_colab, pais_colab, estado_colab, cidade_colab,
    rua_colab, numero_colab, cep_colab, telefone_fixo_colab, telefone_celular_colab, cargo_colab, departamento_colab,
    salario_colab, nacionalidade_colab);
    
    IF ROW_COUNT () = 0 THEN 
		SET saida_rotulo = "ERRO!";
        SET saida = "O usuario não foi cadastrado!";
	
    ELSE 
		SET saida_rotulo = "Tudo Certo!";
        SET saida = "Usuário cadastrado com sucesso!";
	END IF;
    SELECT saida_rotulo, saida;
END