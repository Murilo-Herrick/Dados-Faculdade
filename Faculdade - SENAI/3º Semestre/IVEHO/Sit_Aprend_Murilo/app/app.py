# Importa as bibliotecas necessárias
from flask import Flask, jsonify, render_template
from flask_cors import CORS
import random
import mysql.connector
import requests
import threading
import time

# Cria a aplicação Flask
app = Flask(__name__)

# Habilita CORS para permitir que o front-end (JavaScript) faça requisições ao servidor Flask
CORS(app)

# Função que faz a conexão com o banco de dados
db_config = {
    'host': 'db',
    'user': 'root',
    'password': 'password',
    'database': 'sitAprend'
}

# Função para simular os dados dos sensores
def get_sensor_data():
    data = {
       "temperatura": round(random.randint(20, 80), 2),  # Temperatura entre 20°C e 80°C
       "umidade": round(random.randint(30, 90), 2),      # Umidade entre 30% e 90%
       "presenca": round(random.randint(0, 1), 2),       # Tensão entre 0 V e 220 V
       "tensao": round(random.randint(0, 220), 2),    
    }

    # Conecta ao banco de dados
    conn = mysql.connector.connect(**db_config)
    cursor = conn.cursor()
    
    cursor.execute(" CREATE TABLE IF NOT EXISTS dados (id INT AUTO_INCREMENT PRIMARY KEY, temperatura INT NOT NULL, umidade INT NOT NULL, presenca INT NOT NULL, tensao INT NOT NULL) ")
    conn.commit()
    
    # Comando SQL para inserir os dados no banco
    cursor.execute("INSERT INTO dados (temperatura, umidade, presenca, tensao) VALUES (%s, %s, %s, %s)",
                   (data['temperatura'], data['umidade'], data['presenca'], data['tensao']))

    # Commit para salvar as alterações
    conn.commit()
    conn.close()

    return data

# Função para enviar os dados para o ThingSpeak
def submit_data_thing_speak():
    API_KEY = "RJUMMERR3XSM0GTF"  # Substitua pela sua chave de API do ThingSpeak
    while True:
        # Obtém os dados do sensor
        data = get_sensor_data()

        # Dados para enviar ao ThingSpeak
        id1 = data['temperatura']
        id2 = data['umidade']
        id3 = data['presenca']
        id4 = data['tensao']

        # URL de atualização do ThingSpeak
        url = f'https://api.thingspeak.com/update?api_key={API_KEY}&field1={id1}&field2={id2}&field3={id3}&field4={id4}'

        # Envia os dados usando uma requisição GET
        resposta = requests.get(url)

        # Exibe a resposta (opcional para depuração)
        print(f"Resposta: {resposta.text}, Status code: {resposta.status_code}")

        # Espera 15 segundos antes de enviar novamente
        time.sleep(15)

# Cria e inicia o thread que envia dados para o ThingSpeak
def start_thread():
    thread = threading.Thread(target=submit_data_thing_speak)
    thread.daemon = True  # Torna o thread "daemon", para que ele pare quando o programa principal terminar
    thread.start()

# Rota principal (página inicial)
@app.route('/')
def index():
    return render_template('index.html')

# Rota de sensores (retorna dados simulados em formato JSON)
@app.route('/sensores', methods=['GET'])
def sensores():
    return jsonify(get_sensor_data())

# Executa o servidor Flask e começa o envio contínuo para o ThingSpeak
if __name__ == '__main__':
    # Inicia o thread para envio contínuo de dados para o ThingSpeak
    start_thread()
    # Inicia o servidor Flask
    app.run(host='0.0.0.0', port=5000, debug=True)
