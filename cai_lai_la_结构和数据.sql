/*
 Navicat Premium Data Transfer

 Source Server         : mysql_root
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : localhost:3306
 Source Schema         : cai_lai_la

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 17/05/2020 10:42:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address`  (
  `aid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `uid` int(11) NULL DEFAULT NULL COMMENT '外键，用户id',
  `addrName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '收货人',
  `addrtell` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '收货人电话',
  `sheng` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '省',
  `shi` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '市',
  `qu` varchar(5) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '区',
  `detailAddr` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '详细地址',
  `psotNum` varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '邮编',
  PRIMARY KEY (`aid`) USING BTREE,
  INDEX `FK_delivery_address`(`uid`) USING BTREE,
  CONSTRAINT `FK_delivery_address` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES (1, 1, '小明', '10086', '江苏', '常州', '武进', '奔牛镇', NULL);
INSERT INTO `address` VALUES (3, 1, 'zlj', '10086', '江苏', '苏州', '吴中区', '苏州大学', NULL);

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart`  (
  `uid` int(11) NOT NULL COMMENT '外键，用户id',
  `pid` int(11) NOT NULL COMMENT '外键，商品id',
  `num` int(11) NOT NULL DEFAULT 1,
  PRIMARY KEY (`uid`, `pid`) USING BTREE,
  INDEX `FK_cart2`(`pid`) USING BTREE,
  CONSTRAINT `FK_cart` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_cart2` FOREIGN KEY (`pid`) REFERENCES `product` (`pid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of cart
-- ----------------------------
INSERT INTO `cart` VALUES (1, 2, 1);
INSERT INTO `cart` VALUES (1, 3, 1);
INSERT INTO `cart` VALUES (2, 1, 1);
INSERT INTO `cart` VALUES (2, 2, 1);
INSERT INTO `cart` VALUES (2, 3, 1);

-- ----------------------------
-- Table structure for discount
-- ----------------------------
DROP TABLE IF EXISTS `discount`;
CREATE TABLE `discount`  (
  `did` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `discountMoney` float NULL DEFAULT NULL COMMENT '优惠金额（money和rate一般只取一个）',
  `discountRate` float NULL DEFAULT NULL COMMENT '优惠比例',
  `discountName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '优惠名称',
  `describe` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '优惠描述',
  PRIMARY KEY (`did`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20003 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discount
-- ----------------------------
INSERT INTO `discount` VALUES (1, 5, 0.8, '满减优惠1', '购物满25减5');
INSERT INTO `discount` VALUES (2, 15, 0.75, '满减优惠2', '购物满50减15');
INSERT INTO `discount` VALUES (3, 30, 0.7, '满减优惠3', '购物满100减30');

-- ----------------------------
-- Table structure for discount_belong
-- ----------------------------
DROP TABLE IF EXISTS `discount_belong`;
CREATE TABLE `discount_belong`  (
  `uid` int(11) NOT NULL COMMENT '外键，用户id',
  `did` int(11) NOT NULL COMMENT '外键，折扣id',
  PRIMARY KEY (`uid`, `did`) USING BTREE,
  INDEX `FK_discount_belong2`(`did`) USING BTREE,
  CONSTRAINT `FK_discount_belong` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_discount_belong2` FOREIGN KEY (`did`) REFERENCES `discount` (`did`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discount_belong
-- ----------------------------
INSERT INTO `discount_belong` VALUES (1, 1);

-- ----------------------------
-- Table structure for discount_to
-- ----------------------------
DROP TABLE IF EXISTS `discount_to`;
CREATE TABLE `discount_to`  (
  `did` int(11) NOT NULL COMMENT '外键，折扣id',
  `pid` int(11) NOT NULL COMMENT '外键，商品id',
  PRIMARY KEY (`did`, `pid`) USING BTREE,
  INDEX `FK_discount_to2`(`pid`) USING BTREE,
  CONSTRAINT `FK_discount_to` FOREIGN KEY (`did`) REFERENCES `discount` (`did`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_discount_to2` FOREIGN KEY (`pid`) REFERENCES `product` (`pid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discount_to
-- ----------------------------
INSERT INTO `discount_to` VALUES (1, 3);

-- ----------------------------
-- Table structure for gender
-- ----------------------------
DROP TABLE IF EXISTS `gender`;
CREATE TABLE `gender`  (
  `gid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `gName` varchar(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '名称',
  PRIMARY KEY (`gid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gender
-- ----------------------------
INSERT INTO `gender` VALUES (1, '男');
INSERT INTO `gender` VALUES (2, '女');
INSERT INTO `gender` VALUES (3, '保密');

-- ----------------------------
-- Table structure for history_browser
-- ----------------------------
DROP TABLE IF EXISTS `history_browser`;
CREATE TABLE `history_browser`  (
  `uid` int(11) NOT NULL COMMENT '外键，用户id',
  `pid` int(11) NOT NULL COMMENT '外键，商品id',
  `num` int(11) NOT NULL,
  PRIMARY KEY (`uid`, `pid`) USING BTREE,
  INDEX `FK_history_browser2`(`pid`) USING BTREE,
  CONSTRAINT `FK_history_browser` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_history_browser2` FOREIGN KEY (`pid`) REFERENCES `product` (`pid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of history_browser
-- ----------------------------
INSERT INTO `history_browser` VALUES (1, 1, 0);
INSERT INTO `history_browser` VALUES (2, 1, 0);

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `pid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `pcid` int(11) NULL DEFAULT NULL COMMENT '外键，类型id',
  `title` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '商品标题',
  `subTitle` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '商品副标题',
  `originalPrice` float NOT NULL COMMENT '原价',
  `currentPrice` float NOT NULL COMMENT '现价',
  `storeNum` int(11) NOT NULL COMMENT '库存',
  `manuDate` datetime(0) NULL DEFAULT NULL COMMENT '生产日期',
  `lifeTime` float NULL DEFAULT NULL COMMENT '保质期',
  `specificationi` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '商品规格（ml、kg之类的）',
  `arrivalTime` datetime(0) NOT NULL COMMENT '预计到达时间',
  PRIMARY KEY (`pid`) USING BTREE,
  INDEX `FK_product_classify`(`pcid`) USING BTREE,
  CONSTRAINT `FK_product_classify` FOREIGN KEY (`pcid`) REFERENCES `product_class` (`pcid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 10004 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (1, 1, '白菜', '好吃不贵的蔬菜', 4, 5, 100, '2020-05-02 00:00:00', 7, '每斤', '2020-05-05 08:00:00');
INSERT INTO `product` VALUES (2, 1, '萝卜', '好吃的不得了', 25, 23, 100, '2020-05-02 00:00:00', 10, '每斤', '2020-05-05 08:00:00');
INSERT INTO `product` VALUES (3, 1, '青菜', '便宜实惠，快来抢购吧', 16, 15, 80, '2020-05-02 00:00:00', 7, '每斤', '2020-05-05 00:00:00');

-- ----------------------------
-- Table structure for product_class
-- ----------------------------
DROP TABLE IF EXISTS `product_class`;
CREATE TABLE `product_class`  (
  `pcid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `className` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '商品类型名称',
  PRIMARY KEY (`pcid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11004 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_class
-- ----------------------------
INSERT INTO `product_class` VALUES (1, '蔬菜');

-- ----------------------------
-- Table structure for product_pic
-- ----------------------------
DROP TABLE IF EXISTS `product_pic`;
CREATE TABLE `product_pic`  (
  `picid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `pid` int(11) NULL DEFAULT NULL COMMENT '外键，商品id',
  `pidPath` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '图片路径',
  PRIMARY KEY (`picid`) USING BTREE,
  INDEX `FK_detailPic`(`pid`) USING BTREE,
  CONSTRAINT `FK_detailPic` FOREIGN KEY (`pid`) REFERENCES `product` (`pid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 12004 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product_pic
-- ----------------------------
INSERT INTO `product_pic` VALUES (1, 1, 'D:\\OneDrive\\图片\\1.jpg');
INSERT INTO `product_pic` VALUES (2, 1, 'D:\\OneDrive\\图片');

-- ----------------------------
-- Table structure for purchase_order
-- ----------------------------
DROP TABLE IF EXISTS `purchase_order`;
CREATE TABLE `purchase_order`  (
  `oid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `uid` int(11) NOT NULL COMMENT '外键，用户id',
  `pid` int(11) NOT NULL COMMENT '外键，商品id',
  `num` int(11) UNSIGNED NOT NULL DEFAULT 1 COMMENT '数目',
  `current_price` float(10, 2) NOT NULL COMMENT '成交价格',
  `order_time` datetime(0) NOT NULL COMMENT '成交时间',
  PRIMARY KEY (`oid`) USING BTREE,
  INDEX `o_index`(`oid`) USING BTREE,
  INDEX `fk_order`(`uid`) USING BTREE,
  INDEX `fk_order1`(`pid`) USING BTREE,
  CONSTRAINT `fk_order` FOREIGN KEY (`uid`) REFERENCES `user` (`uid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `fk_order1` FOREIGN KEY (`pid`) REFERENCES `product` (`pid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of purchase_order
-- ----------------------------
INSERT INTO `purchase_order` VALUES (1, 1, 1, 1, 22.00, '2020-05-07 16:01:22');
INSERT INTO `purchase_order` VALUES (2, 1, 2, 1, 12.00, '2020-05-10 17:20:09');
INSERT INTO `purchase_order` VALUES (3, 1, 2, 1, 32.00, '2020-05-16 20:12:34');
INSERT INTO `purchase_order` VALUES (5, 1, 2, 1, 32.00, '2020-05-16 20:12:34');
INSERT INTO `purchase_order` VALUES (6, 1, 2, 4, 32.00, '2020-05-16 20:12:34');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uid` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `gid` int(11) NULL DEFAULT NULL COMMENT '外键，性别id',
  `nickName` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '昵称',
  `userTel` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '电话',
  `email` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT 'e-mail',
  `balance` float(255, 2) UNSIGNED NOT NULL COMMENT '账户余额',
  PRIMARY KEY (`uid`) USING BTREE,
  INDEX `FK_gender_to`(`gid`) USING BTREE,
  CONSTRAINT `FK_gender_to` FOREIGN KEY (`gid`) REFERENCES `gender` (`gid`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 33348 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 1, '小王', '13770000000', '', 0.00);
INSERT INTO `user` VALUES (2, 2, '李四', '18015479652', '12343412@qq.com', 0.00);
INSERT INTO `user` VALUES (3, 1, '小王', '13770000000', '', 0.00);
INSERT INTO `user` VALUES (33343, 1, '小王', '13770000000', '', 0.00);
INSERT INTO `user` VALUES (33344, 1, '小王', '13770000000', '', 0.00);
INSERT INTO `user` VALUES (33345, 1, '小王', '13770000000', '', 0.00);
INSERT INTO `user` VALUES (33346, 1, '小王', '13770000000', '', 0.00);
INSERT INTO `user` VALUES (33347, 1, '小王', '13770000000', '', 0.00);

SET FOREIGN_KEY_CHECKS = 1;
