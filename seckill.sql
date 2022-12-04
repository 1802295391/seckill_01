/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 5.7.31
 Source Host           : localhost:3306
 Source Schema         : seckill

*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
-- 用户表
create table if not exists `customer`
(
    `id` char(19) not null comment 'id' primary key,
    `username` varchar(50) null comment '用户名',
    `password` varchar(256) null comment '密码',
    `phone` varchar(11) null comment '手机号',
    `openid` varchar(128) null comment '微信id',
    `bank_cards` varchar(18) null comment '银行卡号',
    `pay_password` varchar(6) null comment '支付密码',
    `avatar` varchar(256) null comment '用户头像',
    `token` varchar(256) null comment 'token',
    `level` int default 0 null comment '等级',
    `sex` tinyint null comment '性别',
    `age` tinyint null comment '年龄',
    `is_deleted` tinyint(1) default 0 not null comment '逻辑删除 1（true）已删除， 0（false）未删除',
    `is_disabled` tinyint default 0 not null comment '是否禁用 1（true）已禁用，  0（false）未禁用',
    `gmt_create` datetime not null comment '创建时间',
    `gmt_modified` datetime not null comment '更新时间'
    ) comment '用户表';

-- ----------------------------
-- Records of customer
-- ----------------------------
insert into `customer` (`id`, `username`, `password`, `phone`, `openid`, `bank_cards`, `pay_password`, `avatar`, `token`, `level`, `sex`, `age`, `is_deleted`, `is_disabled`, `gmt_create`, `gmt_modified`) values ('1596558950512316417', '韦果', '17457', '17389349184', 'BdpCL', '84628952', '723204', 'www.katheryn-okuneva.name', '7vi', 0, '1', 84, '0', 0, '2022-10-13 11:55:58', '2022-11-28 11:31:16');
insert into `customer` (`id`, `username`, `password`, `phone`, `openid`, `bank_cards`, `pay_password`, `avatar`, `token`, `level`, `sex`, `age`, `is_deleted`, `is_disabled`, `gmt_create`, `gmt_modified`) values ('1586558950512316417', '陆修杰', '2998024', '18902435626', 'V1UU', '856', '844446', 'www.allyn-rodriguez.io', 'yb1B', 0, '1', 11, '0', 0, '2022-09-02 00:07:17', '2022-02-23 23:43:00');
insert into `customer` (`id`, `username`, `password`, `phone`, `openid`, `bank_cards`, `pay_password`, `avatar`, `token`, `level`, `sex`, `age`, `is_deleted`, `is_disabled`, `gmt_create`, `gmt_modified`) values ('1596458950512316417', '吴伟泽', '5804693', '14748829679', 'cZ8', '2', '371856', 'www.bethany-klocko.info', 'qsNk', 0, '0', 67, '0', 0, '2022-09-29 02:40:17', '2022-05-16 20:42:37');
insert into `customer` (`id`, `username`, `password`, `phone`, `openid`, `bank_cards`, `pay_password`, `avatar`, `token`, `level`, `sex`, `age`, `is_deleted`, `is_disabled`, `gmt_create`, `gmt_modified`) values ('1596558770512316417', '范苑博', '457450575', '15281546752', 'x2', '128157', '378532', 'www.leandro-schmitt.io', '7zB', 0, '1', 31, '0', 0, '2022-11-26 20:47:41', '2022-08-15 04:58:47');
insert into `customer` (`id`, `username`, `password`, `phone`, `openid`, `bank_cards`, `pay_password`, `avatar`, `token`, `level`, `sex`, `age`, `is_deleted`, `is_disabled`, `gmt_create`, `gmt_modified`) values ('1596558950512316418', '梁炎彬', '572542', '13278821962', 'mx', '586884', '981604', 'www.darleen-swaniawski.biz', 'owjr', 0, '0', 3, '0', 0, '2022-11-06 20:51:12', '2022-10-14 21:38:12');
insert into `customer` (`id`, `username`, `password`, `phone`, `openid`, `bank_cards`, `pay_password`, `avatar`, `token`, `level`, `sex`, `age`, `is_deleted`, `is_disabled`, `gmt_create`, `gmt_modified`) values ('1596558950512316419', '何博文', '210390', '15125602140', 'k0tw', '696465', '735944', 'www.angelic-emmerich.name', 'V1iX', 0, '1', 9, '0', 0, '2022-03-08 14:57:24', '2022-04-03 06:55:31');
insert into `customer` (`id`, `username`, `password`, `phone`, `openid`, `bank_cards`, `pay_password`, `avatar`, `token`, `level`, `sex`, `age`, `is_deleted`, `is_disabled`, `gmt_create`, `gmt_modified`) values ('1596558950512316410', '崔建辉', '4183757', '14594323471', 'F98', '539887', '398644', 'www.brant-ullrich.net', 'UY8', 0, '0', 96, '0', 0, '2022-03-09 15:47:39', '2022-02-24 19:08:57');
insert into `customer` (`id`, `username`, `password`, `phone`, `openid`, `bank_cards`, `pay_password`, `avatar`, `token`, `level`, `sex`, `age`, `is_deleted`, `is_disabled`, `gmt_create`, `gmt_modified`) values ('1596558950512316411', '江雪松', '8811668', '18576920827', 'My', '1', '265024', 'www.omar-dickens.com', 'skMdM', 0, '1', 91, '0', 0, '2022-06-08 15:41:05', '2022-05-22 21:34:57');
insert into `customer` (`id`, `username`, `password`, `phone`, `openid`, `bank_cards`, `pay_password`, `avatar`, `token`, `level`, `sex`, `age`, `is_deleted`, `is_disabled`, `gmt_create`, `gmt_modified`) values ('1596558950512316414', '顾靖琪', '266', '15696925484', 'S1mN', '9130063', '236262', 'www.hyacinth-mclaughlin.org', 'I2', 0, '0', 9, '0', 0, '2022-05-08 11:41:41', '2022-12-21 16:53:53');
insert into `customer` (`id`, `username`, `password`, `phone`, `openid`, `bank_cards`, `pay_password`, `avatar`, `token`, `level`, `sex`, `age`, `is_deleted`, `is_disabled`, `gmt_create`, `gmt_modified`) values ('1596558950512316427', '冯思源', '55', '15272770308', 'M4BPg', '3405', '758395', 'www.val-kovacek.co', 'RItgD', 0, '1', 9, '0', 0, '2022-01-19 12:44:26', '2022-11-05 03:07:10');
insert into `customer` (`id`, `username`, `password`, `phone`, `openid`, `bank_cards`, `pay_password`, `avatar`, `token`, `level`, `sex`, `age`, `is_deleted`, `is_disabled`, `gmt_create`, `gmt_modified`) values ('1596558950512316437', '姜昊强', '642631294', '15502864467', 'IWqI', '942013', '996971', 'www.henry-abernathy.name', 'wLgNz', 0, '0', 4, '0', 0, '2022-01-18 11:34:37', '2022-08-08 18:35:51');
insert into `customer` (`id`, `username`, `password`, `phone`, `openid`, `bank_cards`, `pay_password`, `avatar`, `token`, `level`, `sex`, `age`, `is_deleted`, `is_disabled`, `gmt_create`, `gmt_modified`) values ('1596558950512316447', '陶子骞', '24810847', '15759519291', 'rEi93', '587274', '317309', 'www.joesph-nienow.com', 'qm', 0, '0', 39, '0', 0, '2022-09-23 15:25:11', '2022-04-26 04:45:55');
insert into `customer` (`id`, `username`, `password`, `phone`, `openid`, `bank_cards`, `pay_password`, `avatar`, `token`, `level`, `sex`, `age`, `is_deleted`, `is_disabled`, `gmt_create`, `gmt_modified`) values ('1596558950512316457', '龚鸿煊', '1133224732', '17510171649', 'eU58', '824524', '273734', 'www.bill-rippin.name', 'u3Yi', 0, '1', 61, '0', 0, '2022-08-10 19:20:23', '2022-05-29 09:27:34');


