-- CREATE SCHEMA IF NOT EXISTS intellectualproperty;-- 


use intellectualproperty;
-- -----------------------------------------------------
-- Table `intellectualpropertydb`.`usertb`

-- -----------------------------------------------------





DROP TABLE IF EXISTS agentcompany;

CREATE TABLE `agentcompany` (
  companyid int,
  companyname varchar(45) ,
  companyaddress varchar(45),
  companyphonenumber varchar(45),
  companyemail varchar(45),
  PRIMARY KEY (companyid)
  );
  
  
insert into agentcompany
 values(1, "Delano Partners", "45 berkley street", "2348023223443", "delano@delanolegal.com");
