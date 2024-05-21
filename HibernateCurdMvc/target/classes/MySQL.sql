create database spring;
use spring;
create table employee( 
Employee_Id int primary key auto_increment, FirstName varchar(255), 
LastName varchar(255), Age int, Education varchar(255), Salary double);

select * from employee;