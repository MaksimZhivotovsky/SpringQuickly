CREATE TABLE book (
 id INT AUTO_INCREMENT PRIMARY KEY,
 name varchar(50) NOT NULL,
 author varchar(50) NOT NULL,
 pages DOUBLE NOT NULL
);


INSERT INTO book VALUES (1, 'Идиот', 'Достоевский Ф. М', 1000);
INSERT INTO book VALUES (2, 'Записки Юного врача', 'Достоевский Ф. М', 1000);