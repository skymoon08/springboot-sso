package com.suzhe.sso.controller;


import com.suzhe.sso.common.R;
import com.suzhe.sso.common.annotation.LoginAuth;
import com.suzhe.sso.common.web.LoginUser;
import com.suzhe.sso.common.web.LoginUserContex;
import com.suzhe.sso.service.IAccountService;
import com.suzhe.sso.vo.AccountVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account/")
@Slf4j
public class AccountController {

    @Autowired
    IAccountService iAccountService;

    @LoginAuth
    @RequestMapping(value = "getAccountInfo", method = RequestMethod.GET)
    public R<AccountVo> getAccountInfo() {

        LoginUser loginUser = LoginUserContex.getLoginUser();

        AccountVo accountVo = iAccountService.getAccountVo(loginUser.getId());
        return R.createBySuccess(accountVo);
    }



}
