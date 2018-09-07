package com.suzhe.sso.test;


import com.suzhe.sso.common.util.CodecUtil;
import com.suzhe.sso.common.util.RedisUtil;
import com.suzhe.sso.common.util.RediskeyUtil;
import com.suzhe.sso.mapper.TbUserMapper;
import com.suzhe.sso.pojo.TbUser;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.suzhe.sso.mapper")
public class Test {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    TbUserMapper tbUserMapper;

    @Autowired
    RedisUtil redisUtil;

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
        redisUtil.set("aaaa","bbbb");

        System.out.println(redisUtil.get("aaa",String.class));
    }


}
