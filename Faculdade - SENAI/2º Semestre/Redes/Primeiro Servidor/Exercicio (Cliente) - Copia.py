import socket #biblioteca
import time #biblioteca
HOST = '127.0.0.1' #endereço do servidor
PORT = 5000 #porta que o servidor está utilizando
tcp = socket.socket(socket.AF_INET, socket.SOCK_STREAM)#intan. TCP familia IPv4
dest = (HOST, PORT)
tcp.connect(dest)#conexão via tcp
menu = True

while menu:
    print('\n    MENU')
    print('==========================================')
    print('0.Contador')
    print('1.Nome da Faculdade')
    print('2.Tabuada do 7')
    print('3.Valores impares do intervalo de 1 á 30')
    msg=input('Digite qual opção deseja: ') #mensagem que será enviada
    tcp.send(msg.encode('utf-8')) #enviando a mensagem
    time.sleep(1)#tempo para o envia da mensagem
