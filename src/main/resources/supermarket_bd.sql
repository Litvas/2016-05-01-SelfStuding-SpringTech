-- CREATE DATABASE supermarketdb;
-- 
-- CREATE TABLE employee (
-- id_employee INT NOT NULL AUTO_INCREMENT,
-- name_Department VARCHAR(255),
-- name_specialisation VARCHAR(255),
-- surename_Employee VARCHAR(255),
-- name_Employee VARCHAR(255),
-- PRIMARY KEY(id_employee)
-- );
-- 
-- CREATE TABLE department (
-- id_department int NOT NULL AUTO_INCREMENT,
-- name_Department VARCHAR(255) NOT NULL,
-- description_Department VARCHAR (255),
-- PRIMARY KEY(id_department)
-- );
-- 
-- CREATE TABLE specialisation (
-- id_specialisation int NOT NULL AUTO_INCREMENT,
-- name_specialisation VARCHAR(255) NOT NULL,
-- description_specialisation VARCHAR (255),
-- PRIMARY KEY(id_specialisation)
-- );
-- 
-- INSERT INTO specialisation (name_specialisation, description_specialisation)
-- VALUES ('sales manager', NULL);
-- INSERT INTO specialisation (name_specialisation, description_specialisation)
-- VALUES ('HR-manager', NULL);
-- 
-- INSERT INTO department (name_Department, description_Department)
-- VALUES ('HR-department', NULL);
-- INSERT INTO department (name_Department, description_Department)
-- VALUES ('Sales department', NULL);

INSERT INTO employee (surename_Employee, name_Employee, name_specialisation, name_Department)
VALUES ('Annova','Anna' ,1,1);
INSERT INTO employee (surename_Employee, name_Employee, name_specialisation, name_Department)
VALUES ('Andreev', 'Andrei',2,2);

-- drop table employee, department, specialisation;

SELECT * FROM employee;