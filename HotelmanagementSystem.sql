create table login (username varchar (40) primary key, password varchar (40) primary key);

create table customer (id char (30), number varchar (30) primary key, name char (30), gender char (30), country char (30), room_number int, foreign key(room_number) REFERENCES room(room_number), status char (30), deposit real);

create table room (room_number int primary key, availability char (20), status char (20), price real, type char (30));

create table employee (name char (30), age int, gender char (30), job char (30), salary real, phone real, aadhar real, email varchar (40));

create table driver (name char (30), age int, gender char (20), company varchar (30), brand varchar (30), available char (10), location varchar (50));

create table department (department varchar (40) primary key, budget int (40));
