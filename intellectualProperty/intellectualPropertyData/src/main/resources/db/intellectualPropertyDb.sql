-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema intellectualpropertydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema intellectualpropertydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `intellectualpropertydb` DEFAULT CHARACTER SET utf8 ;
USE `intellectualpropertydb` ;

-- -----------------------------------------------------
-- Table `intellectualpropertydb`.`usertb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `intellectualpropertydb`.`usertb` (
  `userID` INT(11) NOT NULL AUTO_INCREMENT,
  `firstName` VARCHAR(20) CHARACTER SET 'utf8' NOT NULL,
  `lastName` VARCHAR(20) CHARACTER SET 'utf8' NOT NULL,
  `email` VARCHAR(50) CHARACTER SET 'utf8' NULL DEFAULT NULL COMMENT 'user\'s email address',
  PRIMARY KEY (`userID`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `intellectualpropertydb`.`regdetailtb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `intellectualpropertydb`.`regdetailtb` (
  `USERTB_userID` INT(11) NOT NULL,
  `nameOfTradeMark` VARCHAR(50) CHARACTER SET 'utf8' NOT NULL,
  `companyName` VARCHAR(100) CHARACTER SET 'utf8' NOT NULL,
  `classOfTradeMark` INT(11) NOT NULL,
  `dateOfReg` DATE NOT NULL,
  `email` VARCHAR(100) CHARACTER SET 'utf8' NOT NULL,
  `nationality` VARCHAR(50) CHARACTER SET 'utf8' NOT NULL,
  `officeAddress` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`nameOfTradeMark`),
  INDEX `fk_REGDETAILTB_USERTB_idx` (`USERTB_userID` ASC) VISIBLE,
  CONSTRAINT `fk_REGDETAILTB_USERTB`
    FOREIGN KEY (`USERTB_userID`)
    REFERENCES `intellectualpropertydb`.`usertb` (`userID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `intellectualpropertydb`.`trademarktb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `intellectualpropertydb`.`trademarktb` (
  `tradeMarkNum` INT(11) NOT NULL,
  `REGDETAILTB_nameOfTradeMark` VARCHAR(50) CHARACTER SET 'utf8' NOT NULL,
  PRIMARY KEY (`tradeMarkNum`),
  INDEX `fk_TRADEMARKTB_REGDETAILTB1_idx` (`REGDETAILTB_nameOfTradeMark` ASC) VISIBLE,
  CONSTRAINT `fk_TRADEMARKTB_REGDETAILTB1`
    FOREIGN KEY (`REGDETAILTB_nameOfTradeMark`)
    REFERENCES `intellectualpropertydb`.`regdetailtb` (`nameOfTradeMark`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;