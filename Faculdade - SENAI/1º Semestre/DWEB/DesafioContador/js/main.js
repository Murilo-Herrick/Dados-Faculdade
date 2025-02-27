setInterval(() =>{ /* Essa função atualiza minha pagina a todo momento sem que eu precisa clicar para reiniciar */
    lerNodeRedJson() /* Chama a função para ler o arquivo em JSON e exibir ele no HTML */
    lerNodeRedObj() /* Chama a função para ler o arquivo em Objeto e exibir ele no HTML */
},/*5000*/)  /* Define a frequência que a pagina será atualizada, no comentário está que a cada 5 segundos
                a página será atualizada, mas como está comentada ela ficará reiniciando sem tmepo, ou seja
                ela será reiniciada a todo momento */

let contador; // Declarei a variavel contador globalmente para poder usar ela no meu código todo, 
             // e não apenas na função em que é escrita ou criada.
let svgNS = 'http://www.w3.org/2000/svg';
let Mlinha = document.createElementNS(svgNS,"line") // Instanciando a minha linha em formato grafico SVG
let desenho = document.querySelector(".desenho"); // Instanciando minha classe desenho no meu JavaScript 


// Função que lê no formato JSON
function lerNodeRedJson(){
    const valor = new XMLHttpRequest(); //Construtor
    valor.open('GET','http://10.110.6.137:9097/dadosn1')
    valor.send()
    valor.onload = function(){
        let txt = JSON.stringify(this.responseText) // Converte em formato JSON
        document.getElementById("texto2").innerHTML = txt // Coloca o valor JSON na página HTML
    }
}


// Função que lê no formato Objeto
function lerNodeRedObj(){
    const valor = new XMLHttpRequest(); //Construtor
    valor.open('GET','http://10.110.6.137:9097/dadosn1')
    valor.send()
    valor.onload = function(){
        let obj = JSON.parse(this.responseText) // Converte em formato objeto
        contador = obj.contador //Pega o valor do rotulo contador
        barraDeContagem = linha(contador); // Variavel barraDeContagem irá receber a função linha com o 
                                          //  parâmetro contador, pois conforme o contador aumenta a linha
                                          //  irá seguir ele aumentando seu tamanho horizontalmente também. 
        document.getElementById("texto").innerHTML = barraDeContagem // Coloca o valor objeto na página HTML
    }
}

async function linha(){
    Mlinha.setAttributeNS(null,"x1",1);
    Mlinha.setAttributeNS(null,"y1",200); // Define em que posição a linha irá ficar no eixo Y
    Mlinha.setAttributeNS(null,"x2",contador);
    Mlinha.setAttributeNS(null,"y2",200); // Define em que posição a linha irá ficar no eixo Y
    Mlinha.setAttributeNS(null,"style","stroke:blue; stroke-width:100"); // Define o tamanho e estilo da linha
    desenho.appendChild(Mlinha);
}

