/*
 Navicat MySQL Data Transfer

 Source Server         : localhost_zhiyu
 Source Server Type    : MySQL
 Source Server Version : 50163
 Source Host           : localhost
 Source Database       : zhiyu

 Target Server Type    : MySQL
 Target Server Version : 50163
 File Encoding         : utf-8

 Date: 12/25/2016 12:38:39 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `T_User`
-- ----------------------------
DROP TABLE IF EXISTS `T_User`;
CREATE TABLE `T_User` (
  `id` int(8) NOT NULL AUTO_INCREMENT,
  `email` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '注册email',
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户密码',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '用户昵称',
  `createtime` datetime NOT NULL COMMENT '注册时间',
  `phone` varchar(20) DEFAULT NULL COMMENT '用户手机号',
  `qq` varchar(255) DEFAULT NULL COMMENT '用户qq号',
  `weixin` varchar(255) DEFAULT NULL COMMENT '用户微信号',
  `type` int(8) NOT NULL DEFAULT '0' COMMENT '用户类型：0，注册用户；1，广告主用户；2:媒体主用户；3:广告主和媒体主用户',
  `user_id` varchar(127) NOT NULL COMMENT '用户ID唯一标识',
  `company_type` int(3) DEFAULT NULL COMMENT '企业类型：1，公司；0，个人',
  `ad_account_money` double(128,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`) USING BTREE
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
