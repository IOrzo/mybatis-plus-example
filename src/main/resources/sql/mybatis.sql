/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 50716
 Source Host           : localhost:3306
 Source Schema         : mybatis

 Target Server Type    : MySQL
 Target Server Version : 50716
 File Encoding         : 65001

 Date: 29/01/2021 15:30:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for auto_fill
-- ----------------------------
DROP TABLE IF EXISTS `auto_fill`;
CREATE TABLE `auto_fill`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '名称',
  `auto_create_time` datetime(0) NULL DEFAULT NULL COMMENT '自动填充创建时间',
  `auto_update_time` datetime(0) NULL DEFAULT NULL COMMENT '自动填充更新时间',
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
  `gmt_modified` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  `deleted` tinyint(1) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '自动填充测试' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of auto_fill
-- ----------------------------
INSERT INTO `auto_fill` VALUES (1, '8kror6', NULL, NULL, '2021-01-29 11:26:05', '2021-01-29 11:26:05', 0);
INSERT INTO `auto_fill` VALUES (2, 'oubg9a', '2021-01-29 11:28:02', NULL, '2021-01-29 11:28:02', '2021-01-29 11:28:02', 0);
INSERT INTO `auto_fill` VALUES (3, 'c444psupdate', '2021-01-29 11:28:24', NULL, '2021-01-29 11:28:23', '2021-01-29 11:28:23', 0);
INSERT INTO `auto_fill` VALUES (4, 'jk7g4yupdate', '2021-01-29 11:29:30', '2021-01-29 11:29:31', '2021-01-29 11:29:30', '2021-01-29 11:29:30', 0);
INSERT INTO `auto_fill` VALUES (5, NULL, '2020-12-12 12:12:00', '2020-12-12 12:12:00', '2021-01-29 11:29:51', '2021-01-29 11:29:51', 0);
INSERT INTO `auto_fill` VALUES (6, NULL, '2020-12-12 12:12:00', '2020-12-12 12:12:00', '2021-01-29 12:14:04', '2021-01-29 12:14:04', 0);

-- ----------------------------
-- Table structure for customize_template
-- ----------------------------
DROP TABLE IF EXISTS `customize_template`;
CREATE TABLE `customize_template`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '账户',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  `open_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '微信-openId',
  `nick_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '微信-用户昵称',
  `gender` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '微信-用户性别 0: 未知, 1: 男性, 2:女性',
  `language` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'en: 英文, zh_CN: 简体中文, zh_TW: 繁体中文',
  `country` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '微信-用户所在国家',
  `province` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '微信-用户所在省份',
  `city` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '微信-用户所在城市',
  `avatar_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '微信-用户头像',
  `union_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '微信-unionId',
  `account_non_expired` tinyint(1) NULL DEFAULT 1 COMMENT '账户过期状态',
  `account_non_locked` tinyint(1) NULL DEFAULT 1 COMMENT '账户锁定状态',
  `credentials_non_expired` tinyint(1) NULL DEFAULT 1 COMMENT '凭证过期状态',
  `enabled` tinyint(1) NULL DEFAULT 1,
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
  `gmt_modified` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  `deleted` tinyint(1) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customize_template
