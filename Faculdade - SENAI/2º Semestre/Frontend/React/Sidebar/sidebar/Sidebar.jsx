import Logo from './img/logo.png'
import Home from './img/home.png'
import Contato from './img/contato.png'
import Sobre from './img/info.png'
import Pagina from './img/pagina.png'
import Sair from './img/sair.png'
import './style.css'


export default function Sidebar() {

    return (
        <aside>
            <img src={Logo} alt="Logo do sidebar" />
            <p>Porjeto Sidebar</p>
            <nav>
                <ul className='lista-sidebar'>
                    <li>
                        <a href='#' className='item__link'>
                            <img src={Home} alt='Home'></img>
                            <span>Home</span>
                        </a>
                    </li>
                    <li>
                        <a href='#' className='item__link'>
                            <img src={Contato} alt='Contato'></img>
                            <span>Contato</span>
                        </a>
                    </li>
                    <li>
                        <a href='#' className='item__link'>
                            <img src={Sobre} alt='Sobre'></img>
                            <span>Sobre</span>
                        </a>
                    </li>
                    <li>
                        <a href='#' className='item__link'>
                            <img src={Pagina} alt='Pagina'></img>
                            <span>Página</span>
                        </a>
                    </li>
                    <li>
                        <a href='#' className='item__link'>
                            <img src={Sair} alt='Sair'></img>
                            <span>Sair</span>
                        </a>
                    </li>
                </ul>
            </nav>
        </aside>
    )
}