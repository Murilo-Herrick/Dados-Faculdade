// Exercicio 1

function ex1(){
    let numero = document.getElementById("numero").value;

    if(numero < 0){
        document.getElementById("resultado").innerHTML= "negativo";
    }else {
        document.getElementById("resultado").innerHTML= "positivo";
    }
}

// Exericico 2

function intervalo(){
    nf = document.getElementById("nf").value;

    for(let i = 0; i <= nf; i++){
        res = i % 2;
        if(res == 1){
            document.write(i + "<br>");
        }
    }
}

// Exercicio 3

function movermouse(){
    bt = document.getElementById("b");
    if(bt.style.backgroundColor == "gray"){
        bt.style.backgroundColor = "red";
    }else
        bt.style.backgroundColor = "gray";
        
}

// Verifica se é numero

function vstring(){
    valor = document.getElementById("numero").value;
    if(isNaN( valor )){
        document.write("O valor digitado não é número")
    }else{
        document.write("O valor digitado é um número")
    }
}

// Exercicio da Data

function data(){
    h = new Date().getHours;

    if(h > 5 && h < 12){
        document.getElementsById("saudacao").innerHTML= "Bom dia!";
    }
    if(h > 0 && h < 5){
        document.getElementsById("saudacao").innerHTML= "Bom Madrugada!";
    }
    if(h > 12 && h < 18){
        document.getElementsById("saudacao").innerHTML= "Boa Tarde!";
    }
    if(h > 18 && h < 0){
        document.getElementsById("saudacao").innerHTML= "Boa Tarde!";
    }
}