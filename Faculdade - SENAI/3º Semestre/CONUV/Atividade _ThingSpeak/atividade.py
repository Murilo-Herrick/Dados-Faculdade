import requests
import random
import time
import csv
import json

API_KEY = "ON4G1PKUV3S0XDKD"
URL = f"https://api.thingspeak.com/update?api_key={API_KEY}"
CURL = f"https://thingspeak.mathworks.com/channels/2844642/feeds.json?results=1"

inicio = time.time()

def enviar_dados(temp, umd, press, lum, nvl, est):
    url=  f'{URL}&field1={temp}&field2={umd}&field3={press}&field4={lum}&field5={nvl}&field6={est}'
    resposta = requests.get(url)
    print(f"\nResposta: {resposta.text}")

def gravar_csv():
    # Usa o get para pegar os dados do json
    response = requests.get(CURL)
    # Coloca os dados do json em uma variavel (dados) para poder puxar os dados atraves de palavaras-chaves
    dados = json.loads(response.content)
    # Busca no json o campo feeds
    feeds = dados['feeds']

    # Intera um for no campos feeds procurando os campos fileds
    with open ('dados.csv', 'a',newline='') as csvfile:
        # Cria o nome de cada campo do csv
        fieldnames = ['Entry_id', 'Temperatura', 'Umidade', 'Pressao', 'Luminosidade', 'Nivel', 'Estado']
        writer = csv.DictWriter(csvfile, fieldnames=fieldnames)
        
        # função para adicionaro nome de cada coluna, comentei para evitar que adicionace repretidamente
        # writer.writeheader()
        
        
        for x in feeds:
            row = {
                'Entry_id': x['entry_id'],
                'Temperatura': x['field1'],
                'Umidade': x['field2'],
                'Pressao': x['field3'],
                'Luminosidade': x['field4'],
                'Nivel': x['field5'],
                'Estado': x['field6']
            }
            writer.writerow(row)

def analisar_csv():
    with open('dados.csv', 'r', newline='') as csvfile:
        reader = csv.DictReader(csvfile)
        dados = {
                "Temperatura": [],
                "Umidade": [],
                "Pressao": [],
                "Luminosidade": [],
                "Nivel": []
            }
        
        for row in reader:
            for chave in dados.keys():
                 if row[chave]:  # Verifica se há valor na coluna
                     dados[chave].append(float(row[chave]))

            # Analisando os dados
        print("\n===== Análise dos Dados do CSV =====")
        for parametro, valores in dados.items():
            if valores:  # Verifica se há dados na coluna
                media = sum(valores) / len(valores)
                minimo = min(valores)
                maximo = max(valores)
                print(f"{parametro}: Média = {media:.2f}, Mínimo = {minimo}, Máximo = {maximo}")

def main():
    temp = random.randint(20, 35)
    umd = random.randint(40, 80)
    press = random.randint(1009, 1015)
    lum = random.randint(20, 100)
    nvl = random.randint(1, 5)
    est = random.randint(0, 1)
    enviar_dados(temp, umd, press, lum, nvl, est)

while True:
    agora = time.time()
    main()
    gravar_csv()
    analisar_csv()
    time.sleep(15)