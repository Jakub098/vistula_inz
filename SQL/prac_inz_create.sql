-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2024-04-01 20:43:27.944

-- tables
-- Table: Audiobook
CREATE TABLE Audiobook (
    id_audiobook int  NOT NULL,
    id_lektor int  NOT NULL,
    id_kategoria int  NOT NULL,
    CONSTRAINT Audiobook_pk PRIMARY KEY (id_audiobook)
);

-- Table: Czytelnik
CREATE TABLE Czytelnik (
    id_czytelnik int  NOT NULL,
    numer_karty varchar(16)  NOT NULL,
    CONSTRAINT Czytelnik_pk PRIMARY KEY (id_czytelnik)
);

-- Table: Dostepnosc_dict
CREATE TABLE Dostepnosc_dict (
    id_dostepnosc int  NOT NULL AUTO_INCREMENT,
    nazwa varchar(3)  NOT NULL,
    CONSTRAINT Dostepnosc_dict_pk PRIMARY KEY (id_dostepnosc)
);

-- Table: Film
CREATE TABLE Film (
    id_film int  NOT NULL,
    rezyser varchar(64)  NOT NULL,
    id_kategoria int  NOT NULL,
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
    imie varchar(64)  NOT NULL,
    nazwisko varchar(64)  NOT NULL,
    CONSTRAINT Konto_pk PRIMARY KEY (id_konto)
);

-- Table: Ksiazka
CREATE TABLE Ksiazka (
    id_ksiazka int  NOT NULL,
    id_kategoria int  NOT NULL,
    isbn varchar(64)  NOT NULL,
    CONSTRAINT Ksiazka_pk PRIMARY KEY (id_ksiazka)
);

-- Table: Lektor
CREATE TABLE Lektor (
    id_lektor int  NOT NULL AUTO_INCREMENT,
    imie varchar(64)  NOT NULL,
    nazwisko varchar(64)  NOT NULL,
    CONSTRAINT Lektor_pk PRIMARY KEY (id_lektor)
);

-- Table: Pracownik
CREATE TABLE Pracownik (
    id_pracownik int  NOT NULL,
    id_aktywnosc int  NOT NULL,
    CONSTRAINT Pracownik_pk PRIMARY KEY (id_pracownik)
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
    rok_wydania date  NOT NULL,
    id_dostepnosc int  NOT NULL,
    CONSTRAINT Zasoby_pk PRIMARY KEY (id_zasob)
);

-- foreign keys
-- Reference: Audiobook_Kategoria (table: Audiobook)
ALTER TABLE Audiobook ADD CONSTRAINT Audiobook_Kategoria FOREIGN KEY Audiobook_Kategoria (id_kategoria)
    REFERENCES Kategoria_dict (id_kategoria);

-- Reference: Audiobook_Lektor (table: Audiobook)
ALTER TABLE Audiobook ADD CONSTRAINT Audiobook_Lektor FOREIGN KEY Audiobook_Lektor (id_lektor)
    REFERENCES Lektor (id_lektor);

-- Reference: Audiobook_Zasoby (table: Audiobook)
ALTER TABLE Audiobook ADD CONSTRAINT Audiobook_Zasoby FOREIGN KEY Audiobook_Zasoby (id_audiobook)
    REFERENCES Zasoby (id_zasob);

-- Reference: Czytelnik_Konto (table: Czytelnik)
ALTER TABLE Czytelnik ADD CONSTRAINT Czytelnik_Konto FOREIGN KEY Czytelnik_Konto (id_czytelnik)
    REFERENCES Konto (id_konto);

-- Reference: Dvd_Zasoby (table: Film)
ALTER TABLE Film ADD CONSTRAINT Dvd_Zasoby FOREIGN KEY Dvd_Zasoby (id_film)
    REFERENCES Zasoby (id_zasob);

-- Reference: Film_Kategoria (table: Film)
ALTER TABLE Film ADD CONSTRAINT Film_Kategoria FOREIGN KEY Film_Kategoria (id_kategoria)
    REFERENCES Kategoria_dict (id_kategoria);

-- Reference: Ksiazka_Kategoria (table: Ksiazka)
ALTER TABLE Ksiazka ADD CONSTRAINT Ksiazka_Kategoria FOREIGN KEY Ksiazka_Kategoria (id_kategoria)
    REFERENCES Kategoria_dict (id_kategoria);

-- Reference: Osoba_Zasoby (table: Ksiazka)
ALTER TABLE Ksiazka ADD CONSTRAINT Osoba_Zasoby FOREIGN KEY Osoba_Zasoby (id_ksiazka)
    REFERENCES Zasoby (id_zasob);

-- Reference: Pracownik_Dostepnosc_dict (table: Pracownik)
ALTER TABLE Pracownik ADD CONSTRAINT Pracownik_Dostepnosc_dict FOREIGN KEY Pracownik_Dostepnosc_dict (id_aktywnosc)
    REFERENCES Dostepnosc_dict (id_dostepnosc);

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

-- Reference: Zasoby_Dostepnosc_dict (table: Zasoby)
ALTER TABLE Zasoby ADD CONSTRAINT Zasoby_Dostepnosc_dict FOREIGN KEY Zasoby_Dostepnosc_dict (id_dostepnosc)
    REFERENCES Dostepnosc_dict (id_dostepnosc);

-- End of file.

