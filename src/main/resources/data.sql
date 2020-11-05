INSERT INTO Organization (id, name, full_org_name, inn, kpp, address, phone, is_active) VALUES (11, 'Райффайзенбанк',
'АО "Райффайзенбанк"', 7744000302, 770201001, 'Андропова пр-т, 18 к 2, Москва', '84957219100', true );

INSERT INTO Office (id, name, org_id, address, phone, is_active) VALUES (12, 'Центральный', 11, 'Андропова пр-т, 18 к 2, Москва',
 '84957219101', true);

INSERT INTO Document (id, name, code) VALUES (1, 'пасспорт', 21);
INSERT INTO Document (id, name, code) VALUES (2, 'водительское удостоверение', 22);
INSERT INTO Document (id, name, code) VALUES (3, 'заграничный паспорт', 23);

INSERT INTO Country (id, name, code) VALUES (7, 'Россия', 212);

INSERT INTO User_document (id, doc_code, doc_number, doc_data) VALUES (3, 1, 975, 'йцукенгшщз');
INSERT INTO User_document (id, doc_code, doc_number, doc_data) VALUES (4, 2, 597, 'зщшгнекуцйждлорпавы');
INSERT INTO User_document (id, doc_code, doc_number, doc_data) VALUES (5, 3, 711, 'ячсмитьбюфывапролдйцукенгшщ');

INSERT INTO User (id, first_name, second_name, middle_name, position, office_id, phone, user_doc_id, citizenship_code, is_identified)
            VALUES (1, 'Андрей', 'Тихонов', NULL, 'программист', 12, NULL, 3, 7, NULL);
INSERT INTO User (id, first_name, second_name, middle_name, position, office_id, phone, user_doc_id, citizenship_code, is_identified)
            VALUES (2, 'Владимир', 'Соколов', NULL, 'продавец', 12, NULL, 4, 7, NULL);
INSERT INTO User (id, first_name, second_name, middle_name, position, office_id, phone, user_doc_id, citizenship_code, is_identified)
            VALUES (3, 'Наталья', 'Терехова', NULL, 'бухгалтер', 12, NULL, 5, 7, NULL);



