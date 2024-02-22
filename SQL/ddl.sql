-- Wypełnienie tabeli Film
INSERT INTO Film (nazwa, opis, dlugosc) VALUES
('Interstellar', 'Odyseja kosmiczna', 169),
('Incepcja', 'Głęboko w świadomości', 148),
('Django', 'Niezależny rewolwerowiec', 165),
('The Dark Knight', 'Mroczny bohater', 152),
('Shutter Island', 'Zagadkowa wyspa', 138);

-- Wypełnienie tabeli Sala
INSERT INTO Sala (numer) VALUES
(1),
(2),
(3),
(4);


INSERT INTO Seans (id_film, id_sala, data_rozpoczecia) VALUES
-- Seanse dla filmu "Interstellar"
(1, 1, '2024-02-23 10:00:00'),
(1, 2, '2024-02-24 15:00:00'),
(1, 3, '2024-02-25 18:00:00'),
-- Seanse dla filmu "Incepcja"
(2, 2, '2024-02-23 12:00:00'),
(2, 3, '2024-02-24 17:00:00'),
(2, 4, '2024-02-25 20:00:00'),
-- Seanse dla filmu "Django"
(3, 1, '2024-02-23 14:00:00'),
(3, 3, '2024-02-24 19:00:00'),
(3, 4, '2024-02-25 22:00:00'),
-- Seanse dla filmu "The Dark Knight"
(4, 4, '2024-02-23 16:00:00'),
(4, 1, '2024-02-24 20:00:00'),
(4, 2, '2024-02-25 23:00:00'),
-- Seanse dla filmu "Shutter Island"
(5, 3, '2024-02-23 18:00:00'),
(5, 4, '2024-02-24 21:00:00'),
(5, 1, '2024-02-25 12:00:00');


INSERT INTO Miejsce (id_sala, rzad, miejsce)
SELECT 
    s.id_sala,
    ROUND((ROW_NUMBER() OVER () - 1) / 10) + 1 AS rzad,
    (ROW_NUMBER() OVER () - 1) % 10 + 1 AS miejsce
FROM 
    Sala s
CROSS JOIN 
    Film f
LIMIT 
    120; 

INSERT INTO Uzytkownik (email, imie, nazwisko) VALUES
('user1@example.com', 'John', 'Smith'),
('user2@example.com', 'Alice', 'Johnson'),
('user3@example.com', 'Emily', 'Brown'),
('user4@example.com', 'Michael', 'Davis'),
('user5@example.com', 'Sarah', 'Wilson'),
('user6@example.com', 'David', 'Martinez');


INSERT INTO Rezerwacja (id_seans, id_uzytkownik, data_rezerwacji, numer_rezerwacji) VALUES
(1, 1, NOW(), 'R001'),
(3, 2, NOW(), 'R002');
