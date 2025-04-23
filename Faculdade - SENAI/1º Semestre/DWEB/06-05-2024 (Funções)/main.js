function condicao(){
    while(form1.nome.value==""){
        alert("Favor Preencher o campo");
        form1.nome.value=prompt("Digite seu nome agora","");
    }
    alert("Obrigado, "+form1.nome.value);
}

condicao();

function para(){
    document.write("Exemplo for <br>");

    for(let i = 1; i <= 10; i++){
        document.write("Numero: "+i+"<br>")
    }
}


function verifica(){
    valor = document.geteElementById("numero").value;
    res = valor%2;
    if(res == 1){
        document.write("O valor digitado ${valor} é impar");
    }else{
        document.write("O valor digitado ${valor} é pra");
    }
}

verifica();

function caso(){
    x = document.getElementsById("nome").value;
    switch(x){
        case "1":
            alert("Valor sleecioando 1");
            return form1.nome.focus();
            breack;
        case "2":
            alert("Valor sleecioando 2");
            return form1.nome.focus();
            breack;
        default:
            alert("Valor fora do padrão");
            return form1.nome.focus();
    }
}


// Função da tabela (form2)

function tab(){
    for(let i = 0; i <= 10; i++){
        let tabela = document.getElementById("tb1");
        let qtdLinhas = tabela.rows.length;
        let linha = tabela.insertRow(qtdLinhas);

        let ident = linha.insertCell(0);
        let valor = linha.insertCell(1);

        ident.append("linha");
        valor.append(i);
    }
}

// Comandos relacionados a Data e Hora

function data(){
    dt = new Date();
    h = new Date().getHours();
    m = new Date().getMinutes();
    d = new Date().getDate();
    document.getElementById("dt").innerHTML = dt;
    document.getElementById("h").innerHTML = h;
    document.getElementById("m").innerHTML = m;
    document.getElementById("d").innerHTML = d;
}

// Exemplo de Array (com lista)

function nomes(){

    let lista =["João", 16, "Maria", 15, "Carolina", 18];
    let tamanho = lista.length;
    for(let i = 0; i < tamanho; i=i+2){
        let tabela = document.getElementById("tb2");
        let qtdLinhas = tabela.rows.length;
        let linha = tabela.insertRow(qtdLinhas);
        let nome = linha.insertCell(0);
        let idade = linha.insertCell(1);
        nome.append(lista[i]);
        idade.append(lista[i+1]);
    }
}