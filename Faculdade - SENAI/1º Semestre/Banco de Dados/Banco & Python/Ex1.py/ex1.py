import mysql.connector

conexao = mysql.connector.connect(
    host = "localhost", 
    user = "root",
    password = "aluno",
    database = "clientes"
)

cursor = conexao.cursor()

#CRUD

#INSERT
comando = f'INSERT INTO cliente(nome,idade,profissao,data_admissao) VALUES ("Paulo",33,"Professor","20020812")'
cursor.execute(comando)
conexao.commit()#Edita Banco de Dados

#READ
comando = f'SELECT * FROM cliente'
cursor.execute(comando)
resultado = cursor.fetchall()#Ler banco de dados
print(resultado)


cursor.close()
conexao.close()