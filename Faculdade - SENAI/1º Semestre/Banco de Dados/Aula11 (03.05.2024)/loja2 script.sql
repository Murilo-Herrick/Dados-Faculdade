-- Inserindo dados de Clientes
INSERT INTO cliente (nome, cpf, telefone) VALUES
('Murilo', '44124102412', '(16)999924143'),
('João', '19523652349', '(16)214535283'),
('Fernanda', '9203112403', '(16)019395112'),
('Gabriela', '009310301250', '(16)09012904'),
('Vinicius', '01930104932', '(16)012839152');

-- Inserindo dados de Produtos
INSERT INTO produto (produto, valor) VALUES
('Coca-cola', '4,50'),
('Suco de Laranja', '5,00'),
('Fanta Laranja', '4,50'),
('Guaraná', '4,00');

-- Inserindo dados de Venda
INSERT INTO venda (data_compra, qtd_compra, CLIENTE_id_cliente, PRODUTO_id_produto) VALUES
('2024-04-01', 1, 1, 1),
('2024-04-01', 2, 2, 4),
('2024-04-01', 3, 3, 2),
('2024-04-02', 1, 4, 3),
('2024-04-02', 3, 5, 1),
('2024-04-02', 3, 1, 4),
('2024-04-03', 1, 4, 2),
('2024-04-03', 2, 3, 1),
('2024-04-03', 1, 5, 3),
('2024-04-04', 2, 1, 2);


-- Exibindo os dados
SELECT * FROM cliente;
SELECT * FROM produto;
SELECT * FROM venda;

-- Chamando o Procedure que exibe o que o cliente comprou
CALL Cliente_Comprou('5',@saida);
