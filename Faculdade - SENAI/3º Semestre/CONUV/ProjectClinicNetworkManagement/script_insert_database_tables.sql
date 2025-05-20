USE medical_clinic_db;

CREATE TABLE paciente (
	cpf VARCHAR(15) PRIMARY KEY,
    id_plano_saude INT,
    nome VARCHAR(60),
      FOREIGN KEY (id_plano_saude) REFERENCES plano_saude(id_plano_saude)
);

CREATE TABLE consulta (
	id_consulta INT AUTO_INCREMENT PRIMARY KEY,
    cpf_paciente VARCHAR(15),
    medico VARCHAR(60),
    tipo_de_consulta VARCHAR(30),
    preco FLOAT,
    data_consulta DATETIME DEFAULT NOW(),
    FOREIGN KEY (cpf_paciente) REFERENCES paciente(cpf)
);

CREATE TABLE prontuario (
	id_prontuario INT AUTO_INCREMENT PRIMARY KEY,
    id_consulta INT,
    descricao VARCHAR(150),
     FOREIGN KEY (id_consulta) REFERENCES consulta(id_consulta)
);

CREATE TABLE plano_saude (
	id_plano_saude INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR (3),
    plano BOOL
);

INSERT INTO plano_saude(nome, plano) VALUES 
('SIM', true),
('NÃO', false);


