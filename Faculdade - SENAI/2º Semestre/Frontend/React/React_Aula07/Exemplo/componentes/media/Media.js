import React, {useState} from 'react';

function MediaProvas(){
    const [nota1, setNota1] = useState('');
    const [nota2, setNota2] = useState('');
    const [nota3, setNota3] = useState('');
    const [media, setMedia] = useState(null);

    const calcularMedia = () => {
        const num1 = parseFloat(nota1);
        const num2 = parseFloat(nota2);
        const num3 = parseFloat(nota3);

        if (!isNaN(num1) && !isNaN(num2) && !isNaN(num3)){
            const resultado = (num1 + num2 + num3) / 3;
            setMedia(resultado.toFixed(2));//Armazena o resultado com 2 casas decimais
        } else{
            alert("Por favor, insira valores válidos.")
        }
    };
    return (
        <div>
            <h2>calculara de Média</h2>
            {/*Campo de entrada para a Nota 1*/ }
            <div>
            <input type="number" placeholder="Nota 1" value={nota1}
            onChange={(e) =>  setNota1 (e.target.value)}/>
            </div>
            {/*Campo de entrada para a Nota 2*/ }
            <div>
            <input type="number" placeholder="Nota 2" value={nota2}
            onChange={(e) =>  setNota2 (e.target.value)}/>
            </div>
            {/*Campo de entrada para a Nota 3*/ }
            <div>
            <input type="number" placeholder="Nota 3" value={nota3}
            onChange={(e) =>  setNota3 (e.target.value)}/>
            </div>
            <button onClick={calcularMedia}>calcular Media</button>

            {/* Exibe o resultado da media, caso tenha sido calculado */}
            {media && <h3>Media: {media}</h3>}
        </div>
    );
}

export default MediaProvas;