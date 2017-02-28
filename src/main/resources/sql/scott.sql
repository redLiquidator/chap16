-- ################
-- scott.sql
-- ################

set termout on
set echo on

-- 
-- scott user drop
-- 

drop user scott cascade;

--
-- scott user create
--

create user scott identified by tiger;

grant connect, resource, unlimited tablespace to scott;

alter user scott default tablespace users;
alter user scott temporary tablespace temp;


set echo off
