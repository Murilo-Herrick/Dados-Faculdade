// @ts-ignore
var temp = document.getElementById('temp').value;
var resultado = 0;

function CelsiusParaFahrenheit() {
  resultado = (9 / 5) * temp + 32;
}

function CelsiusParaKelvin() {
  resultado = temp + 273.15;
}

function FahrenheitParaCelsius() {
  resultado = (9 / 5) * (temp - 32);
}

function KelvinParaCelsius() {
  resultado = temp - 273.15;
}
