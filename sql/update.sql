UPDATE ORDERS set CUST_CODE = 'C00030'  where ORD_NUM=200100;
UPDATE ORDERS set CUST_CODE = 'C00026'  where ORD_NUM=200110;
UPDATE CUSTOMER set CUST_CODE = 'C00026'  where CUST_NAME='Bolt';
UPDATE CUSTOMER set CUST_CODE = 'C00027'  where CUST_NAME='Cook';
UPDATE AGENTS set WORKING_AREA = 'Delhi'  where AGENT_NAME='Alex';
UPDATE AGENTS set WORKING_AREA = 'Mumbai'  where AGENT_NAME='Alford';

