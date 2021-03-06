-- Consider following schema for library database
-- --------------------------------------------------

-- BOOK (Book_id, Title, Publisher_ID, Pub_Year)
-- BOOK_AUTHORS (Book_id, Author_ID)
-- AUTHOR (AUTH_ID, AUTHOR_NAME, AUTHOR_DESCRIPTION)
-- CARD (CARD_NO)
-- PUBLISHER (PUB_ID, Name, Address, Phone) 
-- BOOK_COPIES (Book_id, Branch_id, No_publisherof_Copies)
-- BOOK_LENDING (Book_id, Branch_id, Card_No, Date_Out, Due_Date)
-- LIBRARY_BRANCH (Branch_id, Branch_Name, Address)

DROP DATABASE IF EXISTS LIBRARY;
CREATE DATABASE IF NOT EXISTS LIBRARY;
USE LIBRARY;

CREATE TABLE PUBLISHER
(PUB_ID INT UNSIGNED  PRIMARY KEY,
 NAME VARCHAR(20),
 PHONE BIGINT UNSIGNED,
 ADDRESS VARCHAR(20));

CREATE TABLE BOOK
(BOOK_ID INT UNSIGNED PRIMARY KEY,
 TITLE VARCHAR(20),
 PUB_YEAR VARCHAR(20),
 PUB_ID INT UNSIGNED REFERENCES PUBLISHER (ID) ON DELETE CASCADE);
 
CREATE TABLE BOOK_AUTHORS
(AUTH_ID  INT UNSIGNED,
 BOOK_ID INT UNSIGNED REFERENCES BOOK (BOOK_ID) ON DELETE CASCADE,
 PRIMARY KEY (BOOK_ID, AUTH_ID));
 
CREATE TABLE AUTHOR
( auth_id INT UNSIGNED PRIMARY KEY,
  author_name VARCHAR(20),
  author_description VARCHAR(2000)
);

CREATE TABLE LIBRARY_BRANCH
(BRANCH_ID INT UNSIGNED PRIMARY KEY,
 BRANCH_NAME VARCHAR(50),
 ADDRESS VARCHAR(50));

CREATE TABLE BOOK_COPIES
 (NO_OF_COPIES INT UNSIGNED,
  BOOK_ID INT UNSIGNED REFERENCES BOOK (BOOK_ID) ON DELETE CASCADE,
  BRANCH_ID INT UNSIGNED REFERENCES LIBRARY_BRANCH (BRANCH_ID) ON DELETE CASCADE,
  PRIMARY KEY (BOOK_ID, BRANCH_ID));

CREATE TABLE CARD
(CARD_NO INT UNSIGNED PRIMARY KEY
 -- As of now single column only. In future we may extend with card owner details
);

CREATE TABLE BOOK_LENDING
(
  DATE_OUT DATE,
  DUE_DATE DATE,
  BOOK_ID INT UNSIGNED REFERENCES BOOK (BOOK_ID) ON DELETE CASCADE,
  BRANCH_ID INT UNSIGNED REFERENCES LIBRARY_BRANCH (BRANCH_ID) ON DELETE CASCADE,
  CARD_NO  INT UNSIGNED REFERENCES CARD (CARD_NO) ON DELETE CASCADE,
  PRIMARY KEY (BOOK_ID, BRANCH_ID, CARD_NO));

