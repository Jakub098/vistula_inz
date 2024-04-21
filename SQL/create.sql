-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2024-04-21 10:33:35.071

-- tables
-- Table: Audiobook
CREATE TABLE Audiobook (
    id_audiobook int  NOT NULL,
    ilosc_plyt int  NOT NULL,
    CONSTRAINT Audiobook_pk PRIMARY KEY (id_audiobook)
);

-- Table: Autor
CREATE TABLE Autor (
    id_autor int  NOT NULL AUTO_INCREMENT,
    imie varchar(64)  NOT NULL,
    nazwisko varchar(64)  NOT NULL,
    CONSTRAINT Autor_pk PRIMARY KEY (id_autor)
);

-- Table: Czytelnik
CREATE TABLE Czytelnik (
    id_czytelnik int  NOT NULL,
    numer_karty varchar(16)  NOT NULL,
    CONSTRAINT Czytelnik_pk PRIMARY KEY (id_czytelnik)
);

-- Table: Film
CREATE TABLE Film (
    id_film int  NOT NULL,
    dlugosc int  NOT NULL,
    CONSTRAINT Film_pk PRIMARY KEY (id_film)
);

-- Table: Kategoria_dict
CREATE TABLE Kategoria_dict (
    id_kategoria int  NOT NULL AUTO_INCREMENT,
    nazwa varchar(64)  NOT NULL,
    CONSTRAINT Kategoria_dict_pk PRIMARY KEY (id_kategoria)
);

-- Table: Konto
CREATE TABLE Konto (
    id_konto int  NOT NULL AUTO_INCREMENT,
    data_zalozenia date  NOT NULL,
    imie varchar(20)  NOT NULL,
    nazwisko varchar(64)  NOT NULL,
    id_status_aktywnosci int  NOT NULL,
    CONSTRAINT Konto_pk PRIMARY KEY (id_konto)
);

-- Table: Ksiazka
CREATE TABLE Ksiazka (
    id_ksiazka int  NOT NULL,
    isbn varchar(64)  NOT NULL,
    CONSTRAINT Ksiazka_pk PRIMARY KEY (id_ksiazka)
);

-- Table: Pracownik
CREATE TABLE Pracownik (
    id_pracownik int  NOT NULL,
    CONSTRAINT Pracownik_pk PRIMARY KEY (id_pracownik)
);

-- Table: Status_aktywnosci_dict
CREATE TABLE Status_aktywnosci_dict (
    id_status_aktywnosci int  NOT NULL AUTO_INCREMENT,
    nazwa varchar(3)  NOT NULL,
    CONSTRAINT Status_aktywnosci_dict_pk PRIMARY KEY (id_status_aktywnosci)
);

-- Table: Wypozyczenie
CREATE TABLE Wypozyczenie (
    id_wypozyczenie int  NOT NULL AUTO_INCREMENT,
    data_wypozyczenia date  NOT NULL,
    data_zwrotu date  NULL,
    id_zasob int  NOT NULL,
    id_pracownik int  NOT NULL,
    id_czytelnik int  NOT NULL,
    CONSTRAINT Wypozyczenie_pk PRIMARY KEY (id_wypozyczenie)
);

-- Table: Zasoby
CREATE TABLE Zasoby (
    id_zasob int  NOT NULL AUTO_INCREMENT,
    tytul varchar(64)  NOT NULL,
    rok_wydania int  NOT NULL,
    id_status_aktywnosci int  NOT NULL,
    id_autor int  NOT NULL,
    id_kategoria int  NOT NULL,
    CONSTRAINT Zasoby_pk PRIMARY KEY (id_zasob)
);

-- foreign keys
-- Reference: Audiobook_Zasoby (table: Audiobook)
ALTER TABLE Audiobook ADD CONSTRAINT Audiobook_Zasoby FOREIGN KEY Audiobook_Zasoby (id_audiobook)
    REFERENCES Zasoby (id_zasob);

-- Reference: Czytelnik_Konto (table: Czytelnik)
ALTER TABLE Czytelnik ADD CONSTRAINT Czytelnik_Konto FOREIGN KEY Czytelnik_Konto (id_czytelnik)
    REFERENCES Konto (id_konto);

-- Reference: Dvd_Zasoby (table: Film)
ALTER TABLE Film ADD CONSTRAINT Dvd_Zasoby FOREIGN KEY Dvd_Zasoby (id_film)
    REFERENCES Zasoby (id_zasob);

-- Reference: Konto_Status_aktywnosci_dict (table: Konto)
ALTER TABLE Konto ADD CONSTRAINT Konto_Status_aktywnosci_dict FOREIGN KEY Konto_Status_aktywnosci_dict (id_status_aktywnosci)
    REFERENCES Status_aktywnosci_dict (id_status_aktywnosci);

-- Reference: Osoba_Zasoby (table: Ksiazka)
ALTER TABLE Ksiazka ADD CONSTRAINT Osoba_Zasoby FOREIGN KEY Osoba_Zasoby (id_ksiazka)
    REFERENCES Zasoby (id_zasob);

-- Reference: Pracownik_Konto (table: Pracownik)
ALTER TABLE Pracownik ADD CONSTRAINT Pracownik_Konto FOREIGN KEY Pracownik_Konto (id_pracownik)
    REFERENCES Konto (id_konto);

-- Reference: Wypozyczenie_Czytelnik (table: Wypozyczenie)
ALTER TABLE Wypozyczenie ADD CONSTRAINT Wypozyczenie_Czytelnik FOREIGN KEY Wypozyczenie_Czytelnik (id_czytelnik)
    REFERENCES Czytelnik (id_czytelnik);

-- Reference: Wypozyczenie_Pracownik (table: Wypozyczenie)
ALTER TABLE Wypozyczenie ADD CONSTRAINT Wypozyczenie_Pracownik FOREIGN KEY Wypozyczenie_Pracownik (id_pracownik)
    REFERENCES Pracownik (id_pracownik);

-- Reference: Wypozyczenie_Zasoby (table: Wypozyczenie)
ALTER TABLE Wypozyczenie ADD CONSTRAINT Wypozyczenie_Zasoby FOREIGN KEY Wypozyczenie_Zasoby (id_zasob)
    REFERENCES Zasoby (id_zasob);

-- Reference: Zasoby_Autor (table: Zasoby)
ALTER TABLE Zasoby ADD CONSTRAINT Zasoby_Autor FOREIGN KEY Zasoby_Autor (id_autor)
    REFERENCES Autor (id_autor);

-- Reference: Zasoby_Kategoria_dict (table: Zasoby)
ALTER TABLE Zasoby ADD CONSTRAINT Zasoby_Kategoria_dict FOREIGN KEY Zasoby_Kategoria_dict (id_kategoria)
    REFERENCES Kategoria_dict (id_kategoria);

-- Reference: Zasoby_Status_aktywnosci_dict (table: Zasoby)
ALTER TABLE Zasoby ADD CONSTRAINT Zasoby_Status_aktywnosci_dict FOREIGN KEY Zasoby_Status_aktywnosci_dict (id_status_aktywnosci)
    REFERENCES Status_aktywnosci_dict (id_status_aktywnosci);

-- End of file.

