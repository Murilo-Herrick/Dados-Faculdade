import sqlite3

# Função para criar o banco de dados e a tabela de feedbacks
def criar_banco():
    # Conecta ao banco de dados (ou cria um novo se não existir)
    conn = sqlite3.connect('feedback.db')
    
    # Cria um cursor para executar comandos SQL
    cursor = conn.cursor()

    # Cria a tabela de feedbacks
    cursor.execute('''
        CREATE TABLE IF NOT EXISTS feedbacks (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            quarto TEXT NOT NULL,
            texto TEXT NOT NULL,
            estrelas INTEGER NOT NULL
        )
    ''')

    # Salva as mudanças e fecha a conexão
    conn.commit()
    conn.close()
    print("Banco de dados e tabela criados com sucesso!")

if __name__ == '__main__':
    criar_banco()
