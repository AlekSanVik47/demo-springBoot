DROP TABLE IF EXISTS users;
CREATE TABLE IF NOT EXISTS users (id BIGSERIAL PRIMARY KEY, login TEXT NOT NULL, password TEXT NOT NULL);
