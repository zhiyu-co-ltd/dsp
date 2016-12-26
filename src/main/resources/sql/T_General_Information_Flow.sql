/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50163
 Source Host           : localhost
 Source Database       : zhiyu

 Target Server Type    : MySQL
 Target Server Version : 50163
 File Encoding         : utf-8

 Date: 12/26/2016 16:08:07 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `T_General_Information_Flow`
-- ----------------------------
DROP TABLE IF EXISTS `T_General_Information_Flow`;
CREATE TABLE `T_General_Information_Flow` (
  `id` int(8) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(128) NOT NULL COMMENT '名字',
  `material_id` varchar(128) NOT NULL COMMENT '物料ID',
  `ad_id` varchar(128) NOT NULL COMMENT '广告id',
  `size` varchar(128) NOT NULL COMMENT '物料尺寸',
  `ad_title` varchar(128) NOT NULL COMMENT '广告标题',
  `ad_description` varchar(128) NOT NULL COMMENT '广告副标题',
  `image_url` varchar(128) NOT NULL COMMENT 'icon图片地址',
  `createtime` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
