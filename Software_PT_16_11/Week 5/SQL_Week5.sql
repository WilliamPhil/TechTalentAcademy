/*create database university*/
create database university;

/*create table using primary key*/
/*student: sid, sname, sub, score*/
create table student(
sid int primary key,
sname varchar(100),
sub varchar(100),
score double
);

/*add record insert query*/
insert into student(sid, sname, sub, score)
values(1, 'William', 'Data', 90.1);

insert into student(sid, sname, sub, score)
values(2, 'P', 'Data', 90.1);

update student
set score = 50.1
where sid = 1;

/*select student*/
select * from student;

select * from student where score >= 50 and score <=100;

/*delete table from database*/
drop table student;


