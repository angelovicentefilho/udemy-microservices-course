INSERT INTO users (name, email, password) values ('Angelo Vicente', 'angelo@email.com', '$2a$10$9zHP1VCOpnseqEcb8Hy/NuQIcKsXgJqln9LJHKo8B/jO5BSVII0Mq');
INSERT INTO users (name, email, password) values ('Gustavo Ames', 'gustavo@email.com', '$2a$10$9zHP1VCOpnseqEcb8Hy/NuQIcKsXgJqln9LJHKo8B/jO5BSVII0Mq');

INSERT INTO roles (name) VALUES ('ROLE_OPERATOR');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');

INSERT INTO users_has_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO users_has_roles (user_id, role_id) VALUES (1, 2);
INSERT INTO users_has_roles (user_id, role_id) VALUES (2, 1);
