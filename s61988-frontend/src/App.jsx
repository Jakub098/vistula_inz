import React from "react";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Footer from "./components/fragments/Footer";
import Header from "./components/fragments/Header";
import NavMenu from "./components/fragments/NavMenu";
import MainPage from "./components/MainPage";
import ResourcesList from "./components/ResourcesList";
import BooksList from "./components/BooksList";

function App() {
  return (
    <Router>
      <div className="page-container">
        <Header />
        <NavMenu />
        <div className="main-content">
          <Routes>
            <Route path="/" element={<MainPage />} />
            <Route path="/resources" element={<ResourcesList />} />
            <Route path="/books" element={<BooksList />} />
            {/* <Route path="/audiobooks" element={<Movies />} /> */}
            {/* <Route path="/movies" element={<Movies />} /> */}
            {/* <Route path="/my-hires" element={<Theaters />} /> */}
            {/* <Route path="/account" element={<Theaters />} /> */}
          </Routes>
        </div>
        <Footer />
      </div>
    </Router>
  );
}

export default App;
