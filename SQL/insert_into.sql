INSERT INTO Status_aktywnosci_dict (nazwa) VALUES ('Tak'), ('Nie');

INSERT INTO Konto (data_zalozenia, imie, nazwisko, id_status_aktywnosci) VALUES 
('2024-01-01', 'Jan', 'Kowalski', 1),
('2024-01-05', 'Anna', 'Nowak', 1),
('2024-01-10', 'Piotr', 'Wiśniewski', 1),
('2024-01-15', 'Maria', 'Dąbrowska', 1),
('2024-01-20', 'Andrzej', 'Lewandowski', 2),
('2024-01-25', 'Magdalena', 'Wójcik', 2),
('2024-01-30', 'Krzysztof', 'Kamiński', 1),
('2024-02-01', 'Barbara', 'Kowalczyk', 2);

INSERT INTO Pracownik (id_pracownik) VALUES (1), (2);

INSERT INTO Czytelnik (id_czytelnik, numer_karty) VALUES 
(3, 'ABC123'),
(4, 'DEF456'),
(5, 'GHI789'),
(6, 'JKL012'),
(7, 'MNO345'),
(8, 'PQR678');

INSERT INTO Autor (imie, nazwisko) VALUES
('Adam', 'Mickiewicz'),
('Henryk', 'Sienkiewicz'),
('Juliusz', 'Słowacki'),
('Bolesław', 'Prus'),
('Stanisław', 'Wyspiański'),
('Quentin', 'Tarantino'),
('Christopher', 'Nolan'),
('Martin', 'Scorsese'),
('Steven', 'Spielberg'),
('David', 'Lynch'),
('J.R.R.', 'Tolkien'),
('George', 'R.R. Martin'),
('Stephen', 'King'),
('Agatha', 'Christie'),
('Haruki', 'Murakami');

INSERT INTO Kategoria_dict (nazwa) VALUES
('Komedia'),
('Dramat'),
('Science fiction'),
('Fantastyka'),
('Kryminał'),
('Horror');

INSERT INTO Zasoby (tytul, rok_wydania, id_status_aktywnosci, id_autor, id_kategoria) VALUES 
('Książka 1', 2000, 1, 1,1 ),
('Książka 2', 2005, 1, 2, 2),
('Książka 3', 2010, 1, 3, 3),
('Książka 4', 2015, 1, 4, 4),
('Książka 5', 2020, 1, 5, 5);

INSERT INTO Ksiazka (id_ksiazka, isbn)
VALUES 
(1, '9788373191723'),
(2, '9788373199859'),
(3, '9788373199866'),
(4, '9788373199873'),
(5, '9788373199880');

INSERT INTO Zasoby (tytul, rok_wydania, id_status_aktywnosci, id_autor, id_kategoria) VALUES 
('Film 1', 2000, 1, 6, 1),
('Film 2', 2005, 1, 7, 2),
('Film 3', 2010, 1, 8, 3),
('Film 4', 2015, 1, 9, 4),
('Film 5', 2020, 1, 10, 5);

INSERT INTO Film (id_film, dlugosc)
VALUES 
(6, 120),
(7, 135),
(8, 110),
(9, 150),
(10, 105);

INSERT INTO Zasoby (tytul, rok_wydania, id_status_aktywnosci, id_autor, id_kategoria) VALUES 
('Audiobook 1', 2000, 1, 11, 1),
('Audiobook 2', 2005, 1, 12, 2),
('Audiobook 3', 2010, 1, 13, 3),
('Audiobook 4', 2015, 1, 14, 4),
('Audiobook 5', 2020, 1, 15, 5);

INSERT INTO Audiobook (id_audiobook, ilosc_plyt)
VALUES 
(11, 5),
(12, 6),
(13, 4),
(14, 7),
(15, 3);

INSERT INTO Wypozyczenie (data_wypozyczenia, data_zwrotu, id_zasob, id_pracownik, id_czytelnik) VALUES 
('2024-04-01', '2024-04-15', 1, 1, 5),
('2024-04-02', '2024-04-16', 2, 1, 4),
('2024-04-03', '2024-04-17', 3, 2, 3),
('2024-04-04', '2024-04-18', 4, 2, 4),
('2024-04-05', '2024-04-19', 5, 1, 5),
('2024-04-06', '2024-04-20', 6, 1, 6),
('2024-04-07', '2024-04-21', 7, 2, 4),
('2024-04-08', '2024-04-22', 8, 2, 3),
('2024-04-09', '2024-04-23', 9, 1, 3),
('2024-04-10', '2024-04-24', 10, 1, 4),
('2024-04-11', '2024-04-25', 11, 2, 5),
('2024-04-12', '2024-04-26', 12, 2, 6),
('2024-04-13', '2024-04-27', 13, 1, 7),
('2024-04-14', '2024-04-28', 14, 1, 6),
('2024-04-15', '2024-04-29', 15, 2, 7);
