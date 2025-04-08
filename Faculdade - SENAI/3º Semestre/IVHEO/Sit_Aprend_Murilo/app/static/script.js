// @ts-nocheck
// Obtem o contexto do elemento onde <canvas> onde o gráfico será desenhado
const ctx = document.getElementById('sensorChart').getContext('2d');

// Cria um gráfico de linha usando a biblioteca Chart.js
const chart = new Chart(ctx, {
  type: 'line', // Define o tipo do gráfico como linha
  data: {
    labels: [], // Inicialmente não há rótulos no eixo X (serão preenchidos com timestamps)
    datasets: [
      { label: 'Temperatura (°C)', data: [], borderColor: 'yellow', fill: false },
      { label: 'Umidade (%)', data: [], borderColor: 'blue', fill: false },
      { label: 'Presença', data: [], borderColor: 'green', fill: false },
      { label: 'Tensão (V)', data: [], borderColor: 'red', fill: false }
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
  temperatura: 35,  
  umidade: 85,                  
};

let intervalo;

async function atualizarSensores() {
  try {
    // Faz uma requisição para o endpoint do Flask que fornece os dados de sensores
    const response = await fetch('http://127.0.0.1:5000/sensores');
    const data = await response.json();

    // Atualiza os valores exibidos na página
    document.getElementById('temp').innerText = data.temperatura;
    document.getElementById('hum').innerText = data.umidade;
    document.getElementById('pres').innerText = data.presenca;
    document.getElementById('ten').innerText = data.tensao;

    verificarLimites(data);

    const now = new Date().toLocaleTimeString();

    // Adiciona um novo ponto no gráfico
    chart.data.labels.push(now); // Adiciona o horário atual no eixo X
    chart.data.datasets[0].data.push(data.temperatura);
    chart.data.datasets[1].data.push(data.umidade);
    chart.data.datasets[2].data.push(data.presenca);
    chart.data.datasets[3].data.push(data.tensao);

    // Mantém apenas os últimos 10 valores no gráfico para evitar sobrecarga
    if (chart.data.labels.length > 10) {
      chart.data.labels.shift(); // Remove o primeiro item da lista de labels
      chart.data.datasets.forEach((dataset) => dataset.data.shift()); // Remove o primeiro valor de cada dataset
    }

    // Atualiza o gráfico na tela
    chart.update();
  } catch (error) {
    console.log('Erro ao buscar dados: ', error);
  }
}

let alertasMostrados = { temperatura: false, umidade: false };

function verificarLimites(data) {
  let alerta = '';

  if (data.temperatura > limites.temperatura && !alertasMostrados.temperatura) {
    alerta += '⚠️ Temperatura muito alta!\n';
    alertasMostrados.temperatura = true;
  }
  if (data.umidade > limites.umidade && !alertasMostrados.umidade) {
    alerta += '⚠️ Umidade muito alta!\n';
    alertasMostrados.umidade = true;
  }
  if (alerta) {
    alert(alerta);
  }

  // Reseta os alertas quando o valor volta ao normal
  if (data.temperatura <= limites.temperatura) alertasMostrados.temperatura = false;
  if (data.umidade <= limites.umidade) alertasMostrados.umidade = false;
}

function leitura() {
  const text = document.getElementById("btnLeitura");

  if (text.innerText == "Iniciar") {
    text.innerText = "Pausar";
    intervalo = setInterval(atualizarSensores, 2000);
    document.getElementById("btnLeitura").classList.toggle("btn-vermelho");
    atualizarStatus("iniciar");
  } else {
    text.innerText = "Iniciar";
    clearInterval(intervalo);
    document.getElementById("btnLeitura").classList.toggle("btn-vermelho");
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
