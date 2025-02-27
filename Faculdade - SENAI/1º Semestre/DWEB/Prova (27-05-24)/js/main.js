// Contador-Nome

setInterval(
    () => {
      calcNome()
    }, 1500 //inves de 15 segundos coloquei 1,5 segundos.
  );

function calcNome(){

    let nome = document.getElementById("usuario-nome").value;
    let contador;

    for (let i = 0; i <= nome.length; i++){
        contador = i;
        document.getElementById("nome-contador").innerHTML = contador ;
    }
}

// Horario e Data

setInterval(
    () => {
      horario()
    }, 0
  );

function horario(){
    let h = new Date().getHours()
    let m = new Date().getMinutes()
    let s = new Date().getSeconds()

    if (h < 10){
        document.getElementById("hora").innerHTML = "0" + h;
    }else{
        document.getElementById("hora").innerHTML = h;
    }
    
    if(m <10){
        document.getElementById("minutos").innerHTML = "0" + m;
    }else {
        document.getElementById("minutos").innerHTML = m;
    }
    
    if(s < 10){
        document.getElementById("segundos").innerHTML = "0" + s;
    }else {
        document.getElementById("segundos").innerHTML = s;
    }
    
}

setInterval(
    () => {
      data()
    }, 0
  );

function data(){

    let getDia = new Date().getDate()
    let getMes = new Date().getMonth()+1
    let getAno = new Date().getFullYear()

    if(getDia < 10){
        document.getElementById("dia").innerHTML = "0" + getDia;
    }else{
        document.getElementById("dia").innerHTML = getDia;
    }

    if(getMes < 10){
        document.getElementById("mes").innerHTML = "0" + getMes;
    }else{
        document.getElementById("mes").innerHTML = getMes;
    }

    document.getElementById("ano").innerHTML = getAno
}

// Conversor de temperatura

setInterval(
    () => {
        conversor()
    }, 0
);

function conversor(){

    let temperatura = document.getElementById("input-temp").value;
    let convertido = temperatura * 1.8 + 32;
    document.getElementById("conversao").innerHTML = "Em fahrenheit: " + convertido
}