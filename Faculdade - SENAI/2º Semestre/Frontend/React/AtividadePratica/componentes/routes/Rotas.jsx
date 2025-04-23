import { Route, BrowserRouter } from "react-router-dom";

import Home from './Home'
import Sobre from './Sobre'

const Routes = () => {
    return(
        <BrowserRouter>
            <Route Component={ Home } path='/'  exact/>
            <Route Component={ Sobre } path='/Sobre'  exact/>
        </BrowserRouter>
    )
}

export default Routes;