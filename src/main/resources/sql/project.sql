--
-- Employee
--
select count(*) from dept;
select count(*) from emp;
select count(*) from bonus;
select count(*) from salgrade;

select * from dept;
select * from emp;
select * from bonus;
select * from salgrade;
--
-- World
--

select count(*) from country;
select count(*) from city;
select count(*) from countrylanguage;


select * from country where code='USA';
select * from city where countrycode='USA';
select * from countrylanguage where countrycode='USA';

drop table city;
drop table countrylanguage;

create table city (
	id			number(11)		not null,
	name		char(35 char),
	country_code char(3 char),
	district	char(20 char),
	population	number(11)		default 0,
	constraint pk_city primary key (id),
	constraint fk_country foreign key (country_code) references country(code) 
);
create table country_language (
	country_code	char(3 char),
	language	char(30 char),
	is_official	char(1 char)		default 'F',
	percentage	number(4,1)			default '0.0',
	constraint ck_isofficial check (is_official in ('T','F')),
	constraint pk_country_language primary key (country_code, language)
);

select * from city;
select * from country_language;
