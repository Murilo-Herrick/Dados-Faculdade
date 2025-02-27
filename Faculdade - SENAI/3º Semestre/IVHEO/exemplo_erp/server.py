from flask import Flask, render_template, request, jsonify
import mysql.connector
from flask_cors import CORS

app = Flask(__name__, static_folder="static", template_folder="template")

CORS(app)

def init_db():
    conn = mysql.connector.connect(
        host="localhost",
        user="root",
        password="123456",
        database="clientes"
    ) 

    cursor = conn.cursor() # Cria o cursor para executar comando sql

    cursor.execute("CREATE TABLE IF NOT EXISTS clientes( id INT AUTO_INCREMENT PRIMARY KEY, nome VARCHAR (255) NOT NULL, email VARCHAR(255) NOT NULL, telefone VARCHAR(20) NOT NULL)")

    conn.commit()
    conn.close()

@app.route("/")
def index():
    return render_template('index.html')


@app.route('/add_client', methods=['POST']) # define o metodo das requisicoes para POST
def add_client():
    data = request.get_json()
    nome = data['name']
    email = data['email']
    telefone = data['phone']

    conn = mysql.connector.connect(
            host="localhost",
            user="root",
            password="123456",
            database="clientes"
        ) 

    cursor = conn.cursor()

    cursor.execute("INSERT INTO clientes (nome, email, telefone) VALUES (%S, %S, %S)", (nome, email, telefone))

    conn.commit()
    conn.close()

    return jsonify({'message':'Cliente cadastrado com sucesso!'}), 200

if __name__ == '__main__':
    init_db() #Cria a tabela no bacno se nao existir
    app.run(debug=True) # Habilita o debug