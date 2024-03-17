import * as React from "react";

import { Link } from "react-router-dom";

const NavMenu = () => {
  return (
    <nav>
      <ul>
        <li>
          <Link to="/">Strona główna</Link>
        </li>
        <li>
          <Link to="/movies">Filmy</Link>
        </li>
        <li>
          <Link to="/theaters">Sale kinowe</Link>
        </li>
        <li>
          <Link to="/programme">Repertuar filmowy</Link>
        </li>
      </ul>
    </nav>
  );
};

export default NavMenu;
