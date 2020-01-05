DROP TABLE IF EXISTS person;

CREATE TABLE person (
	id					 	UUID	        NOT NULL DEFAULT random_uuid(),
	name			        NVARCHAR(128)   NOT NULL,
	age                     INT,
	CONSTRAINT pk_uzytkownik_atena PRIMARY KEY (id)
);

INSERT INTO person (name, age) VALUES ('Adam', 5);
INSERT INTO person (name, age) VALUES ('Ewa', 15);
INSERT INTO person (name, age) VALUES ('Zenon', 75);