// Aguar o carregamento completo da pagina antes de rodar o js
document.addEventListener('DOMContentLoaded', function () {
    // Seleciona o formulario
    const form = document.getElementById('cadastroForm');

    // Adiciona um listen para o evento submit
    form.addEventListener('submit', function (event) {
        event.preventDefault(); // Impede o recarregamento da pagina

        // Obtem dados do formulario
        const formData = new FormData(form);

        // Envia os dados para o endpoint /cadastrar
        fetch('/cadastrar', {
            method: 'POST',
            body: JSON.stringify(Object.fromEntries(formData)),
            headers: {
                'Content-Type': 'application/json'
            }
        })
        .then(response => response.json())
        .then(data => {
            alert(data.message); // Exibe a mensagem de erro ou sucesso
            if (data.message === "Cadastro realizado com sucesso!"){
                form.reset(); // Limpas os campos do formulario
            }
            })
            .catch(error => {
                console.error('Erro:', error);
        });
    });
}) ;

