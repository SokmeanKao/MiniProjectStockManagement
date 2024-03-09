DROP TABLE products;

CREATE TABLE if not EXISTS products (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    unit_price DECIMAL(10, 2) NOT NULL,
    stock_quantity INTEGER NOT NULL,
    imported_date DATE NOT NULL
);
INSERT INTO products (name, unit_price, stock_quantity, imported_date) VALUES ('coffee', 10.000000, 19, '2024-03-09');
INSERT INTO products (name, unit_price, stock_quantity, imported_date) VALUES ('dog', 100.000000, 2, '2024-03-09');
INSERT INTO products (name, unit_price, stock_quantity, imported_date) VALUES ('Hello', 11.000000, 12, '2024-03-09');
INSERT INTO products (name, unit_price, stock_quantity, imported_date) VALUES ('coffee', 10.000000, 19, '2024-03-09');
INSERT INTO products (name, unit_price, stock_quantity, imported_date) VALUES ('laptop', 199.000000, 3, '2024-03-09');
