CREATE DATABASE hlc5;

CREATE TABLE productos (id int PRIMARY KEY, nombre VARCHAR(25), precio float, fechaProduccion date, imagen VARCHAR(25));

INSERT INTO productos VALUES (1, 'Zapatillas', 56.99, '2021-03-11', 'imagen1.jpg');
INSERT INTO productos VALUES (2, 'Raqueta', 20.59, '2021-03-11', 'imagen2.jpg');
INSERT INTO productos VALUES (3, 'Pelota', 3.50, '2021-03-11', 'imagen3.jpg');
INSERT INTO productos VALUES (4, 'Red', 3.50, '2021-03-11', 'imagen4.jpg');