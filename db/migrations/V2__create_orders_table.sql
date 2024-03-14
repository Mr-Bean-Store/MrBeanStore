CREATE TABLE orders (
  id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  customer_id INTEGER,
  delivery_addess_id INTEGER NOT NULL,
  created_date TIMESTAMP WITH TIME ZONE NOT NULL,
  completed_date TIMESTAMP WITH TIME ZONE NOT NULL
);