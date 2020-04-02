create database c12;
 drop database c12;
use c12;
CREATE TABLE Persons (
    PersonID INT,
    LastName VARCHAR(255)
);
 drop table Persons;
-- xem data cua table Persons
select * from Persons;
-- insert data vao table Persons
insert into Persons(PersonID,LastName) values (1,'Duc');
insert into Persons(PersonID,LastName) values (2,'My');
insert into Persons(PersonID,LastName) values 
	(3,'tinh'),(4,'thuan');
-- update row Duc -> Tho
SET SQL_SAFE_UPDATES = 0;
update Persons set LastName = 'Tho' where PersonID = 1;
-- xoa 1 row
delete from Persons where PersonID = 1;