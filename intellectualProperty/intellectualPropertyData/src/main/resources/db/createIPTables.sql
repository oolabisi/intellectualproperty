use `intellectualpropertydb` ;
-- -----------------------------------------------------
-- Table `intellectualpropertydb`.`usertb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `A` (
  `userID` INT(11) NOT NULL AUTO_INCREMENT,
  `firstName` VARCHAR(20) NOT NULL,
  `lastName` VARCHAR(20) NOT NULL,
  `email` VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (`userID`));
 