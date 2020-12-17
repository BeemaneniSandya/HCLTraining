CREATE DATABASE Electricity_bill;
USE Electricity_bill;
CREATE TABLE Electricity_connection_type(id int primary key,connection_name varchar(20) not null);
CREATE TABLE slab(id int primary key,connection_type_id int(11) not null,from_unit int(11) not null,rate double not null,constraint connection_type_id_fk foreign key(connection_type_id) references Electricity_connection_type(id));
CREATE TABLE building_type(id int primary key,connection_type_id int(11) not null,name varchar(100) not null);
CREATE TABLE building(id int primary key,address varchar(100) not null,building_type_id int(11) not null,owner_name varchar(100) not null,contact_number varchar(100) not null,email_adress varchar(100),constraint building_type_id_fk foreign key(building_type_id) references building_type(id));
USE Electricity_bill;
ALTER TABLE building CHANGE owner_name building_owner_name varchar(100) not null;
ALTER TABLE building MODIFY address varchar(255);
ALTER TABLE Electricity_connection_type Add constraint check_connection_type check(connection_name = 'commercial' or connection_name ='home');
ALTER TABLE building RENAME TO building_details;
DROP TABLE slab;
DROP TABLE building_details;
USE Electricity_bill;
INSERT INTO building_type(id,connection_type_id,name)VALUES(5,514,'sukesh');
INSERT INTO building_type(id,connection_type_id,name)VALUES(6,215,'magesh');
INSERT INTO building_type(id,connection_type_id,name)VALUES(7,582,'ramesh');
INSERT INTO building_type(id,connection_type_id,name)VALUES(8,455,'kamesh');
INSERT INTO building_type(id,connection_type_id,name)VALUES(9,256,'somesh');
INSERT INTO Electricity_connection_type(id,connection_name)VALUES(6,'home');
INSERT INTO Electricity_connection_type(id,connection_name)VALUES(5,'home');
USE Electricity_bill;
DESC slab;
SELECT * FROM Electricity_connection_type;
INSERT INTO slab(id,connection_type_id,from_unit,rate)VALUES(23,123,5,2.1);
SELECT*FROM slab;
INSERT INTO slab(id,connection_type_id,from_unit,rate)VALUES(22,123,0,5.1);
UPDATE slab SET from_unit=1 WHERE id = 22;
INSERT INTO building_type(id,connection_type_id,name)VALUES(10,526,'Shopping Mall');
SELECT*FROM building_type;
UPDATE building_type SET name = 'Mall' WHERE id = 10;
DELETE FROM building_type WHERE id = 5;
DELETE FROM building_type WHERE id = 6;
USE Electricity_bill;
DELETE FROM slab;