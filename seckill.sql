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
    `audit` tinyint null comment '审核字段（0审核。1发布。2退回）',
    `cause` longtext null comment '退回原因',
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
insert into `goods` (`id`, `title`, `cover_image`, `detail_image`, `start_time`, `audit`, `price`, `num`, `limit_num`,`is_refund`) values ('1189389726308478977', '广东工业大学', 'beijing.aliyuncs.com/2020/08/06/587d5686663541d986a750be8c9b99b9java.jpg', 'beijing.aliyuncs.com/2020/08/06/587d5686663541d986a750be8c9b99b9java.jpg', '2022-07-30 07:42:58', 0, 19, 564671772, 567229,0);
insert into `goods` (`id`, `title`, `cover_image`, `detail_image`, `start_time`, `audit`, `price`, `num`, `limit_num`,`is_refund`) values ('1189389726308478970', '汕头大学', 'beijing.aliyuncs.com/2020/08/06/587d5686663541d986a750be8c9b99b9java.jpg', 'beijing.aliyuncs.com/2020/08/06/587d5686663541d986a750be8c9b99b9java.jpg', '2022-07-30 07:42:58', 0, 950348152, 606, 5869852,0);
insert into `goods` (`id`, `title`, `cover_image`, `detail_image`, `start_time`, `audit`, `price`, `num`, `limit_num`,`is_refund`) values ('1189389726308478971', '武汉科技大学', 'beijing.aliyuncs.com/2020/08/06/587d5686663541d986a750be8c9b99b9java.jpg', 'beijing.aliyuncs.com/2020/08/06/587d5686663541d986a750be8c9b99b9java.jpg', '2022-07-30 07:42:58', 0, 99, 376694, 900473,0);
insert into `goods` (`id`, `title`, `cover_image`, `detail_image`, `start_time`, `audit`, `price`, `num`, `limit_num`,`is_refund`) values ('1189389726308478972', '嘉兴学院', 'beijing.aliyuncs.com/2020/08/06/587d5686663541d986a750be8c9b99b9java.jpg', 'beijing.aliyuncs.com/2020/08/06/587d5686663541d986a750be8c9b99b9java.jpg', '2022-07-30 07:42:58', 0, 60226725, 34, 927415,0);
insert into `goods` (`id`, `title`, `cover_image`, `detail_image`, `start_time`, `audit`, `price`, `num`, `limit_num`,`is_refund`) values ('1189389726308478973', '集美大学', 'beijing.aliyuncs.com/2020/08/06/587d5686663541d986a750be8c9b99b9java.jpg', 'beijing.aliyuncs.com/2020/08/06/587d5686663541d986a750be8c9b99b9java.jpg', '2022-07-30 07:42:58', 0, 12622, 82274274, 90454,0);



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
    `state` tinyint null comment '支付状态（0待支付。1已支付。2退款中）',
    `phone` varchar(11) null comment '用户手机号',
    `total_price` decimal  null comment '总价格',
    `goods_num` int null comment '购买总数',
    `is_refund` tinyint default 0 not null comment '是否为可退款产品(0可退款，1不可退款)',
    `gmt_create` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `gmt_modified` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间'
    ) comment '订单表';



-- ----------------------------
-- Records of orders
-- ----------------------------

insert into `orders` (`orders_id`,orders_num, `user_id`, `goods_id`, `username`, `title`, `state`, `phone`) values ('129227888958885069','888958885069', '1596558950512316410', '1189389726308478973', '钱睿渊', '厦门大学', 0, '17162194381');
insert into `orders` (`orders_id`,orders_num,`user_id`, `goods_id`, `username`, `title`, `state`, `phone`) values ('129227888958885060','888958885060', '1596558950512316437', '1189389726308478973', '严志泽', '河海大学', 0, '17733446818');
insert into `orders` (`orders_id`,orders_num, `user_id`, `goods_id`, `username`, `title`, `state`, `phone`) values ('129227888958885061','888958885061', '1596558950512316437', '1189389726308478971', '郭皓轩', '上海大学', 0, '15376909294');




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
