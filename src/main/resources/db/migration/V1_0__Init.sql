CREATE TABLE Person (
id bigint not null auto_increment,
first_name varchar(255) not null,
last_name varchar(255) not null,
primary key (id)
);

insert into Person (first_name, last_name) values ('Dave', 'Syer');