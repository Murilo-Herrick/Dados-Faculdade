let listaDeItensRobotica = []

const form = document.getElementById("form-itens")
const itensInput = document.getElementById("receber-item")
const ulItens = document.getElementById("lista-de-itens-robotica")
const ulItensComprados = document.getElementById("corretos")
const listaRecuperada = localStorage.getItem('listaDeItensRobotica')


function atualizaLocalStorage() {
    localStorage.setItem('listaDeItensRobotica', JSON.stringify(listaDeItensRobotica))
}

if(listaRecuperada){
    listaDeItensRobotica = JSON.parse(listaRecuperada)
    mostrarItem()
} else {
    listaDeItensRobotica = []
}


function salvarItem() {
    const comprasItem = itensInput.value
    const checarDuplicado = listaDeItensRobotica.some((elemento)=>elemento.valor.toUpperCase() === comprasItem.toUpperCase())

    if (checarDuplicado) {
        alert("Elemento já existe!")
    }
    else {
        listaDeItensRobotica.push({
            valor: comprasItem,
            checar: false
        })
    }
    itensInput.value = ''
}

form.addEventListener("submit", function (evento){
    evento.preventDefault()
    salvarItem()
    mostrarItem()
    ItensInput.focus()
})

function mostrarItem(){
    ulItens.innerHTML = ''
    ulItensComprados.innerHTML = ''
    listaDeItensRobotica.forEach((elemento,index)=>{
        if(elemento.checar){
            ulItensComprados.innerHTML +=`
            <div class="itens-adicionados">
            <li class="" data-value="${index}">
                <div>
                    <input type="checkbox" checked class="is-clickable"> </input>
                    <span class="itens">${elemento.valor}</span>
                    <i class="fa-solid fa-trash is-clickable deletar"></i>
                </div>
                <div>
                    
                </div>
            </li>
            </div>
            `
        } else {
            ulItens.innerHTML +=`
            <li class="item-compra is-flex is-justify-content-space-between" data-value="${index}">
                <div>
                    <input type="checkbox" class="is-clickable"> </input>
                    <input type="text" class="itens" value="${elemento.valor}"> </input>
                    <i class="fa-solid fa-trash is-clickable deletar"></i>
                </div>
            </li>
            `
        }
    })

    const inputCheck = document.querySelectorAll('input[type="checkbox"]')
    inputCheck.forEach(i => {
        i.addEventListener('click', (evento) => {
           const valorDoElemento = evento.target.parentElement.parentElement.getAttribute('data-value')
           listaDeItensRobotica[valorDoElemento].checar = evento.target.checked
           console.log(listaDeItensRobotica[valorDoElemento].checar)
           mostrarItem()
        })
    })

    const deletarObjetos = document.querySelectorAll(".deletar") 

    deletarObjetos.forEach(i => {
        i.addEventListener('click', (evento) => {
            valorDoElemento = evento.target.parentElement.getAttribute('data-value')
            listaDeItensRobotica.splice(valorDoElemento, 1)
            mostrarItem()
        })
    })

    atualizaLocalStorage()
}