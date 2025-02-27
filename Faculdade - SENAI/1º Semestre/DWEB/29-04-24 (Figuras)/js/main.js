setInterval(() =>{ /* Essa função atualiza minha pagina a todo momento sem que eu precisa clicar para reiniciar */
    lerNodeRedJson() /* Chama a função para ler o arquivo em JSON e exibir ele no HTML */
    lerNodeRedObj() /* Chama a função para ler o arquivo em Objeto e exibir ele no HTML */
},/*5000*/)  /* Define a frequência que a pagina será atualizada, no comentário está que a cada 5 segundos
                a página será atualizada, mas como está comentada ela ficará reiniciando sem tmepo, ou seja
                ela será reiniciada a todo momento */


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
        let contador = obj.contador //Pega o valor do rotulo contador
        document.getElementById("texto").innerHTML = contador // Coloca o valor objeto na página HTML
    }
}

