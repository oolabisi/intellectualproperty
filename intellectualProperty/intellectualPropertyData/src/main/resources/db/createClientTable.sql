/********************************************************************************
 Project: Intellectual Property database
 Author: Johnson Adebayo
 purpose: clients table creation
 Date: 11-02-2020

********************************************************************************/
drop schema if exists `intellectualproperty`;
create schema intellectualproperty;

use `intellectualproperty`;

DROP TABLE IF EXISTS `clients`;

CREATE TABLE `clients` (
	`clientid` INT,
	`firstname` VARCHAR (40) NOT NULL,
	`lastname` VARCHAR (40) NOT NULL,
	`email` VARCHAR(50) NOT NULL,
	`password` VARCHAR(20) NOT NULL,
    `phone` VARCHAR(20) NOT NULL,
    `nationality` VARCHAR(45) NOT NULL,
  	PRIMARY KEY (`clientid`)
);


INSERT INTO `clients`
VALUES
(1, "Johnson", "Adebayo", "j.adebayo@phoruspet.com","olumba","090234678","Nigerian");


