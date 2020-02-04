use `intellectualpropertydb` ;
-- -----------------------------------------------------
-- Table `intellectualpropertydb`.`usertb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `users` (
  `userID` INT(11) NOT NULL AUTO_INCREMENT,
  `firstName` VARCHAR(20) NOT NULL,
  `lastName` VARCHAR(20) NOT NULL,
  `email` VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (`userID`));
  
  -- -----------------------------------------------------
-- Table `intellectualpropertydb`.`regdetailtb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `regdetails` (
  `USERTB_userID` INT(11) NOT NULL,
  `nameOfTradeMark` VARCHAR(50) NOT NULL,
  `companyName` VARCHAR(100) NOT NULL,
  `classOfTradeMark` INT(11) NOT NULL,
  `dateOfReg` DATE NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `nationality` VARCHAR(50) NOT NULL,
  `officeAddress` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`nameOfTradeMark`),
  INDEX `fk_REGDETAILTB_USERTB_idx` (`USERTB_userID` ASC) VISIBLE,
  CONSTRAINT `fk_REGDETAILTB_USERTB`
    FOREIGN KEY (`USERTB_userID`)
    REFERENCES `intellectualpropertydb`.`users` (`userID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `intellectualpropertydb`.`trademarktb`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `trademarks` (
  `tradeMarkNum` INT(11) NOT NULL,
  `REGDETAILTB_nameOfTradeMark` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`tradeMarkNum`),
  INDEX `fk_TRADEMARKTB_REGDETAILTB1_idx` (`REGDETAILTB_nameOfTradeMark` ASC) VISIBLE,
  CONSTRAINT `fk_TRADEMARKTB_REGDETAILTB1`
    FOREIGN KEY (`REGDETAILTB_nameOfTradeMark`)
    REFERENCES `intellectualpropertydb`.`regdetailtb` (`nameOfTradeMark`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;