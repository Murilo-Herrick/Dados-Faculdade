// @ts-nocheck
document
  .getElementById('clientForm')
  .addEventListener('submit', function (event) {
    event.preventDefault(); // impede o recarregamento da pagina ao enviar o formulario

    // espera o registro salvar no banco
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const phone = document.getElementById('phone').value;

    // cria um objeto contendo os dados do cliente
    const clientData = {
      name: name,
      email: email,
      phone: phone,
    };

    fetch('/add_client', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(clientData), // converte os dados do clinete para JSON e os envia para o corpo da requisição
    })
      .then((response) => response.json())
      .then((data) => {
        // Exibe uma mensagem de sucesso e reseta o formulario
        document.getElementById('message').innerHTML =
          'Cliente cadastrado com sucesso!';
        document.getElementById('clientForm').reset();
      })
      .catch((error) => {
        // Exibe mensagem de erro caso a requisicao falhe
        document.getElementById('message').innerHTML =
          'Erro ao cadastrar cliente!';
      });
  });
