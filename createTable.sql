-- 数据库设计
-- Zhaoguoquan All rights reserverd
create database b2c;
use b2c;
create table NBAdmin(username varchar(20) primary key ,password varchar(100)) DEFAULT CHARSET=utf8;
create table NBCategory (id int primary key auto_increment ,name varchar(50),fatherID int,description varchar(500),imagePath varchar(100))DEFAULT CHARSET=utf8;
create table NBUser(id int primary key auto_increment,email varchar(200) unique ,nickname varchar(200),password varchar(200),score int ,registerDate Date)DEFAULT CHARSET=utf8;
create table NBOrder(orderID int primary key auto_increment ,userID int ,orderDate date ,state int , scoreGet int,userAddressID int,foreign key (userID) REFERENCES NBUser (id))DEFAULT CHARSET=utf8;
create table NBOrderInfo(orderID int ,productID int ,number int ,foreign key (orderID) REFERENCES NBOrder (orderID))DEFAULT CHARSET=utf8;
create table NBProduct(id int primary key auto_increment,categoryID int ,name varchar(200),description varchar(2000),imagePath varchar(200),price float,discount float,numberLeft int ,foreign key(categoryID)REFERENCES NBCategory(id) )DEFAULT CHARSET=utf8;
create table NBProductComment(userID int ,productID int ,level int ,title varchar(200),content varchar(200),foreign key (userID) REFERENCES NBUser (id),foreign key (productID) REFERENCES NBProduct (id))DEFAULT CHARSET=utf8;
create table NBUserAddress(userAddressID int primary key auto_increment,userID int ,receiverName varchar(200),address varchar(200),postCode varchar(200),telephone varchar(20),mobilephone varchar(20),isActive int,foreign key (userID) REFERENCES NBUser (id) )DEFAULT CHARSET=utf8;
create table NBVIPCategory(ID int ,levelName varchar(200),leastScore int ,scorePercentage float)DEFAULT CHARSET=utf8;


-- 数据库初始表建立：written by 王淞

insert into nbadmin values ('admin','admin');

insert into nbcategory values (1,'图书音像',1,'该目录下包括图书、音像商品，其中图书涵盖了计算机用书、外语书籍、教科书、考试用书，种类齐全。',null);
insert into nbcategory values (2,'时尚生活',2,'该目录下包括时下热点话题，时尚前沿，国际视角，确保使用者能够领略时尚的魅力。',null);
insert into nbcategory values (3,'数码产品',3,'该目录下包括照相、摄像所需的大多数设备，比如单反、录像机等等，为用户提供丰富的产品选择。',null);
insert into nbcategory values (4,'鲜花速递',4,'该目录下包括鲜花分类推荐、鲜花预定、鲜花定时送货上门等贴心服务，为消费者提供优质服务。',null);

insert into nbuser values (null,'michael@163.com','菊花','juhuaduoduo',0,'2014-6-26');
insert into nbuser values (null,'scofiled@163.com','采摘','renjuncaizhai',0,'2014-6-26');
insert into nbuseraddress values(1,1,'赵国铨','哈工大A02-5049','150000','0451-110','18646083168',1);

insert into NBProduct values (1,1,'教你如何3天提升逼格','这是一本非常提升逼格的书，来自5049专供，华大师亲笔题词', '/B2C/web/image/ssbs.jpg',52.5,0.9,3)
