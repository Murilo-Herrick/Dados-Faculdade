// @ts-nocheck
// Obtem o contexto do elemento onde <canvas> onde o grafico será desenhado
const ctx = document.getElementById('sensorChart').getContext('2d');

// Cria um grafico de linha usando a bibilioteca Chart.js
const chart = new Chart(ctx, {
  type: 'line', // Define o tipo do grafico como linha
  data: {
    labels: [], //Inicialmente não há rotulos no eixo X (será preenchidos com timestamps)
    datasets: [
      { label: 'Temperatura (°C)', data: [], borderColor: 'red', fill: false },
      { label: 'Umidade (%)', data: [], borderColor: 'blue', fill: false },
      { label: 'Pressão (hPa)', data: [], borderColor: 'green', fill: false },
      { label: 'Nivel sonoro (dB)', data: [], borderColor: 'yellow', fill: false },
      { label: 'Vazao (m3/h)', data: [], borderColor: 'purple', fill: false }
    ],
  },
  options: {
    responsive: true,
    scales: {
      x: { title: { display: true, text: 'Tempo' } },
    },
  },
});

const limites = {
  temperatura: 75,  
  umidade: 85,      
  pressao: 1080,    
  som: 130,         
  vazao: 390        
};

async function atualizarSensores() {
  try {
    // Faz uma requisição para o endpoint do Flask que fornece os dados de sensores
    const response = await fetch('http://127.0.0.1:5000/sensores');

    // Converte a resposta JSON para um objeto JavaScript
    const data = await response.json();

    // Atualiza os valores exibidos na pagina
    document.getElementById('temp').innerText = data.temperatura;
    document.getElementById('hum').innerText = data.umidade;
    document.getElementById('pres').innerText = data.pressao;
    document.getElementById('som').innerText = data.som;
    document.getElementById('vazao').innerText = data.vazao;

    verificarLimites(data);

    const now = new Date().toLocaleTimeString();

    // Adiciona um novo ponto no grafico
    chart.data.labels.push(now); // Adiciona o horario atual no eixo X
    chart.data.datasets[0].data.push(data.temperatura);
    chart.data.datasets[1].data.push(data.umidade);
    chart.data.datasets[2].data.push(data.pressao);
    chart.data.datasets[3].data.push(data.som);
    chart.data.datasets[4].data.push(data.vazao);

    // Mantem apenas os ultimos 10 valores no grafico para evitar sobrecarga
    if (chart.data.labels.length > 10) {
      chart.data.labels.shift(); // Remove o primeiro item da lista de labels
      chart.data.datasets.forEach((dataset) => dataset.data.shift()); // remove o primeiro valor de cada dataset
    }

    // Atualiza o grafico na tela
    chart.update();
  } catch (error) {
    // Se houver um erro na requisicao, exibe no console
    console.log('Erro ao buscar dados: ', error);
  }
}

function verificarLimites(data) {
  let alerta = '';

  if (data.temperatura > limites.temperatura) {
    alerta += '⚠️ Temperatura muito alta!\n';
  }
  if (data.umidade > limites.umidade) {
    alerta += '⚠️ Umidade muito alta!\n';
  }
  if (data.pressao > limites.pressao) {
    alerta += '⚠️ Pressão muito alta!\n';
  }
  if (data.som > limites.som) {
    alerta += '⚠️ Nível sonoro muito alto!\n';
  }
  if (data.vazao > limites.vazao) {
    alerta += '⚠️ Vazão muito alta!\n';
  }

  if (alerta) {
    alert(alerta);
  }
}

function leitura() {
  text = document.getElementById("btnLeitura");

  if (text.innerText == "Iniciar") {
    text.innerText = "Pausar";
    intervalo = setInterval(atualizarSensores, 2000);
    btn = document.getElementById("btnLeitura").classList.toggle("btn-vermelho");
    atualizarStatus("iniciar");
  } else {
    text.innerText = "Iniciar";
    clearInterval(intervalo);
    btn = document.getElementById("btnLeitura").classList.toggle("btn-vermelho");
    atualizarStatus("pausar");
  }
}

async function atualizarStatus(acao) {
  try {
      const response = await fetch(`http://127.0.0.1:5000/status?acao=${acao}`);
      const data = await response.json();
      console.log("📡 Status atualizado:", data);
  } catch (error) {
      console.error("⚠️ Erro ao atualizar status:", error);
  }
}