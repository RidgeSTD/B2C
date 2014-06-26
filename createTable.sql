--数据库设计
<<<<<<< HEAD
--C:\Users\Guoquan\workspace\B2C\createTable.sql
=======
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
-- Zhaoguoquan All rights reserverd
-- 首先遇到的问题是所有中文都是？？？

-- 这里阐明：

-- 	* console里默认编码是latin，可以调成GBK，但都不是我们想要的
-- 	* Eclipse默认是GBK的
-- 	* MySQL不调的话默认是latin1

-- 验证后：console不太好改，改了也没什么用，算了
-- 所以

-- 	1. Eclipse encoding调成utf8
-- 	2. mysql这么设置：my.ini：mysqld里写 character_set_server=utf8
-- 	3. root进入mysql，show variables like 'char%',都执行set [global]XXX=utf8
-- 	4. mysql建表这么建,create table student(XXX)  DEFAULT CHARSET=utf8


-- 插入的时候进入console，用source命令可以直接执行sql文件。可以这样建表。


<<<<<<< HEAD
=======

>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
create database b2c;
use b2c;
create table NBAdmin(username varchar(20) primary key ,
	password varchar(100)) DEFAULT CHARSET=utf8;
create table NBCategory (id int primary key auto_increment ,
	name varchar(50),
	fatherID int,
	description varchar(500),
	imagePath varchar(100))DEFAULT CHARSET=utf8;
create table NBUser(id int primary key auto_increment,
	email varchar(200) unique ,
	nickname varchar(200),
	password varchar(200),
	score int ,
	registerDate Date)DEFAULT CHARSET=utf8;
create table NBOrder(orderID int primary key auto_increment ,
	userID int ,
	orderDate date ,
	state int ,
	 scoreGet int,
 	userAddressID int,
	foreign key (userID) REFERENCES NBUser (id))DEFAULT CHARSET=utf8;
create table NBOrderInfo(orderID int ,
	productID int ,
	number int ,
	foreign key (orderID) REFERENCES NBOrder (orderID))DEFAULT CHARSET=utf8;
create table NBProduct(id int primary key auto_increment,
	categoryID int ,
	name varchar(200),
	description varchar(2000),
	imagePath varchar(200),
	price float,
	discount float,
	numberLeft int ,
	foreign key(categoryID)REFERENCES NBCategory(id) )DEFAULT CHARSET=utf8;
create table NBProductComment(userID int ,
	productID int ,
	level int ,
	title varchar(200),
	content varchar(200),
	foreign key (userID) REFERENCES NBUser (id),
	foreign key (productID) REFERENCES NBProduct (id))DEFAULT CHARSET=utf8;
create table NBUserAddress(userAddressID int primary key auto_increment,
	userID int ,
	receiverName varchar(200),
	address varchar(200),
	postCode varchar(200),
	telephone varchar(20),
	mobilephone varchar(20),
	isActive int,
	foreign key (userID) REFERENCES NBUser (id) )DEFAULT CHARSET=utf8;
create table NBVIPCategory(ID int ,
	levelName varchar(200),
	leastScore int ,
	scorePercentage float)DEFAULT CHARSET=utf8;


-- 数据库初始表建立：written by 王淞

insert into nbadmin values ('admin',
		'admin');

<<<<<<< HEAD

	
	
	
	
	
-- category	
insert into nbcategory values 
	(1,'图书音像',1,'该目录下包括图书、音像商品，其中图书涵盖了计算机用书、外语书籍、教科书、考试用书等，种类齐全。','B2C\web\image\tsyx.gif');
insert into nbcategory values
    (2,'时尚生活',2,'该目录下包括时尚信息，潮流服饰等国际化流行元素，展示出一个当代生活该有的时尚文化。',null);
insert into nbcategory values	
	(3,'数码产品',3,'该目录下包括时下流行的数码产品的详细介绍以及价格等信息，例如单反、摄像机、U盘等等。',null);
insert into nbcategory values	
	(4,'鲜花速递',4,'该目录下包括该季节流行的鲜花信息，并且提供鲜花预订、鲜花定时速递等等内容，方便了用户。',null);
insert into nbcategory values
	(5,'教材',1,'该目录下包括大学物理学第一册、第二册、第四册，用于学生的物理学习。',null);
insert into nbcategory values
    (6,'外语',1,'该目录下包括大学外语教材等学习书籍，用于学生们的英语教育。',null);
insert into nbcategory values
    (7,'公务员考试',1,'该目录下包括公务员考试使用书籍以及练习题，用于考生参考。',null);