-- ----------------------------
-- Table structure for goods
-- ----------------------------
-- 产品表
create table if not exists `goods`
(
    `id` char(19) not null comment 'id' primary key,
    `title` varchar(50) null comment '产品标题',
    `cover_image` varchar(256) null comment '封面图片',
    `detail_image` varchar(256) null comment '详细图片',
    `start_time` datetime null comment '秒杀开始时间',
    `audit` tinyint default 0 null comment '审核字段（0审核。1上架。2退回。3售完）',
    `cause` longtext null comment '退回原因',
    `level` int default 0 null comment '等级',
    `price` decimal null comment '价格',
    `num` int null comment '数量',
    `limit_num` int not null comment '限制数量',
    `is_refund` tinyint default 0 null comment '是否为可退款产品(0可退款，1不可退款)',
    `description` longtext null comment '产品描述',
    `is_deleted` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)',
    `gmt_create` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `gmt_modified` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间'
    ) comment '产品表';



-- ----------------------------
-- Records of goods
-- ----------------------------
insert into `goods` (`id`, `title`, `cover_image`, `detail_image`, `start_time`, `audit`,`level`, `price`, `num`, `limit_num`,`is_refund`) values ('1189389726308478977', '广东工业大学', 'https://dasa.oss-cn-hangzhou.aliyuncs.com/OIP-D.jfif', 'https://dasa.oss-cn-hangzhou.aliyuncs.com/OIP-C.jfif', '2022-07-30 07:42:58', 0,0, 19, 564671772, 567229,0);
insert into `goods` (`id`, `title`, `cover_image`, `detail_image`, `start_time`, `audit`,`level`, `price`, `num`, `limit_num`,`is_refund`) values ('1189389726308478970', '汕头大学', 'https://dasa.oss-cn-hangzhou.aliyuncs.com/OIP-D.jfif', 'https://dasa.oss-cn-hangzhou.aliyuncs.com/OIP-C.jfif', '2022-07-30 07:42:58', 0,0, 950348152, 606, 5869852,0);
insert into `goods` (`id`, `title`, `cover_image`, `detail_image`, `start_time`, `audit`,`level`, `price`, `num`, `limit_num`,`is_refund`) values ('1189389726308478971', '武汉科技大学', 'https://dasa.oss-cn-hangzhou.aliyuncs.com/OIP-D.jfif', 'https://dasa.oss-cn-hangzhou.aliyuncs.com/OIP-C.jfif', '2022-07-30 07:42:58',0, 0, 99, 376694, 900473,0);
insert into `goods` (`id`, `title`, `cover_image`, `detail_image`, `start_time`, `audit`,`level`, `price`, `num`, `limit_num`,`is_refund`) values ('1189389726308478972', '嘉兴学院', 'https://dasa.oss-cn-hangzhou.aliyuncs.com/OIP-D.jfif', 'https://dasa.oss-cn-hangzhou.aliyuncs.com/OIP-C.jfif', '2022-07-30 07:42:58', 0,0, 60226725, 34, 927415,0);
insert into `goods` (`id`, `title`, `cover_image`, `detail_image`, `start_time`, `audit`,`level`, `price`, `num`, `limit_num`,`is_refund`) values ('1189389726308478973', '集美大学', 'https://dasa.oss-cn-hangzhou.aliyuncs.com/OIP-D.jfif', 'https://dasa.oss-cn-hangzhou.aliyuncs.com/OIP-C.jfif', '2022-07-30 07:42:58', 0,0, 12622, 82274274, 90454,0);



-- ----------------------------
-- Table structure for manage
-- ----------------------------
-- 管理表
create table if not exists `manage`
(
    `id` char(19) not null comment '主键' primary key,
    `username` varchar(256) not null comment '用户名',
    `password` varchar(256) not null comment '密码',
    `is_deleted` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)',
    `gmt_create` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `gmt_modified` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间'
    ) comment '管理表';

-- ----------------------------
-- Records of manage
-- ----------------------------

insert into `manage` (`id`, `username`, `password`) values ('1594013624614121473', '苏文', '51264');
insert into `manage` (`id`, `username`, `password`) values ('1594013624614121472', '方浩轩', '9848102216');
insert into `manage` (`id`, `username`, `password`) values ('1594013624614121471', '孙熠彤', '85503481');
insert into `manage` (`id`, `username`, `password`) values ('1594013624614121470', '何伟泽', '775455687');

-- ----------------------------
-- Table structure for user_goods
-- ----------------------------
-- 收藏表表
create table if not exists `user_goods`
(
    `collection_id` char(19) not null comment '收藏id' primary key,
    `user_id` char(19) not null comment '用户id',
    `goods_id` char(19) not null comment '产品id'
    ) comment '收藏表';




-- ----------------------------
-- Records of user_goods
-- ----------------------------
insert into `user_goods` (`collection_id`, `user_id`, `goods_id`) values ('1196269345666019330', '1586558950512316417', '1189389726308478970');
insert into `user_goods` (`collection_id`, `user_id`, `goods_id`) values ('1196269345666019331', '1586558950512316417', '1189389726308478972');
insert into `user_goods` (`collection_id`, `user_id`, `goods_id`) values ('1196269345666019332', '1596558950512316414', '1189389726308478977');


-- ----------------------------
-- Table structure for orders
-- ----------------------------
-- 订单表
create table if not exists `orders`
(
    `orders_id` char(19) not null comment '订单id' primary key,
    orders_num varchar(256) not null comment '订单号',
    `user_id` char(19) not null comment '用户id',
    `goods_id` char(19) not null comment '产品id',
    `username` varchar(50) null comment '用户名',
    `title` varchar(50) null comment '产品名称',
    `detail_image` varchar(256) null comment '详细图片',
    `state` tinyint null comment '支付状态（0待支付。1已支付。2退款中.3已完成后续交易的历史订单）',
    `phone` varchar(11) null comment '用户手机号',
    `total_price` decimal  null comment '总价格',
    `goods_num` int null comment '购买总数',
    `is_deleted` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)',
    `is_refund` tinyint default 0 not null comment '是否为可退款产品(0可退款，1不可退款)',
    `gmt_create` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `gmt_modified` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间'
    ) comment '订单表';



-- ----------------------------
-- Records of orders
-- ----------------------------

