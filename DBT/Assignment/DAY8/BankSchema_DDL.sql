-- Bank Schema
drop database if exists bank;
CREATE DATABASE IF NOT EXISTS bank;

USE BANK;

CREATE TABLE customer
   (
       custid VARCHAR(6),
       fname VARCHAR(30),
       mname VARCHAR(30),
       ltname VARCHAR(30),
       city VARCHAR(15),
       mobileno VARCHAR(10),
       occupation VARCHAR(10),
       dob DATE,
  primary key(custid) ,
  CONSTRAINT CK_MyTable_fname_NoSpace CHECK (`fname` not like '% %'),
  constraint chk_fname check (fname not in (" " ,mname,ltname)),
  constraint chk_mname check (mname not in (fname,ltname)),
  constraint chk_age check ( (datediff(sysdate(),dob))/365 > 10 )
   );

CREATE TABLE branch
   (
    bid VARCHAR(8) NOT NULL,
    bname VARCHAR(30) NOT NULL,
    bcity VARCHAR(30),
    PRIMARY KEY(BID)
   );
   
CREATE TABLE `account`
   (
      acnumber VARCHAR(6),
      custid  VARCHAR(6) NOT NULL,
      bid VARCHAR(8),
      opening_balance INT,
      aod DATE,
      atype VARCHAR(10),
      astatus VARCHAR(10),
      PRIMARY KEY(acnumber),
	CONSTRAINT `fk_custid` FOREIGN KEY (`custid`) references `customer` (`custid`) ON UPDATE CASCADE,
    CONSTRAINT CK_OB CHECK (opening_balance >= 10000),
    CONSTRAINT CK_AOD CHECK ( aod < sysdate()),
    CONSTRAINT FK_BID FOREIGN KEY (bid) REFERENCES branch (bid) ON UPDATE CASCADE
    );

CREATE TABLE tran_detail
    (   
     tnumber VARCHAR(6) PRIMARY KEY ,
     acnumber VARCHAR(6),
     dot DATE,
     medium_of_transaction VARCHAR(20),
     transaction_type VARCHAR(20),
     transaction_amount INT,
     CONSTRAINT FK_ACNUMBER FOREIGN KEY (`acnumber`) REFERENCES `account` (`acnumber`)
    );

CREATE TABLE loan
   (
    custid VARCHAR(6) not null,
    bid VARCHAR(8),
    loan_amount INT,
	loan_type VARCHAR(10),
	loan_status VARCHAR(20),
	CONSTRAINT FK_custid_loan FOREIGN KEY (`custid`) REFERENCES `customer` (`custid`) ON UPDATE CASCADE,
    CONSTRAINT FK_bid_loan FOREIGN KEY (`bid`) REFERENCES `branch` (`bid`) ON UPDATE CASCADE,
    PRIMARY KEY (custid,loan_type)
   );
 
