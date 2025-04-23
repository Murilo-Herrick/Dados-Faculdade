import time
from flask import Flask, jsonify, request
from flask_cors import CORS 
import random
import mysql.connector 
import threading

app = Flask (__name__)

CORS(app)

leitura_ativa = False

def get_sensor_data():
    return {
        "temperatura":round(random.uniform(20, 80), 2),
        "umidade":round(random.uniform(30, 90), 2),
        "pressao":round(random.uniform(900, 1100), 2),
        "som":round(random.uniform(20, 140), 2),
        "vazao":round(random.uniform(200, 400), 2)
    }

@app.route('/sensores', methods=['GET'])
def sensores():
    return jsonify(get_sensor_data())


@app.route('/status', methods=['GET'])
def atualizar_status():
    global leitura_ativa
    acao = request.args.get("acao")

    print(f"Recebendo ação: {acao}")
    
    if acao == "iniciar":
        leitura_ativa = True
    elif acao == "pausar":
        leitura_ativa = False

    return jsonify({"leitura_ativa": leitura_ativa})

def inserirDados():
        global leitura_ativa
        while True:
            if leitura_ativa == True:
                try:
                    conexao = mysql.connector.connect(
                        host="localhost",      
                        user="root",      
                        password="1234",   
                        database="servidorFlask"  
                    )

                    cursor = conexao.cursor()

                    sensor_data = get_sensor_data()

                    temperatura = sensor_data["temperatura"]
                    umidade = sensor_data["umidade"]
                    pressao = sensor_data["pressao"]
                    som = sensor_data["som"]
                    vazao = sensor_data["vazao"]

                    query = "INSERT INTO dados (temperatura, umidade, pressao, som, vazao) VALUES (%s, %s, %s, %s, %s)"
                    valores = (temperatura, umidade, pressao, som, vazao)

                    cursor.execute(query, valores)
                    conexao.commit()
                    
                    print("Dados inseridos com sucesso!")

                    cursor.close()
                    conexao.close()
                    
                    # Determina em que intervalo de tempo seram inseridos os dados
                    time.sleep(3)
                    
                except Exception as e:
                    print("Erro na inserção: ", e)

# Thread para rodar em segundo plano para realizar a insercao de dados
thread = threading.Thread(target=inserirDados, daemon=True)
thread.start()

if __name__ == '__main__':
    app.run(debug=True)