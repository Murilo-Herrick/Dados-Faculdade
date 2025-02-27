let desenho = document.querySelector(".desenho"); //Pegando toda a classe desenho
let svgNS = 'http://www.w3.org/2000/svg';

let Mcirculo = document.createElementNS(svgNS,"circle");
let Mlinha = document.createElementNS(svgNS, "line");  // Cria elemento no NS


const timer = (seconds) => { //Preparando tempo para função timer
    let time = seconds * 1000 // 1 segundo
    return new Promise(res => setTimeout(res, time))
}

async function circulo(){
    for(let i=0; i<=30; i++){ // Faz com uma animação onde o circulo irá aumentar de tamanho até chegar no limite que você inseriu no for
        Mcirculo.setAttributeNS(null,"r",i);
        Mcirculo.setAttributeNS(null,"cx",50);
        Mcirculo.setAttributeNS(null,"cy",50);
        Mcirculo.setAttributeNS(null,"fill","blue");
        desenho.appendChild(Mcirculo); // O appendChild()método anexa um nó (elemento) como o último filho de um elemento.
        await timer(1)
    }

}

async function linha(){
    for(i=0; i<=100; i++){ // Faz com uma animação onde a linha irá aumentar de tamanho até chegar no limite que você inseriu no for
        Mlinha.setAttributeNS(null,"x1",1);
        Mlinha.setAttributeNS(null,"y1",10);
        Mlinha.setAttributeNS(null,"x2",i);
        Mlinha.setAttributeNS(null,"y2",10);
        Mlinha.setAttributeNS(null,"style","stroke:blue; stroke-width:5");
        desenho.appendChild(Mlinha); // O appendChild()método anexa um nó (elemento) como o último filho de um elemento.
        await timer(1)
    }

}




console.log(desenho)
console.log(Mlinha)