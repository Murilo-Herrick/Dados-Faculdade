import requests
import random

API_KEY = "98XKV99VL9YXLJOX"
URL = f"https://api.thingspeak.com/update?api_key={API_KEY}" #Write Channel

def enviar_dados (id1, id2):
    url = f'https://api.thingspeak.com/update?api_key={API_KEY}&field1={id1}&field2={id2}'
    resposta = requests.get(url)
    print(f"Resposta: {resposta.text}")

def main(): 
    temperatura = random.uniform(20, 30) #Simula temperatura entre 20 e 30°C
    umidade = random.uniform(50, 70) #Simula umidade entre 50 e 70%
    enviar_dados(temperatura, umidade)

main()