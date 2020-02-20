/*
 Navicat MySQL Data Transfer

 Source Server         : 172.16.32.243
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : 172.16.32.243
 Source Database       : db_supper_stock

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : utf-8

 Date: 02/20/2020 10:18:48 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `tbl_holidays`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_holidays`;
CREATE TABLE `tbl_holidays` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `tbl_push_config`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_push_config`;
CREATE TABLE `tbl_push_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL DEFAULT '',
  `messagePushType` varchar(255) NOT NULL DEFAULT 'DingTalk' COMMENT '推送方式，默认钉钉',
  `configData` varchar(255) NOT NULL DEFAULT '{}' COMMENT '配置信息',
  `updateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `tbl_stock_info`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_stock_info`;
CREATE TABLE `tbl_stock_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stockCode` varchar(255) NOT NULL DEFAULT '' COMMENT '股票代码',
  `stockName` varchar(255) NOT NULL DEFAULT '' COMMENT '股票名称',
  `price` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '股价',
  `totalValue` int(11) NOT NULL DEFAULT '0' COMMENT '总市值',
  `flowValue` int(11) NOT NULL DEFAULT '0' COMMENT '流通市值',
  `priceProfitAssetRatio` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '市盈率',
  `priceNetAssetRatio` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '市净率',
  `totalScore` double(8,2) NOT NULL DEFAULT '0.00' COMMENT '得分',
  `marketRank` int(11) NOT NULL DEFAULT '0' COMMENT '市场排名',
  `industryName` varchar(255) NOT NULL DEFAULT '' COMMENT '行业名称',
  `industryRank` int(11) NOT NULL DEFAULT '0' COMMENT '行业排名',
  `organizationHoldScore` int(4) NOT NULL DEFAULT '0' COMMENT '机构持仓',
  `businessPreferenceScore` int(4) NOT NULL DEFAULT '0' COMMENT '全市场情绪',
  `isActive` bit(1) DEFAULT NULL,
  `updateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `stockCode` (`stockCode`)
) ENGINE=InnoDB AUTO_INCREMENT=7823 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `tbl_stock_observer`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_stock_observer`;
CREATE TABLE `tbl_stock_observer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stockCode` varchar(255) NOT NULL,
  `stockName` varchar(255) NOT NULL,
  `addReason` varchar(255) NOT NULL DEFAULT '' COMMENT '添加原因',
  `addTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `pushConfigID` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `tbl_stock_public_notice`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_stock_public_notice`;
CREATE TABLE `tbl_stock_public_notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '公告ID',
  `stockCode` varchar(255) NOT NULL COMMENT '股票代码',
  `stockName` varchar(255) NOT NULL DEFAULT '' COMMENT '股票名称',
  `noticeCode` varchar(255) NOT NULL DEFAULT '' COMMENT '公告编号',
  `title` varchar(255) NOT NULL DEFAULT '' COMMENT '公告标题',
  `noticeDate` datetime NOT NULL COMMENT '公告日期',
  `publicTime` datetime NOT NULL COMMENT '发布时间',
  `keywords` varchar(255) NOT NULL DEFAULT '' COMMENT '关键词',
  `url` varchar(1000) NOT NULL DEFAULT '' COMMENT 'url链接',
  `updateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `noticeCode` (`noticeCode`) USING BTREE,
  KEY `keywords` (`keywords`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=160226 DEFAULT CHARSET=utf8mb4 COMMENT='股票公告';

-- ----------------------------
--  Table structure for `tbl_stock_public_notice_observer`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_stock_public_notice_observer`;
CREATE TABLE `tbl_stock_public_notice_observer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `keywords` varchar(255) NOT NULL DEFAULT '' COMMENT '订阅公告的关键字',
  `memo` varchar(255) NOT NULL DEFAULT '' COMMENT '备注',
  `pushConfigID` int(11) NOT NULL DEFAULT '0' COMMENT '推送配置的id',
  `isActive` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COMMENT='订阅股票公告的关键字，';

-- ----------------------------
--  Table structure for `tbl_stock_score`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_stock_score`;
CREATE TABLE `tbl_stock_score` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stockCode` varchar(255) NOT NULL DEFAULT '' COMMENT '股票代码',
  `stockName` varchar(255) NOT NULL DEFAULT '' COMMENT '股票名称',
  `companyHonorScore` int(10) NOT NULL DEFAULT '0' COMMENT '公司品质',
  `businessStatusScore` int(10) NOT NULL DEFAULT '0' COMMENT '行业龙头',
  `achievementsAppraisalScore` int(10) NOT NULL DEFAULT '0' COMMENT '超预期鉴定',
  `achievementsGrowupScore` int(10) NOT NULL DEFAULT '0' COMMENT '业绩成长性',
  `profitAbilityScore` int(10) NOT NULL DEFAULT '0' COMMENT '盈利能力',
  `achievementsClueScore` int(10) NOT NULL DEFAULT '0' COMMENT '业绩线索',
  `marketplaceStyleScore` int(10) NOT NULL DEFAULT '0' COMMENT '业绩驱动性',
  `organizationHoldScore` int(10) NOT NULL DEFAULT '0' COMMENT '机构持仓',
  `organizationEmotionScore` int(10) NOT NULL DEFAULT '0' COMMENT '分析师情绪',
  `businessPreferenceScore` int(10) NOT NULL DEFAULT '0' COMMENT '全市场情绪',
  `successRateStatisticsScore` int(10) NOT NULL DEFAULT '0' COMMENT '胜率统计',
  `stockValuationScore` int(10) NOT NULL DEFAULT '0' COMMENT '个股估值',
  `totalScore` double NOT NULL DEFAULT '0' COMMENT '当前得分',
  `marketRank` int(11) NOT NULL DEFAULT '0' COMMENT '全市场排名',
  `industryRank` int(11) NOT NULL DEFAULT '0' COMMENT '行业排名',
  `industryDetail` varchar(255) NOT NULL DEFAULT '' COMMENT '行业名称',
  `date` date NOT NULL COMMENT '评分日期',
  `updateTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `totalValue` int(11) NOT NULL DEFAULT '0' COMMENT '总市值，单位(亿)',
  `flowValue` int(11) NOT NULL DEFAULT '0' COMMENT '流通市值，单位(亿)',
  `priceProfitAssetRatio` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '市盈率',
  `priceNetAssetRatio` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '市净率',
  `dealQuantity` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '成交量，单位（万手）',
  `dealAmount` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '成交金额，单位（亿元）',
  `priceChange` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '价格涨跌，单位：元',
  `priceChangeRatio` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '价格涨跌幅，单位：%',
  `turnoverRatio` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '换手率，单位：%',
  `mainInflowAmount` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '主力流入金额，单位：亿元',
  `mainOutflowAmount` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '主力流出金额，单位：亿元',
  `netInflow` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '净流入金额，单位：亿元',
  `openPrice` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '开盘价，单位：元',
  `maxPrice` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '最高价，单位：元',
  `minPrice` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '最低价，单位：元',
  `price` double(10,2) NOT NULL DEFAULT '0.00' COMMENT '当前价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=624233 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `tbl_stock_score_change`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_stock_score_change`;
CREATE TABLE `tbl_stock_score_change` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stockCode` varchar(255) NOT NULL DEFAULT '' COMMENT '股票代码',
  `stockName` varchar(255) NOT NULL DEFAULT '' COMMENT '股票名称',
  `fieldName` varchar(255) NOT NULL DEFAULT '' COMMENT '变化的字段',
  `todayValue` int(11) DEFAULT NULL COMMENT '当前值',
  `preValue` int(11) DEFAULT NULL COMMENT '前值',
  `changeValue` int(11) DEFAULT NULL COMMENT '变化值',
  `totalScore` double DEFAULT '0',
  `date` date DEFAULT NULL,
  `updateTime` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4326 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Table structure for `tbl_stock_trans`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_stock_trans`;
CREATE TABLE `tbl_stock_trans` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stockCode` varchar(255) NOT NULL DEFAULT '',
  `stockName` varchar(255) NOT NULL DEFAULT '',
  `transPrice` decimal(8,2) NOT NULL,
  `currentPrice` decimal(8,2) DEFAULT '0.00',
  `shCompositeStockPrice` decimal(8,2) DEFAULT NULL,
  `transType` int(11) NOT NULL DEFAULT '0' COMMENT '操作类型：1 加仓， 2 减仓',
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2435 DEFAULT CHARSET=utf8mb4 COMMENT='模拟交易';

SET FOREIGN_KEY_CHECKS = 1;
