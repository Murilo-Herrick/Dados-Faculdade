setInterval(() => {
  dadoscnc(), status();
}, 10);

let parado = false;

if (!parado) {
  function dadoscnc() {
    const valor = new XMLHttpRequest();
    valor.open("GET", "http://127.0.0.1:1880/cnc");
    valor.send();
    valor.onload = function () {
      let obj = JSON.parse(this.responseText);

      let x = obj.x;
      let y = obj.y;
      let z = obj.z;
      let feedRate = obj.feedRate;
      let spindle = obj.spindle;

      // FeedRate
      document.getElementById("valorAvanco").innerHTML = "F: " + feedRate;

      // RPM
      let RPM = document.getElementById("rpm");
      let SPINDLE = document.getElementById("spindle");

      spindle = spindle < 10 ? "0" + spindle : spindle;

      RPM.innerHTML = spindle + "<br><span>RPM</span>";

      SPINDLE.style.strokeDashoffset = 440 - (440 * spindle) / 1000;

      // Posicoes

      // X
      x = Math.round(x);
      document.getElementById("eixo_X").innerHTML = "X:" + x;

      // Y
      y = Math.round(y);
      document.getElementById("eixo_Y").innerHTML = "Y:" + y;

      // Z
      z = Math.round(z);
      document.getElementById("eixo_Z").innerHTML = "Z:" + z;
    };
  }
}

// Status Maquina --- INICIO ---

function status() {
  let CHECK = document.getElementById("circuloCheck");
  let OFF = document.getElementById("circuloOFF");
  let RUN = document.getElementById("circuloRUN");
  let IDLE = document.getElementById("circuloIdle");

  mqnOFF = false;
  mqnCHECK = false;
  mqnIDLE = false;
  mqnRUN = false;

  const valor = new XMLHttpRequest();
  valor.open("GET", "http://127.0.0.1:1880/status");
  valor.send();
  valor.onload = function () {
    let status = JSON.parse(this.responseText);

    switch (status) {
      case -1:
        mqnOFF = true;
        mqnCHECK = false;
        mqnIDLE = false;
        mqnRUN = false;
        break;

      case 0:
        mqnOFF = false;
        mqnCHECK = false;
        mqnIDLE = true;
        mqnRUN = false;
        break;

      case 1:
        mqnOFF = false;
        mqnCHECK = true;
        mqnIDLE = false;
        mqnRUN = false;
        break;

      case 2:
        mqnOFF = false;
        mqnCHECK = false;
        mqnIDLE = false;
        mqnRUN = true;
        break;

      default:
        mqnOFF = false;
        mqnCHECK = false;
        mqnIDLE = false;
        mqnRUN = false;
        break;
    }

    if (mqnOFF) {
      OFF.style.opacity = "1";
      OFF.style.fontWeight = "bold";
      parado = true;
    } else {
      OFF.style.opacity = "0.3";
      OFF.style.fontWeight = "0";
    }

    if (mqnIDLE) {
      IDLE.style.opacity = "1";
      IDLE.style.fontWeight = "bold";
      parado = true;

      let RPM = document.getElementById("rpm");
      let SPINDLE = document.getElementById("spindle");

      spindle = 0;
      spindle = spindle < 10 ? "0" + spindle : spindle;
      RPM.innerHTML = spindle + "<br><span>RPM</span>";

      SPINDLE.style.strokeDashoffset = 440 - (440 * spindle) / 1000;

    } else {
      IDLE.style.opacity = "0.3";
      IDLE.style.fontWeight = "0";
    }

    if (mqnCHECK) {
      CHECK.style.opacity = "1";
      CHECK.style.fontWeight = "bold";
      parado = false;
    } else {
      CHECK.style.opacity = "0.3";
      CHECK.style.fontWeight = "0";
    }

    if (mqnRUN) {
      RUN.style.opacity = "1";
      RUN.style.fontWeight = "bold";
      parado = false;
    } else {
      RUN.style.opacity = "0.3";
      RUN.style.fontWeight = "0";
    }
  };
}
// Status maquina ---FIM---

setInterval(() => {
  relogio();
});

function relogio() {
  let horas = document.getElementById("horas");
  let minutos = document.getElementById("minutos");
  let segundos = document.getElementById("segundos");

  let h = new Date().getHours();
  let m = new Date().getMinutes();
  let s = new Date().getSeconds();

  h = h < 10 ? "0" + h : h;
  m = m < 10 ? "0" + m : m;
  s = s < 10 ? "0" + s : s;

  horas.innerHTML = h;
  minutos.innerHTML = ":" + m;
  segundos.innerHTML = " :" + s;
}
