1. Update all Branch_id where referred as BR in place of B
        eg: B00001 will become BR_00001

-->
		UPDATE BRANCH SET BID = REPLACE(BID, 'B','BR_');

	 |A00001 |	C00001 |	BR_00001 |	10000 |	2012-12-15 |	Saving |	Active     | 
	 |A00002 |	C00002 |	BR_00001 |	12000 |	2012-06-12 |	Saving |	Active     |
	 |A00003 |	C00003 |	BR_00002 |	12500 |	2012-05-17 |	Saving |	Active     |
	 |A00004 |	C00002 |	BR_00005 |	11300 |	2013-01-27 |	Saving |	Active     |
	 |A00005 |	C00006 |	BR_00006 |	20000 |	2012-12-17 |	Saving |	Active     |
	 |A00006 |	C00007 |	BR_00007 |	12000 |	2010-08-12 |	Saving |	Suspended  |
	 |A00007 |	C00007 |	BR_00001 |	15500 |	2012-10-02 |	Saving |	Active	   |
	 |A00008 |	C00001 |	BR_00003 | 	11640 |	2009-11-09 |	Saving |	Terminated |
	 |A00009 |	C00003 |	BR_00007 |	11000 |	2008-11-30 |	Saving |	Terminated |
	 |A00010 |	C00004 |	BR_00002 |	11000 |	2013-03-01 |	Saving |	Active	   |
						

2. For testing purpose create a copy of tran_detail table and use bulk insert to load 1 million records to it. Please make necessary arrangement to generate new TRAN_ID for each record
-->

3. Update Transaction type and medium of transaction values to upper case for all records of transaction table.
-->
	UPDATE T SET medium_of_transaction = UPPER(medium_of_transaction), transaction_type=UPPER(transaction_type);

	mysql> SELECT * FROM T;

	+---------+----------+------------+-----------------------+------------------+--------------------+
	| tnumber | acnumber | dot        | medium_of_transaction | transaction_type | transaction_amount |
	+---------+----------+------------+-----------------------+------------------+--------------------+
	| T00001  | A00001   | 2013-01-01 | CHEQUE                | DEPOSIT          |               2000 |
	| T00002  | A00001   | 2013-02-01 | CASH                  | WITHDRAWAL       |               1000 |
	| T00003  | A00002   | 2013-01-01 | CASH                  | DEPOSIT          |               2000 |
	| T00004  | A00002   | 2013-02-01 | CASH                  | DEPOSIT          |               3000 |
	| T00005  | A00007   | 2013-01-11 | CASH                  | DEPOSIT          |               7000 |
	| T00006  | A00007   | 2013-01-13 | CASH                  | DEPOSIT          |               9000 |
	| T00007  | A00001   | 2013-03-13 | CASH                  | DEPOSIT          |               4000 |
	| T00008  | A00001   | 2013-03-14 | CHEQUE                | DEPOSIT          |               3000 |
	| T00009  | A00001   | 2013-03-21 | CASH                  | WITHDRAWAL       |               9000 |
	| T00010  | A00001   | 2013-03-22 | CASH                  | WITHDRAWAL       |               2000 |
	| T00011  | A00002   | 2013-03-25 | CASH                  | WITHDRAWAL       |               7000 |
	| T00012  | A00007   | 2013-03-26 | CASH                  | WITHDRAWAL       |               2000 |
	+---------+----------+------------+-----------------------+------------------+--------------------+

4. Update phone number and base location of customer Abhishek (C00009) to 8976523191 and Pune
-->
		UPDATE C SET CITY = 'Pune', mobileno = 8976523191 where fname='abhishek' and custid= 'C00009';
		
		select * from c where custid = 'C00009';
		
		+--------+----------+-------+--------+------+------------+------------+------------+
		| custid | fname    | mname | ltname | city | mobileno   | occupation | dob        |
		+--------+----------+-------+--------+------+------------+------------+------------+
		| C00009 | Abhishek | NULL  | Dutta  | Pune | 8976523191 | Service    | 1973-05-22 |
		+--------+----------+-------+--------+------+------------+------------+------------+

5. Add a new column customer_cnt to Branch table and update its value based on count of customer that branch has.
-->
	alter table b add column customer_cnt int;
	
	update b set customer_cnt = ( select count(*) from `account` group by bid having account.bid=b.bid);

	BR_00001	Asaf ali road			Delhi		3
	BR_00002	New delhi main branch	Delhi		2
	BR_00003	Delhi cantt				Delhi		1
	BR_00004	Jasola					Delhi		NULL
	BR_00005	Mahim					Mumbai		1
	BR_00006	Vile parle				Mumbai		1
	BR_00007	Mandvi					Mumbai		2
	BR_00008	Jadavpur				Kolkata		NULL
	BR_00009	Kodambakkam				Chennai		NULL
	
6. Create a new table account_bak and copy all records of account table to account_bak
-->
		CREATE TABLE account_bak AS SELECT * FROM ACCOUNT;
		SELECT * FROM account_bak;
	
		A00001	C00001	BR_00001	10000	2012-12-15	Saving	Active
		A00002	C00002	BR_00001	12000	2012-06-12	Saving	Active
		A00003	C00003	BR_00002	12500	2012-05-17	Saving	Active
		A00004	C00002	BR_00005	11300	2013-01-27	Saving	Active
		A00005	C00006	BR_00006	20000	2012-12-17	Saving	Active
		A00006	C00007	BR_00007	12000	2010-08-12	Saving	Suspended
		A00007	C00007	BR_00001	15500	2012-10-02	Saving	Active
		A00008	C00001	BR_00003	11640	2009-11-09	Saving	Terminated
		A00009	C00003	BR_00007	11000	2008-11-30	Saving	Terminated
		A00010	C00004	BR_00002	11000	2013-03-01	Saving	Active

7. Update the account status as Inavtive for account of customer 'Amit Kumar Borkar'
-->
	UPDATE account_bak SET ASTATUS='Inactive' where custid=(select custid from customer where 
	concat(fname,' ' ,mname, ' ' , ltname)='Amit kumar Borkar');

	|A00006|C00007|BR_00007|12000|2010-08-12|Saving|Inactive|

8. Add a new transaction to account for all loan account customers as one time charge of 1000 Rs for current month.
-->
	