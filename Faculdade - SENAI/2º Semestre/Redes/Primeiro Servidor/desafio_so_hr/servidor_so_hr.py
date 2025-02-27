import platform
import socket #biblioteca
HOST = "10.110.12.35" #endereço do servidor
PORT = 5000 #porta que o servidor irá ficar ouvindo a rede
tcp = socket.socket(socket.AF_INET, socket.SOCK_STREAM)#Instan. TCP familia IPv4
orig = (HOST, PORT)
tcp.bind(orig)#Passagem do endereço e porta
tcp.listen(1)#Quantidade de conexões
while True: #Loop
    print('Aguardando conexão')#Mensagem para orientação
    con, cliente = tcp.accept()#Aguradando o aceite da conexão
    print('Conectado por:', cliente)#Mensagem de conexão
    while True: #Loop de recebimento de mensagens
        msg = con.recv(1024)#Variável onde será recebida a mensagem
        if not msg:#Verifica se há mensagens
            break #Se não houver mensagem sai do loop
        valor = str(msg)
        vit = int(valor[2])
        if vit == 1:
           print('Arquitetura: ', platform.architecture())
           print('Sistema Operacional: ', platform.system())
        if vit == 2:
           print('Processador: ', platform.processor())
           print('Tipo Máquina: ', platform.machine())
           print('Nome da rede do sistema: ', platform.node())
           print('Infomação da plataforma: ', platform.platform())
        if vit == 0:
            #print(cliente, msg) #impressão da mensagem recebida
            print('Finalizando conexão do cliente', cliente)#Mensagem de orientação
            con.close()#Finalização da conexão
