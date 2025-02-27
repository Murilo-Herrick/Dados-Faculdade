import { NavLink } from "react-router-dom";

export default function NavBar() {
  return (
    <nav>
      <NavLink to="/" end>Home</NavLink>{" "}
      | <NavLink to="/sobre">Sobre</NavLink> |{" "}
      <NavLink to="/contato">Contato</NavLink>
    </nav>
  );
}
