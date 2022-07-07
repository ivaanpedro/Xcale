INSERT INTO chat (id_chat, name, nickname, number, chat_type) VALUES (1, 'carlos', '', '42512345', 1);
INSERT INTO chat (id_chat, name, nickname, number, chat_type) VALUES (2, 'juan', '', '4815235', 1);
INSERT INTO chat (id_chat, name, nickname, number, chat_type) VALUES (3, '', 'grupo1', '', 2);
INSERT INTO chat (id_chat, name, nickname, number, chat_type) VALUES (4, '', 'grupo2', '', 2);
INSERT INTO chat (id_chat, name, nickname, number, chat_type) VALUES (5, 'jorge', '', '1234567', 1);

INSERT INTO chat_contacts (group_id_chat, contacts_id_chat) VALUES (3,1);
INSERT INTO chat_contacts (group_id_chat, contacts_id_chat) VALUES (3,2);
INSERT INTO chat_contacts (group_id_chat, contacts_id_chat) VALUES (4,1);
INSERT INTO chat_contacts (group_id_chat, contacts_id_chat) VALUES (4,2);
INSERT INTO chat_contacts (group_id_chat, contacts_id_chat) VALUES (4,5);

INSERT INTO message (id_message, send_date, text, chat_id_chat) VALUES (1,'2022-7-07', 'prueba mensaje', 1);
INSERT INTO message (id_message, send_date, text, chat_id_chat) VALUES (2,'2022-7-07', 'mensaje', 1);
INSERT INTO message (id_message, send_date, text, chat_id_chat) VALUES (3,'2022-7-07', 'esto es un mensaje', 1);
INSERT INTO message (id_message, send_date, text, chat_id_chat) VALUES (4,'2022-7-07', 'nuevo mensaje', 3);

INSERT INTO person (id_person, dni, name) VALUES (1, '12586958', 'ivan');
INSERT INTO person (id_person, dni, name) VALUES (2, '4586958', 'matias');
INSERT INTO person (id_person, dni, name) VALUES (3, '33586958', 'carla');

INSERT INTO person_chats (person_id_person, chats_id_chat) VALUES (1, 1);
INSERT INTO person_chats (person_id_person, chats_id_chat) VALUES (1, 3);
INSERT INTO person_chats (person_id_person, chats_id_chat) VALUES (2, 4);