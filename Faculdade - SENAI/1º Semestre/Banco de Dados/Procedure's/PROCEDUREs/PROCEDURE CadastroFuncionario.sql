CREATE DEFINER=`root`@`localhost` PROCEDURE `cadastrofuncionario`(
nome_colab VARCHAR(40), data_nascimento_colab DATE,	data_admissao_colab DATE, pais_colab VARCHAR(40), 
estado_colab VARCHAR(2), cidade_colab VARCHAR(40), rua_colab VARCHAR(40), numero_colab INT, cep_colab VARCHAR(20),
telefone_fixo_colab VARCHAR(45), telefone_celular_colab VARCHAR(45), cargo_colab VARCHAR(30),
departamento_colab VARCHAR(45), salario_colab FLOAT, nacionalidade_colab VARCHAR(20),OUT saida VARCHAR(80),
saida_rotulo VARCHAR(80)
)
BEGIN
	IF EXISTS(SELECT * FROM colaboradores WHERE nome = nome_colab) THEN 
	BEGIN
		SET saida_rotulo = "OPS!!!";
		SET saida = "Este colaborador já está cadastrado!";
	END;
    ELSE 
        INSERT INTO colaboradores(nome, data_nascimento, data_admissao, pais, estado, cidade, rua, numero, cep 
		,telefone_fixo, telefone_celular, cargo, departamento, salario, nacionalidade)
		VALUES (nome_colab, data_nascimento_colab, data_admissao_colab, pais_colab, estado_colab, cidade_colab,
		rua_colab, numero_colab, cep_colab, telefone_fixo_colab, telefone_celular_colab, cargo_colab, departamento_colab,
		salario_colab, nacionalidade_colab);
        END IF;
        
        IF ROW_COUNT () = 0 THEN 
			SET saida_rotulo = "ERRO!";
			SET saida = "O usuario não foi cadastrado!";
	
		ELSE 
			SET saida_rotulo = "Tudo Certo!";
			SET saida = "Usuário cadastrado com sucesso!";
		END IF;
		SELECT saida_rotulo, saida;
END