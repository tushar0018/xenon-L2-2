use Sales;

CREATE TABLE ORDERS (
     ORD_NUM int(6) NOT NULL PRIMARY KEY, 
	 ORD_AMOUNT int(12) NOT NULL,   
	 CUST_CODE VARCHAR(6) NOT NULL REFERENCES CUSTOMER, 
	 AGENT_CODE CHAR(6) NOT NULL REFERENCES AGENTS 
   );

INSERT INTO ORDERS VALUES('200100', '1000.00', 'C00013', 'A003');
INSERT INTO ORDERS VALUES('200110', '3000.00', 'C00019', 'A010');
INSERT INTO ORDERS VALUES('200107', '4500.00', 'C00001', 'A010');
INSERT INTO ORDERS VALUES('200112', '2000.00', 'C00025', 'A007'); 
INSERT INTO ORDERS VALUES('200113', '4000.00', 'C00020', 'A011');
INSERT INTO ORDERS VALUES('200102', '2000.00', 'C00018', 'A007');
INSERT INTO ORDERS VALUES('200114', '3500.00', 'C00021', 'A008');
INSERT INTO ORDERS VALUES('200122', '2500.00', 'C00024', 'A003');
INSERT INTO ORDERS VALUES('200118', '500.00' , 'C00015', 'A011');
INSERT INTO ORDERS VALUES('200119', '4000.00', 'C00002', 'A010');