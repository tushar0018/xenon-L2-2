create database if not exists Sales ;
use Sales;

CREATE TABLE AGENTS (	
    AGENT_CODE CHAR(6) NOT NULL PRIMARY KEY, 
	AGENT_NAME CHAR(40), 
	WORKING_AREA CHAR(35), 
	COMMISSION int(10)
);

INSERT INTO AGENTS VALUES ('A007', 'Ramasundar', 'Bangalore', '0.15');
INSERT INTO AGENTS VALUES ('A003', 'Alex ', 'London', '0.13');
INSERT INTO AGENTS VALUES ('A008', 'Alford', 'New York', '0.12');
INSERT INTO AGENTS VALUES ('A011', 'Ravi Kumar', 'Bangalore', '0.15');
INSERT INTO AGENTS VALUES ('A010', 'Santakumar', 'Chennai', '0.14');