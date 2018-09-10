CREATE database csf;

CREATE TABLE user(
	userid int(11) NOT NULL AUTO_INCREMENT,
	firstname varchar(45) DEFAULT NULL,
	lastname varchar(45) DEFAULT NULL,
	email varchar(100) DEFAULT null,
	PRIMARY KEY (userid)
);