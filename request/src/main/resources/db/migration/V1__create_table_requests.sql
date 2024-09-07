CREATE TABLE IF NOT EXISTS requests (
    id SERIAL PRIMARY KEY,
    value numeric(19,2) NOT NULL,
    client_id bigint NOT NULL
);