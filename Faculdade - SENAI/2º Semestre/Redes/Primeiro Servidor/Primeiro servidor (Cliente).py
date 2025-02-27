import socket #biblioteca
import time #biblioteca
HOST = '127.0.0.1' #endereço do servidor
PORT = 5000 #porta que o servidor está utilizando
tcp = socket.socket(socket.AF_INET, socket.SOCK_STREAM)#intan. TCP familia IPv4
dest = (HOST, PORT)
tcp.connect(dest)#conexão via tcp

while True:
    msg=input('Entre com o valor do contador: ') #mensagem que será enviada
    tcp.send(msg.encode('utf-8')) #enviando a mensagem
    time.sleep(1)#tempo para o envia da mensagem
