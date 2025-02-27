const horas = document.getElementById('horas'); //pegando o elemento horas do html
const minutos = document.getElementById('minutos');//pegando o elemento minutos do html
const segundos = document.getElementById('segundos');//pegando o elemento segundos do html

//Criando a função para pegar horário do sistema e passar para os elementos html
const relogio = setInterval(function time() {
    let dateToday = new Date(); //pegando hora do sistema
    let hr = dateToday.getHours(); //pegando somente a hora
    let min = dateToday.getMinutes();//pegando somente os minutos
    let s = dateToday.getSeconds();//pegando somente os segundos

//Colocando os dois digitos nos elementos do relógio quando for menos que 10
    if (hr < 10){
        hr = '0' + hr;
    } 

    if (min < 10){
        min = '0' + min;
    }

    if (s < 10){
        s = '0' + s;
    } 

//Passando os valores atualizados para os elemntos no html
    horas.textContent = hr;
    minutos.textContent = min;
    segundos.textContent = s;

})