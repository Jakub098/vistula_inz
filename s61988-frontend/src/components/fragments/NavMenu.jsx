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
          <Link to="/resources">Katalog online</Link>
        </li>
        <li>
          <Link to="/books">Książki</Link>
        </li>
        <li>
          <Link to="/audiobooks">Audiobooki</Link>
        </li>
        <li>
          <Link to="/movies">Filmy</Link>
        </li>
        <li>
          <Link to="/my-hires">Moje wypożyczenia</Link>
        </li>
        <li>
          <Link to="/account">Zarządzanie kontem</Link>
        </li>
      </ul>
    </nav>
  );
};

export default NavMenu;
