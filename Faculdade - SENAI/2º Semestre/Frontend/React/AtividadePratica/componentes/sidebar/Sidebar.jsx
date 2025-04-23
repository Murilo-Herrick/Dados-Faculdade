import list from './img/list.png'
import Home from './img/home.png'
import Sobre from './img/info.png'
import Pagina from './img/pagina.png'
import './style.css'
import { Link } from 'react-router-dom';

export default function Sidebar() {

    return (
        <aside>
            <img src={list} className='list-img' alt="Logo do sidebar" />
            <p className='list-img'>To-do-List</p>
            <nav>
                <ul className='lista-sidebar'>
                    <li>
                        <Link to="/" className='item__link'>
                            <img src={Home} alt='Home'></img>
                            <span>Home</span>
                        </Link>
                    </li>
                    <li>
                        <Link to="/Sobre" className='item__link'>
                            <img src={Sobre} alt='Sobre'></img>
                            <span>Sobre</span>
                        </Link>
                    </li>
                    <li>
                        <Link to="/Lista" href='#' className='item__link'>
                            <img src={Pagina} alt='To-do-List'></img>
                            <span>Lista</span>
                        </Link>
                    </li>
                </ul>
            </nav>
        </aside>
    )
}