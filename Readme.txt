Simple Spring JPA Rest Project to test Put, post, delete, patch operations

DB:
use mySchema;

create table user_table(
id int NOT NULL AUTO_INCREMENT,
first_name varchar(20),
last_name varchar(20),
PRIMARY KEY (ID)
);

select * from mySchema.user_table;

