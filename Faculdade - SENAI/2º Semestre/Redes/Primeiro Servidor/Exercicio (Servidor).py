import socket #biblioteca
HOST = '127.0.0.1' #endereço do servidor
PORT = 5000 #porta que o servidor irá ficar ouvindo a rede
tcp = socket.socket(socket.AF_INET, socket.SOCK_STREAM) #instan. TCP fmilia IPv4
orig = (HOST, PORT)
tcp.bind(orig) #passagem deo rendereço e porta
tcp.listen(1) #quantidade de conexões
while True: #Loop
    print('Aguardando conexão') #mensagem para orientação
    con , cliente = tcp.accept() #aguardando o aceite da conexão
    print('Conectado por:', cliente)#mensagem de conexçao
    while True: #loop de recebimento de mensagens
            msg = con.recv(1024)#variavel onde será recebida a mensagem
            if not msg: #verifica se há mensagem
                    break #se não houver mensagem sai do loop
            valor = str(msg)
            vit = int(valor[2])

            if vit == 0:
                contador = int(msg)
                for i in range contador
                
            print('Finalizando conexão do cliente', cliente)#mensagem de orientação
            con.close()#finalização da conexão
