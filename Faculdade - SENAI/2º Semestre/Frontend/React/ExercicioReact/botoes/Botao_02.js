import React from 'react';
import Swal from 'sweetalert2';
import './Botao_02.css';

const Alerta = () => {
    const showAlert = () => {
        Swal.fire({
            title: 'Faculdade SENAI',
            text: 'Este é um alerta personalizado!',
            icon: 'info',
            confirmButtonText: 'Fechar',
            customClass: {
                title: 'custom-title',
                content: 'custom-content'
            },
        });
    };

    return (
        <div>
            <button onClick={showAlert}>Botao 2</button>
        </div>
    );
}

export default Alerta;
