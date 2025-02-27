const Botao_01 = () => {
    function handleClick(){
        alert('Faculdade de Tecnologia')
    }

    return (
        <button onClick={handleClick}>
            Botao_1
        </button>
    );
}

export default Botao_01;