	-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
	--
	-- Host: localhost    Database: coffeshop
	-- ------------------------------------------------------
	-- Server version	8.0.19

	/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
	/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
	/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
	/*!50503 SET NAMES utf8 */;
	/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
	/*!40103 SET TIME_ZONE='+00:00' */;
	/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
	/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
	/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
	/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

	--
	-- Table structure for table `bangchamcong`
	--

	DROP TABLE IF EXISTS `bangchamcong`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `bangchamcong` (
	  `bbcid` bigint NOT NULL AUTO_INCREMENT,
	  `bbcthoigian` varchar(50) NOT NULL,
	  PRIMARY KEY (`bbcid`)
	) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `bangchamcong`
	--

	LOCK TABLES `bangchamcong` WRITE;
	/*!40000 ALTER TABLE `bangchamcong` DISABLE KEYS */;
	INSERT INTO `bangchamcong` VALUES (1,'Tháng 5 năm 2019'),(2,'Tháng 6 năm 2019'),(3,'Tháng 7 năm 2019'),(4,'Tháng 8 năm 2019'),(5,'Tháng 9 năm 2019'),(6,'Tháng 10 năm 2019'),(7,'Tháng 11 năm 2019'),(8,'Tháng 12 năm 2019'),(9,'Tháng 1 năm '),(10,'Tháng 2 năm 2020'),(11,'Tháng 3 năm 2020'),(12,'Tháng 4 năm 2020');
	/*!40000 ALTER TABLE `bangchamcong` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `ca`
	--

	DROP TABLE IF EXISTS `ca`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `ca` (
	  `caid` bigint NOT NULL,
	  `caname` varchar(45) DEFAULT NULL,
	  `cathoigian` varchar(45) DEFAULT NULL,
	  PRIMARY KEY (`caid`)
	) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `ca`
	--

	LOCK TABLES `ca` WRITE;
	/*!40000 ALTER TABLE `ca` DISABLE KEYS */;
	INSERT INTO `ca` VALUES (1,'Ca 1','8h00-13h00'),(2,'Ca 1','13h00-18h00'),(3,'Ca 1','18h00-22h00');
	/*!40000 ALTER TABLE `ca` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `chitietchamcong`
	--

	DROP TABLE IF EXISTS `chitietchamcong`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `chitietchamcong` (
	  `bbcid` bigint NOT NULL,
	  `nvid` bigint NOT NULL,
	  `ngaychamcong` date NOT NULL,
	  `caid` bigint NOT NULL,
	  `ghichu` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
	  `idchitietcc` bigint NOT NULL AUTO_INCREMENT,
	  PRIMARY KEY (`idchitietcc`),
	  KEY `fk_idx` (`bbcid`),
	  KEY `fk1_idx` (`caid`),
	  KEY `fk_nv_bcc_idx` (`nvid`),
	  CONSTRAINT `fk` FOREIGN KEY (`bbcid`) REFERENCES `bangchamcong` (`bbcid`),
	  CONSTRAINT `fk1` FOREIGN KEY (`caid`) REFERENCES `ca` (`caid`),
	  CONSTRAINT `fk_nv_bcc` FOREIGN KEY (`nvid`) REFERENCES `nhanvien` (`idnhanvien`)
	) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `chitietchamcong`
	--

	LOCK TABLES `chitietchamcong` WRITE;
	/*!40000 ALTER TABLE `chitietchamcong` DISABLE KEYS */;
	INSERT INTO `chitietchamcong` VALUES (8,1,'2019-12-01',1,NULL,1),(8,1,'2019-12-02',1,NULL,2),(8,1,'2019-12-03',1,NULL,3),(8,1,'2019-12-04',2,NULL,4),(8,1,'2019-12-05',1,NULL,5),(8,1,'2019-12-06',1,NULL,6),(8,1,'2019-12-07',3,NULL,7),(8,2,'2019-12-01',1,NULL,8),(8,2,'2019-12-02',2,NULL,9),(8,2,'2019-12-05',3,NULL,10),(8,2,'2019-12-03',2,NULL,11),(8,2,'2019-12-04',2,NULL,12),(8,2,'2019-12-06',3,NULL,13),(8,2,'2019-12-07',2,NULL,14),(8,2,'2019-12-08',1,NULL,15),(8,3,'2019-12-01',3,NULL,16),(8,3,'2019-12-02',1,NULL,17),(8,3,'2019-12-03',2,NULL,18),(8,3,'2019-12-04',1,NULL,19),(8,3,'2019-12-05',1,NULL,20),(8,3,'2019-12-06',2,NULL,21),(8,3,'2019-12-07',3,NULL,22),(8,3,'2019-12-08',2,NULL,23),(8,4,'2019-12-09',1,NULL,24),(8,5,'2019-12-01',1,NULL,25),(8,5,'2019-12-02',2,NULL,26),(8,5,'2019-12-03',3,NULL,27),(8,5,'2019-12-04',1,NULL,28),(8,5,'2019-12-05',2,NULL,29),(8,5,'2019-12-06',3,NULL,30),(8,5,'2019-12-07',1,NULL,31),(8,5,'2019-12-08',2,NULL,32),(8,6,'2019-12-09',2,NULL,33),(8,6,'2019-12-05',1,NULL,34),(8,6,'2019-12-02',3,NULL,35),(8,6,'2019-12-03',1,NULL,36),(8,6,'2019-12-04',2,NULL,37),(8,6,'2019-12-01',1,NULL,38),(8,7,'2019-12-01',1,NULL,39),(8,7,'2019-12-02',1,NULL,40),(8,7,'2019-12-04',2,NULL,41);
	/*!40000 ALTER TABLE `chitietchamcong` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `chitiethoadon`
	--

	DROP TABLE IF EXISTS `chitiethoadon`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `chitiethoadon` (
	  `idchitiethoadon` bigint NOT NULL AUTO_INCREMENT,
	  `idmathang` bigint DEFAULT NULL,
	  `soluong` bigint DEFAULT NULL,
	  `giatienbandau` float DEFAULT NULL,
	  `giatienhientai` float DEFAULT NULL,
	  `thanhtien` float DEFAULT NULL,
	  `idhoadon` bigint NOT NULL,
	  PRIMARY KEY (`idchitiethoadon`),
	  KEY `fk_hd_cthd_idx` (`idhoadon`),
	  KEY `fk_mathang_cthd_idx` (`idmathang`),
	  CONSTRAINT `fk_hd_cthd` FOREIGN KEY (`idhoadon`) REFERENCES `hoadon` (`idhoadon`),
	  CONSTRAINT `fk_mathang_cthd` FOREIGN KEY (`idmathang`) REFERENCES `mathang` (`idmathang`)
	) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `chitiethoadon`
	--

	LOCK TABLES `chitiethoadon` WRITE;
	/*!40000 ALTER TABLE `chitiethoadon` DISABLE KEYS */;
	INSERT INTO `chitiethoadon` VALUES (1,1,1,50000,50000,50000,1),(2,2,1,50000,50000,50000,6),(3,3,2,50000,50000,100000,2),(4,1,1,50000,50000,50000,3),(5,4,1,20000,20000,20000,1),(6,5,1,20000,20000,20000,4),(7,1,1,50000,50000,50000,4),(8,2,1,50000,50000,50000,5),(9,2,1,50000,50000,50000,6),(10,4,2,20000,20000,40000,6);
	/*!40000 ALTER TABLE `chitiethoadon` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `chitietlichlamviec`
	--

	DROP TABLE IF EXISTS `chitietlichlamviec`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `chitietlichlamviec` (
	  `nvid` bigint NOT NULL,
	  `llvid` bigint NOT NULL,
	  `ngaylamviec` date NOT NULL,
	  `caid` bigint NOT NULL,
	  `ghichu` varchar(45) DEFAULT NULL,
	  `idchitietllv` bigint NOT NULL AUTO_INCREMENT,
	  PRIMARY KEY (`idchitietllv`),
	  KEY `fk_nv_ctllv_idx` (`nvid`),
	  KEY `fk_llv_ctllv_idx` (`llvid`),
	  KEY `fk_ca_ctllv_idx` (`caid`),
	  CONSTRAINT `fk_ca_ctllv` FOREIGN KEY (`caid`) REFERENCES `ca` (`caid`),
	  CONSTRAINT `fk_llv_ctllv` FOREIGN KEY (`llvid`) REFERENCES `lichlamviec` (`llvid`),
	  CONSTRAINT `fk_nv_ctllv` FOREIGN KEY (`nvid`) REFERENCES `nhanvien` (`idnhanvien`)
	) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `chitietlichlamviec`
	--

	LOCK TABLES `chitietlichlamviec` WRITE;
	/*!40000 ALTER TABLE `chitietlichlamviec` DISABLE KEYS */;
	INSERT INTO `chitietlichlamviec` VALUES (1,12,'2019-12-01',1,'Tốt',1),(1,12,'2019-12-01',2,'Tốt',2),(2,12,'2019-12-01',2,'Tốt',3),(2,12,'2019-12-01',3,'Tốt',4),(3,12,'2019-12-02',1,'Tốt',5),(3,12,'2019-12-02',2,'Tốt',6),(4,12,'2019-12-02',2,'Tốt',7),(4,12,'2019-12-02',3,'Tốt',8),(5,12,'2019-12-03',2,'Tốt',9),(5,12,'2019-12-03',3,'Tốt',10),(6,8,'2019-08-01',1,'Tốt',11),(6,8,'2019-08-01',2,'Tốt',12);
	/*!40000 ALTER TABLE `chitietlichlamviec` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `chitietphieunhap`
	--

	DROP TABLE IF EXISTS `chitietphieunhap`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `chitietphieunhap` (
	  `idchitietphieunhap` bigint NOT NULL AUTO_INCREMENT,
	  `idmathang` bigint DEFAULT NULL,
	  `soluongtheochungtu` bigint DEFAULT NULL,
	  `soluongthucxuat` bigint DEFAULT NULL,
	  `dongia` float DEFAULT NULL,
	  `thanhtien` float DEFAULT NULL,
	  `idphieunhapkho` bigint DEFAULT NULL,
	  PRIMARY KEY (`idchitietphieunhap`),
	  KEY `fk_mathang_pn_idx` (`idmathang`),
	  KEY `fk_pnk_ctpn_idx` (`idphieunhapkho`),
	  CONSTRAINT `fk_mathang_pn` FOREIGN KEY (`idmathang`) REFERENCES `mathang` (`idmathang`),
	  CONSTRAINT `fk_pnk_ctpn` FOREIGN KEY (`idphieunhapkho`) REFERENCES `phieunhapkho` (`idphieunhapkho`)
	) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `chitietphieunhap`
	--

	LOCK TABLES `chitietphieunhap` WRITE;
	/*!40000 ALTER TABLE `chitietphieunhap` DISABLE KEYS */;
	INSERT INTO `chitietphieunhap` VALUES (1,1,100,100,100000,1000000,1),(2,2,100,100,100000,1000000,1),(3,3,100,100,100000,1000000,1),(4,4,100,100,100000,1000000,1),(5,1,200,200,200000,200000,2),(6,2,100,100,100000,200000,2),(7,3,100,100,100000,200000,2),(8,4,100,100,100000,200000,2),(9,1,200,200,200000,200000,3),(10,2,200,200,200000,200000,3),(11,3,200,200,200000,200000,3),(12,4,100,100,500000,200000,3),(13,1,100,100,500000,300000,4),(14,2,100,100,500000,300000,4),(15,3,100,100,500000,300000,4),(16,4,100,100,500000,300000,4),(17,1,100,100,500000,300000,5),(18,2,100,100,500000,300000,5),(19,3,100,100,500000,300000,5),(20,4,100,100,500000,300000,5);
	/*!40000 ALTER TABLE `chitietphieunhap` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `chitietphieuxuat`
	--

	DROP TABLE IF EXISTS `chitietphieuxuat`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `chitietphieuxuat` (
	  `idchitietphieuxuat` bigint NOT NULL AUTO_INCREMENT,
	  `idmathang` bigint DEFAULT NULL,
	  `soluongtheochungtu` bigint DEFAULT NULL,
	  `soluongthucxuat` bigint DEFAULT NULL,
	  `dongiaxuat` bigint DEFAULT NULL,
	  `idphieuxuatkho` bigint DEFAULT NULL,
	  PRIMARY KEY (`idchitietphieuxuat`),
	  KEY `fk_mathang_ctpxk_idx` (`idmathang`),
	  KEY `fk_pxk_ctpxk_idx` (`idphieuxuatkho`),
	  CONSTRAINT `fk_mathang_ctpxk` FOREIGN KEY (`idmathang`) REFERENCES `mathang` (`idmathang`),
	  CONSTRAINT `fk_pxk_ctpxk` FOREIGN KEY (`idphieuxuatkho`) REFERENCES `phieuxuatkho` (`idphieuxuatkho`)
	) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `chitietphieuxuat`
	--

	LOCK TABLES `chitietphieuxuat` WRITE;
	/*!40000 ALTER TABLE `chitietphieuxuat` DISABLE KEYS */;
	INSERT INTO `chitietphieuxuat` VALUES (1,1,100,100,100000,1),(2,2,100,100,100000,1),(3,3,100,100,100000,1),(4,4,100,100,100000,1),(5,1,200,200,200000,2),(6,2,100,100,100000,2),(7,3,100,100,100000,2),(8,4,100,100,100000,2),(9,1,200,200,200000,3),(10,2,200,200,200000,3),(11,3,200,200,200000,3),(12,4,100,100,500000,3),(13,1,100,100,500000,4),(14,2,100,100,500000,4),(15,3,100,100,500000,4),(16,4,100,100,500000,4);
	/*!40000 ALTER TABLE `chitietphieuxuat` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `chucvu`
	--

	DROP TABLE IF EXISTS `chucvu`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `chucvu` (
	  `chucvuid` bigint NOT NULL AUTO_INCREMENT,
	  `chucvuten` varchar(100) DEFAULT NULL,
	  PRIMARY KEY (`chucvuid`)
	) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `chucvu`
	--

	LOCK TABLES `chucvu` WRITE;
	/*!40000 ALTER TABLE `chucvu` DISABLE KEYS */;
	INSERT INTO `chucvu` VALUES (1,'Quan Lý'),(2,'Nhân viên thủ kho'),(3,'Nhân viên phục vụ'),(4,'Nhân viên pha chế'),(5,'Nhân viên bán hàng'),(6,'Thủ kho');
	/*!40000 ALTER TABLE `chucvu` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `cuahang`
	--

	DROP TABLE IF EXISTS `cuahang`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `cuahang` (
	  `idcuahang` bigint NOT NULL AUTO_INCREMENT,
	  `tencuahang` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
	  `diachi` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
	  PRIMARY KEY (`idcuahang`)
	) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='		';
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `cuahang`
	--

	LOCK TABLES `cuahang` WRITE;
	/*!40000 ALTER TABLE `cuahang` DISABLE KEYS */;
	INSERT INTO `cuahang` VALUES (1,'Café Mộc','234, Hoàng Quốc Việt, Cổ Nhuế 1, Bắc Từ Liêm, Hà Nội'),(2,'Café Nhàn','20, Hai Bà Trưng, Hà Nội'),(3,'Café Xuân','38, Tôn Thất Tùng, Thanh Xuân, Hà Nội '),(4,'Café Nhung Kute','170, phường Hòa Minh, quận Liên Chiểu, Đà Nẵng'),(5,'Café Hạ','16, Láng Hạ, Thanh Xuân, Hà Nội'),(6,'Café Thu','55, Phan Đình Phùng, Ba Đình '),(7,'Café Đông','307, Lê Văn Lương, Quận 7, thành phố Hồ Chí Minh');
	/*!40000 ALTER TABLE `cuahang` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `giamgia`
	--

	DROP TABLE IF EXISTS `giamgia`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `giamgia` (
	  `idgiamgia` bigint NOT NULL AUTO_INCREMENT,
	  `phantram` float DEFAULT NULL,
	  `sotien` bigint DEFAULT NULL,
	  `mota` varchar(45) DEFAULT NULL,
	  PRIMARY KEY (`idgiamgia`)
	) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `giamgia`
	--

	LOCK TABLES `giamgia` WRITE;
	/*!40000 ALTER TABLE `giamgia` DISABLE KEYS */;
	INSERT INTO `giamgia` VALUES (1,20,0,NULL),(2,15,0,NULL),(3,10,0,NULL),(4,5,0,NULL),(5,0,15000,NULL),(6,0,25000,NULL),(7,0,30000,NULL),(8,0,40000,NULL);
	/*!40000 ALTER TABLE `giamgia` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `hibernate_sequence`
	--

	DROP TABLE IF EXISTS `hibernate_sequence`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `hibernate_sequence` (
	  `next_val` bigint DEFAULT NULL
	) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `hibernate_sequence`
	--

	LOCK TABLES `hibernate_sequence` WRITE;
	/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
	INSERT INTO `hibernate_sequence` VALUES (1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1),(1);
	/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `hoadon`
	--

	DROP TABLE IF EXISTS `hoadon`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `hoadon` (
	  `idhoadon` bigint NOT NULL AUTO_INCREMENT,
	  `idkhachhang` bigint DEFAULT NULL,
	  `idnhanvien` bigint DEFAULT NULL,
	  `ngaymua` datetime DEFAULT NULL,
	  `sotiennhan` float DEFAULT NULL,
	  `sotientralai` float DEFAULT NULL,
	  `tongtienbandau` float DEFAULT NULL,
	  `tongtienthanhtoan` float DEFAULT NULL,
	  `idgiamgia` bigint DEFAULT NULL,
	  `tinhtrang` bigint DEFAULT NULL,
	  `idcuahang` bigint DEFAULT NULL,
	  PRIMARY KEY (`idhoadon`),
	  KEY `fk_hoadon_khachhang_idx` (`idkhachhang`),
	  KEY `fk_hoadon_nhanvien_idx` (`idnhanvien`),
	  KEY `fk_hoadon_giamgia_idx` (`idgiamgia`),
	  KEY `fk_hoadon_cuahang_idx` (`idcuahang`),
	  CONSTRAINT `fk_hoadon_cuahang` FOREIGN KEY (`idcuahang`) REFERENCES `cuahang` (`idcuahang`),
	  CONSTRAINT `fk_hoadon_giamgia` FOREIGN KEY (`idgiamgia`) REFERENCES `giamgia` (`idgiamgia`),
	  CONSTRAINT `fk_hoadon_khachhang` FOREIGN KEY (`idkhachhang`) REFERENCES `khachhang` (`idkhachhang`),
	  CONSTRAINT `fk_hoadon_nhanvien` FOREIGN KEY (`idnhanvien`) REFERENCES `nhanvien` (`idnhanvien`)
	) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `hoadon`
	--

	LOCK TABLES `hoadon` WRITE;
	/*!40000 ALTER TABLE `hoadon` DISABLE KEYS */;
	INSERT INTO `hoadon` VALUES (1,1,5,'2019-12-01 00:00:00',100000,30000,90000,70000,2,1,1),(2,2,5,'2019-12-02 00:00:00',100000,0,100000,100000,1,1,1),(3,3,5,'2019-12-02 00:00:00',500000,0,50000,50000,2,1,1),(4,4,5,'2019-12-02 00:00:00',200000,130000,100000,70000,2,1,1),(5,5,5,'2019-12-03 00:00:00',100000,30000,100000,70000,2,1,1),(6,6,5,'2019-12-05 00:00:00',100000,10000,90000,90000,1,1,1),(7,7,11,'2019-12-02 00:00:00',50000,0,50000,0,1,1,2),(8,8,11,'2019-12-05 00:00:00',100000,0,100000,100000,1,1,2),(9,9,11,'2019-12-01 00:00:00',150000,0,150000,150000,1,1,2),(10,10,11,'2019-12-02 00:00:00',100000,30000,100000,70000,2,1,2),(20,NULL,NULL,NULL,0,0,0,0,NULL,0,NULL);
	/*!40000 ALTER TABLE `hoadon` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `khachhang`
	--

	DROP TABLE IF EXISTS `khachhang`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `khachhang` (
	  `idkhachhang` bigint NOT NULL AUTO_INCREMENT,
	  `sodienthoai` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
	  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
	  `facebook` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
	  `tenkhachhang` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
	  `idloaikhachhang` bigint DEFAULT NULL,
	  PRIMARY KEY (`idkhachhang`)
	) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `khachhang`
	--

	LOCK TABLES `khachhang` WRITE;
	/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
	INSERT INTO `khachhang` VALUES (1,'0123456789','a@gmail.com','https://www.facebook.com/a.98','a',1),(2,'0125365466','b@gmail.com','https://www.facebook.com/b.98','b',1),(3,'9856465656','c@gmail.com','https://www.facebook.com/c.98\n','c',2),(4,'0124563995','d@gmail.com','https://www.facebook.com/d.98\n','d',3),(5,'0965422111','e@gmail.com','https://www.facebook.com/e.98\n','e',4),(6,'056441698','f@gmail.com','https://www.facebook.com/f.98\n','f',1),(7,'0665999999','g@gmail.com','https://www.facebook.com/h.98\n','g',2),(8,'0333888888','h@gmail.com','https://www.facebook.com/i.98','h',3),(9,'0468888888','i@gmail.com','https://www.facebook.com/j.98\n','i',4),(10,'0568686868','k@gmail.com','https://www.facebook.com/k.98\n','j',1);
	/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `khachhang_giamgia`
	--

	DROP TABLE IF EXISTS `khachhang_giamgia`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `khachhang_giamgia` (
	  `idkhachhanggiamgia` bigint NOT NULL AUTO_INCREMENT,
	  `idkhachhang` bigint DEFAULT NULL,
	  `idgiamgia` bigint DEFAULT NULL,
	  `soluong` bigint DEFAULT NULL,
	  `ngaybatdau` datetime DEFAULT NULL,
	  `ngayketthuc` datetime DEFAULT NULL,
	  PRIMARY KEY (`idkhachhanggiamgia`),
	  KEY `fk_khachhang_giamgia_khachahng_idx` (`idkhachhang`),
	  KEY `fk_khachhang_giamgia_gimagia_idx` (`idgiamgia`),
	  CONSTRAINT `fk_khachhang_giamgia_gimagia` FOREIGN KEY (`idgiamgia`) REFERENCES `giamgia` (`idgiamgia`),
	  CONSTRAINT `fk_khachhang_giamgia_khachahng` FOREIGN KEY (`idkhachhang`) REFERENCES `khachhang` (`idkhachhang`)
	) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `khachhang_giamgia`
	--

	LOCK TABLES `khachhang_giamgia` WRITE;
	/*!40000 ALTER TABLE `khachhang_giamgia` DISABLE KEYS */;
	INSERT INTO `khachhang_giamgia` VALUES (1,1,1,10,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(2,2,1,5,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(3,3,2,6,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(4,4,3,7,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(5,5,4,8,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(6,6,5,9,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(7,7,1,10,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(8,8,2,11,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(9,9,3,12,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(10,10,4,1,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(14,1,2,2,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(15,2,3,2,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(16,3,4,2,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(17,4,5,2,'2019-01-01 00:00:00','2019-05-01 00:00:00');
	/*!40000 ALTER TABLE `khachhang_giamgia` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `lichlamviec`
	--

	DROP TABLE IF EXISTS `lichlamviec`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `lichlamviec` (
	  `llvid` bigint NOT NULL AUTO_INCREMENT,
	  `thoigian` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
	  PRIMARY KEY (`llvid`)
	) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `lichlamviec`
	--

	LOCK TABLES `lichlamviec` WRITE;
	/*!40000 ALTER TABLE `lichlamviec` DISABLE KEYS */;
	INSERT INTO `lichlamviec` VALUES (1,'Tháng 1 Năm 2019'),(2,'Tháng 2 Năm 2019'),(3,'Tháng 3 Năm 2019'),(4,'Tháng 4 Năm 2019'),(5,'Tháng 5 Năm 2019'),(6,'Tháng 6 Năm 2019'),(7,'Tháng 7 Năm 2019'),(8,'Tháng 8 Năm 2019'),(9,'Tháng 9 Năm 2019'),(10,'Tháng 10 Năm 2019'),(11,'Tháng 11 Năm 2019'),(12,'Tháng 12 Năm 2019'),(13,'Tháng 1 Năm 2020'),(14,'Tháng 2 Năm 2020'),(15,'Tháng 3 Năm 2020'),(16,'Tháng 4 Năm 2020');
	/*!40000 ALTER TABLE `lichlamviec` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `loaikhachhang`
	--

	DROP TABLE IF EXISTS `loaikhachhang`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `loaikhachhang` (
	  `idloaikhachhang` bigint NOT NULL AUTO_INCREMENT,
	  `tenloai` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
	  `dinhmuc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
	  PRIMARY KEY (`idloaikhachhang`)
	) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `loaikhachhang`
	--

	LOCK TABLES `loaikhachhang` WRITE;
	/*!40000 ALTER TABLE `loaikhachhang` DISABLE KEYS */;
	INSERT INTO `loaikhachhang` VALUES (1,'VIP','50'),(2,'VIP1','30'),(3,'VIP2','20'),(4,'VIP3','10');
	/*!40000 ALTER TABLE `loaikhachhang` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `loaikhachhang_giamgia`
	--

	DROP TABLE IF EXISTS `loaikhachhang_giamgia`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `loaikhachhang_giamgia` (
	  `idloaikhachhanggiamgia` bigint NOT NULL AUTO_INCREMENT,
	  `idloaikhachhang` bigint DEFAULT NULL,
	  `idgiamgia` bigint DEFAULT NULL,
	  `soluong` bigint DEFAULT NULL,
	  `ngaybatdau` datetime DEFAULT NULL,
	  `ngayketthuc` datetime DEFAULT NULL,
	  PRIMARY KEY (`idloaikhachhanggiamgia`),
	  KEY `fk_loaikh_giamgia_loai_idx` (`idloaikhachhang`),
	  KEY `fk_loaikh_giiamgia_giamgia_idx` (`idgiamgia`),
	  CONSTRAINT `fk_loaikh_giamgia_loai` FOREIGN KEY (`idloaikhachhang`) REFERENCES `loaikhachhang` (`idloaikhachhang`),
	  CONSTRAINT `fk_loaikh_giiamgia_giamgia` FOREIGN KEY (`idgiamgia`) REFERENCES `giamgia` (`idgiamgia`)
	) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `loaikhachhang_giamgia`
	--

	LOCK TABLES `loaikhachhang_giamgia` WRITE;
	/*!40000 ALTER TABLE `loaikhachhang_giamgia` DISABLE KEYS */;
	INSERT INTO `loaikhachhang_giamgia` VALUES (1,1,1,10,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(2,2,2,10,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(3,3,3,10,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(4,4,4,10,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(5,1,2,10,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(6,2,3,10,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(7,3,4,10,'2019-01-01 00:00:00','2019-05-01 00:00:00'),(8,4,2,10,'2019-01-01 00:00:00','2019-05-01 00:00:00');
	/*!40000 ALTER TABLE `loaikhachhang_giamgia` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `mathang`
	--

	DROP TABLE IF EXISTS `mathang`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `mathang` (
	  `idmathang` bigint NOT NULL AUTO_INCREMENT,
	  `gia` float DEFAULT NULL,
	  `donvitinh` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
	  `tenhang` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
	  PRIMARY KEY (`idmathang`)
	) ENGINE=InnoDB AUTO_INCREMENT=120 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `mathang`
	--

	LOCK TABLES `mathang` WRITE;
	/*!40000 ALTER TABLE `mathang` DISABLE KEYS */;
	INSERT INTO `mathang` VALUES (1,35000,'Cốc','Café Sữa'),(2,50000,'Cốc','Café Espresso'),(3,60000,'Cốc','Café Capuchino'),(4,30000,'Cốc','Café Latte'),(5,50000,'Cốc','Café Vanilla'),(6,60000,'Cốc','Café Americano'),(7,70000,'Cốc','Caramel Machiato'),(8,50000,'Cốc','Caramel Mocha'),(9,45000,'Cốc','Raspberry Mocha'),(10,55000,'Cốc','Hot Chocolate '),(11,65000,'Cốc','Café Breve'),(12,40000,'Cốc','Café Irish'),(13,55000,'Cốc','Hot white chocolate'),(14,50000,'Cốc','Marshmellow latte'),(15,35000,'Cốc','Café White Mocha'),(16,5000,'Cái','Su kem Matcha'),(17,20000,'Cái','Bánh kem hạnh nhân cỡ nhỏ'),(18,20000,'Đĩa','Hạt dưa có vị'),(19,20000,'Đĩa','Hạt hướng dương có vị'),(20,20000,'Cái','Bánh Caramel Fla');
	/*!40000 ALTER TABLE `mathang` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `mathang_cuahang`
	--

	DROP TABLE IF EXISTS `mathang_cuahang`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `mathang_cuahang` (
	  `idmathangcuahang` bigint NOT NULL AUTO_INCREMENT,
	  `ngay` date DEFAULT NULL,
	  `idmathang` bigint DEFAULT NULL,
	  `idcuahang` bigint DEFAULT NULL,
	  `idgiamgia` bigint DEFAULT NULL,
	  PRIMARY KEY (`idmathangcuahang`),
	  KEY `fk_mathang_cuahang_mathang_idx` (`idmathang`),
	  KEY `fk_mathang_cuahang_cuahang_idx` (`idcuahang`),
	  KEY `fk_mathang_cuahang_giamgia_idx` (`idgiamgia`),
	  CONSTRAINT `fk_mathang_cuahang_cuahang` FOREIGN KEY (`idcuahang`) REFERENCES `cuahang` (`idcuahang`),
	  CONSTRAINT `fk_mathang_cuahang_giamgia` FOREIGN KEY (`idgiamgia`) REFERENCES `giamgia` (`idgiamgia`),
	  CONSTRAINT `fk_mathang_cuahang_mathang` FOREIGN KEY (`idmathang`) REFERENCES `mathang` (`idmathang`)
	) ENGINE=InnoDB AUTO_INCREMENT=163 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `mathang_cuahang`
	--

	LOCK TABLES `mathang_cuahang` WRITE;
	/*!40000 ALTER TABLE `mathang_cuahang` DISABLE KEYS */;
	INSERT INTO `mathang_cuahang` VALUES (1,'2020-04-08',1,1,1),(2,'2020-04-08',2,1,1),(3,'2020-04-08',3,1,2),(4,'2020-04-08',4,1,2),(5,'2020-04-08',5,1,2),(6,'2020-04-08',6,1,1),(7,'2020-04-08',7,1,1),(8,'2020-04-08',8,1,2),(9,'2020-04-08',9,1,2),(10,'2020-04-08',10,1,2),(11,'2020-04-08',11,1,1),(12,'2020-04-08',12,1,1),(158,'2020-04-08',NULL,NULL,NULL),(159,'2025-04-08',NULL,NULL,NULL),(160,'2025-04-08',NULL,1,NULL),(161,'2025-04-08',NULL,1,NULL),(162,'2030-04-08',7,1,NULL);
	/*!40000 ALTER TABLE `mathang_cuahang` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `nhanvien`
	--

	DROP TABLE IF EXISTS `nhanvien`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `nhanvien` (
	  `idnhanvien` bigint NOT NULL AUTO_INCREMENT,
	  `idcuahang` bigint DEFAULT NULL,
	  PRIMARY KEY (`idnhanvien`),
	  KEY `fk_nhanvien_cuahang_idx` (`idcuahang`),
	  CONSTRAINT `fk_nhanvien_cuahang` FOREIGN KEY (`idcuahang`) REFERENCES `cuahang` (`idcuahang`)
	) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `nhanvien`
	--

	LOCK TABLES `nhanvien` WRITE;
	/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
	INSERT INTO `nhanvien` VALUES (1,1),(2,1),(3,1),(4,1),(5,1),(6,1),(7,2),(8,2),(9,2),(10,2),(11,2),(12,2),(13,3),(14,3),(15,3),(16,3),(17,3),(18,3),(19,4),(20,4),(21,4),(22,4),(23,4),(24,4);
	/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `nhanvien_chucvu`
	--

	DROP TABLE IF EXISTS `nhanvien_chucvu`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `nhanvien_chucvu` (
	  `nvid` bigint NOT NULL,
	  `chucvuid` bigint NOT NULL,
	  `thoigianbatdau` date NOT NULL,
	  `thoigianketthuc` date DEFAULT NULL,
	  `idnvcv` bigint NOT NULL AUTO_INCREMENT,
	  PRIMARY KEY (`idnvcv`),
	  KEY `rbew_idx` (`nvid`),
	  KEY `rr_idx` (`chucvuid`),
	  CONSTRAINT `rbew` FOREIGN KEY (`nvid`) REFERENCES `nhanvien` (`idnhanvien`) ON DELETE CASCADE ON UPDATE CASCADE,
	  CONSTRAINT `rr` FOREIGN KEY (`chucvuid`) REFERENCES `chucvu` (`chucvuid`)
	) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `nhanvien_chucvu`
	--

	LOCK TABLES `nhanvien_chucvu` WRITE;
	/*!40000 ALTER TABLE `nhanvien_chucvu` DISABLE KEYS */;
	INSERT INTO `nhanvien_chucvu` VALUES (1,1,'2018-03-12','2019-03-12',1),(2,2,'2017-03-08','2020-03-09',2),(3,3,'2018-03-10','2019-05-11',3),(4,4,'2018-05-11','2019-03-02',4),(5,5,'2016-07-12','2018-04-10',5),(6,6,'2017-06-12','2019-03-06',6),(7,1,'2018-03-12','2019-08-05',7),(8,2,'2019-02-12','2020-03-02',8),(9,3,'2016-01-12','2018-06-01',9),(10,4,'2017-03-12','2019-04-07',10),(11,5,'2018-09-12','2019-05-09',11),(12,6,'2019-03-12','2020-03-08',12);
	/*!40000 ALTER TABLE `nhanvien_chucvu` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `nhom`
	--

	DROP TABLE IF EXISTS `nhom`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `nhom` (
	  `id` bigint NOT NULL AUTO_INCREMENT,
	  `name` varchar(100) NOT NULL,
	  PRIMARY KEY (`id`)
	) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `nhom`
	--

	LOCK TABLES `nhom` WRITE;
	/*!40000 ALTER TABLE `nhom` DISABLE KEYS */;
	INSERT INTO `nhom` VALUES (1,'nhanvienbanhang'),(2,'nhanvienkho'),(3,'nhanviencuahang'),(4,'quanlykhuvuc'),(5,'bangiamdoc'),(6,'admin');
	/*!40000 ALTER TABLE `nhom` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `nv_bangchamcong`
	--

	DROP TABLE IF EXISTS `nv_bangchamcong`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `nv_bangchamcong` (
	  `bccid` bigint NOT NULL,
	  `nvid` bigint NOT NULL,
	  `idnvbcc` bigint NOT NULL AUTO_INCREMENT,
	  PRIMARY KEY (`idnvbcc`),
	  KEY `fk_nv_bangchamcong_bcc_idx` (`bccid`),
	  KEY `fk_nv_bangchamcong_nhanvine_idx` (`nvid`),
	  CONSTRAINT `fk_nv_bangchamcong_bcc` FOREIGN KEY (`bccid`) REFERENCES `bangchamcong` (`bbcid`),
	  CONSTRAINT `fk_nv_bangchamcong_nhanvine` FOREIGN KEY (`nvid`) REFERENCES `nhanvien` (`idnhanvien`)
	) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `nv_bangchamcong`
	--

	LOCK TABLES `nv_bangchamcong` WRITE;
	/*!40000 ALTER TABLE `nv_bangchamcong` DISABLE KEYS */;
	INSERT INTO `nv_bangchamcong` VALUES (1,3,63),(1,4,64),(1,5,65),(1,6,66),(1,7,67),(1,8,68),(1,9,69),(2,1,70),(2,2,71),(2,3,72),(2,4,73),(2,5,74),(2,6,75),(2,8,76),(2,9,77),(2,10,78),(3,1,79),(3,2,80),(3,3,81),(3,4,82),(3,5,83),(3,6,84),(3,7,85),(3,8,86),(3,9,87),(3,10,88),(4,1,89),(4,2,90),(4,3,91),(4,4,92),(4,5,93),(4,6,94),(4,7,95),(4,8,96),(4,9,97),(5,1,98),(5,2,99),(5,3,100),(5,4,101),(5,5,102),(5,6,103),(5,7,104),(5,8,105),(5,9,106),(6,1,107),(6,2,108),(6,3,109),(6,4,110),(6,5,111),(6,6,112),(6,7,113),(6,8,114),(6,9,115),(7,1,116),(7,2,117),(7,3,118),(7,4,119),(7,5,120),(7,6,121),(7,7,122),(7,8,123),(7,9,124),(1,1,125),(1,2,126);
	/*!40000 ALTER TABLE `nv_bangchamcong` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `nv_lichlamviec`
	--

	DROP TABLE IF EXISTS `nv_lichlamviec`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `nv_lichlamviec` (
	  `nvid` bigint NOT NULL,
	  `llvid` bigint NOT NULL,
	  `idnvllv` bigint NOT NULL AUTO_INCREMENT,
	  PRIMARY KEY (`idnvllv`),
	  KEY `fk_nv_llv_nv_idx` (`nvid`),
	  KEY `fk_llv_nv_llv_idx` (`llvid`),
	  CONSTRAINT `fk_llv_nv_llv` FOREIGN KEY (`llvid`) REFERENCES `lichlamviec` (`llvid`),
	  CONSTRAINT `fk_nv_llv_nv` FOREIGN KEY (`nvid`) REFERENCES `nhanvien` (`idnhanvien`)
	) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `nv_lichlamviec`
	--

	LOCK TABLES `nv_lichlamviec` WRITE;
	/*!40000 ALTER TABLE `nv_lichlamviec` DISABLE KEYS */;
	INSERT INTO `nv_lichlamviec` VALUES (1,12,1),(2,12,2),(3,12,3),(4,12,4),(5,12,5),(6,8,6),(7,8,7),(9,9,8),(10,13,9),(11,13,10);
	/*!40000 ALTER TABLE `nv_lichlamviec` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `phieunhapkho`
	--

	DROP TABLE IF EXISTS `phieunhapkho`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `phieunhapkho` (
	  `idphieunhapkho` bigint NOT NULL AUTO_INCREMENT,
	  `ngaylap` datetime DEFAULT NULL,
	  `idnhanvien` bigint DEFAULT NULL,
	  `idcuahang` bigint DEFAULT NULL,
	  `tongtienchuavat` float DEFAULT NULL,
	  `tongtienvat` float DEFAULT NULL,
	  `tongtiendavat` float DEFAULT NULL,
	  PRIMARY KEY (`idphieunhapkho`),
	  KEY `fk_nv_pnkho_idx` (`idnhanvien`),
	  KEY `fk_ch_pnkho_idx` (`idcuahang`),
	  CONSTRAINT `fk_ch_pnkho` FOREIGN KEY (`idcuahang`) REFERENCES `cuahang` (`idcuahang`),
	  CONSTRAINT `fk_nv_pnkho` FOREIGN KEY (`idnhanvien`) REFERENCES `nhanvien` (`idnhanvien`)
	) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `phieunhapkho`
	--

	LOCK TABLES `phieunhapkho` WRITE;
	/*!40000 ALTER TABLE `phieunhapkho` DISABLE KEYS */;
	INSERT INTO `phieunhapkho` VALUES (1,NULL,1,1,500000,500000,500000),(2,NULL,2,2,600000,600000,600000),(3,NULL,1,1,500000,500000,500000),(4,NULL,2,3,600000,600000,600000),(5,NULL,3,4,500000,500000,500000),(6,NULL,4,5,600000,600000,600000);
	/*!40000 ALTER TABLE `phieunhapkho` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `phieuxuatkho`
	--

	DROP TABLE IF EXISTS `phieuxuatkho`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `phieuxuatkho` (
	  `idphieuxuatkho` bigint NOT NULL AUTO_INCREMENT,
	  `ngaylap` datetime DEFAULT NULL,
	  `idnhanvien` bigint DEFAULT NULL,
	  `idcuahang` bigint DEFAULT NULL,
	  `tongtienchuavat` float DEFAULT NULL,
	  `tongtienvat` float DEFAULT NULL,
	  `tongtiendavat` float DEFAULT NULL,
	  PRIMARY KEY (`idphieuxuatkho`),
	  KEY `fk_cuahang_pxuat_idx` (`idcuahang`),
	  KEY `fk_nv_pxuat_idx` (`idnhanvien`),
	  CONSTRAINT `fk_cuahang_pxuat` FOREIGN KEY (`idcuahang`) REFERENCES `cuahang` (`idcuahang`),
	  CONSTRAINT `fk_nv_pxuat` FOREIGN KEY (`idnhanvien`) REFERENCES `nhanvien` (`idnhanvien`)
	) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `phieuxuatkho`
	--

	LOCK TABLES `phieuxuatkho` WRITE;
	/*!40000 ALTER TABLE `phieuxuatkho` DISABLE KEYS */;
	INSERT INTO `phieuxuatkho` VALUES (1,'2018-01-01 00:00:00',1,1,400000,400000,400000),(2,'2018-03-03 00:00:00',2,2,500000,100000,400000),(3,'2018-04-04 00:00:00',1,2,600000,500000,100000),(4,'2018-05-05 00:00:00',1,2,600000,500000,100000);
	/*!40000 ALTER TABLE `phieuxuatkho` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `quyen`
	--

	DROP TABLE IF EXISTS `quyen`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `quyen` (
	  `id` bigint NOT NULL AUTO_INCREMENT,
	  `action` varchar(45) NOT NULL,
	  `tablename` varchar(45) NOT NULL,
	  PRIMARY KEY (`id`)
	) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=latin1;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `quyen`
	--

	LOCK TABLES `quyen` WRITE;
	/*!40000 ALTER TABLE `quyen` DISABLE KEYS */;
	INSERT INTO `quyen` VALUES (1,'DELTE','bangchamcong'),(2,'SELECT','bangchamcong'),(3,'INSERT','bangchamcong'),(4,'UPDATE','bangchamcong'),(5,'DELTE','ca'),(6,'SELECT','ca'),(7,'INSERT','ca'),(8,'UPDATE','ca'),(9,'DELTE','chitietchamcong'),(10,'SELECT','chitietchamcong'),(11,'INSERT','chitietchamcong'),(12,'UPDATE','chitietchamcong'),(13,'DELTE','chitiethoadon'),(14,'SELECT','chitiethoadon'),(15,'INSERT','chitiethoadon'),(16,'UPDATE','chitiethoadon'),(17,'DELTE','chitiethoadon'),(18,'SELECT','chitiethoadon'),(19,'INSERT','chitiethoadon'),(20,'UPDATE','chitiethoadon'),(21,'DELTE','chitietlichlamviec'),(22,'SELECT','chitietlichlamviec'),(23,'INSERT','chitietlichlamviec'),(24,'UPDATE','chitietlichlamviec'),(25,'DELTE','chitietphieunhap'),(26,'SELECT','chitietphieunhap'),(27,'INSERT','chitietphieunhap'),(28,'UPDATE','chitietphieunhap'),(29,'DELTE','chitietphieuphieuxuat'),(30,'SELECT','chitietphieuphieuxuat'),(31,'INSERT','chitietphieuphieuxuat'),(32,'UPDATE','chitietphieuphieuxuat'),(33,'DELTE','chucvu'),(34,'SELECT','chucvu'),(35,'INSERT','chucvu'),(36,'UPDATE','chucvu'),(37,'DELTE','cuahang'),(38,'SELECT','cuahang'),(39,'INSERT','cuahang'),(40,'UPDATE','cuahang'),(41,'DELTE','giamgia'),(42,'SELECT','giamgia'),(43,'INSERT','giamgia'),(44,'UPDATE','giamgia'),(45,'DELTE','group'),(46,'SELECT','group'),(47,'INSERT','group'),(48,'UPDATE','group'),(49,'DELTE','group_role'),(50,'SELECT','group_role'),(51,'INSERT','group_role'),(52,'UPDATE','group_role'),(53,'DELTE','hoadon'),(54,'SELECT','hoadon'),(55,'INSERT','hoadon'),(56,'UPDATE','hoadon'),(57,'DELTE','khachhang'),(58,'SELECT','khachhang'),(59,'INSERT','khachhang'),(60,'UPDATE','khachhang'),(61,'DELTE','khachhang_giamgia'),(62,'SELECT','khachhang_giamgia'),(63,'INSERT','khachhang_giamgia'),(64,'UPDATE','khachhang_giamgia'),(65,'DELTE','lichlamviec'),(66,'SELECT','lichlamviec'),(67,'INSERT','lichlamviec'),(68,'UPDATE','lichlamviec'),(69,'DELTE','loaikhachhang'),(70,'SELECT','loaikhachhang'),(71,'INSERT','loaikhachhang'),(72,'UPDATE','loaikhachhang'),(73,'DELTE','loaikhachhang_giamgia'),(74,'SELECT','loaikhachhang_giamgia'),(75,'INSERT','loaikhachhang_giamgia'),(76,'UPDATE','loaikhachhang_giamgia'),(77,'DELTE','mathang'),(78,'SELECT','mathang'),(79,'INSERT','mathang'),(80,'UPDATE','mathang'),(81,'DELTE','mathang_cuahang'),(82,'SELECT','mathang_cuahang'),(83,'INSERT','mathang_cuahang'),(84,'UPDATE','mathang_cuahang'),(85,'DELTE','nhanvien'),(86,'SELECT','nhanvien'),(87,'INSERT','nhanvien'),(88,'UPDATE','nhanvien'),(89,'DELTE','nv_bangchamcong'),(90,'SELECT','nv_bangchamcong'),(91,'INSERT','nv_bangchamcong'),(92,'UPDATE','nv_bangchamcong'),(93,'DELTE','nv_chucvu'),(94,'SELECT','nv_chucvu'),(95,'INSERT','nv_chucvu'),(96,'UPDATE','nv_chucvu'),(97,'DELTE','nv_lichlamviec'),(98,'SELECT','nv_lichlamviec'),(99,'INSERT','nv_lichlamviec'),(100,'UPDATE','nv_lichlamviec'),(101,'DELTE','phieunhapkho'),(102,'SELECT','phieunhapkho'),(103,'INSERT','phieunhapkho'),(104,'UPDATE','phieunhapkho'),(105,'DELTE','phieuxuatkho'),(106,'SELECT','phieuxuatkho'),(107,'INSERT','phieuxuatkho'),(108,'UPDATE','phieuxuatkho'),(109,'DELTE','role'),(110,'SELECT','role'),(111,'INSERT','role'),(112,'UPDATE','role'),(113,'DELTE','user'),(114,'SELECT','user'),(115,'INSERT','user'),(116,'UPDATE','user'),(117,'DELTE','user_group'),(118,'SELECT','user_group'),(119,'INSERT','user_group'),(120,'UPDATE','user_group');
	/*!40000 ALTER TABLE `quyen` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `taikhoan`
	--

	DROP TABLE IF EXISTS `taikhoan`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `taikhoan` (
	  `id` bigint NOT NULL AUTO_INCREMENT,
	  `name` varchar(30) NOT NULL,
	  `password` varchar(45) NOT NULL,
	  `createday` date DEFAULT NULL,
	  PRIMARY KEY (`id`)
	) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `taikhoan`
	--

	LOCK TABLES `taikhoan` WRITE;
	/*!40000 ALTER TABLE `taikhoan` DISABLE KEYS */;
	INSERT INTO `taikhoan` VALUES (1,'user1','123456',NULL),(2,'user2','123456',NULL),(3,'user3','123456',NULL),(4,'admin','admin','2020-04-08');
	/*!40000 ALTER TABLE `taikhoan` ENABLE KEYS */;
	UNLOCK TABLES;

	--
	-- Table structure for table `user`
	--

	DROP TABLE IF EXISTS `user`;
	/*!40101 SET @saved_cs_client     = @@character_set_client */;
	/*!50503 SET character_set_client = utf8mb4 */;
	CREATE TABLE `user` (
	  `id` bigint NOT NULL,
	  `active` int NOT NULL,
	  `password` varchar(255) NOT NULL,
	  `permissions` varchar(255) DEFAULT NULL,
	  `roles` varchar(255) DEFAULT NULL,
	  `username` varchar(255) NOT NULL,
	  PRIMARY KEY (`id`)
	) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
	/*!40101 SET character_set_client = @saved_cs_client */;

	--
	-- Dumping data for table `user`
	--

	LOCK TABLES `user` WRITE;
	/*!40000 ALTER TABLE `user` DISABLE KEYS */;
	INSERT INTO `user` VALUES (1,1,'$2a$10$m2a/4RVrIEP.8YrCsBjmeecN0COgyfqkgK5z.IPicRTfagHFiziTm',NULL,'USER','user'),(2,1,'$2a$10$zg83o./HoU.9gqCESX/xiOIX2wbwZEc9Q29gkLUk6e/oasyNn.Gh6','ACCESS_TEST1,ACCESS_TEST2','ADMIN','admin'),(3,1,'$2a$10$2qLofNOLRah0kJYX7QYKYe8IYJtf9kiHMPZuq76nmn/9y8zNddrM6','ACCESS_TEST1','MANAGER','manager');
	/*!40000 ALTER TABLE `user` ENABLE KEYS */;
	UNLOCK TABLES;
	/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

	/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
	/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
	/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
	/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
	/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
	/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
	/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

	-- Dump completed on 2020-06-02 22:49:18
