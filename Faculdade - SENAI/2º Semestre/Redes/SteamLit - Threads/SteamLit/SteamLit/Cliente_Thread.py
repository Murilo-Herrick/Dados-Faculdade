import socket  # Importa o módulo socket para permitir a comunicação em rede
import threading  # Importa o módulo threading para lidar com várias tarefas ao mesmo tempo
import streamlit as st
import pandas as pd

# Função que lida com o recebimento de mensagens do servidor
def receive_messages(client):
    while True:
        try:
            # Tenta receber uma mensagem do servidor (até 2048 bytes) e decodifica de 'utf-8'
            msg = client.recv(2048).decode('utf-8')
            st.warning(msg)  # Exibe a mensagem recebida no terminal
        except:  # Se houver um erro na conexão ou no recebimento de mensagens
            st.warning('Erro ao receber mensagem.', icon="⚠️")  # Informa que houve um erro
            client.close()  # Fecha a conexão com o servidor
            break  # Sai do loop ao detectar erro de conexão

# Função principal do cliente
def main():
    # Define o endereço e a porta do servidor ao qual o cliente tentará se conectar
    server_host = st.text_input('Digite o endereço ip do host') # Servidor local (pode ser o IP do servidor remoto)
    server_port = int(st.text_input('Digite a porta do host', value="0"))  # A porta do servidor para a qual o cliente deve se conectar
    
    # Cria um socket do cliente usando IPv4 (AF_INET) e TCP (SOCK_STREAM)
    client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    if st.button('Conectar'):
        try:
            # Tenta se conectar ao servidor na porta especificada
            client.connect((server_host, server_port))
            st.success(f'Conectado Com Sucesso!', icon='✅')
        except:  # Caso não consiga se conectar ao servidor
            st.warning(f'Não foi possível conectar ao servidor em {server_host}:{server_port}' , icon='⚠️')           
            return  # Encerra o programa se não for possível conectar

    # Cria e inicia uma thread para receber mensagens do servidor enquanto o cliente envia mensagens
    thread = threading.Thread(target=receive_messages, args=(client,))
    thread.start()  # Inicia a execução da thread de recebimento de mensagens

    # Loop infinito para enviar mensagens ao servidor
    while True:
        #msg = st.text_input('Digite:')
        msg = input('Digite')  # Aguarda o usuário digitar uma mensagem no terminal
        if msg.lower() == 'sair':  # Se o usuário digitar "sair", o cliente encerra a conexão
            client.close()  # Fecha a conexão com o servidor
            break  # Sai do loop para terminar o programa
        else:
            # Envia a mensagem digitada ao servidor, codificando-a em 'utf-8'
            client.send(msg.encode('utf-8'))

# Se o script estiver sendo executado diretamente (não importado como um módulo)
if __name__ == "__main__":
    main()  # Chama a função principal para iniciar o cliente
