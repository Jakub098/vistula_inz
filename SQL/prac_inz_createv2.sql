-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2024-03-10 13:56:38.598

-- tables
-- Table: Film
CREATE TABLE Film (
    id_film int  NOT NULL AUTO_INCREMENT,
    nazwa varchar(64)  NOT NULL,
    opis varchar(128)  NOT NULL,
    dlugosc int  NOT NULL,
    CONSTRAINT Film_pk PRIMARY KEY (id_film)
);

-- Table: Miejsce
CREATE TABLE Miejsce (
    id_miejsce int  NOT NULL AUTO_INCREMENT,
    id_sala int  NOT NULL,
    rzad int  NOT NULL,
    miejsce int  NOT NULL,
    CONSTRAINT Miejsce_pk PRIMARY KEY (id_miejsce)
);

-- Table: Rezerwacja
CREATE TABLE Rezerwacja (
    id_rezerwacja int  NOT NULL AUTO_INCREMENT,
    id_seans int  NOT NULL,
    id_uzytkownik int  NOT NULL,
    data_rezerwacji datetime  NOT NULL,
    numer_rezerwacji varchar(64)  NOT NULL,
    CONSTRAINT Rezerwacja_pk PRIMARY KEY (id_rezerwacja)
);

-- Table: RezerwacjaMiejsce
CREATE TABLE RezerwacjaMiejsce (
    id_rezmsc int  NOT NULL,
    id_rezerwacja int  NOT NULL,
    id_miejsce int  NOT NULL,
    CONSTRAINT RezerwacjaMiejsce_pk PRIMARY KEY (id_rezmsc)
);

-- Table: Sala
CREATE TABLE Sala (
    id_sala int  NOT NULL AUTO_INCREMENT,
    numer int  NOT NULL,
    CONSTRAINT Sala_pk PRIMARY KEY (id_sala)
);

-- Table: Seans
CREATE TABLE Seans (
    id_seans int  NOT NULL AUTO_INCREMENT,
    id_film int  NOT NULL,
    id_sala int  NOT NULL,
    data_rozpoczecia datetime  NOT NULL,
    CONSTRAINT Seans_pk PRIMARY KEY (id_seans)
);

-- Table: Uzytkownik
CREATE TABLE Uzytkownik (
    id_uzytkownik int  NOT NULL AUTO_INCREMENT,
    email varchar(64)  NOT NULL,
    imie varchar(64)  NOT NULL,
    nazwisko varchar(64)  NOT NULL,
    CONSTRAINT Uzytkownik_pk PRIMARY KEY (id_uzytkownik)
);

-- foreign keys
-- Reference: Miejsce_Sala (table: Miejsce)
ALTER TABLE Miejsce ADD CONSTRAINT Miejsce_Sala FOREIGN KEY Miejsce_Sala (id_sala)
    REFERENCES Sala (id_sala);

-- Reference: RezerwacjaMiejsce_Miejsce (table: RezerwacjaMiejsce)
ALTER TABLE RezerwacjaMiejsce ADD CONSTRAINT RezerwacjaMiejsce_Miejsce FOREIGN KEY RezerwacjaMiejsce_Miejsce (id_miejsce)
    REFERENCES Miejsce (id_miejsce);

-- Reference: RezerwacjaMiejsce_Rezerwacja (table: RezerwacjaMiejsce)
ALTER TABLE RezerwacjaMiejsce ADD CONSTRAINT RezerwacjaMiejsce_Rezerwacja FOREIGN KEY RezerwacjaMiejsce_Rezerwacja (id_rezerwacja)
    REFERENCES Rezerwacja (id_rezerwacja);

-- Reference: Rezerwacja_Seans (table: Rezerwacja)
ALTER TABLE Rezerwacja ADD CONSTRAINT Rezerwacja_Seans FOREIGN KEY Rezerwacja_Seans (id_seans)
    REFERENCES Seans (id_seans);

-- Reference: Rezerwacja_Uzytkownik (table: Rezerwacja)
ALTER TABLE Rezerwacja ADD CONSTRAINT Rezerwacja_Uzytkownik FOREIGN KEY Rezerwacja_Uzytkownik (id_uzytkownik)
    REFERENCES Uzytkownik (id_uzytkownik);

-- Reference: Seans_Film (table: Seans)
ALTER TABLE Seans ADD CONSTRAINT Seans_Film FOREIGN KEY Seans_Film (id_film)
    REFERENCES Film (id_film);

-- Reference: Seans_Sala (table: Seans)
ALTER TABLE Seans ADD CONSTRAINT Seans_Sala FOREIGN KEY Seans_Sala (id_sala)
    REFERENCES Sala (id_sala);

-- End of file.

