-- this is a comment line
-- MySQLWorkbench is a client side -> connect (ip/port/id/password) -> MySQL Server (7x24)
-- case insensitive

create database bootcamp_2412;

-- Use database
use bootcamp_2412

-- MySQL Server may contains many database, one database may contains many tables
-- varchar = String
create table customers (
    id integer,
    first_name varchar(20),
    last_name varchar(20),
    email varchar(50),
    dob date

);

-- * means all columns
select *
from customers;

insert into customers (id, first_name, last_name, email, dob)
values (1, 'Vincent', 'Lau', 'vincentlau@gmail.com', '1999-12-31');

select *
from customers;


insert into customers (id, first_name, last_name, email, dob) values (2, 'Lucas', 'Lau', 'lucaslau@gmail.com', '1999-10-31');
insert into customers (id, first_name, last_name, email, dob) values (3, 'Sally', 'Wong', 'sallywong@gmail.com', '2000-01-31');

-- show all columns from customers
select * from customers;


-- delete all data from table
delete from customers;


-- delete data by criteria
delete from customers where last_name = 'Wong';


-- select specific columns from customers
-- select is to choose columns
select id, first_name, dob from customers;


-- where is to control rows
select id, first_name, dob from customers where dob < '2000-01-01';


-- select doesnt change the data in harddisk, SQL is just using a program to retrieve the data in harddisk, 睇下
-- insert, delete change the data in harddisk

select * from customers where last_name = 'Lau' and dob < '1999-12-01';

-- and go first
select * from customers where last_name = 'Lau' or first_name = 'Sally' and dob > '2000-01-01';

select * from customers where (last_name = 'Lau' or first_name = 'Sally') and dob > '2000-01-01';

-- not equal to != also ok but in SQL we use <>
select * from customers where last_name <> 'Wong';

-- sorting, order by, by default 小至大 asc, (0.38ms) 1ms - 0.001
select * from customers order by first_name;
select * from customers order by first_name asc;

select * from customers order by first_name desc;


select * from customers where dob > '2000-01-01' order by id desc; -- in java stream().filter().sort()

-- table: orders
-- id, amount, order_date, customer_id

--decimal(13,2), 11係整數位, 2 係小數位, 唔會用 double
--可能要時分秒, 所以 datetime
-- 要同上一個 table 一樣
create table orders (
	id integer,
    amount decimal(13,2), 	
    order_date datetime, 	
    customer_id integer 	
    
);
    
select * from orders;

insert into orders (id, amount, order_date, customer_id) values (1, 100.9, STR_TO_DATE('2025-01-22', '%Y-%m-%d'), 1);

insert into orders (id, amount, order_date, customer_id) values (2, 999.9, current_time(), 3);
insert into orders (id, amount, order_date, customer_id) values (3, 1999.2, current_time(), 3);

insert into orders values (4, 9999.9, current_time(), 3);

insert into orders value (5, 12000, current_time(), 3),
						 (6, 15000, current_time(), 3);
                         

select * from orders;

drop table orders;

--sum() avg() min() max() count() -> aggregate function -> result data structure changed
select sum(amount) from orders;
select avg(amount) from orders;
select min(amount) from orders;
select max(amount) from orders;
select count(amount) from orders;

-- not ok
select sum(amount), id from orders;

-- ok sum(amount) 總合結果, 全部都係一個 row 既 data structure, 1 and hello 都係
-- as 既名會俾番 java
-- round(avg(amount),2) 小數點 2 位

select sum(amount) as total_amt, round(avg(amount),2) as avg_amt, min(amount) as lowest_amt, max(amount) as highest_amt, count(amount) as order_count, 1, 'hello' 
from orders
where amount > 1000;
-- 有 where sum(amount) avg 都會 change


--select 唔會影響 row 數量
--SQL squence
-- 1. From
-- 2. Where
-- 3. Group by (having)
-- 4. order by
-- 5. select columns

-- Math
-- floor() down to nearest integer, ignore decimal places
-- o.* is raw data
select floor(amount), o.* from orders o;
-- up to nearest integer
select ceil(o.amount) from orders o;
select abs(-4), abs(4) from dual;

-- 將 first name + space + last name 出黎叫 full_name
select concat(c.first_name, ' ' , c.last_name) as full_name, 
length(c.last_name) as length_of_lastname,
upper(c.first_name) as uppercase_firstname,
lower(c.first_name) as lowercase_firstname,
replace(c.email, '@', '$') as new_email,
substring(c.first_name, 1, 1) as first_name_initial, 	-- index 由 1 開始, 1 要幾多格仔 
 left(c.first_name, 2) as left_first_name,
 right(c.first_name, 2) as right_first_name,
 instr(c.first_name, 'V') as firist_name_contains_cap_letter,	-- return 1 is true, 0 is false
 instr(c.first_name, 'v') as firist_name_contains_small_letter,	-- also true, case insenitive
 c.* from customers c;
 
 -- like
 -- % means any characters
 -- or 冇 character 都係 character
 select *
 from customers
 where first_name like '%V%';	

-- 結尾要有 'T', 中間要有 'V'
 select * from customers
 where first_name like '%V%T';
 
 -- date_add, date 加3個月
select o.*, date_add(o.order_date, interval 3 month) as follow_up_date from orders o;
-- 擺位唔一樣 
select date_add(o.order_date, interval 3 month) as follow_up_date, o.* from orders o;

 
 

