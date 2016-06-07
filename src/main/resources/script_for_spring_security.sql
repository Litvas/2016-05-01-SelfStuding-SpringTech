-- create table users (
-- username varchar(50)not null primary key,
-- password VARCHAR(50)NOT NULL,
-- enabled tinyint not null
-- );

-- CREATE TABLE `authorities` (
--   `id` int(11) NOT NULL AUTO_INCREMENT,
--   `username` varchar(50) NOT NULL,
--   `authority` varchar(50) NOT NULL,
--   PRIMARY KEY (`id`),
--   UNIQUE KEY `uni_username_role` (`authority`,`username`),
--   KEY `fk_username_idx` (`username`),
--   CONSTRAINT `fk_username` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
-- )

-- INSERT INTO `users` VALUES ('user','suser',1), ('admin','sadmin',1);
INSERT IN`authorities`TO `authorities` VALUES (3,'user','ROLE_USER'), (2,'admin','ROLE_ADMIN);