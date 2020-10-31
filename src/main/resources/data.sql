INSERT INTO Document (name, code) VALUES ('пасспорт', 21);

INSERT INTO Country (name, code) VALUES ('страна', 212);

INSERT INTO User_document (id, doc_code, doc_number, doc_data) VALUES (3, 21, 975, '2005-12-31 23:59:59');

INSERT INTO User (id, first_name, second_name, middle_name, position, phone, user_doc_id, citizenship_code, is_identified)
            VALUES (1, 'Александр', 'Петров', NULL, 'программист', NULL, 3, 212, NULL);

INSERT INTO Organization (id, name, full_org_name, inn, kpp, address, phone, is_active) VALUES (11, 'Райффайзенбанк',
'АО "Райффайзенбанк"', 7744000302, 770201001, 'Андропова пр-т, 18 к 2, Москва', '84957219100', true );

INSERT INTO Office (id, name, address, phone, is_active) VALUES (12, 'Центральный','Андропова пр-т, 18 к 2, Москва',
 '84957219101', true);