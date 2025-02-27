let horas = document.getElementById("horas");
let minutos = document.getElementById("minutos");
let segundos = document.getElementById("segundos");
let milisegundos = document.getElementById("milisegundos");

document.from_main.iniciar.onclick = () => start();
document.from_main.pausar.onclick = () => pausar();
document.from_main.reiniciar.onclick = () => reiniciar();


function start(){

    setInterval(
        () => {
          start()
        }, 10
      );
    
    let h = 0;
    let m = 0;
    let s = 0;
    let ms = new Date().getMilliseconds();

    if(h < 10){
        horas.innerHTML = "0" + h;
    }else{
        horas.innerHTML = h;
    }
    
    if(m < 10){
        minutos.innerHTML = "0" + m;
    }else {
        minutos.innerHTML = m;
    }

    if(s < 10){
        segundos.innerHTML = "0" + s;
    }else {
        segundos.innerHTML = s;
    }

    if(ms < 10){
        milisegundos.innerHTML = "0" + ms;
    }else{
        milisegundos.innerHTML = ms;
    }
    
}

