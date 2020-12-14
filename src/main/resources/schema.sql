CREATE TABLE IF NOT EXISTS User
(
    id               INTEGER               COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT,
    first_name       VARCHAR(50)  NOT NULL COMMENT 'Имя',
    second_name      VARCHAR(50)  NOT NULL COMMENT 'Фамилия',
    middle_name      VARCHAR(50)           COMMENT 'Отчество',
    position         VARCHAR(50)  NOT NULL COMMENT 'Должность',
    office_id        INTEGER               COMMENT 'Внешний ключ на офис',
    phone            VARCHAR(15)           COMMENT 'Номер телефона',
    citizenship_code INTEGER               COMMENT 'Внешний ключ на документ, содержащий код страны',
    is_identified    BOOLEAN               COMMENT 'Определён/не определён'
);
COMMENT ON TABLE User IS 'Пользователь';

CREATE TABLE IF NOT EXISTS User_document
(
    id               INTEGER               COMMENT 'Уникальный идентификатор',
    user_id          INTEGER      NOT NULL COMMENT 'Внешний ключ на пользователя ',
    doc_code         INTEGER      NOT NULL COMMENT 'Внешний ключ на справочник',
    doc_number       INTEGER      NOT NULL COMMENT 'Номер документа',
    doc_data         VARCHAR(512) NOT NULL COMMENT 'Данные документа'
);
COMMENT ON TABLE User_document IS 'Документ пользователя';

CREATE TABLE IF NOT EXISTS Organization
(
    id               INTEGER               COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT,
    name             VARCHAR(128) NOT NULL COMMENT 'Название организации',
    full_org_name    VARCHAR(128) NOT NULL COMMENT 'Полное название организации',
    inn              VARCHAR(12)  NOT NULL COMMENT 'ИНН организации',
    kpp              VARCHAR(12)  NOT NULL COMMENT 'КПП организации',
    address          VARCHAR(128) NOT NULL COMMENT 'Адрес организации',
    phone            VARCHAR(15)           COMMENT 'Номер телефона ',
    is_active        BOOLEAN               COMMENT 'Действующий/не действующий'
);
COMMENT ON TABLE Organization IS 'Организация';

CREATE TABLE IF NOT EXISTS Office
(
    id               INTEGER               COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT,
    name             VARCHAR(128) NOT NULL COMMENT 'Название офиса',
    org_id           VARCHAR(20)  NOT NULL COMMENT 'Внешний ключ на организацию',
    address          VARCHAR(128) NOT NULL COMMENT 'Адрес офиса',
    phone            VARCHAR(15)           COMMENT 'Номер телефона',
    is_active        BOOLEAN               COMMENT 'Действующий/не действующий'
);
COMMENT ON TABLE Office IS 'Офис';

CREATE TABLE IF NOT EXISTS Document
(
    id               INTEGER      COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT,
    name             VARCHAR(256) COMMENT 'Тип документа',
    code             INTEGER      COMMENT 'Код документа'
);
COMMENT ON TABLE Document IS 'Документ';

CREATE TABLE IF NOT EXISTS Country
(
    id               INTEGER      COMMENT 'Уникальный идентификатор' PRIMARY KEY AUTO_INCREMENT,
    name             VARCHAR(256) COMMENT 'Страна, выдавшая документ',
    code             INTEGER      COMMENT 'Код страны, выдавшей документ'
);
COMMENT ON TABLE Country IS 'Страна';

CREATE INDEX IX_User_Id         ON User (id);
CREATE INDEX IX_Organization_Id ON Organization (id);
CREATE INDEX IX_Office_Id       ON Office (id);

ALTER TABLE User          ADD FOREIGN KEY (citizenship_code) REFERENCES Country (id);
ALTER TABLE User_document ADD FOREIGN KEY (doc_code)         REFERENCES Document (id);
ALTER TABLE User          ADD FOREIGN KEY (office_id)        REFERENCES Office (id);
ALTER TABLE Office        ADD FOREIGN KEY (org_id)           REFERENCES Organization (id);
ALTER TABLE User_document ADD FOREIGN KEY (user_id)          REFERENCES User (id);