insert into `orders` (`orders_id`,orders_num, `user_id`, `goods_id`, `username`, `title`,`detail_image`, `state`, `phone`) values ('129227888958885069','888958885069', '1596558950512316410', '1189389726308478973', '钱睿渊', '厦门大学','hangzhou.aliyuncs.com/IMG_7081.jpg', 0, '17162194381');
insert into `orders` (`orders_id`,orders_num,`user_id`, `goods_id`, `username`, `title`,`detail_image`, `state`, `phone`) values ('129227888958885060','888958885060', '1596558950512316437', '1189389726308478973', '严志泽', '河海大学','hangzhou.aliyuncs.com/IMG_7081.jpg', 0, '17733446818');
insert into `orders` (`orders_id`,orders_num, `user_id`, `goods_id`, `username`, `title`,`detail_image`, `state`, `phone`) values ('129227888958885061','888958885061', '1596558950512316437', '1189389726308478971', '郭皓轩', '上海大学','hangzhou.aliyuncs.com/IMG_7081.jpg', 0, '15376909294');
insert into `orders` (`orders_id`,orders_num, `user_id`, `goods_id`, `username`, `title`,`detail_image`, `state`, `phone`) values ('129227888958885062','888958885069', '1596558950512316410', '1189389726308478973', '钱睿渊', '厦门大学','hangzhou.aliyuncs.com/IMG_7081.jpg', 0, '17162194381');
insert into `orders` (`orders_id`,orders_num,`user_id`, `goods_id`, `username`, `title`,`detail_image`, `state`, `phone`) values ('129227888958885063','888958885060', '1596558950512316437', '1189389726308478973', '严志泽', '河海大学','hangzhou.aliyuncs.com/IMG_7081.jpg', 0, '17733446818');
insert into `orders` (`orders_id`,orders_num, `user_id`, `goods_id`, `username`, `title`,`detail_image`, `state`, `phone`) values ('129227888958885064','888958885061', '1596558950512316437', '1189389726308478971', '郭皓轩', '上海大学', 'hangzhou.aliyuncs.com/IMG_7081.jpg',0, '15376909294');
insert into `orders` (`orders_id`,orders_num, `user_id`, `goods_id`, `username`, `title`,`detail_image`, `state`, `phone`) values ('129227888958885065','888958885069', '1596558950512316410', '1189389726308478973', '钱睿渊', '厦门大学','hangzhou.aliyuncs.com/IMG_7081.jpg', 0, '17162194381');
insert into `orders` (`orders_id`,orders_num,`user_id`, `goods_id`, `username`, `title`,`detail_image`, `state`, `phone`) values ('129227888958885066','888958885060', '1596558950512316437', '1189389726308478973', '严志泽', '河海大学', 'hangzhou.aliyuncs.com/IMG_7081.jpg',0, '17733446818');
insert into `orders` (`orders_id`,orders_num, `user_id`, `goods_id`, `username`, `title`,`detail_image`, `state`, `phone`) values ('129227888958885067','888958885061', '1596558950512316437', '1189389726308478971', '郭皓轩', '上海大学','hangzhou.aliyuncs.com/IMG_7081.jpg', 0, '15376909294');


