const ti={
    turma: "ADS",
    ano: 2024, 
    UC: ["LIP", "BCD", "DWEB", "AUI"]
}

let texto = JSON.stringify(ti)
document.getElementById("prog").innerHTML = texto

console.log(texto.turma)

let obj = JSON.parse(texto)
console.log(obj.turma)
console.log(obj.UC[1])

function buscaCEP(){
    let input = document.getElementById("cep").value
    const valor = new XMLHttpRequest();
    valor.open("GET","https://viacep.com.br/ws/"+ input +"/json")
    valor.send()
    valor.onload = function(){
        document.getElementById("texto").innerHTML = this.responseText

        let obj = JSON.parse(this.responseText)
        let logradouro = obj.logradouro
        let cidade = obj.localidade
        let estado = obj.uf

        document.getElementById("texto").innerHTML = "Logradouro: "+logradouro+"<br>"+"Cidade: "+cidade+"<br>"+"Estado: "+estado+"<br>"
    }
}