let isSending = false; // Flag para controlar se está enviando mensagens
let currentDirection = null; // Direção atual do movimento
let intervalId; // ID do intervalo para envio contínuo

// Funções de movimentação
document.getElementById('move-up').addEventListener('mousedown', function() {
    handleMovement('1');
});

document.getElementById('move-left').addEventListener('mousedown', function() {
    handleMovement('3');
});

document.getElementById('move-right').addEventListener('mousedown', function() {
    handleMovement('4');
});

document.getElementById('move-down').addEventListener('mousedown', function() {
    handleMovement('2');
});

// Para o movimento ao soltar o botão ou sair do botão
document.querySelectorAll('.control-btn').forEach(button => {
    button.addEventListener('mouseup', stopMovement);
    button.addEventListener('mouseleave', stopMovement);
});

function handleMovement(direction) {
    if (currentDirection !== direction) {
        currentDirection = direction;
        updateStatus(`Movendo para ${direction}`);
        sendMovementData(direction); // Envia imediatamente a mensagem ao pressionar
        isSending = true;

        // Inicia um intervalo para enviar mensagens continuamente
        intervalId = setInterval(() => {
            if (isSending) {
                sendMovementData(direction);
            }
        }, 200); // Envia dados a cada 100ms
    }
}

function stopMovement() {
    currentDirection = null;
    isSending = false; // Para o envio contínuo
    clearInterval(intervalId); // Para o intervalo

    // Envia a mensagem de parada ao soltar
    sendMovementData("0");
    updateStatus('Parado'); // Atualiza o status
}

function updateStatus(message) {
    document.getElementById('machine-status').innerHTML = message;
}

function sendMovementData(direction) {
    const data = { movement: direction }; // Cria o objeto de dados

    // Faz a requisição para o Node-RED
    fetch('http://10.110.12.35:1880/mensagem', { // Atualize a URL para seu endpoint
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        return response.json();
    })
    .then(data => {
        console.log('Success:', data);
    })
    .catch(error => {
        console.error('Error:', error);
        updateStatus('Erro ao enviar mensagem!'); // Atualiza status em caso de erro
    });
}