-- ----------------------------
-- Table structure for t_pay_log
-- ----------------------------
DROP TABLE IF EXISTS `t_pay_log`;
CREATE TABLE `t_pay_log` (
     `id` char(19) NOT NULL DEFAULT '',
     `order_no` varchar(20) NOT NULL DEFAULT '' COMMENT '订单号',
     `pay_time` datetime DEFAULT NULL COMMENT '支付完成时间',
     `total_fee` decimal(10,2) DEFAULT '0.01' COMMENT '支付金额（分）',
     `transaction_id` varchar(30) DEFAULT NULL COMMENT '交易流水号',
     `trade_state` char(20) DEFAULT NULL COMMENT '交易状态',
     `pay_type` tinyint(3) NOT NULL DEFAULT '0' COMMENT '支付类型（1：微信 2：支付宝）',
     `attr` text COMMENT '其他属性',
     `is_deleted` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '逻辑删除 1（true）已删除， 0（false）未删除',
     `gmt_create` datetime NOT NULL COMMENT '创建时间',
     `gmt_modified` datetime NOT NULL COMMENT '更新时间',
     PRIMARY KEY (`id`),
     UNIQUE KEY `uk_order_no` (`order_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='支付日志表';

-- ----------------------------
-- Records of t_pay_log
-- ----------------------------
INSERT INTO `t_pay_log` VALUES ('1295350465545920514', '20200817212244397', '2020-08-17 21:23:12', '0.01', '4200000716202008178616288778', 'SUCCESS', '1', '{\"transaction_id\":\"4200000716202008178616288778\",\"nonce_str\":\"cEyoCjOyeqXliQvT\",\"trade_state\":\"SUCCESS\",\"bank_type\":\"OTHERS\",\"openid\":\"oHwsHuBXPNFFfvVIPO0ziWML1MTc\",\"sign\":\"82FCF003369C7099A273E5326BA66AB9\",\"return_msg\":\"OK\",\"fee_type\":\"CNY\",\"mch_id\":\"1558950191\",\"cash_fee\":\"1\",\"out_trade_no\":\"20200817212244397\",\"cash_fee_type\":\"CNY\",\"appid\":\"wx74862e0dfcf69954\",\"total_fee\":\"1\",\"trade_state_desc\":\"支付成功\",\"trade_type\":\"NATIVE\",\"result_code\":\"SUCCESS\",\"attach\":\"\",\"time_end\":\"20200817212159\",\"is_subscribe\":\"N\",\"return_code\":\"SUCCESS\"}', '0', '2020-08-17 21:23:12', '2020-08-17 21:23:12');
INSERT INTO `t_pay_log` VALUES ('1295351158851768322', '20200817212544565', '2020-08-17 21:25:57', '0.01', '4200000722202008173765395839', 'SUCCESS', '1', '{\"transaction_id\":\"4200000722202008173765395839\",\"nonce_str\":\"o9ZhRL5bAKyH7fob\",\"trade_state\":\"SUCCESS\",\"bank_type\":\"OTHERS\",\"openid\":\"oHwsHuBXPNFFfvVIPO0ziWML1MTc\",\"sign\":\"7DAE26540D60F6751F4C6BDF349CFE63\",\"return_msg\":\"OK\",\"fee_type\":\"CNY\",\"mch_id\":\"1558950191\",\"cash_fee\":\"1\",\"out_trade_no\":\"20200817212544565\",\"cash_fee_type\":\"CNY\",\"appid\":\"wx74862e0dfcf69954\",\"total_fee\":\"1\",\"trade_state_desc\":\"支付成功\",\"trade_type\":\"NATIVE\",\"result_code\":\"SUCCESS\",\"attach\":\"\",\"time_end\":\"20200817212443\",\"is_subscribe\":\"N\",\"return_code\":\"SUCCESS\"}', '0', '2020-08-17 21:25:57', '2020-08-17 21:25:57');

-- ----------------------------
-- Table structure for audit
-- ----------------------------
-- 审核表
create table if not exists `audit`
(
    `id` char(19) not null comment '主键' primary key,
    `username` varchar(256) null comment '用户名',
    `password` varchar(256) default '0' null comment '密码',
    `is_deleted` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)',
    `gmt_create` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `gmt_modified` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间'
    ) comment '审核表';





-- ----------------------------
-- Records of audit
-- ----------------------------

insert into `audit` (`id`, `username`, `password`) values ('1195251020861317122', '胡天磊', '836630582');
insert into `audit` (`id`, `username`, `password`) values ('1195251020861317123', '潘晟睿', '8');


-- ----------------------------
-- Table structure for crm_banner
-- ----------------------------

DROP TABLE IF EXISTS `crm_banner`;
CREATE TABLE `crm_banner` (
                              `id` char(19) NOT NULL DEFAULT '' COMMENT 'ID',
                              `title` varchar(20) DEFAULT '' COMMENT '标题',
                              `image_url` varchar(500) NOT NULL DEFAULT '' COMMENT '图片地址',
                              `link_url` varchar(500) DEFAULT '' COMMENT '链接地址',
                              `sort` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '排序',
                              `is_deleted` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '逻辑删除 1（true）已删除， 0（false）未删除',
                              `gmt_create` datetime NOT NULL COMMENT '创建时间',
                              `gmt_modified` datetime NOT NULL COMMENT '更新时间',
                              PRIMARY KEY (`id`),
                              UNIQUE KEY `uk_name` (`title`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='首页banner表';

-- ----------------------------
-- Records of crm_banner
-- ----------------------------
INSERT INTO `crm_banner` VALUES ('1194556896025845762', 'test1', 'https://online-teach-file.oss-cn-beijing.aliyuncs.com/cms/2019/11/14/297acd3b-b592-4cfb-a446-a28310369675.jpg', '/course', '1', '0', '2019-11-13 18:05:32', '2019-11-18 10:28:22');
INSERT INTO `crm_banner` VALUES ('1194607458461216769', 'test2', 'https://online-teach-file.oss-cn-beijing.aliyuncs.com/cms/2019/11/13/8f80790d-d736-4842-a6a4-4dcb0d684d4e.jpg', '/teacher', '2', '0', '2019-11-13 21:26:27', '2019-11-14 09:12:15');





-- ----------------------------
-- Table structure for statistics_daily
-- ----------------------------
DROP TABLE IF EXISTS `statistics_daily`;
CREATE TABLE `statistics_daily` (
                                    `id` char(19) NOT NULL COMMENT '主键',
                                    `date_calculated` varchar(20) NOT NULL COMMENT '统计日期',
                                    `register_num` int(11) NOT NULL DEFAULT '0' COMMENT '注册人数',
                                    `login_num` int(11) NOT NULL DEFAULT '0' COMMENT '登录人数',
                                    `clinch_num` int(11) NOT NULL DEFAULT '0' COMMENT '每日订单成交量',
                                    `refund_num` int(11) NOT NULL DEFAULT '0' COMMENT '每日订单退款量',
                                    `gmt_create` datetime NOT NULL COMMENT '创建时间',
                                    `gmt_modified` datetime NOT NULL COMMENT '更新时间',
                                    PRIMARY KEY (`id`),
                                    KEY `statistics_day` (`date_calculated`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='网站统计日数据';

-- ----------------------------
-- Records of statistics_daily
-- ----------------------------
INSERT INTO `statistics_daily` VALUES ('1078490017163833345', '2018-12-28', '0', '0', '154', '170', '2018-12-28 11:17:12', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1087142127818768386', '2019-01-02', '2', '0', '167', '177', '2019-01-21 08:17:36', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1087198321809457153', '2019-01-01', '1', '0', '130', '189', '2019-01-21 12:00:54', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1087198383973236738', '2019-01-03', '0', '0', '114', '130', '2019-01-21 12:01:09', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1087451681764982785', '2019-01-04', '0', '0', '118', '155', '2019-01-22 04:47:39', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1087455336471785473', '2019-01-05', '0', '0', '184', '186', '2019-01-22 05:02:11', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1105339962460491777', '2019-03-01', '0', '143', '168', '136', '2019-03-12 13:29:18', '2019-03-12 13:29:18');
INSERT INTO `statistics_daily` VALUES ('1105339977027309569', '2019-03-02', '0', '165', '171', '158', '2019-03-12 13:29:21', '2019-03-12 13:29:21');
INSERT INTO `statistics_daily` VALUES ('1105339990738489346', '2019-03-03', '0', '143', '147', '194', '2019-03-12 13:29:25', '2019-03-12 13:29:25');
INSERT INTO `statistics_daily` VALUES ('1105340000544772098', '2019-03-04', '0', '155', '106', '153', '2019-03-12 13:29:27', '2019-03-12 13:29:27');
INSERT INTO `statistics_daily` VALUES ('1105340011244441602', '2019-03-05', '0', '186', '102', '155', '2019-03-12 13:29:30', '2019-03-12 13:29:30');
INSERT INTO `statistics_daily` VALUES ('1105340020929089538', '2019-03-06', '0', '140', '192', '129', '2019-03-12 13:29:32', '2019-03-12 13:29:32');
INSERT INTO `statistics_daily` VALUES ('1105340029800042497', '2019-03-07', '0', '186', '139', '116', '2019-03-12 13:29:34', '2019-03-12 13:29:34');
INSERT INTO `statistics_daily` VALUES ('1105340038696161282', '2019-03-08', '0', '120', '166', '112', '2019-03-12 13:29:36', '2019-03-12 13:29:36');
INSERT INTO `statistics_daily` VALUES ('1105340049441968129', '2019-03-09', '0', '182', '147', '119', '2019-03-12 13:29:39', '2019-03-12 13:29:39');
INSERT INTO `statistics_daily` VALUES ('1105340059738984449', '2019-03-10', '0', '199', '141', '103', '2019-03-12 13:29:41', '2019-03-12 13:29:41');
INSERT INTO `statistics_daily` VALUES ('1105340070438653953', '2019-03-11', '0', '127', '137', '156', '2019-03-12 13:29:44', '2019-03-12 13:29:44');
INSERT INTO `statistics_daily` VALUES ('1105340080307851266', '2019-03-12', '0', '167', '123', '132', '2019-03-12 13:29:46', '2019-03-12 13:29:46');
INSERT INTO `statistics_daily` VALUES ('1105340090047025153', '2019-03-13', '0', '106', '132', '103', '2019-03-12 13:29:48', '2019-03-12 13:29:48');
INSERT INTO `statistics_daily` VALUES ('1105340100075606017', '2019-03-14', '0', '166', '180', '118', '2019-03-12 13:29:51', '2019-03-12 13:29:51');
INSERT INTO `statistics_daily` VALUES ('1105340110511034370', '2019-03-15', '0', '114', '151', '185', '2019-03-12 13:29:53', '2019-03-12 13:29:53');
INSERT INTO `statistics_daily` VALUES ('1105340121412030466', '2019-03-16', '0', '134', '105', '126', '2019-03-12 13:29:56', '2019-03-12 13:29:56');
INSERT INTO `statistics_daily` VALUES ('1105340132833120258', '2019-03-17', '0', '169', '106', '131', '2019-03-12 13:29:59', '2019-03-12 13:29:59');
INSERT INTO `statistics_daily` VALUES ('1105340145659301890', '2019-03-18', '0', '120', '106', '163', '2019-03-12 13:30:02', '2019-03-12 13:30:02');
INSERT INTO `statistics_daily` VALUES ('1105340153578147842', '2019-03-19', '0', '146', '155', '153', '2019-03-12 13:30:03', '2019-03-12 13:30:03');
INSERT INTO `statistics_daily` VALUES ('1105340162436517890', '2019-03-20', '0', '127', '181', '186', '2019-03-12 13:30:06', '2019-03-12 13:30:06');
INSERT INTO `statistics_daily` VALUES ('1105340171517186050', '2019-03-21', '0', '106', '134', '145', '2019-03-12 13:30:08', '2019-03-12 13:30:08');
INSERT INTO `statistics_daily` VALUES ('1105340181034061825', '2019-03-22', '0', '161', '182', '143', '2019-03-12 13:30:10', '2019-03-12 13:30:10');
INSERT INTO `statistics_daily` VALUES ('1105340190072786946', '2019-03-23', '0', '183', '101', '182', '2019-03-12 13:30:12', '2019-03-12 13:30:12');
INSERT INTO `statistics_daily` VALUES ('1105340199426084865', '2019-03-24', '0', '117', '100', '102', '2019-03-12 13:30:14', '2019-03-12 13:30:14');
INSERT INTO `statistics_daily` VALUES ('1105340209261727745', '2019-03-25', '0', '116', '103', '160', '2019-03-12 13:30:17', '2019-03-12 13:30:17');
INSERT INTO `statistics_daily` VALUES ('1105340217935548418', '2019-03-26', '0', '101', '119', '150', '2019-03-12 13:30:19', '2019-03-12 13:30:19');
INSERT INTO `statistics_daily` VALUES ('1105340225967640577', '2019-03-27', '0', '129', '141', '181', '2019-03-12 13:30:21', '2019-03-12 13:30:21');
INSERT INTO `statistics_daily` VALUES ('1105340234075230209', '2019-03-28', '0', '113', '179', '158', '2019-03-12 13:30:23', '2019-03-12 13:30:23');
INSERT INTO `statistics_daily` VALUES ('1105340242837131265', '2019-03-29', '0', '117', '131', '101', '2019-03-12 13:30:25', '2019-03-12 13:30:25');
INSERT INTO `statistics_daily` VALUES ('1105340252395950082', '2019-03-30', '0', '153', '187', '174', '2019-03-12 13:30:27', '2019-03-12 13:30:27');
INSERT INTO `statistics_daily` VALUES ('1105340261958963201', '2019-03-31', '0', '179', '135', '199', '2019-03-12 13:30:29', '2019-03-12 13:30:29');
INSERT INTO `statistics_daily` VALUES ('1105372743634898945', '2019-01-06', '0', '113', '143', '148', '2019-03-12 15:39:34', '2019-03-12 15:39:34');
INSERT INTO `statistics_daily` VALUES ('1105372754380705793', '2019-01-07', '0', '173', '158', '153', '2019-03-12 15:39:36', '2019-03-12 15:39:36');
INSERT INTO `statistics_daily` VALUES ('1105372762526044162', '2019-01-08', '0', '135', '199', '131', '2019-03-12 15:39:38', '2019-03-12 15:39:38');
INSERT INTO `statistics_daily` VALUES ('1105372771229224961', '2019-01-09', '0', '161', '107', '162', '2019-03-12 15:39:40', '2019-03-12 15:39:40');
INSERT INTO `statistics_daily` VALUES ('1105372780922261505', '2019-01-10', '0', '182', '196', '135', '2019-03-12 15:39:42', '2019-03-12 15:39:42');
INSERT INTO `statistics_daily` VALUES ('1105372790103592961', '2019-01-11', '0', '123', '194', '102', '2019-03-12 15:39:45', '2019-03-12 15:39:45');
INSERT INTO `statistics_daily` VALUES ('1105372798626418689', '2019-01-12', '0', '185', '106', '180', '2019-03-12 15:39:47', '2019-03-12 15:39:47');
INSERT INTO `statistics_daily` VALUES ('1165', '2018-01-01', '583', '26', '236', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1166', '2018-01-02', '583', '26', '236', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1167', '2018-01-03', '584', '26', '236', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1168', '2018-01-04', '584', '26', '237', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1169', '2018-01-05', '585', '26', '237', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1170', '2018-01-06', '585', '26', '237', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1171', '2018-01-07', '586', '26', '237', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1172', '2018-01-08', '586', '26', '237', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1173', '2018-01-09', '587', '26', '238', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1174', '2018-01-10', '587', '26', '238', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1175', '2018-01-11', '588', '27', '238', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1176', '2018-01-12', '588', '27', '238', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1177', '2018-01-13', '589', '27', '238', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1178', '2018-01-14', '589', '27', '239', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1179', '2018-01-15', '590', '27', '239', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1180', '2018-01-16', '590', '27', '239', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1181', '2018-01-17', '591', '27', '239', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1182', '2018-01-18', '591', '27', '239', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1183', '2018-01-19', '592', '27', '240', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1183991737299263490', '2019-10-01', '0', '145', '149', '153', '2019-10-15 14:23:22', '2019-10-15 14:23:22');
INSERT INTO `statistics_daily` VALUES ('1183999299272904705', '2019-10-03', '0', '125', '102', '153', '2019-10-15 14:53:25', '2019-10-15 14:53:25');
INSERT INTO `statistics_daily` VALUES ('1183999309477646338', '2019-10-04', '0', '103', '194', '161', '2019-10-15 14:53:28', '2019-10-15 14:53:28');
INSERT INTO `statistics_daily` VALUES ('1183999318919024642', '2019-10-05', '0', '173', '174', '147', '2019-10-15 14:53:30', '2019-10-15 14:53:30');
INSERT INTO `statistics_daily` VALUES ('1183999331409661954', '2019-10-06', '0', '129', '197', '173', '2019-10-15 14:53:33', '2019-10-15 14:53:33');
INSERT INTO `statistics_daily` VALUES ('1183999342897860610', '2019-10-07', '0', '184', '125', '169', '2019-10-15 14:53:36', '2019-10-15 14:53:36');
INSERT INTO `statistics_daily` VALUES ('1183999351588458498', '2019-10-08', '0', '173', '143', '138', '2019-10-15 14:53:38', '2019-10-15 14:53:38');
INSERT INTO `statistics_daily` VALUES ('1183999360316805122', '2019-10-09', '0', '161', '158', '117', '2019-10-15 14:53:40', '2019-10-15 14:53:40');
INSERT INTO `statistics_daily` VALUES ('1183999367480676353', '2019-10-10', '0', '190', '166', '135', '2019-10-15 14:53:42', '2019-10-15 14:53:42');
INSERT INTO `statistics_daily` VALUES ('1184', '2018-01-20', '592', '27', '240', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1184030117693284353', '2019-10-11', '0', '182', '199', '193', '2019-10-15 16:55:53', '2019-10-15 16:55:53');
INSERT INTO `statistics_daily` VALUES ('1185', '2018-01-21', '593', '27', '240', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1185373213064482818', '2019-01-19', '6', '135', '126', '167', '2019-10-19 09:52:52', '2019-10-19 09:52:52');
INSERT INTO `statistics_daily` VALUES ('1186', '2018-01-22', '593', '27', '240', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1186536619937435650', '2019-10-02', '0', '187', '183', '108', '2019-10-22 14:55:50', '2019-10-22 14:55:50');
INSERT INTO `statistics_daily` VALUES ('1187', '2018-01-23', '594', '27', '240', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1188', '2018-01-24', '594', '27', '241', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1189', '2018-01-25', '595', '27', '241', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1190', '2018-01-26', '595', '27', '241', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1191', '2018-01-27', '596', '27', '241', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1192', '2018-01-28', '596', '27', '241', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1192253597226455042', '2019-11-01', '0', '129', '122', '167', '2019-11-07 09:33:03', '2019-11-07 09:33:03');
INSERT INTO `statistics_daily` VALUES ('1192253902756335617', '2019-11-02', '0', '170', '192', '192', '2019-11-07 09:34:16', '2019-11-07 09:34:16');
INSERT INTO `statistics_daily` VALUES ('1193', '2018-01-29', '597', '27', '242', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1194', '2018-01-30', '597', '27', '242', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1194060032935493633', '2019-11-11', '0', '121', '121', '122', '2019-11-12 09:11:11', '2019-11-12 09:11:11');
INSERT INTO `statistics_daily` VALUES ('1194060301425475585', '2019-11-10', '0', '155', '187', '140', '2019-11-12 09:12:15', '2019-11-12 09:12:15');
INSERT INTO `statistics_daily` VALUES ('1195', '2018-01-31', '598', '27', '242', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1196', '2018-02-01', '598', '27', '242', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1197', '2018-02-02', '599', '27', '242', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1198', '2018-02-03', '599', '27', '243', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1199', '2018-02-04', '600', '27', '243', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1200', '2018-02-05', '600', '27', '243', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1201', '2018-02-06', '601', '27', '243', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1202', '2018-02-07', '601', '27', '243', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1203', '2018-02-08', '602', '27', '244', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1204', '2018-02-09', '602', '27', '244', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1205', '2018-02-10', '603', '27', '244', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1206', '2018-02-11', '603', '27', '244', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1207', '2018-02-12', '604', '27', '244', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1208', '2018-02-13', '604', '27', '245', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1209', '2018-02-14', '605', '27', '245', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1210', '2018-02-15', '605', '27', '245', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1211', '2018-02-16', '606', '27', '245', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1212', '2018-02-17', '606', '27', '245', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1213', '2018-02-18', '607', '27', '246', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1214', '2018-02-19', '607', '27', '246', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1215', '2018-02-20', '608', '27', '246', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1216', '2018-02-21', '608', '27', '246', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1217', '2018-02-22', '609', '27', '246', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1218', '2018-02-23', '609', '27', '247', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1219', '2018-02-24', '610', '27', '247', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1220', '2018-02-25', '610', '27', '247', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1221', '2018-02-26', '611', '27', '247', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1222', '2018-02-27', '611', '27', '247', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1223', '2018-02-28', '612', '27', '248', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1224', '2018-03-01', '612', '27', '248', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1225', '2018-03-02', '613', '28', '248', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1226', '2018-03-03', '613', '28', '248', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1227', '2018-03-04', '614', '28', '248', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1228', '2018-03-05', '614', '28', '249', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1229', '2018-03-06', '615', '28', '249', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1230', '2018-03-07', '615', '28', '249', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1231', '2018-03-08', '616', '28', '249', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1232', '2018-03-09', '616', '28', '249', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1233', '2018-03-10', '617', '28', '250', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1234', '2018-03-11', '617', '28', '250', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1235', '2018-03-12', '618', '28', '250', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1236', '2018-03-13', '618', '28', '250', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1237', '2018-03-14', '619', '28', '250', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1238', '2018-03-15', '619', '28', '251', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1239', '2018-03-16', '620', '28', '251', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1240', '2018-03-17', '620', '28', '251', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1241', '2018-03-18', '621', '28', '251', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1242', '2018-03-19', '621', '28', '251', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1243', '2018-03-20', '622', '28', '252', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1244', '2018-03-21', '622', '28', '252', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1245', '2018-03-22', '623', '28', '252', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1246', '2018-03-23', '623', '28', '252', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1247', '2018-03-24', '624', '28', '252', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1248', '2018-03-25', '624', '28', '253', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1249', '2018-03-26', '625', '28', '253', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1250', '2018-03-27', '625', '28', '253', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1251', '2018-03-28', '626', '28', '253', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1252', '2018-03-29', '626', '28', '253', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1253', '2018-03-30', '627', '28', '254', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1254', '2018-03-31', '627', '28', '254', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1255', '2018-04-01', '628', '28', '254', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1256', '2018-04-02', '628', '28', '254', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1257', '2018-04-03', '629', '28', '254', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1258', '2018-04-04', '629', '28', '255', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1259', '2018-04-05', '630', '28', '255', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1260', '2018-04-06', '630', '28', '255', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1261', '2018-04-07', '631', '28', '255', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1262', '2018-04-08', '631', '28', '255', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1263', '2018-04-09', '632', '28', '256', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1264', '2018-04-10', '632', '28', '256', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1265', '2018-04-11', '633', '28', '256', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1266', '2018-04-12', '633', '28', '256', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1267', '2018-04-13', '634', '28', '256', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1268', '2018-04-14', '634', '28', '257', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1269', '2018-04-15', '635', '28', '257', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1270', '2018-04-16', '635', '28', '257', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1271', '2018-04-17', '636', '28', '257', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1272', '2018-04-18', '636', '28', '257', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1273', '2018-04-19', '637', '28', '258', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1274', '2018-04-20', '637', '28', '258', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1275', '2018-04-21', '638', '29', '258', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1276', '2018-04-22', '638', '29', '258', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1277', '2018-04-23', '639', '29', '258', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1278', '2018-04-24', '639', '29', '259', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1279', '2018-04-25', '640', '29', '259', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1280', '2018-04-26', '640', '29', '259', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1281', '2018-04-27', '641', '29', '259', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1282', '2018-04-28', '641', '29', '259', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1283', '2018-04-29', '642', '29', '260', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1284', '2018-04-30', '642', '29', '260', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1285', '2018-05-01', '643', '29', '260', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1286', '2018-05-02', '643', '29', '260', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1287', '2018-05-03', '644', '29', '260', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1288', '2018-05-04', '644', '29', '261', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1289', '2018-05-05', '645', '29', '261', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1290', '2018-05-06', '645', '29', '261', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1291', '2018-05-07', '646', '29', '261', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1292', '2018-05-08', '646', '29', '261', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1293', '2018-05-09', '647', '29', '262', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1294', '2018-05-10', '647', '29', '262', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1295', '2018-05-11', '648', '29', '262', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1295626066102104065', '2020-08-12', '3', '145', '168', '131', '2020-08-18 15:38:20', '2020-08-18 15:38:20');
INSERT INTO `statistics_daily` VALUES ('1296', '2018-05-12', '648', '29', '262', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1297', '2018-05-13', '649', '29', '262', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1298', '2018-05-14', '649', '29', '263', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1299', '2018-05-15', '5', '29', '263', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1300', '2018-05-16', '650', '29', '263', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1301', '2018-05-17', '651', '29', '263', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1302', '2018-05-18', '651', '29', '263', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1303', '2018-05-19', '652', '29', '264', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1304', '2018-05-20', '652', '29', '264', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1305', '2018-05-21', '653', '29', '264', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1306', '2018-05-22', '1', '29', '264', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1307', '2018-05-23', '654', '29', '264', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1308', '2018-05-24', '654', '29', '265', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1309', '2018-05-25', '1', '29', '265', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1310', '2018-05-26', '655', '29', '265', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1311', '2018-05-27', '656', '29', '265', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1312', '2018-05-28', '656', '29', '265', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1313', '2018-05-29', '657', '29', '266', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1314', '2018-05-30', '657', '29', '266', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1315', '2018-05-31', '658', '29', '266', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1316', '2018-06-01', '658', '29', '266', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1317', '2018-06-02', '659', '29', '266', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1318', '2018-06-03', '659', '29', '267', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1319', '2018-06-04', '660', '29', '267', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1320', '2018-06-05', '660', '29', '267', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1321', '2018-06-06', '661', '29', '267', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1322', '2018-06-07', '661', '29', '267', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1323', '2018-06-08', '662', '29', '268', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1324', '2018-06-09', '662', '29', '268', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1325', '2018-06-10', '663', '30', '268', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1326', '2018-06-11', '663', '30', '268', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1327', '2018-06-12', '664', '30', '268', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1328', '2018-06-13', '664', '30', '269', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1329', '2018-06-14', '665', '30', '269', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1330', '2018-06-15', '665', '30', '269', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1331', '2018-06-16', '666', '30', '269', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1332', '2018-06-17', '666', '30', '269', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1333', '2018-06-18', '667', '30', '270', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1334', '2018-06-19', '667', '30', '270', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1335', '2018-06-20', '668', '30', '270', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1336', '2018-06-21', '668', '30', '270', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1337', '2018-06-22', '669', '30', '270', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1338', '2018-06-23', '669', '30', '271', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1339', '2018-06-24', '670', '30', '271', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1340', '2018-06-25', '670', '30', '271', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1341', '2018-06-26', '671', '30', '271', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1342', '2018-06-27', '671', '30', '271', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1343', '2018-06-28', '672', '30', '272', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1344', '2018-06-29', '672', '30', '272', '14', '2018-01-25 06:38:19', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1345', '2018-06-30', '673', '30', '272', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1346', '2018-07-01', '673', '30', '272', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1347', '2018-07-02', '674', '30', '272', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1348', '2018-07-03', '674', '30', '273', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1349', '2018-07-04', '675', '30', '273', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1350', '2018-07-05', '675', '30', '273', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1351', '2018-07-06', '676', '30', '273', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1352', '2018-07-07', '676', '30', '273', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1353', '2018-07-08', '677', '30', '274', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1354', '2018-07-09', '677', '30', '274', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1355', '2018-07-10', '678', '30', '274', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1356', '2018-07-11', '678', '30', '274', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1357', '2018-07-12', '679', '30', '274', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1358', '2018-07-13', '679', '30', '275', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1359', '2018-07-14', '680', '30', '275', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1360', '2018-07-15', '680', '30', '275', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1361', '2018-07-16', '681', '30', '275', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1362', '2018-07-17', '681', '30', '275', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1363', '2018-07-18', '682', '30', '276', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1364', '2018-07-19', '682', '30', '276', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1365', '2018-07-20', '683', '30', '276', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1366', '2018-07-21', '683', '30', '276', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1367', '2018-07-22', '684', '30', '276', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1368', '2018-07-23', '684', '30', '277', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1369', '2018-07-24', '685', '30', '277', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1370', '2018-07-25', '685', '30', '277', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1371', '2018-07-26', '686', '30', '277', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1372', '2018-07-27', '686', '30', '277', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1373', '2018-07-28', '687', '30', '278', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1374', '2018-07-29', '687', '30', '278', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1375', '2018-07-30', '688', '31', '278', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1376', '2018-07-31', '688', '31', '278', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1377', '2018-08-01', '689', '31', '278', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1378', '2018-08-02', '689', '31', '279', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1379', '2018-08-03', '690', '31', '279', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1380', '2018-08-04', '690', '31', '279', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1381', '2018-08-05', '691', '31', '279', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1382', '2018-08-06', '691', '31', '279', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1383', '2018-08-07', '692', '31', '280', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1384', '2018-08-08', '692', '31', '280', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1385', '2018-08-09', '1', '31', '280', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1386', '2018-08-10', '693', '31', '280', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1387', '2018-08-11', '694', '31', '280', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1388', '2018-08-12', '694', '31', '281', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1389', '2018-08-13', '695', '31', '281', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1390', '2018-08-14', '695', '31', '281', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1391', '2018-08-15', '696', '31', '281', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1392', '2018-08-16', '696', '31', '281', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1393', '2018-08-17', '697', '31', '282', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1394', '2018-08-18', '697', '31', '282', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1395', '2018-08-19', '698', '31', '282', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1396', '2018-08-20', '698', '31', '282', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1397', '2018-08-21', '699', '31', '282', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1398', '2018-08-22', '699', '31', '283', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1399', '2018-08-23', '700', '31', '283', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1400', '2018-08-24', '700', '31', '283', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1401', '2018-08-25', '701', '31', '283', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1402', '2018-08-26', '701', '31', '283', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1403', '2018-08-27', '702', '31', '284', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1404', '2018-08-28', '702', '31', '284', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1405', '2018-08-29', '703', '31', '284', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1406', '2018-08-30', '703', '31', '284', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1407', '2018-08-31', '704', '31', '284', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1408', '2018-09-01', '1', '31', '285', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1409', '2018-09-02', '705', '31', '285', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1410', '2018-09-03', '705', '31', '285', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1411', '2018-09-04', '706', '31', '285', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1412', '2018-09-05', '706', '31', '285', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1413', '2018-09-06', '707', '31', '286', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1414', '2018-09-07', '707', '31', '1', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1415', '2018-09-08', '708', '31', '1', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1416', '2018-09-09', '1', '31', '1', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1417', '2018-09-10', '1', '31', '2', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1418', '2018-09-11', '709', '31', '287', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1419', '2018-09-12', '710', '31', '287', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1420', '2018-09-13', '710', '31', '287', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1421', '2018-09-14', '711', '31', '287', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1422', '2018-09-15', '711', '31', '287', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1423', '2018-09-16', '712', '31', '288', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1424', '2018-09-17', '712', '31', '288', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1425', '2018-09-18', '713', '32', '288', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1426', '2018-09-19', '713', '32', '288', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1427', '2018-09-20', '714', '32', '288', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1428', '2018-09-21', '714', '32', '289', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1429', '2018-09-22', '715', '32', '289', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1430', '2018-09-23', '715', '32', '289', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1431', '2018-09-24', '716', '32', '1', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1432', '2018-09-25', '716', '32', '289', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1433', '2018-09-26', '717', '32', '290', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1434', '2018-09-27', '717', '32', '290', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1435', '2018-09-28', '718', '32', '290', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1436', '2018-09-29', '718', '32', '1', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1437', '2018-09-30', '719', '32', '290', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1438', '2018-10-01', '719', '32', '291', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1439', '2018-10-02', '720', '32', '291', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1440', '2018-10-03', '720', '32', '291', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1441', '2018-10-04', '721', '32', '291', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1442', '2018-10-05', '721', '32', '291', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1443', '2018-10-06', '722', '32', '292', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1444', '2018-10-07', '722', '32', '292', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1445', '2018-10-08', '1', '32', '292', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1446', '2018-10-09', '723', '32', '292', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1447', '2018-10-10', '724', '32', '292', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1448', '2018-10-11', '724', '32', '293', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1449', '2018-10-12', '725', '32', '293', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1450', '2018-10-13', '725', '32', '293', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1451', '2018-10-14', '726', '32', '4', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1452', '2018-10-15', '726', '32', '293', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1453', '2018-10-16', '727', '32', '294', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1454', '2018-10-17', '727', '32', '294', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1455', '2018-10-18', '728', '32', '294', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1456', '2018-10-19', '728', '32', '294', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1457', '2018-10-20', '729', '32', '294', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1458', '2018-10-21', '729', '32', '295', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1459', '2018-10-22', '730', '32', '1', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1460', '2018-10-23', '730', '32', '295', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1461', '2018-10-24', '731', '32', '295', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1462', '2018-10-25', '731', '32', '295', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1463', '2018-10-26', '732', '32', '296', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1464', '2018-10-27', '732', '32', '296', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1465', '2018-10-28', '733', '32', '296', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1466', '2018-10-29', '2', '32', '3', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1467', '2018-10-30', '734', '32', '296', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1468', '2018-10-31', '734', '32', '297', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1469', '2018-11-01', '735', '32', '297', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1470', '2018-11-02', '735', '32', '297', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1471', '2018-11-03', '1', '32', '297', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1472', '2018-11-04', '736', '32', '1', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1473', '2018-11-05', '737', '32', '298', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1474', '2018-11-06', '737', '32', '298', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1475', '2018-11-07', '738', '33', '298', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1476', '2018-11-08', '738', '33', '169', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1477', '2018-11-09', '1', '33', '298', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1478', '2018-11-10', '739', '33', '78', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1479', '2018-11-11', '740', '33', '299', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1480', '2018-11-12', '740', '33', '299', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1481', '2018-11-13', '741', '33', '299', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1482', '2018-11-14', '741', '33', '299', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1483', '2018-11-15', '742', '33', '300', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1484', '2018-11-16', '742', '33', '35', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1485', '2018-11-17', '743', '33', '300', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1486', '2018-11-18', '743', '33', '300', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1487', '2018-11-19', '744', '33', '300', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1488', '2018-11-20', '744', '33', '301', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1489', '2018-11-21', '745', '33', '234', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1490', '2018-11-22', '456', '33', '301', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1491', '2018-11-23', '746', '33', '301', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1492', '2018-11-24', '746', '33', '301', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1493', '2018-11-25', '747', '33', '302', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1494', '2018-11-26', '747', '4', '302', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1495', '2018-11-27', '748', '33', '302', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1496', '2018-11-28', '748', '33', '36', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1497', '2018-11-29', '749', '33', '302', '2', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1498', '2018-11-30', '749', '3', '303', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1499', '2018-12-01', '750', '33', '303', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1500', '2018-12-02', '234', '33', '303', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1501', '2018-12-03', '751', '33', '303', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1502', '2018-12-04', '751', '33', '303', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1503', '2018-12-05', '752', '6', '304', '33', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1505', '2018-12-07', '753', '33', '55', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1506', '2018-12-08', '753', '33', '304', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1507', '2018-12-09', '754', '33', '304', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1508', '2018-12-10', '754', '1', '305', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1509', '2018-12-11', '755', '33', '305', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1510', '2018-12-12', '755', '33', '305', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1511', '2018-12-13', '756', '33', '305', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1512', '2018-12-14', '366', '33', '305', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1513', '2018-12-15', '757', '33', '66', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1514', '2018-12-16', '757', '33', '306', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1515', '2018-12-17', '758', '33', '306', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1516', '2018-12-18', '758', '2', '306', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1517', '2018-12-19', '759', '33', '306', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1518', '2018-12-20', '564', '33', '307', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1519', '2018-12-21', '760', '33', '307', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1520', '2018-12-22', '760', '33', '307', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1521', '2018-12-23', '761', '33', '307', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1522', '2018-12-24', '761', '33', '307', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1527', '2018-12-29', '764', '34', '308', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1528', '2018-12-30', '764', '34', '309', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1529', '2018-12-31', '765', '34', '309', '14', '2018-01-25 06:38:20', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1554', '2018-01-01', '333', '34', '314', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1555', '2018-01-02', '778', '34', '314', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1556', '2018-01-03', '778', '34', '314', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1557', '2018-01-04', '779', '34', '314', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1558', '2018-01-05', '779', '34', '315', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1559', '2018-01-06', '780', '34', '315', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1560', '2018-01-07', '780', '34', '315', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1561', '2018-01-08', '781', '34', '315', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1562', '2018-01-09', '781', '34', '315', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1563', '2018-01-10', '782', '34', '316', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1564', '2018-01-11', '782', '34', '316', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1565', '2018-01-12', '783', '34', '316', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1566', '2018-01-13', '783', '34', '316', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1567', '2018-01-14', '784', '34', '316', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1568', '2018-01-15', '784', '34', '317', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1569', '2018-01-16', '23', '34', '317', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1570', '2018-01-17', '785', '34', '317', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1571', '2018-01-18', '786', '34', '317', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1572', '2018-01-19', '786', '34', '317', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1573', '2018-01-20', '787', '2', '318', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1574', '2018-01-21', '787', '2', '318', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1575', '2018-01-22', '788', '1', '318', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1576', '2018-01-23', '788', '35', '318', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1577', '2018-01-24', '789', '35', '318', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1578', '2018-01-25', '789', '1', '319', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1579', '2018-01-26', '790', '1', '319', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1580', '2018-01-27', '531', '2', '319', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1581', '2018-01-28', '791', '2', '319', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1582', '2018-01-29', '791', '2', '319', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1583', '2018-01-30', '2', '4', '2', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1584', '2018-01-31', '792', '35', '320', '14', '2018-02-02 08:58:31', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1586', '2018-02-01', '793', '4', '3', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1587', '2018-02-02', '794', '2', '1', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1588', '2018-02-03', '794', '1', '4', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1589', '2018-02-04', '795', '35', '321', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1590', '2018-02-05', '795', '35', '321', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1591', '2018-02-06', '796', '35', '321', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1592', '2018-02-07', '796', '35', '321', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1593', '2018-02-08', '797', '35', '322', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1594', '2018-02-09', '797', '35', '322', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1595', '2018-02-10', '99', '35', '322', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1596', '2018-02-11', '798', '35', '322', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1597', '2018-02-12', '799', '35', '322', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1598', '2018-02-13', '799', '35', '323', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1599', '2018-02-14', '800', '35', '323', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1600', '2018-02-15', '800', '35', '323', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1601', '2018-02-16', '89', '35', '90', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1602', '2018-02-17', '801', '35', '323', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1603', '2018-02-18', '802', '23', '324', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1604', '2018-02-19', '802', '2', '324', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1605', '2018-02-20', '803', '56', '324', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1606', '2018-02-21', '45', '35', '89', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1607', '2018-02-22', '804', '35', '324', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1608', '2018-02-23', '804', '35', '325', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1609', '2018-02-24', '805', '1', '3', '14', '2018-02-25 10:54:34', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1610', '2018-05-15', '0', '0', '0', '7', '2018-05-16 00:25:27', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1611', '2018-10-01', '0', '0', '0', '7', '2018-10-24 16:17:15', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1612', '2018-10-02', '0', '0', '0', '7', '2018-10-24 16:17:15', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1613', '2018-10-03', '0', '0', '0', '7', '2018-10-24 16:17:15', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1614', '2018-10-04', '0', '0', '0', '7', '2018-10-24 16:17:15', '2019-09-09 12:12:12');
INSERT INTO `statistics_daily` VALUES ('1615', '2018-10-05', '0', '0', '0', '7', '2018-10-24 16:17:15', '2019-09-09 12:12:12');
