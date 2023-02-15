create table movies (
id serial primary key not null,
title varchar(50) not null,
release_date date not null,
stars int
);