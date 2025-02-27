const Botao_02 = () => {
    function handleClick() {
        alert('Você clicou no botão!');
    }

    return (
        <button onClick={handleClick}>
            Clique aqui
        </button>
    );
}

export default Botao_02;