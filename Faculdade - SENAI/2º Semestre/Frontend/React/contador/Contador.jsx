import { useState } from 'react'
import './Contador.css'

function Contador(){

    const [contador, setContador] = useState(0);
    const [limitePos, setLimitePos] = useState('');
    const [limiteNeg, setLimiteNeg] = useState('');

    return (
        <div>
        
        <div>
            <hr></hr>
        </div>
        
        <div className='contador'>
        <h2>{contador}</h2>
        </div>

        <hr></hr>

        {/* Contador Crescente */}
        <button type="button" onClick={() => setContador((contador) => contador + 1)}>
            Imcrementar
        </button>

        {/* Contador Decrescente */}
        <button type="button" onClick={() => setContador((contador) => contador - 1)}>
            Decrementar
        </button>
        
        {/* Resetar Contador */}
        <button type="button" onClick={() => setContador(0)}>
            Resetar
        </button>

        <div className='definir-limite'>
            <h3>Definir Limite:</h3>
            <input type="number" placeholder='Positivo'
            onChange={(e) => {setLimitePos (e.target.value)}}/>
            {limitePos}

            <input type="number" placeholder='Negativo'
            onChange={(e) => {setLimiteNeg (e.target.value)}}/>
            {limiteNeg}
        </div>

        </div>
        
    )
}

export default Contador;