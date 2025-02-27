let listaDeItens = [];

const form = document.getElementById("form-itens");
const itensInput = document.getElementById("receber-item");
const ulItens = document.getElementById("lista-de-itens");
const ulItensComprados = document.getElementById("itens-comprados");
const listaRecuperada = localStorage.getItem("listaDeItens")

function atualizaLocalStorage(){
    localStorage.setItem("listaDeItens", JSON.stringify(listaDeItens))
}

if (listaRecuperada){
    listaDeItens = JSON.parse(listaRecuperada)
    mostrarItem()
}
else{
    listaDeItens = []
}

form.addEventListener("submit", function (evento) {
  evento.preventDefault();
  salvarItem();
  mostrarItem();
  itensInput.focus();
});

function salvarItem() {
  const comprasItem = itensInput.value;
  const checarDuplicado = listaDeItens.some(
    (elemento) => elemento.valor.toUpperCase() === comprasItem.toUpperCase()
  );

  if (checarDuplicado) {
    alert("Elemento já existe!");
  } else {
    listaDeItens.push({
      valor: comprasItem,
      checar: false,
    });
  }

  itensInput.value = ""
}

function mostrarItem() {
  ulItens.innerHTML = "";
  ulItensComprados.innerHTML = "";
  listaDeItens.forEach((elemento, index) => {
    if (elemento.checar) {
      ulItensComprados.innerHTML += `
            <li class="item-compra is-flex is-justify-content-space-between" data-value='${index}'>
            <div>
                <input type="checkbox" checked class="is-clickable"></input>
                <span class="itens-comprados is-size-5">${elemento.valor}</span>
            </div>
            <div>
                <i class="fa-solid fa-trash is-clickable deletar"></i>
            </div>
    </li>
  `;
    } else {
      ulItens.innerHTML += `
            <li class="item-compra is-flex is-justify-content-space-between" data-value='${index}'>
                <div>
                    <input type="checkbox" class="is-clickable"></input>
                    <input type="text" class="is-size-5" value="${elemento.valor}"></input>
                 </div>
                <div>
                <i class="fa-solid fa-trash is-clickable deletar"></i>
                </div>
            </li>
            `;
    }
  });
  const inputsCheck = document.querySelectorAll('input[type="checkbox"]');
  inputsCheck.forEach((i) => {
    i.addEventListener("click", (evento) => {
      const valorDoElemento =
        evento.target.parentElement.parentElement.getAttribute("data-value");
      listaDeItens[valorDoElemento].checar = evento.target.checked; // altera o estado do check box
      console.log(listaDeItens[valorDoElemento].checar); // verificar o estado do checkbox no console
      mostrarItem();
    });
  });

  const deletarObjetos = document.querySelectorAll(".deletar")

  deletarObjetos.forEach(i => {
    i.addEventListener("click", (evento) => {
        valorDoElemento = evento.target.parentElement.parentElement.getAttribute("data-value")
        listaDeItens.splice(valorDoElemento,1)
        mostrarItem()
    })
  })

  atualizaLocalStorage()
}
