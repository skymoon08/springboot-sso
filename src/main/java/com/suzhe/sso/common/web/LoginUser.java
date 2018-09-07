package com.suzhe.sso.common.web;

import lombok.Data;


@Data
public class LoginUser {

    /**
     * ID
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 手机号
     */
    private String phoneNo;

    /**
     * 昵称
     */
    private String nickName;
    /**
     * 用户性别
     */
    private String sex;

}
