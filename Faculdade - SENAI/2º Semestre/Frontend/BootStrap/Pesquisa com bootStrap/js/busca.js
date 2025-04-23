// Função para atualizar a data e a hora no dropdown da navbar
function atualizaDataHora() {
    // Cria um novo objeto Date para obter a data e hora atuais
    const now = new Date();
    // Define as opções para formatar a data e hora em portugues 
    const options = {
        weekday:'long',
        year:'numeric',
        month:'long',
        day:'numeric',
        hour:'2-digit',
        minute:'2-digit',
        second:'2-digit'
    };
    // Atualiza o conteudo do elemento com o ID 'dateTime' com a data e hora e formatadas
    document.getElementById('datetime').textContent = now.toLocaleDateString('pt-BR', options);
}
// Atualiza a data e hora a cada segundo
setInterval(atualizaDataHora, 1000);
// Atualiza a data e hora imediatamente ao carregar a pagina 
atualizaDataHora();

//Dados de exemplo de contatos
const contatos = [
    { name: 'João Silva', email: 'joao.silva@example.com', phone: '(11) 1234-5678' },
    { name: 'Maria Oliveira', email: 'maria.oliveira@example.com', phone: '(21) 9876-5432' },
    { name: 'Pedro Santos', email: 'pedro.santos@example.com', phone: '(31) 4567-8910' },
    { name: 'Pedro Silva', email: 'pedro.silva@example.com', phone: '(31) 4567-8910' },
    { name: 'Pedro José', email: 'pedro.jose@example.com', phone: '(31) 5314-9623' },
    { name: 'João Roberto', email: 'joao.roberto@example.com', phone: '(31) 3960-1025' }
];

// Função para exibir os contatos na tabela 
function displayContatos (filteredContacts){
    // Seleciona o corpo da tabela onde os contatos serão exibidos 
    const tableBody = document.querySelector('#contactTable tbody');
    // Limpa o corpo da tabela antes de adicionar novos resultados
    tableBody.innerHTML = '' ;

    // verifica se há contatos filtrados 
    if(filteredContacts.length > 0) {
        // Adiciona uma linha para cada contato filtrado 
        filteredContacts.forEach(contact => {
            const row = document.createElement('tr');
            row.innerHTML = `
            <td>${contact.name}</td>
            <td>${contact.email}</td>
            <td>${contact.phone}</td>
            `;
            tableBody.appendChild(row);
        });
    } else {
        // Adiciona uma linha indicando que nenhum contato foi encontrado   
        const row = document.createElement('tr');
        row.innerHTML = '<td colspan="3">Nenhum contato encontrado</td>';
        tableBody.appendChild(row);
    }
}

// Função para pesquisar contatos com base no texto digitado 
function procuraContatos() {
    // Obtem o valor do campo de pesquisa e converte para minusculas 
    const query = document.getElementById('search').value.toLowerCase();
    // filtra a lista de contatos para incluir apenas aqueles que correspondem á pesquisa
    const filteredContacts = contatos.filter(contact =>
        contact.name.toLowerCase().includes(query) ||
        contact.email.toLowerCase().includes(query) ||
        contact.phone.toLowerCase().includes(query)
    );
    // Exibe os contatos filtrados na tabela
    displayContatos (filteredContacts);
}

// Adiciona um envento de clique ao botao de pesquisa
document.getElementById('searchButton').addEventListener('click', procuraContatos);

// Adiciona um evento de clique no botão de limpar 
document.getElementById('clearButton').addEventListener('click', function() {
    // Limpa o campo de pesquisa
    document.getElementById('search').value= '';
    // Limpa a tabela de contatos
    displayContatos([]);
});


