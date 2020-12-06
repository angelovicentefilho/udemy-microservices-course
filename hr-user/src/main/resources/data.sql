INSERT INTO users (name, email, password) values ('Angelo Vicente', 'angelo@email.com', '$2a$10$T7WegFimehlGoLvXFwDDaO.ErCL/x5gE/fOsJqVEsTLzM4.nGQiWG');
INSERT INTO users (name, email, password) values ('Gustavo Ames', 'gustavo@email.com', '$2a$10$T7WegFimehlGoLvXFwDDaO.ErCL/x5gE/fOsJqVEsTLzM4.nGQiWG');

INSERT INTO roles (name) VALUES ('ROLE_OPERATOR');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');

INSERT INTO users_has_roles (user_id, role_id) VALUES (1, 1);
INSERT INTO users_has_roles (user_id, role_id) VALUES (1, 2);
INSERT INTO users_has_roles (user_id, role_id) VALUES (2, 1);
