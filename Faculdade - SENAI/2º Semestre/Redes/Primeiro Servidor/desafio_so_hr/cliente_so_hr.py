import socket #biblioteca
import time #biblioteca
HOST = "10.110.12.35" #endereço do servidor
PORT = 5000 #porta qu eo servidor está utilizando
tcp = socket.socket(socket.AF_INET, socket.SOCK_STREAM)#Instan. TCP familia IPv4
dest = (HOST, PORT)
tcp.connect(dest)#conexão via tcp
menu = False
while menu == False:
    print('MENU')
    print('1- Especificações do SO')
    print('2- Especificações do Hardware')
    print('0- Encerrar conexão')
    msg=input('Escolha uma opção: ')#Mensagem que será enviada
    tcp.send(msg.encode('utf-8'))#Enviando a mensagem
    time.sleep(1)#Tempo para envio da mensagem
