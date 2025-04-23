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
    print('1- Contador de 0 á 20')
    print('2- Imprimir o nome da faculdade')
    print('3- tabuada do 7')
    print('4- Valores ímpares do intervalo 1 á 30')
    print('0- Encerrar conexão')
    msg=input('Escolha uma opção: ')#Mensagem que será enviada
    tcp.send(msg.encode('utf-8'))#Enviando a mensagem
    time.sleep(1)#Tempo para envio da mensagem
