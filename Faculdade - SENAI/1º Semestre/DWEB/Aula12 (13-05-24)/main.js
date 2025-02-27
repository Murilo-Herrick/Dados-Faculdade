let horas = document.getElementById("horas");
let minutos = document.getElementById("minutos");
let segundos = document.getElementById("segundos");

let hh = document.getElementById("hh");
let mm = document.getElementById("mm");
let ss = document.getElementById("ss");

let h12 = document.getElementById("12h");
let h24 = document.getElementById("24h");

/* Faz a atualização continua.
Estamos tirando o intervalo "5000", pois o relogio já atualiza automaticamente */
setInterval(
  () => {
    relogio()
  }, /*5000*/
);

// Criando a função do relogio
function relogio() {
  //criar um condutor de data -
  // para isso é nescessario acrescentar o new para criar um novo elemento
  let h = new Date().getHours()
  let m = new Date().getMinutes()
  let s = new Date().getSeconds()

  // convertendo para 12 ou 24 horas
  if (h12.checked) {
    h24.checked = false
    if (h > 12) {
      h = h - 12;
    }
    hh.style.strokeDashoffset = 440 - (440 * h) / 12;
    horas.innerHTML = h + '<br><span>Horas</span>';
  } else if (h24.checked) {
    hh.style.strokeDashoffset = 440 - (440 * h) / 24;

    // Adicionando 0 antes de um unico número
    h = (h < 10) ? "0" + h : h;
    m = (m < 10) ? "0" + m : m;
    s = (s < 10) ? "0" + s : s;

    /* Colocando o texto no relogio*/
    horas.innerHTML = h + '<br><span>Horas</span>';
    minutos.innerHTML = m + '<br><span>Minutos</span>';
    segundos.innerHTML = s + '<br><span>Segundos</span>';

    /* Animando o relogio */

    mm.style.strokeDashoffset = 440 - (440 * m) / 60;
    ss.style.storkeDashoffset = 440 - (440 * s) / 60;
  }
}
