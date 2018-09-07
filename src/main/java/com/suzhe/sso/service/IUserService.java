package com.suzhe.sso.service;

import com.suzhe.sso.common.R;
import com.suzhe.sso.pojo.TbUser;

public interface IUserService {

    /**
     * 用户登录接口
     * @param username 用户名
     * @param password 密码
     * @return
     */
    R<String> login(String username,String password);

    /**
     * 获取用户
     * @param username
     * @return
     */
    TbUser getByUsername(String username);

}
