
-- ----------------------------
-- Table structure for CTHD
-- ----------------------------
DROP TABLE IF EXISTS `CTHD`;
CREATE TABLE `CTHD` (
`MAHD`  varchar(10) NOT NULL ,
`MASP`  varchar(10) NOT NULL ,
`SL`  int NULL ,
`KHUYENMAI`  double NULL ,
`GIABAN`  double NULL ,
PRIMARY KEY (`MAHD`, `MASP`)
)

;

-- ----------------------------
-- Records of CTHD
-- ----------------------------
BEGIN;
INSERT INTO `CTHD` VALUES ('HD01', 'SP01', '3', '9000', '70000'), ('HD01', 'SP02', '4', '4000', '90000'), ('HD02', 'SP03', '3', '0', '80000'), ('HD02', 'SP04', '5', '6000', '90000'), ('HD03', 'SP01', '6', '0', '10000'), ('HD03', 'SP03', '9', '0', '90000'), ('HD03', 'SP04', '8', '8000', '60000'), ('HD04', 'SP01', '4', '5000', '90000');
COMMIT;

-- ----------------------------
-- Table structure for HOADON
-- ----------------------------
DROP TABLE IF EXISTS `HOADON`;
CREATE TABLE `HOADON` (
`MAHD`  varchar(10) NOT NULL ,
`NGAY`  datetime NULL ,
`MAKH`  varchar(10) NOT NULL ,
`MANV`  varchar(10) NULL ,
PRIMARY KEY (`MAHD`)
)

;

-- ----------------------------
-- Records of HOADON
-- ----------------------------
BEGIN;
INSERT INTO `HOADON` VALUES ('HD01', '2021-04-29 00:00:00', 'KH01', 'NV01'), ('HD02', '2021-03-29 00:00:00', 'KH02', 'NV02'), ('HD03', '2021-04-29 00:00:00', 'KH03', 'NV03'), ('HD04', '2021-04-29 00:00:00', 'KH04', 'NV04');
COMMIT;

-- ----------------------------
-- Table structure for KHACHHANG
-- ----------------------------
DROP TABLE IF EXISTS `KHACHHANG`;
CREATE TABLE `KHACHHANG` (
`MAKH`  varchar(10) NOT NULL ,
`TENKH`  varchar(30) NOT NULL ,
`DIACHI`  varchar(50) NULL ,
`DT`  varchar(11) NULL ,
`EMAIL`  varchar(30) NULL ,
PRIMARY KEY (`MAKH`)
)

;

-- ----------------------------
-- Records of KHACHHANG
-- ----------------------------
BEGIN;
INSERT INTO `KHACHHANG` VALUES ('KH01', 'BÙI VĂN PHÙNG', '123 AO ĐÔI', '0934343', 'PHUNGHA@GMAIL.COM'), ('KH02', 'BÙI VĂN KHANG', '30 CỔ CÒ', '09873434343', 'VANKHANG@GMAIL.COM'), ('KH03', 'CAO SƠN', '40 LÒ LU', '0934343', 'CAOSON@GMAIL.COM'), ('KH04', 'VŨ BẢO', '50 LƯƠNG BẰNG', '0934343434', 'VUBAO@GMAIL.COM');
COMMIT;

-- ----------------------------
-- Table structure for LOAISP
-- ----------------------------
DROP TABLE IF EXISTS `LOAISP`;
CREATE TABLE `LOAISP` (
`MALOAI`  varchar(10) NOT NULL ,
`TENLOAI`  varchar(20) NULL ,
PRIMARY KEY (`MALOAI`)
)

;

-- ----------------------------
-- Records of LOAISP
-- ----------------------------
BEGIN;
INSERT INTO `LOAISP` VALUES ('BK', 'Bánh kẹo'), ('GK', 'Giải khát'), ('MP', 'Mỹ phẩm');
COMMIT;

-- ----------------------------
-- Table structure for NHANVIEN
-- ----------------------------
DROP TABLE IF EXISTS `NHANVIEN`;
CREATE TABLE `NHANVIEN` (
`MANV`  varchar(10) NOT NULL ,
`TENNV`  varchar(30) NOT NULL ,
`DIACHI`  varchar(50) NULL ,
`DT`  varchar(11) NULL ,
`EMAIL`  varchar(30) NULL ,
`NGAYLAMVIEC`  datetime NULL ,
`MATKHAU`  varchar(50) NULL ,
PRIMARY KEY (`MANV`)
)

;

-- ----------------------------
-- Records of NHANVIEN
-- ----------------------------
BEGIN;
INSERT INTO `NHANVIEN` VALUES ('NV01', 'NGUYỄN XUÂN NHỰT', '20 TĂNG NHƠN PHÚ', '0986979721', 'NXNHUT@GMAIL.COM', '2011-01-01 00:00:00', '123'), ('NV02', 'NGUYỄN VĂN HÓA', '30 LÒ LU', '09878722', 'NXBABA@GMAIL.COM', '2012-02-02 00:00:00', '456'), ('NV03', 'NGUYỄN TẮNG', '30 ĐƯỜNG 22', '098666666', 'DUONG22@GMAIL.COM', '2013-03-03 00:00:00', '789'), ('NV04', 'NGUYỄN HUỆ', '40 ĐƯỜNG NGUYỄN HUÊUJ', '097666666', 'NGUYENHUE@GMAIL.COM', '2015-04-04 00:00:00', '123');
COMMIT;

-- ----------------------------
-- Table structure for SANPHAM
-- ----------------------------
DROP TABLE IF EXISTS `SANPHAM`;
CREATE TABLE `SANPHAM` (
`MASP`  varchar(10) NOT NULL ,
`TENSP`  varchar(20) NULL ,
`DVT`  varchar(20) NOT NULL ,
`GIAMUA`  double NULL ,
`SLTON`  int NULL ,
`MALOAI`  varchar(10) NULL ,
PRIMARY KEY (`MASP`)
)

;

-- ----------------------------
-- Records of SANPHAM
-- ----------------------------
BEGIN;
INSERT INTO `SANPHAM` VALUES ('SP01', 'Cocacola', 'Thùng', '300000', '50', 'GK'), ('SP02', '7UP', 'Chai', '4000', '700', 'GK'), ('SP03', 'Bánh bao', 'Cái', '5000', '20', 'BK'), ('SP04', 'Mức gừng', 'Bịch', '8000', '90', 'BK'), ('SP05', 'Kem dưỡng da', 'Hộp', '80000', '100', 'MP'), ('SP06', 'Kem chống nắng', 'Chai', '70000', '400', 'MP');
COMMIT;


