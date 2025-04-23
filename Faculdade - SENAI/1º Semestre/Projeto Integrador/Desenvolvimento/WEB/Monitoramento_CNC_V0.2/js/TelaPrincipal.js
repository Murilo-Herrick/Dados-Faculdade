setInterval(() => {
  status(), feedrate(), rpm(), possicaoX(), possicaoY(), possicaoZ();
}, 100);

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
    let obj = JSON.parse(this.responseText);

    switch (obj) {
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
    } else {
      OFF.style.opacity = "0.3";
    }

    if (mqnIDLE) {
      IDLE.style.opacity = "1";
      zerar();
    } else {
      IDLE.style.opacity = "0.3";
    }

    if (mqnCHECK) {
      CHECK.style.opacity = "1";
    } else {
      CHECK.style.opacity = "0.3";
    }

    if (mqnRUN) {
      RUN.style.opacity = "1";
    } else {
      RUN.style.opacity = "0.3";
    }
  };
}

// Status maquina ---FIM---

// Taxa de avanço ---INICIO---

function feedrate() {
  const valor = new XMLHttpRequest();
  valor.open("GET", "http://127.0.0.1:1880/feed");
  valor.send();
  valor.onload = function () {
    let obj = JSON.parse(this.responseText);

    document.getElementById("valorAvanco").innerHTML = "F: " + obj;
  };
}

// Taxa de avanço ---FIM---

// RPM ---INICIO--- (BIBLIOTECA CANVAS)

function rpm() {
  const valor = new XMLHttpRequest();
  valor.open("GET", "http://127.0.0.1:1880/rpm");
  valor.send();
  valor.onload = function () {
    let obj = JSON.parse(this.responseText);

    document.getElementById("rpm").innerHTML = obj;
  };
}

// RPM ---FIM---

// POSICIONAMENTO ---INICIO---

function possicaoX() {
  const valor = new XMLHttpRequest();
  valor.open("GET", "http://127.0.0.1:1880/posx");
  valor.send();
  valor.onload = function () {
    let obj = JSON.parse(this.responseText);
    obj = Math.round(obj);

    document.getElementById("eixo_X").innerHTML = "X:" + obj;
  };
}

function possicaoY() {
  const valor = new XMLHttpRequest();
  valor.open("GET", "http://127.0.0.1:1880/posy");
  valor.send();
  valor.onload = function () {
    let obj = JSON.parse(this.responseText);
    obj = Math.round(obj);

    document.getElementById("eixo_Y").innerHTML = "Y:" + obj;
  };
}

function possicaoZ() {
  const valor = new XMLHttpRequest();
  valor.open("GET", "http://127.0.0.1:1880/posz");
  valor.send();
  valor.onload = function () {
    let obj = JSON.parse(this.responseText);
    obj = Math.round(obj);

    document.getElementById("eixo_Z").innerHTML = "Z:" + obj;
  };
}

// POSICIONAMENTO ---FIM---
