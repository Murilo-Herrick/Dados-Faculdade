// Função para adicionar um feedback ao banco de dados
function adicionarFeedbackBanco(novoFeedback, estrelas, quartoNome) {
    return fetch('http://127.0.0.1:5000/adicionar_feedback', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            texto: novoFeedback,
            estrelas: estrelas,
            quarto: quartoNome
        })
    }).then(response => {
        if (!response.ok) {
            throw new Error('Erro ao adicionar feedback ao banco de dados');
        }
        return response.json();
    });
}

// Função para analisar o feedback
function analisarFeedback(novoFeedback) {
    return fetch('http://127.0.0.1:5000/analisar_feedback', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({ feedback: novoFeedback })
    }).then(response => {
        if (!response.ok) {
            throw new Error('Erro ao analisar feedback');
        }
        return response.json();
    });
}

// Função para adicionar um novo feedback e atualizar a interface
function adicionarNovoFeedback() {
    const quartoNome = document.getElementById("modalQuartoNome").innerText.toLowerCase();
    const novoFeedback = document.getElementById("novoFeedback").value.trim(); // Remove espaços em branco

    if (novoFeedback) {
        // Primeiro, analisa o feedback
        analisarFeedback(novoFeedback)
            .then(data => {
                // Após a análise, adiciona ao banco de dados
                return adicionarFeedbackBanco(novoFeedback, data.estrelas, quartoNome);
            })
            .then(() => {
                // Atualiza a interface com o feedback
                adicionarFeedback(quartoNome, novoFeedback, data.estrelas);
                atualizarEstrelas(quartoNome);
                document.getElementById("novoFeedback").value = ''; // Limpa o campo de feedback
            })
            .catch(error => console.error('Erro:', error));
    } else {
        alert('Por favor, insira um feedback válido.'); // Mensagem de alerta para feedback vazio
    }
}
