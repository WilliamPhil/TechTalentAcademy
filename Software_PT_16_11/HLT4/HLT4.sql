/*create table using primary key*/
/*Manager: mid, name, shift, salary*/

create table manager(
mid int primary key,
mname varchar(100),
shift varchar(100),
salary double
);

/*Item: itemid, dish, price, category*/
create table item(
itemid varchar(100) primary key,
dish varchar(100),
price double,
category varchar(100)
);

/*create table using primary key and foreign key*/
create table corder(
orderid int not null auto_increment,
cname varchar(100),
phone varchar(100),
address varchar(100),
itemid varchar(100),
qty int,
total double,
cdate date,
primary key(orderid),
foreign key(itemid)
references item(itemid)
);

/*add record insert query*/
insert into manager(mid, mname, shift, salary)
values(5, 'jill', 'day', 2000), 
	(6, 'will', 'night', 5000),
    (7, 'james', 'day', 5000),
    (8, 'jack', 'night', 5000),
    (9, 'cliff', 'night', 5000),
    (10, 'zion', 'night', 5000);
    
    
insert into item(itemid, dish, price, category)
values(1, 'coreslaw', 7.5, 'salad'),
(2, 'grill squid salad', 7.5, 'salad'),
(3, 'carbonara', 12, 'pasta'),
(4, 'Bolognese', 11, 'pasta'),
(5, 'chicken soup', 8, 'soup'),
(6, 'tomato soup', 7.5, 'soup'),
(7, 'Daal', 7.5, 'curry'),
(8, 'Vegie korma', 7.5, 'curry'),
(9, 'cheese pizza', 10.5, 'pizza'),
(10, 'meatfeast pizza', 10.5, 'pizza');


insert into corder(cname, phone, address, itemid, qty, total, cdate)
values('luke', '13546', '10 green street', 2, 1, 7.5, '2022-01-03'),
('james', '10046', '1 sewel street', 2, 1, 7.5, '2022-01-05'),
('brown', '09878', '26 church road', 5, 1, 8, '2022-01-03'),
('adele', '67889', '2 grosvernor street', 2, 1, 7.5, '2022-01-01'),
('sam', '45678', '11 st. james street', 5, 1, 8, '2022-01-01'),
('fin', '98769', '150 plastow garden', 5, 1, 8, '2022-01-03'),
('ed', '56787', '10 paul street', 2, 1, 7.5, '2022-01-03'),
('jack', '45678', '13 goodnews street', 9, 1, 10.5, '2022-01-01'),
('luke', '98766', '363 samson street', 10, 1, 10.5, '2021-12-11'),
('jesse', '67899', '2009 obama street', 7, 1, 7.5, '2021-11-02');

/*Making requirement queries*/
/*1 display average salary of manager*/
select avg(salary)
from manager;

 /*Making requirement queries*/
/*2 display number of orders placed in a day*/
select count(orderid) as num_orders from corder where cdate = curdate();

/*Making requirement queries*/
/*3 display total amount of order*/
select sum(total) from corder;

/*Making requirement queries*/
/*4 display total number of dishes serve in the hotel*/
select count(*) as numberofdishesserve from item;

/*Making requirement queries*/
/*5 display dishes as per category*/
select dish, category from item group by category;