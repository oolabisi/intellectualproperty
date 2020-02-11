

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema intellectualproperty
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `intellectualproperty` ;

-- -----------------------------------------------------
-- Schema intellectualproperty
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `intellectualproperty` DEFAULT CHARACTER SET utf8 ;
USE `intellectualproperty` ;

-- -----------------------------------------------------
-- Table `intellectualproperty`.`ipusers`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `intellectualproperty`.`ipusers` ;

CREATE TABLE IF NOT EXISTS `intellectualproperty`.`ipusers` (
  `userid` INT(11) NOT NULL,
  `firstname` VARCHAR(40) NOT NULL,
  `lastname` VARCHAR(40) NOT NULL,
  `email` VARCHAR(50) NOT NULL,
  `password` VARCHAR(20) NULL DEFAULT NULL,
  `phone` VARCHAR(20) NULL DEFAULT NULL,
  `nationality` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`userid`),
  UNIQUE INDEX `email` (`email` ASC) VISIBLE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `intellectualproperty`.`usercompany`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `intellectualproperty`.`usercompany` ;

CREATE TABLE IF NOT EXISTS `intellectualproperty`.`usercompany` (
  `usercompanyid` INT(11) NOT NULL,
  `companyname` VARCHAR(50) NOT NULL,
  `address` VARCHAR(100) NULL DEFAULT NULL,
  `email` VARCHAR(40) NULL DEFAULT NULL,
  `phone` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`usercompanyid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `intellectualproperty`.`trademarkapplication`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `intellectualproperty`.`trademarkapplication` ;

CREATE TABLE IF NOT EXISTS `intellectualproperty`.`trademarkapplication` (
  `trademarkid` INT(11) NOT NULL,
  `clientcompanyid` INT(11) NOT NULL,
  `description_of_goods_service` VARCHAR(100) NOT NULL,
  `createdDate` DATE NOT NULL,
  `submissionDate` DATE NULL DEFAULT NULL,
  `approvalDate` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`trademarkid`),
  INDEX `fk ip clientid` (`clientcompanyid` ASC) VISIBLE,
  CONSTRAINT `fk ip clientid`
    FOREIGN KEY (`clientcompanyid`)
    REFERENCES `intellectualproperty`.`usercompany` (`usercompanyid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `intellectualproperty`.`userrole`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `intellectualproperty`.`userrole` ;

CREATE TABLE IF NOT EXISTS `intellectualproperty`.`userrole` (
  `roleid` INT(11) NOT NULL,
  `rolename` VARCHAR(20) NOT NULL,
  `descriptions` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`roleid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `intellectualproperty`.`usercompanyrole`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `intellectualproperty`.`usercompanyrole` ;

CREATE TABLE IF NOT EXISTS `intellectualproperty`.`usercompanyrole` (
  `userid` INT(11) NOT NULL,
  `usercompanyid` INT(11) NOT NULL,
  `roleid` INT(11) NOT NULL,
  PRIMARY KEY (`userid`, `usercompanyid`, `roleid`),
  INDEX `fk ip usercompid` (`usercompanyid` ASC) VISIBLE,
  INDEX `fk ip roleid` (`roleid` ASC) VISIBLE,
  CONSTRAINT `fk ip roleid`
    FOREIGN KEY (`roleid`)
    REFERENCES `intellectualproperty`.`userrole` (`roleid`),
  CONSTRAINT `fk ip usercompid`
    FOREIGN KEY (`usercompanyid`)
    REFERENCES `intellectualproperty`.`usercompany` (`usercompanyid`),
  CONSTRAINT `fk ip userid`
    FOREIGN KEY (`userid`)
    REFERENCES `intellectualproperty`.`ipusers` (`userid`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `intellectualproperty`.`patentapplication`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `intellectualproperty`.`patentapplication` ;

CREATE TABLE IF NOT EXISTS `intellectualproperty`.`patentapplication` (
  `patentid` INT NOT NULL,
  `clientcompanyid` INT NULL,
  `description_of_goods_service` VARCHAR(45) NOT NULL,
  `inventorPhoneNumber` VARCHAR(45) NOT NULL,
  `inventorAddress` VARCHAR(45) NOT NULL,
  `inventorNationality` VARCHAR(45) NOT NULL,
  `inventorEmail` VARCHAR(45) NOT NULL,
  `createdDate` DATE NULL,
  `submissionDate` DATE NULL,
  `approvalDate` DATE NULL,
  PRIMARY KEY (`patentid`),
  INDEX `clientcompanyid_idx` (`clientcompanyid` ASC) VISIBLE,
  CONSTRAINT `clientcompanyid`
    FOREIGN KEY (`clientcompanyid`)
    REFERENCES `intellectualproperty`.`usercompany` (`usercompanyid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `intellectualproperty`.`copyrightapplication`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `intellectualproperty`.`copyrightapplication` ;

CREATE TABLE IF NOT EXISTS `intellectualproperty`.`copyrightapplication` (
  `copyrightid` INT NOT NULL,
  `clientcompanyid` INT NOT NULL,
  `categories_of_work` VARCHAR(45) NOT NULL,
  `title_of_work` VARCHAR(70) NOT NULL,
  `medium_of_fixation` VARCHAR(20) NOT NULL,
  `is_work_published` VARCHAR(3) NOT NULL,
  `bibliography_issn` VARCHAR(20) NOT NULL,
  `createdDate` DATE NULL,
  `submissionDate` DATE NULL,
  `approvalDate` DATE NULL,
  PRIMARY KEY (`copyrightid`),
  INDEX `clientcompanyid_idx` (`clientcompanyid` ASC) VISIBLE,
  CONSTRAINT `fk_clientcompanyid`
    FOREIGN KEY (`clientcompanyid`)
    REFERENCES `intellectualproperty`.`usercompany` (`usercompanyid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

