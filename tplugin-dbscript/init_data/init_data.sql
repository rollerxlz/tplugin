LOCK TABLES `SYSMAIN` WRITE;
INSERT INTO `SYSMAIN`
VALUES ('01001', 'DB维护_商品配置', 'DB.Update.Products()', NULL);
UNLOCK TABLES;

LOCK TABLES `LOGIN` WRITE;
INSERT INTO `LOGIN`
VALUES ('admin','123456','192.168.0.1','100001'),
('customer','1234567','192.168.0.2', '010001');
UNLOCK TABLES;

LOCK TABLES `PRODUCT` WRITE;
INSERT INTO `PRODUCT`
VALUES ('01322453435A','加长型热带鱼缸','03','A');
UNLOCK TABLES;

LOCK TABLES `STORE` WRITE;
INSERT INTO `STORE`
VALUES ('021','上海','01,05,06','111222');
UNLOCK TABLES;

LOCK TABLES `STOCK` WRITE;
INSERT INTO `STOCK`
VALUES ('01322453435A','021',18,NULL);
UNLOCK TABLES;