import CompData from "../data/Compdata";
import './Compescdata.css'

const CompEscData = () => {
    return (
        <header>
            <div className='col-12'>
                <h1>Escolha de datas</h1>
            </div>
            <div className='row'>
                <div className='col-6'>
                    <p>Data Atual</p>
                    <CompData />
                </div>
                <div className='col-6'>
                    <p>Data de Nascimento</p>
                    <CompData />
                </div>
            </div>

        </header>
    )
}

export default CompEscData;