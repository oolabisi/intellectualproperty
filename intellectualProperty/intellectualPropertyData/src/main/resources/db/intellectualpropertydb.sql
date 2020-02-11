-- MySQL Workbench Forward Engineering

-- SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
-- SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
-- SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema intellectualproperty
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema intellectualproperty
-- -----------------------------------------------------

--------------------------------------------------------------

CREATE SCHEMA IF NOT EXISTS `intellectualproperty` DEFAULT CHARACTER SET utf8 ;
USE `intellectualproperty` ;

-- -----------------------------------------------------
-- Table `intellectualproperty`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `intellectualproperty`.`role` (
  `roleID` INT NOT NULL,
  `client` VARCHAR(45) NULL,
  `agent` VARCHAR(45) NULL,
  `admin` VARCHAR(45) NULL,
  PRIMARY KEY (`roleID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `intellectualproperty`.`Tbd`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `intellectualproperty`.`Tbd` (
  `tbdID` INT NOT NULL,
  `roleID` VARCHAR(45) NULL,
  `companyID` VARCHAR(45) NULL,
  `loginID` VARCHAR(45) NULL,
  PRIMARY KEY (`tbdID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `intellectualproperty`.`login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `intellectualproperty`.`login` (
  `loginID` INT NOT NULL,
  `email` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `role` VARCHAR(45) NULL,
  `Tbd_tbdID` INT NOT NULL,
  PRIMARY KEY (`loginID`, `Tbd_tbdID`),
  INDEX `fk_login_Tbd1_idx` (`Tbd_tbdID` ASC) VISIBLE,
  CONSTRAINT `fk_login_Tbd1`
    FOREIGN KEY (`Tbd_tbdID`)
    REFERENCES `intellectualproperty`.`Tbd` (`tbdID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `intellectualproperty`.`registration`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `intellectualproperty`.`registration` (
  `registrationID` INT NOT NULL,
  `firstName` VARCHAR(45) NULL,
  `lastName` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `role` VARCHAR(45) NULL,
  `role_roleID` INT NOT NULL,
  `login_loginID` INT NOT NULL,
  PRIMARY KEY (`registrationID`, `role_roleID`, `login_loginID`),
  INDEX `fk_registration_role_idx` (`role_roleID` ASC) VISIBLE,
  INDEX `fk_registration_login1_idx` (`login_loginID` ASC) VISIBLE,
  CONSTRAINT `fk_registration_role`
    FOREIGN KEY (`role_roleID`)
    REFERENCES `intellectualproperty`.`role` (`roleID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_registration_login1`
    FOREIGN KEY (`login_loginID`)
    REFERENCES `intellectualproperty`.`login` (`loginID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `intellectualproperty`.`company`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `intellectualproperty`.`company` (
  `companyID` INT NOT NULL,
  `companyName` VARCHAR(45) NULL,
  `companyAddress` VARCHAR(45) NULL,
  `companyPhone` VARCHAR(45) NULL,
  `companyEmail` VARCHAR(45) NULL,
  `Tbd_tbdID` INT NOT NULL,
  `login_loginID` INT NOT NULL,
  `login_Tbd_tbdID` INT NOT NULL,
  PRIMARY KEY (`companyID`, `Tbd_tbdID`, `login_loginID`, `login_Tbd_tbdID`),
  INDEX `fk_company_Tbd1_idx` (`Tbd_tbdID` ASC) VISIBLE,
  INDEX `fk_company_login1_idx` (`login_loginID` ASC, `login_Tbd_tbdID` ASC) VISIBLE,
  CONSTRAINT `fk_company_Tbd1`
    FOREIGN KEY (`Tbd_tbdID`)
    REFERENCES `intellectualproperty`.`Tbd` (`tbdID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_company_login1`
    FOREIGN KEY (`login_loginID` , `login_Tbd_tbdID`)
    REFERENCES `intellectualproperty`.`login` (`loginID` , `Tbd_tbdID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `intellectualproperty`.`copyrightForm`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `intellectualproperty`.`copyrightForm` (
  `copyrightID` INT NOT NULL,
  `copyrightClassification` VARCHAR(45) NULL,
  PRIMARY KEY (`copyrightID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `intellectualproperty`.`patentform`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `intellectualproperty`.`patentform` (
  `patentID` INT NOT NULL,
  `patentTitle` VARCHAR(45) NULL,
  PRIMARY KEY (`patentID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `intellectualproperty`.`trademarkForm`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `intellectualproperty`.`trademarkForm` (
  `trademarkID` INT NOT NULL auto_increment,
  `applicantName` varchar(50) NOT NULL,
  `applicantPhoneNumber` int NOT NULL,
  `applicantAddress` nvarchar(50) NOT NULL,
  `applicantEmail` nvarchar(50) NOT NULL,
  `applicantNationality` varchar(50) NOT NULL,
  `classOfTrademark` VARCHAR(45) NOT NULL,
  `descriptionOfGoodsService` nvarchar(100) NOT NULL,
  `attorneyName` varchar(50) NOT NUll,
    `attorneyAddress` nvarchar(50) NOT NUll,
  `attorneyEmail` nvarchar(50) NOT NUll,
   `attorneyNationality` varchar(50) NOT NUll,
   `attorneyPhoneNUmber` int NOT NUll,
    `applicationDate` nvarchar(50) NOT NUll,
  PRIMARY KEY (`trademarkID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `intellectualproperty`.`applicationDetail`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `intellectualproperty`.`applicationDetail` (
  `applicationDetailID` INT NOT NULL,
  `loginID` VARCHAR(45) NULL,
  `roleID` VARCHAR(45) NULL,
  `companyID` VARCHAR(45) NULL,
  `iptypeID` VARCHAR(45) NULL,
  `specificForm` VARCHAR(45) NULL,
  `Status` VARCHAR(45) NULL,
  PRIMARY KEY (`applicationDetailID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `intellectualproperty`.`iptype`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `intellectualproperty`.`iptype` (
  `iptypeID` INT NOT NULL,
  `trademark` VARCHAR(45) NULL,
  `copyright` VARCHAR(45) NULL,
  `patent` VARCHAR(45) NULL,
  `Tbd_tbdID` INT NOT NULL,
  `copyrightForm_copyrightID` INT NOT NULL,
  `patentform_patentID` INT NOT NULL,
  `trademarkForm_trademarkID` INT NOT NULL,
  `applicationDetail_applicationDetailID` INT NOT NULL,
  PRIMARY KEY (`iptypeID`, `copyrightForm_copyrightID`, `patentform_patentID`, `trademarkForm_trademarkID`, `applicationDetail_applicationDetailID`),
  INDEX `fk_iptype_Tbd1_idx` (`Tbd_tbdID` ASC) VISIBLE,
  INDEX `fk_iptype_copyrightForm1_idx` (`copyrightForm_copyrightID` ASC) VISIBLE,
  INDEX `fk_iptype_patentform1_idx` (`patentform_patentID` ASC) VISIBLE,
  INDEX `fk_iptype_trademarkForm1_idx` (`trademarkForm_trademarkID` ASC) VISIBLE,
  INDEX `fk_iptype_applicationDetail1_idx` (`applicationDetail_applicationDetailID` ASC) VISIBLE,
  CONSTRAINT `fk_iptype_Tbd1`
    FOREIGN KEY (`Tbd_tbdID`)
    REFERENCES `intellectualproperty`.`Tbd` (`tbdID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_iptype_copyrightForm1`
    FOREIGN KEY (`copyrightForm_copyrightID`)
    REFERENCES `intellectualproperty`.`copyrightForm` (`copyrightID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_iptype_patentform1`
    FOREIGN KEY (`patentform_patentID`)
    REFERENCES `intellectualproperty`.`patentform` (`patentID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_iptype_trademarkForm1`
    FOREIGN KEY (`trademarkForm_trademarkID`)
    REFERENCES `intellectualproperty`.`trademarkForm` (`trademarkID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_iptype_applicationDetail1`
    FOREIGN KEY (`applicationDetail_applicationDetailID`)
    REFERENCES `intellectualproperty`.`applicationDetail` (`applicationDetailID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- SET SQL_MODE=@OLD_SQL_MODE;
-- SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
-- SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
