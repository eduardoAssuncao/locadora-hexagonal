INSERT INTO cliente_entity (id, nome, email, telefone, senha) VALUES (1, 'João Silva', 'joao.silva@example.com', '11999999999', 'senha123');
INSERT INTO cliente_entity (id, nome, email, telefone, senha) VALUES (2, 'Maria Souza', 'maria.souza@example.com', '21988888888', 'senha123');
INSERT INTO cliente_entity (id, nome, email, telefone, senha) VALUES (3, 'Carlos Pereira', 'carlos.pereira@example.com', '31977777777', 'senha123');
INSERT INTO cliente_entity (id, nome, email, telefone, senha) VALUES (4, 'Ana Costa', 'ana.costa@example.com', '41966666666', 'senha123');
INSERT INTO cliente_entity (id, nome, email, telefone, senha) VALUES (5, 'Lucas Fernandes', 'lucas.fernandes@example.com', '51955555555', 'senha123');

INSERT INTO locacao_entity (id, data, cliente_id) VALUES (1, '2024-09-01', 1);
INSERT INTO locacao_entity (id, data, cliente_id) VALUES (2, '2024-09-02', 2);
INSERT INTO locacao_entity (id, data, cliente_id) VALUES (3, '2024-09-03', 3);
INSERT INTO locacao_entity (id, data, cliente_id) VALUES (4, '2024-09-04', 4);
INSERT INTO locacao_entity (id, data, cliente_id) VALUES (5, '2024-09-05', 5);

INSERT INTO jogo_entity (id, titulo) VALUES (1, 'The Legend of Zelda: Breath of the Wild');
INSERT INTO jogo_entity (id, titulo) VALUES (2, 'God of War');
INSERT INTO jogo_entity (id, titulo) VALUES (3, 'Red Dead Redemption 2');
INSERT INTO jogo_entity (id, titulo) VALUES (4, 'The Witcher 3: Wild Hunt');
INSERT INTO jogo_entity (id, titulo) VALUES (5, 'Super Mario Odyssey');

INSERT INTO plataforma_entity (id, nome) VALUES (1, 'Nintendo Switch');
INSERT INTO plataforma_entity (id, nome) VALUES (2, 'PlayStation 4');
INSERT INTO plataforma_entity (id, nome) VALUES (3, 'Xbox One');
INSERT INTO plataforma_entity (id, nome) VALUES (4, 'PC');
INSERT INTO plataforma_entity (id, nome) VALUES (5, 'PlayStation 5');

INSERT INTO jogo_plataforma_entity (jogo_id, plataforma_id, preco_diario) VALUES (1, 1, 19.99);
INSERT INTO jogo_plataforma_entity (jogo_id, plataforma_id, preco_diario) VALUES (1, 2, 19.99);
INSERT INTO jogo_plataforma_entity (jogo_id, plataforma_id, preco_diario) VALUES (2, 1, 24.99);
INSERT INTO jogo_plataforma_entity (jogo_id, plataforma_id, preco_diario) VALUES (3, 2, 29.99);
INSERT INTO jogo_plataforma_entity (jogo_id, plataforma_id, preco_diario) VALUES (3, 3, 29.99);
INSERT INTO jogo_plataforma_entity (jogo_id, plataforma_id, preco_diario) VALUES (4, 3, 34.99);
INSERT INTO jogo_plataforma_entity (jogo_id, plataforma_id, preco_diario) VALUES (5, 1, 14.99);
INSERT INTO jogo_plataforma_entity (jogo_id, plataforma_id, preco_diario) VALUES (5, 2, 14.99);

INSERT INTO item_locacao_entity (locacao_id, jogo_id, plataforma_id, dias, quantidade) VALUES (1, 1, 1, 7, 1);
INSERT INTO item_locacao_entity (locacao_id, jogo_id, plataforma_id, dias, quantidade) VALUES (2, 1, 2, 5, 2);
INSERT INTO item_locacao_entity (locacao_id, jogo_id, plataforma_id, dias, quantidade) VALUES (3, 3, 2, 3, 1);
INSERT INTO item_locacao_entity (locacao_id, jogo_id, plataforma_id, dias, quantidade) VALUES (4, 3, 3, 10, 3);
INSERT INTO item_locacao_entity (locacao_id, jogo_id, plataforma_id, dias, quantidade) VALUES (5, 5, 1, 14, 1);


