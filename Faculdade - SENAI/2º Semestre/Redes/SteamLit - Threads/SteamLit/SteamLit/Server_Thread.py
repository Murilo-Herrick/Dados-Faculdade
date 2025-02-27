import threading  # Importa o módulo threading para trabalhar com múltiplas threads
import socket     # Importa o módulo socket para criar a comunicação de rede

# Define uma classe para encapsular o comportamento do servidor de chat
class ChatServer:
    def __init__(self, host='localhost', port=5000):
        # Inicializa a lista de clientes conectados
        self.clientes = []
        # Cria o socket do servidor usando IPv4 (AF_INET) e TCP (SOCK_STREAM)
        self.server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
        # Associa o servidor ao endereço e porta especificados
        self.server.bind((host, port))
        # Coloca o servidor em modo de escuta para aceitar conexões
        self.server.listen()
        print(f'Servidor iniciado em {host}:{port}')  # Exibe uma mensagem informando que o servidor está em execução

    # Método que inicia o loop principal para aceitar conexões de clientes
    def start(self):
        while True:
            # Aguarda e aceita uma nova conexão de cliente (bloqueia até que um cliente se conecte)
            client, addr = self.server.accept()
            # Adiciona o cliente conectado à lista de clientes
            self.clientes.append(client)
            # Exibe o endereço do cliente que acabou de se conectar
            print(f'Cliente conectado: {addr}')
            # Cria uma nova thread para tratar as mensagens recebidas desse cliente
            thread = threading.Thread(target=self.handle_client, args=(client,))
            thread.start()  # Inicia a thread para lidar com o cliente em paralelo

    # Método para tratar a comunicação com o cliente (receber mensagens e tratá-las)
    def handle_client(self, client):
        while True:
            try:
                # Tenta receber até 2048 bytes de dados enviados pelo cliente
                msg = client.recv(2048)
                if msg:  # Se houver uma mensagem recebida
                    # Envia a mensagem para todos os outros clientes
                    self.broadcast(msg, client)
                else:  # Se a mensagem estiver vazia, significa que o cliente se desconectou
                    self.remove_client(client)  # Remove o cliente da lista e encerra a conexão
                    break  # Sai do loop para parar o tratamento deste cliente
            except ConnectionResetError:  # Se houver um erro de conexão (ex.: cliente desconectado abruptamente)
                self.remove_client(client)  # Remove o cliente da lista
                break  # Sai do loop

    # Método que envia uma mensagem para todos os clientes conectados, exceto o remetente
    def broadcast(self, msg, sender_client):
        for client in self.clientes:  # Itera sobre a lista de clientes conectados
            if client != sender_client:  # Evita enviar a mensagem de volta para o remetente
                try:
                    client.send(msg)  # Envia a mensagem para o cliente
                except:  # Se houver erro ao enviar (ex.: cliente desconectado)
                    self.remove_client(client)  # Remove o cliente da lista

    # Método que remove um cliente da lista e encerra sua conexão
    def remove_client(self, client):
        if client in self.clientes:  # Verifica se o cliente está na lista
            self.clientes.remove(client)  # Remove o cliente da lista de clientes conectados
            client.close()  # Fecha a conexão do cliente
            print(f'Cliente desconectado: {client}')  # Exibe uma mensagem informando que o cliente foi desconectado

#Fim da classe ChatServer
# Código que inicia o servidor de chat
if __name__ == "__main__":
    chat_server = ChatServer()  # Cria uma instância da classe ChatServer
    chat_server.start()  # Inicia o servidor
