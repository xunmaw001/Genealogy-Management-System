-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssmmcq7i
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bianxieren`
--

DROP TABLE IF EXISTS `bianxieren`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bianxieren` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianxierenzhanghao` varchar(200) NOT NULL COMMENT '编写人账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `bianxierenxingming` varchar(200) DEFAULT NULL COMMENT '编写人姓名',
  `bianxierenxingbie` varchar(200) DEFAULT NULL COMMENT '编写人性别',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bianxierenzhanghao` (`bianxierenzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1616992602624 DEFAULT CHARSET=utf8 COMMENT='编写人';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bianxieren`
--

LOCK TABLES `bianxieren` WRITE;
/*!40000 ALTER TABLE `bianxieren` DISABLE KEYS */;
INSERT INTO `bianxieren` VALUES (21,'2021-03-29 04:35:03','编写人1','123456','编写人姓名1','男','13823888881','773890001@qq.com','440300199101010001','http://localhost:8080/ssmmcq7i/upload/bianxieren_touxiang1.jpg'),(22,'2021-03-29 04:35:03','编写人2','123456','编写人姓名2','男','13823888882','773890002@qq.com','440300199202020002','http://localhost:8080/ssmmcq7i/upload/bianxieren_touxiang2.jpg'),(23,'2021-03-29 04:35:03','编写人3','123456','编写人姓名3','男','13823888883','773890003@qq.com','440300199303030003','http://localhost:8080/ssmmcq7i/upload/bianxieren_touxiang3.jpg'),(24,'2021-03-29 04:35:03','编写人4','123456','编写人姓名4','男','13823888884','773890004@qq.com','440300199404040004','http://localhost:8080/ssmmcq7i/upload/bianxieren_touxiang4.jpg'),(25,'2021-03-29 04:35:03','编写人5','123456','编写人姓名5','男','13823888885','773890005@qq.com','440300199505050005','http://localhost:8080/ssmmcq7i/upload/bianxieren_touxiang5.jpg'),(26,'2021-03-29 04:35:03','编写人6','123456','编写人姓名6','男','13823888886','773890006@qq.com','440300199606060006','http://localhost:8080/ssmmcq7i/upload/bianxieren_touxiang6.jpg'),(1616992602623,'2021-03-29 04:36:42','2','2','阿四','男','12312312312','123@qq.com','441402000000000000','http://localhost:8080/ssmmcq7i/upload/1616992614966.jpg');
/*!40000 ALTER TABLE `bianxieren` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssmmcq7i/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssmmcq7i/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssmmcq7i/upload/picture3.jpg'),(6,'homepage','http://localhost:8080/ssmmcq7i/upload/1616992921017.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiapuchengyuan`
--

DROP TABLE IF EXISTS `jiapuchengyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiapuchengyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianxierenzhanghao` varchar(200) DEFAULT NULL COMMENT '编写人账号',
  `bianxierenxingming` varchar(200) DEFAULT NULL COMMENT '编写人姓名',
  `zhanghao` varchar(200) DEFAULT NULL COMMENT '账号',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  `shidai` int(11) DEFAULT NULL COMMENT '世代',
  `paixing` int(11) DEFAULT NULL COMMENT '排行',
  `chucheng` varchar(200) DEFAULT NULL COMMENT '出承',
  `chushengriqi` date DEFAULT NULL COMMENT '出生日期',
  `xueli` varchar(200) DEFAULT NULL COMMENT '学历',
  `zhiye` varchar(200) DEFAULT NULL COMMENT '职业',
  `jiatingzhuzhi` varchar(200) DEFAULT NULL COMMENT '家庭住址',
  `hunyinzhuangkuang` varchar(200) DEFAULT NULL COMMENT '婚姻状况',
  `peiou` varchar(200) DEFAULT NULL COMMENT '配偶',
  `zinvxinxi` varchar(200) DEFAULT NULL COMMENT '子女信息',
  `gerenshiji` varchar(200) DEFAULT NULL COMMENT '个人事迹',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1616992820681 DEFAULT CHARSET=utf8 COMMENT='家谱成员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiapuchengyuan`
--

LOCK TABLES `jiapuchengyuan` WRITE;
/*!40000 ALTER TABLE `jiapuchengyuan` DISABLE KEYS */;
INSERT INTO `jiapuchengyuan` VALUES (41,'2021-03-29 04:35:03','编写人账号1','编写人姓名1','账号1','姓名1','性别1','手机1','http://localhost:8080/ssmmcq7i/upload/jiapuchengyuan_zhaopian1.jpg',1,1,'出承1','2021-03-29','学历1','职业1','家庭住址1','已婚','配偶1','子女信息1','个人事迹1'),(42,'2021-03-29 04:35:03','编写人账号2','编写人姓名2','账号2','姓名2','性别2','手机2','http://localhost:8080/ssmmcq7i/upload/jiapuchengyuan_zhaopian2.jpg',2,2,'出承2','2021-03-29','学历2','职业2','家庭住址2','已婚','配偶2','子女信息2','个人事迹2'),(43,'2021-03-29 04:35:03','编写人账号3','编写人姓名3','账号3','姓名3','性别3','手机3','http://localhost:8080/ssmmcq7i/upload/jiapuchengyuan_zhaopian3.jpg',3,3,'出承3','2021-03-29','学历3','职业3','家庭住址3','已婚','配偶3','子女信息3','个人事迹3'),(44,'2021-03-29 04:35:03','编写人账号4','编写人姓名4','账号4','姓名4','性别4','手机4','http://localhost:8080/ssmmcq7i/upload/jiapuchengyuan_zhaopian4.jpg',4,4,'出承4','2021-03-29','学历4','职业4','家庭住址4','已婚','配偶4','子女信息4','个人事迹4'),(45,'2021-03-29 04:35:03','编写人账号5','编写人姓名5','账号5','姓名5','性别5','手机5','http://localhost:8080/ssmmcq7i/upload/jiapuchengyuan_zhaopian5.jpg',5,5,'出承5','2021-03-29','学历5','职业5','家庭住址5','已婚','配偶5','子女信息5','个人事迹5'),(46,'2021-03-29 04:35:03','编写人账号6','编写人姓名6','账号6','姓名6','性别6','手机6','http://localhost:8080/ssmmcq7i/upload/jiapuchengyuan_zhaopian6.jpg',6,6,'出承6','2021-03-29','学历6','职业6','家庭住址6','已婚','配偶6','子女信息6','个人事迹6'),(1616992756726,'2021-03-29 04:39:16','2','阿四','1','阿三','男','12312312323','http://localhost:8080/ssmmcq7i/upload/1616992713237.jpg',3,1,'阿二','2021-03-29','测试','测试','某某地某某地','已婚','测试','测试','测试');
/*!40000 ALTER TABLE `jiapuchengyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiapuxinxi`
--

DROP TABLE IF EXISTS `jiapuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiapuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiapumingcheng` varchar(200) DEFAULT NULL COMMENT '家谱名称',
  `shizu` varchar(200) DEFAULT NULL COMMENT '始祖',
  `bianxierenzhanghao` varchar(200) DEFAULT NULL COMMENT '编写人账号',
  `bianxierenxingming` varchar(200) DEFAULT NULL COMMENT '编写人姓名',
  `fengmian` varchar(200) DEFAULT NULL COMMENT '封面',
  `bianxieriqi` date DEFAULT NULL COMMENT '编写日期',
  `jiazujianjie` longtext COMMENT '家族简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1616992647476 DEFAULT CHARSET=utf8 COMMENT='家谱信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiapuxinxi`
--

LOCK TABLES `jiapuxinxi` WRITE;
/*!40000 ALTER TABLE `jiapuxinxi` DISABLE KEYS */;
INSERT INTO `jiapuxinxi` VALUES (31,'2021-03-29 04:35:03','家谱名称1','始祖1','编写人账号1','编写人姓名1','http://localhost:8080/ssmmcq7i/upload/jiapuxinxi_fengmian1.jpg','2021-03-29','家族简介1'),(32,'2021-03-29 04:35:03','家谱名称2','始祖2','编写人账号2','编写人姓名2','http://localhost:8080/ssmmcq7i/upload/jiapuxinxi_fengmian2.jpg','2021-03-29','家族简介2'),(33,'2021-03-29 04:35:03','家谱名称3','始祖3','编写人账号3','编写人姓名3','http://localhost:8080/ssmmcq7i/upload/jiapuxinxi_fengmian3.jpg','2021-03-29','家族简介3'),(34,'2021-03-29 04:35:03','家谱名称4','始祖4','编写人账号4','编写人姓名4','http://localhost:8080/ssmmcq7i/upload/jiapuxinxi_fengmian4.jpg','2021-03-29','家族简介4'),(35,'2021-03-29 04:35:03','家谱名称5','始祖5','编写人账号5','编写人姓名5','http://localhost:8080/ssmmcq7i/upload/jiapuxinxi_fengmian5.jpg','2021-03-29','家族简介5'),(36,'2021-03-29 04:35:03','家谱名称6','始祖6','编写人账号6','编写人姓名6','http://localhost:8080/ssmmcq7i/upload/jiapuxinxi_fengmian6.jpg','2021-03-29','家族简介6'),(1616992647475,'2021-03-29 04:37:26','啊氏家谱','啊一','2','阿四','http://localhost:8080/ssmmcq7i/upload/1616992636867.jpg','1997-11-21','<p>测试测试</p>');
/*!40000 ALTER TABLE `jiapuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','n1tgcfe52sc5tszid5mrvwsob6smol4d','2021-03-29 04:36:13','2021-03-29 05:40:55'),(2,1616992602623,'2','bianxieren','编写人','hlkeaqdftzg5vrx2dojudx9t9b0uf89w','2021-03-29 04:36:47','2021-03-29 05:39:35'),(3,1616992697203,'1','yonghu','用户','kr9e9z6itl1218vkegcthzr5a09legqt','2021-03-29 04:38:22','2021-03-29 05:38:22');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-03-29 04:35:03');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhanghao` varchar(200) NOT NULL COMMENT '账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `xingming` varchar(200) DEFAULT NULL COMMENT '姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `shouji` varchar(200) DEFAULT NULL COMMENT '手机',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `zhaopian` varchar(200) DEFAULT NULL COMMENT '照片',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhanghao` (`zhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1616992697204 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2021-03-29 04:35:03','用户1','123456','姓名1','男','13823888881','773890001@qq.com','440300199101010001','http://localhost:8080/ssmmcq7i/upload/yonghu_zhaopian1.jpg'),(12,'2021-03-29 04:35:03','用户2','123456','姓名2','男','13823888882','773890002@qq.com','440300199202020002','http://localhost:8080/ssmmcq7i/upload/yonghu_zhaopian2.jpg'),(13,'2021-03-29 04:35:03','用户3','123456','姓名3','男','13823888883','773890003@qq.com','440300199303030003','http://localhost:8080/ssmmcq7i/upload/yonghu_zhaopian3.jpg'),(14,'2021-03-29 04:35:03','用户4','123456','姓名4','男','13823888884','773890004@qq.com','440300199404040004','http://localhost:8080/ssmmcq7i/upload/yonghu_zhaopian4.jpg'),(15,'2021-03-29 04:35:03','用户5','123456','姓名5','男','13823888885','773890005@qq.com','440300199505050005','http://localhost:8080/ssmmcq7i/upload/yonghu_zhaopian5.jpg'),(16,'2021-03-29 04:35:03','用户6','123456','姓名6','男','13823888886','773890006@qq.com','440300199606060006','http://localhost:8080/ssmmcq7i/upload/yonghu_zhaopian6.jpg'),(1616992697203,'2021-03-29 04:38:17','1','1','阿三','男','12312312323','12@qq.com','441402888888888888','http://localhost:8080/ssmmcq7i/upload/1616992713237.jpg');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-03-30 19:31:09
