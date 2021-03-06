set profiling=1;
select CUSTOMER.GRADE from CUSTOMER union select AGENTS.AGENT_NAME from AGENTS;
select ORDERS.ORD_NUM from ORDERS union select AGENTS.AGENT_NAME from AGENTS;
select ORDERS.ORD_NUM,AGENTS.AGENT_NAME from ORDERS right join AGENTS on  ORDERS.AGENT_CODE=AGENTS.AGENT_CODE;
select ORDERS.ORD_NUM,AGENTS.AGENT_NAME from ORDERS left join AGENTS on  ORDERS.AGENT_CODE=AGENTS.AGENT_CODE;
select ORDERS.ORD_NUM,CUSTOMER.GRADE from ORDERS inner join CUSTOMER on  ORDERS.AGENT_CODE=CUSTOMER.AGENT_CODE;
select * from ORDERS;
select * from CUSTOMER;
select * from AGENTS;
show profiles;
show profile cpu for  query 3;
show processlist;
