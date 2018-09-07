package com.suzhe.sso.controller;


import com.suzhe.sso.common.R;
import com.suzhe.sso.common.constant.LoginConstant;
import com.suzhe.sso.common.util.RedisUtil;
import com.suzhe.sso.common.util.RediskeyUtil;
import com.suzhe.sso.service.IUserService;
import com.suzhe.sso.vo.LoginParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@RestController
@RequestMapping("")
@Slf4j
public class UserController {

    @Autowired
    IUserService iUserService;

    @Autowired
    RedisUtil redisUtil;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public R<String> login(@Valid @RequestBody LoginParam loginParam) {
        log.debug("loginParam:{}",loginParam);


        return iUserService.login(loginParam.getUsername(), loginParam.getPassword());
    }

    @RequestMapping(value = "logout", method = RequestMethod.POST)
    public R logout(HttpServletRequest request) {
        //从header中获取token
        String authToken = request.getHeader(LoginConstant.AUTH_TOKEN_KEY);
        //删除
        if (StringUtils.isNotEmpty(authToken)) {
            redisUtil.delete(RediskeyUtil.getAuthTokenKey(authToken));
        }
        return R.createBySuccess();
    }

}
