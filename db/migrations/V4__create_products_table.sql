CREATE TABLE products (
  id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  serial_number VARCHAR(20) NOT NULL,
  model_id INTEGER NOT NULL
);