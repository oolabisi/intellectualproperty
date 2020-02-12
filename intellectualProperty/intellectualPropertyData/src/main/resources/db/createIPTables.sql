
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `intellectualproperty` ;


CREATE SCHEMA IF NOT EXISTS `intellectualproperty` DEFAULT CHARACTER SET utf8 ;
USE `intellectualproperty` ;

DROP TABLE IF EXISTS `intellectualproperty`.`agent` ;
CREATE TABLE IF NOT EXISTS `agent` (

  `agentid` INT(11) ,
  `firstname` VARCHAR(40) NOT NULL,
  `lastname` VARCHAR(40) NOT NULL,
  `email` VARCHAR(50) NOT NULL,
  `password` VARCHAR(20) NULL DEFAULT NULL,
  `phone` VARCHAR(20) NULL DEFAULT NULL,
  `nationality` VARCHAR(45) NOT NULL,
primary key (`agentid`)

)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

 
insert into agent 
values
(1, "Vincent", "Tester", "test@tester.com", "pass123", "123456789", "malaysia"),
(2, "Ade", "Adeoye", "ade@adeoye.com", "passwd123", "1256789998", "nigeria");