insert into nbcategory values
    (8,'考研',1,'该目录下包括大学生考研方向的参考资料以及练习题等。',null);
insert into nbcategory values
    (9,'影视',1,'该目录下包括时下流行的电影，电视剧或经典的电影电视剧等影视资料。',null);
insert into nbcategory values
    (10,'音乐',1,'该目录下包括时下流行的或是经典的音乐等音频资源。',null);
insert into nbcategory values
    (11,'护肤',2,'该目录下包括对皮肤护理的一些专业建议以及护肤产品的推荐。',null);
insert into nbcategory values
    (12,'首饰',2,'该目录下包括了最近流行的首饰推荐以及价位等详细信息。',null);
insert into nbcategory values
    (13,'服装',2,'该目录下包括了现在流行的男装女装等的流行信息以及价位等详细信息。',null);
insert into nbcategory values
    (14,'箱包',2,'该目录下包括了时下流行的箱包款式以及详细的价位等信息。',null);
insert into nbcategory values
    (15,'数码相机',3,'该目录下包括了现流行的相机型号以及具体的价位等信息。',null);
insert into nbcategory values
    (16,'mp3',3,'该目录下包括了现流行的mp3型号以及具体的价位等信息。',null);
insert into nbcategory values
    (17,'数码录音笔',3,'该目录下包括了现流行的数码录音笔型号以及具体的价位等信息。',null);
insert into nbcategory values
    (18,'数码配件',3,'该目录下包括了现流行的数码配件型号以及具体的价位等信息。',null);
insert into nbcategory values
    (19,'耳机',3,'该目录下包括了现流行的耳机型号以及具体的价位等信息。',null);
insert into nbcategory values
    (20,'玫瑰',4,'该目录下包括了时下玫瑰的价格信息。',null);
insert into nbcategory values
    (21,'百合',4,'该目录下包括了时下百合的价格信息。',null);
insert into nbcategory values
    (22,'郁金香',4,'该目录下包括了时下郁金香的价格信息。',null);
insert into nbcategory values
    (23,'康乃馨',4,'该目录下包括了时下康乃馨的价格信息。',null);

insert into nbuser values (1,
=======
insert into nbcategory values (1,
		'图书音像',
	1,
	'该目录下包括图书、音像商品，其中图书涵盖了计算机用书、外语书籍、教科书、考试用书，种类齐全。',
	null);
insert into nbcategory values (2,
		'时尚生活',
	2,
	'该目录下包括时下热点话题，时尚前沿，国际视角，确保使用者能够领略时尚的魅力。',
	null);
insert into nbcategory values (3,
		'数码产品',
	3,
	'该目录下包括照相、摄像所需的大多数设备，比如单反、录像机等等，为用户提供丰富的产品选择。',
	null);
insert into nbcategory values (4,
		'鲜花速递',
	4,
	'该目录下包括鲜花分类推荐、鲜花预定、鲜花定时送货上门等贴心服务，为消费者提供优质服务。',
	null);

insert into nbuser values (null,
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
		'michael@163.com',
	'菊花',
	'juhuaduoduo',
	0,
	'2014-6-26');
<<<<<<< HEAD
insert into nbuser values (2,
=======
insert into nbuser values (null,
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
		'scofiled@163.com',
	'采摘',
	'renjuncaizhai',
	0,
	'2014-6-26');
insert into nbuseraddress values(1,
		1,
	'赵国铨',
	'哈工大A02-5049',
	'150000',
	'0451-110',
	'18646083168',
	1);
-- 个别数据需求 by Alex Hua
insert into NBProduct values (1,
		1,
	'教你如何3天提升逼格',
	'这是一本非常提升逼格的书，来自5049专供，华大师亲笔题词',
<<<<<<< HEAD
	 'B2C/web/image/ssbs.jpg',
=======
	 '/B2C/web/image/ssbs.jpg',
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
 	52.5,
	0.9,
	3);

insert into nborder values(1,
		1,
	 '2014-06-27',
 	0,
	10,
	1);
insert into nborderinfo values(1,
		1,
	10);
<<<<<<< HEAD
insert into nbvipcategory value(1,'普通会员', 0, 1);
insert into nbvipcategory value(2,'银卡', 3000, 1.2);
insert into nbvipcategory value(3,'金卡', 8000, 1.3);
insert into nbvipcategory value(4,'白金卡', 15000, 1.4);
=======
>>>>>>> 97dd15d7dc8413eb473ec5d5d137f50a8d3bca44
