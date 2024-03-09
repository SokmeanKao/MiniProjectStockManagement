DROP TABLE products;

CREATE TABLE if not EXISTS products (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    unit_price DECIMAL(10, 2) NOT NULL,
    stock_quantity INTEGER NOT NULL,
    imported_date DATE NOT NULL
);
INSERT INTO products (name, unit_price, stock_quantity, imported_date) VALUES ('coca', 34.000000, 12, '2024-03-08');
INSERT INTO products (name, unit_price, stock_quantity, imported_date) VALUES ('Sting', 23.000000, 23, '2024-03-08');
