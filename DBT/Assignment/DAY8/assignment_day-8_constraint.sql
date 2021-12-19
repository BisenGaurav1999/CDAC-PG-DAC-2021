-- Introduce following constraint on tables in Bank schema.
-- -------------------------

-- Customer table
-- ----------
-- 1. Customer id in customer table must be unique and does not allow null values
ALTER TABLE `customer`
MODIFY `custid` VARCHAR(6) NOT NULL,
ADD CONSTRAINT `UK_custid`
      UNIQUE(`custid`);

-- 2. Column fname must not allow space in it
ALTER TABLE `customer`
ADD CONSTRAINT `CHK_fname_space`
      CHECK(INSTR(`fname`, ' ') < 1);

-- 3. First name, middle name and last name must not be same
ALTER TABLE `customer`
ADD CONSTRAINT `CHK_fname_mname`
      CHECK(`fname` <> `mname`),
ADD CONSTRAINT `CHK_fname_ltname`
      CHECK(`fname` <> `ltname`),
ADD CONSTRAINT `CHK_mname_ltname`
      CHECK(`mname` <> `ltname`);

-- 4. Age of customer (based on date of birth) must be more then 10 years old.
ALTER TABLE customer
ADD CONSTRAINT `CHK_age`
      CHECK(ABS(TIMESTAMPDIFF(YEAR, `dob`, SYSDATE())) > 10);

-- Branch Table
-- ----------
-- 1. Branch name must not be null
ALTER TABLE `branch`
MODIFY `bname` VARCHAR(30) NOT NULL;

-- 2. Branch id must be unique and not null
ALTER TABLE `branch`
MODIFY `bid` VARCHAR(6) NOT NULL,
ADD CONSTRAINT `UK_bid`
      UNIQUE(`bid`);

-- Account Table
-- ----------
-- 1. Account number for each record must be unique
ALTER TABLE `account`
ADD CONSTRAINT `UK_accno`
      UNIQUE(`acnumber`);

-- 2. Customer Id must be of valid customer and must not be left as blank
ALTER TABLE `account`
MODIFY custid VARCHAR(6) NOT NULL,
ADD CONSTRAINT `FK_acc2cust_custid`
      FOREIGN KEY (`custid`)
      REFERENCES `customer`(`custid`);
-- 3. opening balance must be more then 10000
ALTER TABLE `account`
ADD CONSTRAINT `CHK_opbal`
      CHECK(`opening_balance` > 10000);

-- 4. Acount opening date must not be of past dates
ALTER TABLE `account`
ADD CONSTRAINT `CHK_opdate`
      CHECK(`aod` >= SYSDATE());

-- 5. Branch id (bid) must be of valid branch
ALTER TABLE `account`
ADD CONSTRAINT `FK_acc2br_bid`
      FOREIGN KEY (`bid`)
      REFERENCES `branch`(`bid`);

-- Tran_detail Table
-- --------------------
-- 1. Transaction number must be unique for each transaction
ALTER TABLE `tran_detail`
ADD CONSTRAINT `UK_transid`
      UNIQUE(`tnumber`);

-- 2. Account number must refer to valid account
ALTER TABLE `tran_detail`
ADD CONSTRAINT `FK_tr2acc_acnum`
      FOREIGN KEY (`acnumber`)
      REFERENCES `account`(`acnumber`);

-- Loan Table
-- ----------
-- 1. Customer Id must be of valid customer and must not be left as blank
ALTER TABLE `loan`
MODIFY `custid` VARCHAR(6) NOT NULL,
ADD CONSTRAINT `FK_ln2cust_custid`
      FOREIGN KEY (`custid`)
      REFERENCES `customer`(`custid`);

-- 2. Branch id (bid) must be of valid branch 
ALTER TABLE `loan`
ADD CONSTRAINT `FK_br2cust_bid`
      FOREIGN KEY (`bid`)
      REFERENCES `branch`(`bid`);

-- 3. One customer can take only one loan for each loan type
ALTER TABLE `loan`
ADD CONSTRAINT `PK_custid_lntp`
      PRIMARY KEY (`custid`, `loan_type`);
