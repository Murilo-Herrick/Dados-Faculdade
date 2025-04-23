let listaDeItensAuto = []

const form = document.getElementById("form-itens")
const itensInput = document.getElementById("receber-item")
const ulItens = document.getElementById("lista-de-itens-auto")
const ulItensComprados = document.getElementById("corretos")
const listaRecuperada = localStorage.getItem('listaDeItensAuto')


function atualizaLocalStorage() {
    localStorage.setItem('listaDeItensAuto', JSON.stringify(listaDeItensAuto))
}

if(listaRecuperada){
    listaDeItensAuto = JSON.parse(listaRecuperada)
    mostrarItem()
} else {
    listaDeItensAuto = []
}


function salvarItem() {
    const comprasItem = itensInput.value
    const checarDuplicado = listaDeItensAuto.some((elemento)=>elemento.valor.toUpperCase() === comprasItem.toUpperCase())

    if (checarDuplicado) {
        alert("Elemento já existe!")
    }
    else {
        listaDeItensAuto.push({
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
    listaDeItensAuto.forEach((elemento,index)=>{
        if(elemento.checar){
            ulItensComprados.innerHTML +=`
            <li class="item-compra is-flex is-justify-content-space-between" data-value="${index}">
                <div>
                    <input type="checkbox" checked class=""> </input>
                    <span class="itens">${elemento.valor}</span>
                    <i class="fa-solid fa-trash is-clickable deletar"></i>
                </div>
                <div>
                    
                </div>
            </li>
            `
        } else {
            ulItens.innerHTML +=`
            <li class="item-compra is-flex is-justify-content-space-between" data-value="${index}">
                <div>
                    <input type="checkbox" class="input"> </input>
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
           listaDeItensAuto[valorDoElemento].checar = evento.target.checked
           console.log(listaDeItensAuto[valorDoElemento].checar)
           mostrarItem()
        })
    })

    const deletarObjetos = document.querySelectorAll(".deletar") 

    deletarObjetos.forEach(i => {
        i.addEventListener('click', (evento) => {
            valorDoElemento = evento.target.parentElement.getAttribute('data-value')
            listaDeItensAuto.splice(valorDoElemento, 1)
            mostrarItem()
        })
    })

    atualizaLocalStorage()
}