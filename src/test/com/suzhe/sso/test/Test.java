package com.suzhe.sso.test;


import com.suzhe.sso.common.util.CodecUtil;
import com.suzhe.sso.common.util.RedisUtil;
import com.suzhe.sso.mapper.TbProductMapper;
import com.suzhe.sso.mapper.TbUserMapper;
import com.suzhe.sso.pojo.TbProduct;
import com.suzhe.sso.pojo.TbUser;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.suzhe.sso.mapper")
public class Test {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    TbUserMapper tbUserMapper;

    @Autowired
    RedisUtil redisUtil;

    @Autowired
    TbProductMapper tbProductMapper;

    @org.junit.Test
    public void test(){

        TbUser user = new TbUser();
        user.setUsername("aaa");
        user.setPhoneNo("12455677");
        user.setSalt("aaa");
        user.setPassword(CodecUtil.encryptMD5("123456"+user.getSalt()));
        tbUserMapper.insertSelective(user);

    }
    @org.junit.Test
    public void test2(){

        TbProduct product = new TbProduct();
        product.setProductName("双季盈");
        product.setAnnualYield(new BigDecimal("0.08"));
        product.setInvestPeriod(60);
        product.setTotalAmount(BigDecimal.valueOf(100000));
        product.setCreateTime(new Date());
        product.setUpdateTime(new Date());
        tbProductMapper.insertSelective(product);
    }


}
