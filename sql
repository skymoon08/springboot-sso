CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL  AUTO_INCREMENT COMMENT 'ID',
  `username` varchar(30) NOT NULL COMMENT '用户名',
  `phone_no` varchar(20) NOT NULL COMMENT '手机号',
  `password` varchar(30) NOT NULL COMMENT '密码',
  `salt` varchar(255) NOT NULL COMMENT '密码盐',
  `nick_name` varchar(30) DEFAULT NULL COMMENT '昵称',
  `head_img` varchar(200) DEFAULT NULL COMMENT '用户头像',
  `indroduce` varchar(200) DEFAULT NULL COMMENT '简介',
  `sex` char(1) DEFAULT NULL COMMENT '用户性别',
  `address` varchar(200) DEFAULT NULL COMMENT '地址',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`),
  KEY `phone_no_index` (`phone_no`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';


CREATE TABLE `tb_account` (
  `id` int(11) NOT NULL  AUTO_INCREMENT COMMENT 'ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `total_assets` decimal(20,2) DEFAULT 0 COMMENT '总资产',
  `total_income` decimal(20,2) DEFAULT 0 COMMENT '总收益',
  `wallet` decimal(20,2) DEFAULT 0 COMMENT '钱包',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `user_id_index` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='账户表';


CREATE TABLE `tb_product` (
  `id` int(11) NOT NULL  AUTO_INCREMENT COMMENT 'ID',
  `product_name` varchar(100) NOT NULL COMMENT '产品名字',
  `annual_yield` decimal(5,4) DEFAULT 0 COMMENT '年化收益率',
  `total_amount` decimal(20,2) DEFAULT 0 COMMENT '总额度',
  `remaining_amount` decimal(20,2) DEFAULT 0 COMMENT '剩余额度',
  `invest_period` int(11) DEFAULT 0 COMMENT '投资期限',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品表';



