-- CREATE SCHEMA IF NOT EXISTS intellectualproperty;-- 


use intellectualproperty;
-- -----------------------------------------------------
-- Table `intellectualpropertydb`.`usertb`

-- -----------------------------------------------------
DROP TABLE IF EXISTS legalfirms;

CREATE TABLE `legalfirms` (
  firmid int,
  firmname varchar(45) ,
  firmaddress varchar(45),
  firmphonenumber varchar(45),
  firmemail varchar(45),
  PRIMARY KEY (firmid)
  );
  
  
  
insert into legalfirms
 values(1, "Delano Partners", "45 berkley street", "2348023223443", "delano@delanolegal.com"),
 (2, "Templars Partners", "5 Gerard road ikoyi", "234895245324", "templars@templar.com");
