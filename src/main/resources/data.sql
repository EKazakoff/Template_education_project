INSERT INTO Organization (id, name, full_org_name, inn, kpp, address, phone, is_active) VALUES (11, 'Райффайзенбанк',
'АО "Райффайзенбанк"', 7744000302, 770201001, 'Андропова пр-т, 18 к 2, Москва', '84957219100', true );

INSERT INTO Office (id, name, org_id, address, phone, is_active) VALUES (12, 'Западный', 11, 'ул.Живописная, 19, Москва',
 '84957211234', true);

INSERT INTO Document (id, name, code) VALUES (1, 'пасспорт', 21);
INSERT INTO Document (id, name, code) VALUES (2, 'водительское удостоверение', 22);
INSERT INTO Document (id, name, code) VALUES (3, 'заграничный паспорт', 23);

INSERT INTO Country (id, name, code) VALUES (7, 'Российская Федерация', 643);

INSERT INTO User (id, first_name, second_name, middle_name, position, office_id, phone, citizenship_code, is_identified)
VALUES (1, 'Максим', 'Умнов', NULL, 'программист', 12, NULL, 7, NULL);
INSERT INTO User (id, first_name, second_name, middle_name, position, office_id, phone, citizenship_code, is_identified)
VALUES (2, 'Сергей', 'Хитров', NULL, 'продавец', 12, NULL, 7, NULL);
INSERT INTO User (id, first_name, second_name, middle_name, position, office_id, phone, citizenship_code, is_identified)
VALUES (3, 'Наталья', 'Шустрова', NULL, 'бухгалтер', 12, NULL, 7, NULL);

INSERT INTO User_document (id, user_id, doc_code, doc_number, doc_data) VALUES (1, 3, 1, 975, 'Выдан ОВД');
INSERT INTO User_document (id, user_id, doc_code, doc_number, doc_data) VALUES (2, 2, 2, 597, 'Выдан ГАИ');
INSERT INTO User_document (id, user_id, doc_code, doc_number, doc_data) VALUES (3, 1, 3, 711, 'Выдан спец. отделом ОВД');









