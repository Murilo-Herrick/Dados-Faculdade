import React, { useState } from "react";

function Graus() {
    const [celcius, setCelcius] = useState('');
    const [fahrenheit, setFahrenheit] = useState('');
    const [kelvin, setKelvin] = useState('');

    const converter = (value, scale) => {
        const cel = parseFloat(celcius);
        const fah = parseFloat(fahrenheit);
        const kel = parseFloat(kelvin);

        if(scale === 'c'){
            const resultadoFah = (cel * 1.8) + 32;
            setFahrenheit(resultadoFah.toFixed(2));
            const resultadoKel = cel + 273;
            setKelvin(resultadoKel.toFixed(2));
        }

        if(scale === 'f'){
            const resultadoCel = (fah - 32) / 1.8;
            setCelcius(resultadoCel.toFixed(2));
            const resultadoKel = resultadoCel + 273;
            setKelvin(resultadoKel.toFixed(2));
        }

        if(scale === 'k'){
            const resultadoCel = kel - 273;
            setCelcius(resultadoCel.toFixed(2));
            const resultadoFah = resultadoCel * 1.8 + 32;
            setFahrenheit(resultadoFah.toFixed(2));
        }

    };
    return(
        <div>
            <h2>Converter graus</h2>
            {/*Campo de entrada para a celcius*/ }
            <div>
            <input type="number" placeholder="celcius" value={celcius}
            onChange={(e) => {setCelcius (e.target.value)
                converter(parseFloat(e.target.value), 'c');
            }} />
            </div>
            {/*Campo de entrada para a fahrenheit*/ }
            <div>
            <input type="number" placeholder="fahrenheit" value={fahrenheit}
            onChange={(e) =>  {setFahrenheit (e.target.value) 
            converter(parseFloat(e.target.value), 'f')}}/>
            </div>
            {/*Campo de entrada para a kelvin*/ }
            <div>
            <input type="number" placeholder="kelvin" value={kelvin}
            onChange={(e) =>  {setKelvin (e.target.value)
                converter(parseFloat(e.target.value), 'k')
            }}/>
            </div>

            {}
        </div>
    );
}

export default Graus;
