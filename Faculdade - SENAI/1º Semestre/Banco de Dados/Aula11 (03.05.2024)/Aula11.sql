SELECT c.nome, v.produto FROM cliente AS c INNER JOIN venda AS v ON c.id_cliente = v.CLIENTE_id_cliente;

-- EXEMPLOS DA AULA 11: 

SELECT c.nome, v.produto, v.data_compra FROM cliente AS c 
INNER JOIN venda AS v ON  c.id_cliente = v.CLIENTE_id_cliente
WHERE v.data_compra = '2024-03-05';

SELECT c.nome, v.produto, v.data_compra FROM cliente AS c 
INNER JOIN venda AS v ON  c.id_cliente = v.CLIENTE_id_cliente
WHERE v.data_compra = '2024-03-05' ORDER BY c.nome asc;

SELECT c.nome, v.produto, v.data_compra FROM cliente AS c 
INNER JOIN venda AS v ON  c.id_cliente = v.CLIENTE_id_cliente
WHERE c.nome = 'Ana Moser';

SELECT c.nome, v.produto, v.data_compra FROM cliente AS c 
INNER JOIN venda AS v ON  c.id_cliente = v.CLIENTE_id_cliente
WHERE c.nome = 'Ana Moser' AND v.data_compra = '2024-04-05';



-- METODO BETWEEN 
SELECT c.nome, v.produto, v.data_compra FROM cliente AS c 
INNER JOIN venda AS v ON  c.id_cliente = v.CLIENTE_id_cliente
WHERE c.nome = 'Ana Moser' AND v.data_compra
BETWEEN '2024-04-01' AND '2024-04-30';

SELECT c.nome, v.produto, v.data_compra, v.valor FROM cliente AS c 
INNER JOIN venda AS v ON  c.id_cliente = v.CLIENTE_id_cliente
WHERE c.nome = 'Ana Moser' AND v.data_compra
BETWEEN '2024-04-01' AND '2024-04-30';

SELECT c.nome, v.produto, v.data_compra FROM cliente AS c 
INNER JOIN venda AS v ON  c.id_cliente = v.CLIENTE_id_cliente
WHERE c.nome = 'Sheilla Castro';



-- SOMAR DADOS & CONTAR DADOS

SELECT COUNT(c.nome) AS 'Total de Compras em Abril'
FROM cliente AS c
INNER JOIN venda AS v ON c.id_cliente = v.CLIENTE_id_cliente
WHERE c.nome = 'Ana Moser' AND v.data_compra
BETWEEN '2024-04-01' AND '2024-04-30';

SELECT SUM(v.valor) AS 'Valor gasto em Abril'
FROM cliente AS c
INNER JOIN venda AS v ON c.id_cliente = v.CLIENTE_id_cliente
WHERE c.nome = 'Ana Moser' AND v.data_compra
BETWEEN '2024-04-01' AND '2024-04-30';

SELECT c.nome, COUNT(c.nome) AS 'Compras em Abril', SUM(v.valor) AS 'Valor Gasto'
FROM cliente AS c
INNER JOIN venda AS v ON c.id_cliente = v.CLIENTE_id_cliente
WHERE c.nome = 'Ana Moser' AND v.data_compra
BETWEEN '2024-04-01' AND '2024-04-30';

SELECT COUNT(v.produto) AS 'Qtd de Coca-cola vendidas em Abril'
FROM cliente AS c
INNER JOIN venda AS v ON c.id_cliente = v.CLIENTE_id_cliente
WHERE v.produto = 'Coca-cola' AND v.data_compra
BETWEEN '2024-04-01' AND '2024-04-30';



-- CHAMAR PROCEDURE
CALL Mostra_Cliente_Compra('Waldir Peres', @saida);

-- 1: Listar todas as compras realizadas pelos clientes em uma determinada data
CALL Mostra_Cliente_Data_De_Compra('2024-04-29', @saida);

-- 2: Listar todas as compras realizadas por um cliente específico em uma determinada data
CALL Mostra_Cliente_Compra_E_Data('Ana Silva', '2024-04-30', @saida);

-- 3: Mostrar o valor gasto por um cliente em um determinado período
