-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`procedure`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`procedure` ;

CREATE TABLE IF NOT EXISTS `mydb`.`procedure` (
  `code` INT NOT NULL,
  `name` TEXT NULL,
  `cost` REAL NULL,
  PRIMARY KEY (`code`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`physician`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`physician` ;

CREATE TABLE IF NOT EXISTS `mydb`.`physician` (
  `employeeid` INT NOT NULL,
  `name` TEXT NULL,
  `position` TEXT NULL,
  `ssn` INT NULL,
  PRIMARY KEY (`employeeid`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`patient`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`patient` ;

CREATE TABLE IF NOT EXISTS `mydb`.`patient` (
  `ssn` INT NOT NULL,
  `name` TEXT NULL,
  `address` TEXT NULL,
  `phone` TEXT NULL,
  `insuranceid` INT NULL,
  `pcp` INT NULL,
  PRIMARY KEY (`ssn`),
  INDEX `fk_pcppatient_idx` (`pcp` ASC) VISIBLE,
  CONSTRAINT `fk_pcpphys`
    FOREIGN KEY (`pcp`)
    REFERENCES `mydb`.`physician` (`employeeid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`nurse`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`nurse` ;

CREATE TABLE IF NOT EXISTS `mydb`.`nurse` (
  `employeeid` INT NOT NULL,
  `name` TEXT NULL,
  `position` TEXT NULL,
  `registered` BIT NULL,
  `ssn` INT NULL,
  PRIMARY KEY (`employeeid`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`appointment`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`appointment` ;

CREATE TABLE IF NOT EXISTS `mydb`.`appointment` (
  `appointmentid` INT NOT NULL,
  `patient` INT NULL,
  `prepnurse` INT NULL,
  `physician` INT NULL,
  `start_dt_time` TIMESTAMP NULL,
  `end_dt_time` TIMESTAMP NULL,
  `examinationroom` TEXT NULL,
  PRIMARY KEY (`appointmentid`),
  INDEX `fk_phy_appointment_idx` (`physician` ASC) VISIBLE,
  INDEX `fk_patient_appoointment_idx` (`patient` ASC) VISIBLE,
  INDEX `fk_prepnurse_appointment_idx` (`prepnurse` ASC) VISIBLE,
  CONSTRAINT `fk_phy_appointment`
    FOREIGN KEY (`physician`)
    REFERENCES `mydb`.`physician` (`employeeid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_patient_appoointment`
    FOREIGN KEY (`patient`)
    REFERENCES `mydb`.`patient` (`ssn`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_prepnurse_appointment`
    FOREIGN KEY (`prepnurse`)
    REFERENCES `mydb`.`nurse` (`employeeid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
constraint chk_d CHECK (`end_dt_time` > `start_dt_time`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`trained_in`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`trained_in` ;

CREATE TABLE IF NOT EXISTS `mydb`.`trained_in` (
  `physician` INT NOT NULL,
  `treatment` INT NOT NULL,
  `certificationdate` DATE NULL,
  `certificationexpires` DATE NULL,
  PRIMARY KEY (`physician`, `treatment`),
  INDEX `fk_treatment_idx` (`treatment` ASC) VISIBLE,
  CONSTRAINT `fk_treatment`
    FOREIGN KEY (`treatment`)
    REFERENCES `mydb`.`procedure` (`code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_physician`
    FOREIGN KEY (`physician`)
    REFERENCES `mydb`.`physician` (`employeeid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`medication`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`medication` ;

CREATE TABLE IF NOT EXISTS `mydb`.`medication` (
  `code` INT NOT NULL,
  `name` TEXT NULL,
  `brand` TEXT NULL,
  `description` TEXT NULL,
  PRIMARY KEY (`code`),
constraint chk_brand CHECK (`brand` in ("cipla","gsk")))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`prescribes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`prescribes` ;

CREATE TABLE IF NOT EXISTS `mydb`.`prescribes` (
  `physician` INT NOT NULL,
  `patient` INT NOT NULL,
  `medication` INT NOT NULL,
  `date` TIMESTAMP NOT NULL,
  `appointment` INT NULL,
  `dose` TEXT NULL,
  PRIMARY KEY (`physician`, `patient`, `medication`, `date`),
  INDEX `fk_medicaton_idx` (`medication` ASC) VISIBLE,
  INDEX `fk_patientpres_idx` (`patient` ASC) VISIBLE,
  INDEX `fk_appointmentpres_idx` (`appointment` ASC) VISIBLE,
  CONSTRAINT `fk_phypres`
    FOREIGN KEY (`physician`)
    REFERENCES `mydb`.`physician` (`employeeid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_medipres`
    FOREIGN KEY (`medication`)
    REFERENCES `mydb`.`medication` (`code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_patientpres`
    FOREIGN KEY (`patient`)
    REFERENCES `mydb`.`patient` (`ssn`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_appointmentpres`
    FOREIGN KEY (`appointment`)
    REFERENCES `mydb`.`appointment` (`appointmentid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
constraint chk_date1 CHECK (`date` <= sysdate()))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`department`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`department` ;

CREATE TABLE IF NOT EXISTS `mydb`.`department` (
  `departmentid` INT NOT NULL,
  `name` TEXT NULL,
  `head` INT NULL,
  PRIMARY KEY (`departmentid`),
  INDEX `fk_head_idx` (`head` ASC) VISIBLE,
  CONSTRAINT `fk_head`
    FOREIGN KEY (`head`)
    REFERENCES `mydb`.`physician` (`employeeid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`affiliated_with`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`affiliated_with` ;

CREATE TABLE IF NOT EXISTS `mydb`.`affiliated_with` (
  `physician` INT NOT NULL,
  `department` INT NOT NULL,
  `primaryaffiliation` BIT NULL,
  PRIMARY KEY (`physician`, `department`),
  INDEX `fk_department_idx` (`department` ASC) VISIBLE,
  CONSTRAINT `fk_dept`
    FOREIGN KEY (`department`)
    REFERENCES `mydb`.`department` (`departmentid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_phys`
    FOREIGN KEY (`physician`)
    REFERENCES `mydb`.`physician` (`employeeid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`block`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`block` ;

CREATE TABLE IF NOT EXISTS `mydb`.`block` (
  `blockfloor` INT NOT NULL,
  `blockcode` INT NOT NULL,
  PRIMARY KEY (`blockfloor`, `blockcode`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`room`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`room` ;

CREATE TABLE IF NOT EXISTS `mydb`.`room` (
  `roomnumber` INT NOT NULL,
  `roomtype` TEXT NULL,
  `blockfloor` INT NULL,
  `blockcode` INT NULL,
  `unavailable` BIT NULL,
  PRIMARY KEY (`roomnumber`),
  INDEX `fk_blockfloor_blockcode_room_idx` (`blockfloor` ASC, `blockcode` ASC) VISIBLE,
  CONSTRAINT `fk_blockfloor_blockcode_room`
    FOREIGN KEY (`blockfloor` , `blockcode`)
    REFERENCES `mydb`.`block` (`blockfloor` , `blockcode`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`stay`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`stay` ;

CREATE TABLE IF NOT EXISTS `mydb`.`stay` (
  `stayid` INT NOT NULL,
  `patient` INT NULL,
  `room` INT NULL,
  `start_time` TIMESTAMP NULL,
  `end_time` TIMESTAMP NULL,
  PRIMARY KEY (`stayid`),
  INDEX `fk_room_stay_idx` (`room` ASC) VISIBLE,
  INDEX `fk_patie_stay_idx` (`patient` ASC) VISIBLE,
  CONSTRAINT `fk_room_stay`
    FOREIGN KEY (`room`)
    REFERENCES `mydb`.`room` (`roomnumber`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_patie_stay`
    FOREIGN KEY (`patient`)
    REFERENCES `mydb`.`patient` (`ssn`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
constraint chk_d1 CHECK (`end_time` > `start_time`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`undergoes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`undergoes` ;

CREATE TABLE IF NOT EXISTS `mydb`.`undergoes` (
  `patient` INT NOT NULL,
  `procedure` INT NOT NULL,
  `stay` INT NOT NULL,
  `date` TIMESTAMP NOT NULL,
  `physician` INT NULL,
  `assistingnurse` INT NULL,
  PRIMARY KEY (`patient`, `procedure`, `stay`, `date`),
  INDEX `fk_procedure_idx` (`procedure` ASC) VISIBLE,
  INDEX `fk_phy_under_idx` (`physician` ASC) VISIBLE,
  INDEX `fk_stay_undergo_idx` (`stay` ASC) VISIBLE,
  INDEX `fk_assistn_undergoes_idx` (`assistingnurse` ASC) VISIBLE,
  CONSTRAINT `fk_procedure`
    FOREIGN KEY (`procedure`)
    REFERENCES `mydb`.`procedure` (`code`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_phy_under`
    FOREIGN KEY (`physician`)
    REFERENCES `mydb`.`physician` (`employeeid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pati_undergoes`
    FOREIGN KEY (`patient`)
    REFERENCES `mydb`.`patient` (`ssn`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_stay_undergo`
    FOREIGN KEY (`stay`)
    REFERENCES `mydb`.`stay` (`stayid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_assistn_undergoes`
    FOREIGN KEY (`assistingnurse`)
    REFERENCES `mydb`.`nurse` (`employeeid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`on_call`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`on_call` ;

CREATE TABLE IF NOT EXISTS `mydb`.`on_call` (
  `nurse` INT NOT NULL,
  `blockfloor` INT NOT NULL,
  `blockcode` INT NOT NULL,
  `oncaallstart` TIMESTAMP NOT NULL,
  `oncallend` TIMESTAMP NOT NULL,
  PRIMARY KEY (`nurse`, `oncallend`, `oncaallstart`, `blockfloor`, `blockcode`),
  INDEX `fk_blkfloor_blkcode_oncall_idx` (`blockfloor` ASC, `blockcode` ASC) VISIBLE,
  CONSTRAINT `fk_nurse_oncall`
    FOREIGN KEY (`nurse`)
    REFERENCES `mydb`.`nurse` (`employeeid`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_blkfloor_blkcode_oncall`
    FOREIGN KEY (`blockfloor` , `blockcode`)
    REFERENCES `mydb`.`block` (`blockfloor` , `blockcode`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
constraint chk_d2 CHECK (TIMESTAMPDIFF(hour,`oncaallstart`,`oncallend`) < 8 ))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
