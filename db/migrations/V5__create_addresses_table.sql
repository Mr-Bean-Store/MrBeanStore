CREATE TABLE addresses (
  id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
  latitude FLOAT NOT NULL,
  longitude FLOAT NOT NULL
);