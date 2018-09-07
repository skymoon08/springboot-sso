package com.suzhe.sso.service;

import com.suzhe.sso.vo.AccountVo;

public interface IAccountService {


    /**
     * 获取账户信息
     * @param userId
     * @return
     */
    AccountVo getAccountVo(Integer userId);
}
