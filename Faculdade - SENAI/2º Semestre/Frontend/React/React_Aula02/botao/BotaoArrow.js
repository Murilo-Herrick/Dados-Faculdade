import './Botao.css'

const Botao_Arrow = () =>{
    function handleClick(){
        alert('Primeiro Botao so que com ArrowFunciton')
    }
    return (
        <button onClick={handleClick}>Botao Arrow</button>
    );
};
   

export default Botao_Arrow;