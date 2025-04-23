import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import './App.css'
import Sidebar from './componentes/sidebar/Sidebar'
import Home from './componentes/routes/Home';
import Sobre from './componentes/routes/Sobre';
import List from './componentes/routes/List';

function App() {


  return (
      <Router>
        <div>
            <Sidebar className='Coluna1' />
          <div>
            <Routes>
              <Route exact path='/' Component={Home}></Route>
              <Route exact path='/Sobre' Component={Sobre}></Route>
              <Route exact path='/Lista' Component={List}></Route>
            </Routes>
          </div>
        </div>
      </Router>
  )
}

export default App