import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Hello from "./components/Hello";
import Movies from "./components/Movies";
import NavMenu from "./components/fragments/NavMenu";
import Programme from "./components/Programme";
import Theaters from "./components/Theaters";
import Footer from "./components/fragments/Footer";
import Header from "./components/fragments/Header";

const App = () => {
  return (
    <Router>
      <div className="page-container">
        <Header />
        <NavMenu />
        <div className="main-content">
          <Routes>
            <Route path="/" element={<Hello />} />
            <Route path="/movies" element={<Movies />} />
            <Route path="/theaters" element={<Theaters />} />
            <Route path="/programme" element={<Programme />} />
          </Routes>
        </div>
        <Footer />
      </div>
    </Router>
  );
};

export default App;
