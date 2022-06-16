UPDATE ORDERS set CUST_CODE = 'C00040'  where ORD_NUM=200100;
commit;
delete from ORDERS where ORD_NUM = 200118;
rollback;
select ORDERS.ORD_NUM,CUSTOMER.GRADE from ORDERS inner join CUSTOMER on  ORDERS.AGENT_CODE=CUSTOMER.AGENT_CODE;
savepoint sp1;
select time("19:30:10");
select time("2017-08-15 19:30:30");


