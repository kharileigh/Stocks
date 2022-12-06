CREATE DATABASE stock;

use stock;

create table Share(
shareId int primary key,
shareName varchar(30),
marketPrice double);

insert into Share
values(1, "Aname", 750),
(2, "Bname", 550),
(3, "Cname", 1500),
(4, "Dname", 950);

select * from Share;

create table customerService (
detailId int primary key,
customerId int,
shareId int,
shareType varchar(35),
quantity int);

insert into customerService (detailId, customerId, shareId, shareType, quantity)
values(100, 1111, 1, 'Equity', 15),
(102, 2222, 2, 'Preference', 45),
(103, 3333, 3, 'Equity', 8),
(104, 4444, 4, 'Redeemable', 57);

select * from customerService;

describe customerService;