-- ----------------------------
INSERT INTO `customize_template` VALUES (1, 'admin', '$2a$10$bAFotFepA1N8yIpbBMy4iegJUvXcmbeQRQwO/hkrc.6gJt6m.S2ra', NULL, 'a', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, 1, 1, '2021-01-05 07:56:57', '2021-01-07 09:43:26', 0);
INSERT INTO `customize_template` VALUES (2, 'dubbo', '$2a$10$EsAfPKw9ecGQsdQZNC0IoeTin2P/uKFsB7Tzh3THP/IvnIJJ1NsTe', NULL, 'b', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, 1, 1, '2021-01-05 07:58:04', '2021-01-07 09:43:28', 0);
INSERT INTO `customize_template` VALUES (3, 'redis', '$2a$10$qY6epcE3mkNXD56HDczQWe3p6rWdQMCi1AFYMJBOwlRO3BqaK9gJ6', NULL, 'redis', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, 1, 1, '2021-01-07 09:44:03', '2021-01-08 01:07:30', 0);
INSERT INTO `customize_template` VALUES (4, 'xx', '$2a$10$HMDx47Pgg5hAwf.DrCPlxui8UFOuMhi343wNoLCj.ZCGu2XR/DmqS', NULL, 'xx', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, 1, 1, '2021-01-07 09:57:25', '2021-01-07 09:58:31', 0);
INSERT INTO `customize_template` VALUES (5, 'rabbit', '$2a$10$IPfjNMOk230mWWHpmcjtqeSxCRz1p/wpIMKK3LH8pdHAFkqxqROEC', NULL, '1o7uvu', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, 1, 1, '2021-01-07 09:57:25', '2021-01-07 09:57:25', 0);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '账户',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '密码',
  `open_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '微信-openId',
  `nick_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '微信-用户昵称',
  `gender` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '微信-用户性别 0: 未知, 1: 男性, 2:女性',
  `language` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT 'en: 英文, zh_CN: 简体中文, zh_TW: 繁体中文',
  `country` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '微信-用户所在国家',
  `province` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '微信-用户所在省份',
  `city` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '微信-用户所在城市',
  `avatar_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '微信-用户头像',
  `union_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '微信-unionId',
  `account_non_expired` tinyint(1) NULL DEFAULT 1 COMMENT '账户过期状态',
  `account_non_locked` tinyint(1) NULL DEFAULT 1 COMMENT '账户锁定状态',
  `credentials_non_expired` tinyint(1) NULL DEFAULT 1 COMMENT '凭证过期状态',
  `enabled` tinyint(1) NULL DEFAULT 1,
  `gmt_create` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
  `gmt_modified` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0),
  `deleted` tinyint(1) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '$2a$10$bAFotFepA1N8yIpbBMy4iegJUvXcmbeQRQwO/hkrc.6gJt6m.S2ra', NULL, 'a', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, 1, 1, '2021-01-05 07:56:57', '2021-01-07 09:43:26', 0);
INSERT INTO `user` VALUES (2, 'dubbo', '$2a$10$EsAfPKw9ecGQsdQZNC0IoeTin2P/uKFsB7Tzh3THP/IvnIJJ1NsTe', NULL, 'b', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, 1, 1, '2021-01-05 07:58:04', '2021-01-07 09:43:28', 0);
INSERT INTO `user` VALUES (3, 'redis', '$2a$10$qY6epcE3mkNXD56HDczQWe3p6rWdQMCi1AFYMJBOwlRO3BqaK9gJ6', NULL, 'redis', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, 1, 1, '2021-01-07 09:44:03', '2021-01-08 01:07:30', 0);
INSERT INTO `user` VALUES (4, 'xx', '$2a$10$HMDx47Pgg5hAwf.DrCPlxui8UFOuMhi343wNoLCj.ZCGu2XR/DmqS', NULL, 'xx', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, 1, 1, '2021-01-07 09:57:25', '2021-01-07 09:58:31', 0);
INSERT INTO `user` VALUES (5, 'xx', '$2a$10$IPfjNMOk230mWWHpmcjtqeSxCRz1p/wpIMKK3LH8pdHAFkqxqROEC', NULL, '1o7uvu', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, 1, 1, '2021-01-07 09:57:25', '2021-01-29 12:24:54', 0);
INSERT INTO `user` VALUES (6, 'xx', NULL, NULL, 'xyz', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, 1, 1, '2021-01-28 16:07:44', '2021-01-29 12:25:03', 0);
INSERT INTO `user` VALUES (7, 'xx', NULL, NULL, 'xy', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, 1, 1, '2021-01-28 16:12:27', '2021-01-29 12:24:44', 0);
INSERT INTO `user` VALUES (8, 'xx', NULL, NULL, '28jmmp', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, 1, 1, '2021-01-28 16:13:41', '2021-01-29 12:24:46', 1);

SET FOREIGN_KEY_CHECKS = 1;
